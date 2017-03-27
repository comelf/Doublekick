package com.doublekick.service;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.doublekick.Configure;
import com.doublekick.entity.academy.Photo;
import com.doublekick.model.UploadResult;
import com.doublekick.repository.PhotoRepository;

@Service
public class FileManager {

	private static int ERROR_IMAGE_ID = -1;
	private static final Logger LOG = LoggerFactory.getLogger(FileManager.class);

	Configure conf = Configure.getInstance();

	@Autowired
	PhotoRepository photoRepo;

	public UploadResult readAndSave(MultipartFile file) {
		Photo img = new Photo(file.getOriginalFilename(), file.getSize(), conf.image_path);

		File origin = null;
		try {
			origin = new File(img.getSavePathAndFileName());
			file.transferTo(origin);
			insertDatabase(img);
		} catch (IllegalStateException | IOException e) {
			if (origin != null && origin.exists()) {
				origin.delete();
			}
			LOG.warn("File transfer Error  : {}", e.getMessage());
			return resultError("파일을 서버에 저장할수 없습니다.");
		} catch (Exception e) {
			if (origin != null && origin.exists()) {
				origin.delete();
			}
			LOG.warn("File meta data insert(DB) Error  : {}", e.getMessage());
			return resultError("파일을 데이터베이스에 저장할수 없습니다.");
		}

		return new UploadResult(false, img.getUrlPath(), img.getId());
	}

	private void insertDatabase(Photo photo) {
		photoRepo.saveAndFlush(photo);
	}

	private UploadResult resultError(String msg) {
		return new UploadResult(true, msg, ERROR_IMAGE_ID);
	}

}
