package com.bmpl.testengine.user.dao;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.*;
import static com.bmpl.testengine.utils.MessageBundleReader.getConfigValue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bmpl.testengine.user.dto.UserDTO;

public class RegisterDAO {
	
	public String register(UserDTO userDTO) throws IOException{
		String message = ERROR;
		FileOutputStream fs =null;
		ObjectOutputStream os =null;
		boolean appendMode = true;
		String filePath = getConfigValue("userfilepath");
		File file = new File(filePath);
		try{
		if(!file.exists()){
			if(!file.createNewFile()){
				return message;
			}
		}
		if(file.exists()){
			 
			fs = new FileOutputStream(file,appendMode);
			 os = new ObjectOutputStream(fs);
			os.writeObject(userDTO);
			message = SUCCESS;
		}
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
		}
		return message;
		
	}

}
