package com.bmpl.testengine.user.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.SUCCESS;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.FAIL;

import com.bmpl.testengine.user.dao.UserDAO;
import com.bmpl.testengine.user.dto.UserDTO;

public class UserLoginView extends JFrame {
	private JTextField useridtxt;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
					UserLoginView frame = new UserLoginView();
					frame.setVisible(true);
		}

	/**
	 * Create the frame.
	 */
	public UserLoginView() {
		setTitle("User Login");
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 237);
		getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(28, 50, 61, 16);
		getContentPane().add(lblUserid);
		
		useridtxt = new JTextField();
		useridtxt.setBounds(118, 45, 217, 26);
		getContentPane().add(useridtxt);
		useridtxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(28, 101, 61, 16);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 96, 217, 26);
		getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLogin();
			}
		});
		btnLogin.setBounds(40, 159, 117, 29);
		getContentPane().add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(169, 159, 117, 29);
		getContentPane().add(btnClear);
	}
	private void doLogin(){
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(useridtxt.getText());
		userDTO.setPassword(String.valueOf(passwordField.getPassword()));
		try {
			String message = userDAO.login(userDTO);
			if(message.equals(SUCCESS)){
				JOptionPane.showMessageDialog(this, "Welcome "+userDTO.getUserid());
			}
			else
			if(message.equals(FAIL)){	
				JOptionPane.showMessageDialog(this, "Invalid Userid or Password ");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
