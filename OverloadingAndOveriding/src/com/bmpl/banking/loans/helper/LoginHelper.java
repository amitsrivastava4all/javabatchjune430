package com.bmpl.banking.loans.helper;

import com.bmpl.banking.loans.dao.LoginDAO;
import com.bmpl.banking.loans.dto.AccountDTO;
import com.bmpl.banking.loans.dto.UserDTO;

// Helper classes contains the Business Logic
public class LoginHelper {
	// by default - default scope (within in the package)
	// public things can be access outside the package
public AccountDTO checkUserAlreadyLogin(UserDTO userDTO){
	System.out.println("No Already Login");
	LoginDAO loginDAO  = new LoginDAO();
	return loginDAO.checkUserExist(userDTO);
}
}
