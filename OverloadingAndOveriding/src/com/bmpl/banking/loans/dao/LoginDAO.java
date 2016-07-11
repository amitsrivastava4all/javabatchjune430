package com.bmpl.banking.loans.dao;

import com.bmpl.banking.loans.dto.AccountDTO;
import com.bmpl.banking.loans.dto.UserDTO;

// DAO - Data Access Object - It contains the DB Logic
public class LoginDAO {
public AccountDTO checkUserExist(UserDTO userDTO){
	AccountDTO accountDTO = new AccountDTO();
	if(userDTO.getUserid().equals(userDTO.getPassword())){
		System.out.println("Welcome User "+userDTO.getUserid());
		accountDTO.setAccountNo("SBI1001");
		accountDTO.setBalance(99999);
		accountDTO.setBranchName("Noida");
		
		
		return accountDTO;
	}
	else
	{
		System.out.println("Invalid Userid or Password ");
		return accountDTO;
	}
	//System.out.println("Yes User Exist ");
	//return true;
}
}
