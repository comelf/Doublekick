package com.doublekick.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UploadResult {
	
	Boolean error;
	String msg;
	String image;
	String img_id;
	
	public UploadResult(boolean b, String m,int imgId) {
		this.error = b;
		this.img_id = String.valueOf(imgId);
		//파일업로드가 안되었을때
		if(b){
			this.msg = m;
			
		//파일업로드가 되었을때
		}else{
			this.image = m;
		}
	}

}
