package com.bmpl.banking.loans.view;

import java.util.Scanner;

import com.bmpl.banking.loans.dto.AccountDTO;
import com.bmpl.banking.loans.dto.UserDTO;
import com.bmpl.banking.loans.helper.CommonLogic;
import com.bmpl.banking.loans.helper.LoginHelper;


// A Class end with View Represent the GUI
public class LoginView extends CommonLogic {
	void doLogin(){
		super.print();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		LoginHelper helper = new LoginHelper();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		AccountDTO accountDTO = helper.checkUserAlreadyLogin(userDTO); // Passing Reference
		System.out.println("Account Details are ");
		System.out.println("Account No is "+accountDTO.getAccountNo());
		System.out.println("Account balance is "+accountDTO.getBalance());
		System.out.println("Branch is "+accountDTO.getBranchName());
		
	}
	public static void main(String[] args) {
		LoginView view = new LoginView();
		view.doLogin();
	}

}
