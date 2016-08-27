package com.bmpl.testengine.user.dao;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.ERROR;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.FAIL;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.SUCCESS;
import static com.bmpl.testengine.utils.MessageBundleReader.getConfigValue;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.bmpl.testengine.user.dto.UserDTO;

public class UserDAO {
	
	public String login(UserDTO userDTO) throws IOException, ClassNotFoundException{
		String message = ERROR;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		UserDTO userDTOFromFile = null;
		String filePath = getConfigValue("userfilepath");
		try
		{
			fi = new FileInputStream (filePath);
			oi = new ObjectInputStream(fi);
			while(true){
				try{
					userDTOFromFile = (UserDTO)oi.readObject();
					if(userDTO.equals(userDTOFromFile)){
						message = SUCCESS;
						return message;
					}
				}
				catch(EOFException e){
					message = FAIL;
					return message;
				}
				}
		}
		finally{
			if(oi!=null){
				oi.close();
			}
			if(fi!=null){
				fi.close();
			}
			//return message;
		}
		//return message;
	}
	
	public ArrayList<UserDTO> fetchData() throws IOException, ClassNotFoundException{
		// ArrayList is a kind of dynamic array
		ArrayList<UserDTO> userList = new ArrayList<>();
		String message = ERROR;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		UserDTO userDTOFromFile = null;
		String filePath = getConfigValue("userfilepath");
		try
		{
			fi = new FileInputStream (filePath);
			oi = new ObjectInputStream(fi);
			while(true){
				try{
					userDTOFromFile = (UserDTO)oi.readObject();
					userList.add(userDTOFromFile);
					
				}
				catch(EOFException e){
					message = FAIL;
					return userList;
				}
				}
		}
		catch(EOFException e){
			return userList;
		}
		finally{
			if(oi!=null){
				oi.close();
			}
			if(fi!=null){
				fi.close();
			}
		}
	}
	
	public String register(UserDTO userDTO) throws IOException, ClassNotFoundException{
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
			ArrayList<UserDTO> userList = this.fetchData(); 
			userList.add(userDTO);
			fs = new FileOutputStream(file);
			 os = new ObjectOutputStream(fs);
			for(UserDTO user: userList){
				os.writeObject(user);
			}
			 //os.writeObject(userList);
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
