package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.doublekick.model.UploadResult;
import com.doublekick.service.FileManager;

@Controller
public class MediaFileController {
	private static final Logger LOG = LoggerFactory.getLogger(MediaFileController.class);

	@Autowired
	FileManager fileManager;
	
	@ResponseBody
	@RequestMapping(value="/academy/photo/upload", method=RequestMethod.POST, consumes = {"multipart/mixed", "multipart/form-data" })
	public UploadResult photoFileUploader(@RequestParam("file") MultipartFile file,
			HttpServletRequest request, HttpSession session, HttpServletResponse response) {
		
		UploadResult result = fileManager.readAndSave(file);
		
		return result;
		
	}
	
	
	
}
