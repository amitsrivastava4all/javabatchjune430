package com.bmpl.testengine.user.view;

//import com.bmpl.testengine.utils.MessageBundleReader;
import static com.bmpl.testengine.utils.MessageBundleReader.getConfigValue;
import static com.bmpl.testengine.utils.MessageBundleReader.getValue;
import static com.bmpl.testengine.utils.ApplicationStatusConstants.*;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.bmpl.testengine.user.dao.UserDAO;
import com.bmpl.testengine.user.dto.UserDTO;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class UserRegisterView extends JFrame {
	private JTextField useridTxt;
	private JPasswordField passwordField;
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rdbtnMale = new JRadioButton("Male",false);
	JRadioButton rdbtnFemale = new JRadioButton("Female",false);
	JComboBox cityCombo = new JComboBox();
	
	public static void main(String[] args) {
		
					UserRegisterView frame = new UserRegisterView();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public UserRegisterView() {
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setTitle(getValue("regform.title"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 435);
		this.getContentPane().setLayout(null);
		
		JLabel lblUserRegisterHere = new JLabel(getValue("regform.heading"));
		lblUserRegisterHere.setBounds(159, 34, 169, 16);
		getContentPane().add(lblUserRegisterHere);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(31, 103, 61, 16);
		getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 169, 61, 16);
		getContentPane().add(lblPassword);
		
		useridTxt = new JTextField();
		useridTxt.setBounds(123, 98, 181, 26);
		getContentPane().add(useridTxt);
		useridTxt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 164, 181, 26);
		getContentPane().add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnRegister.setMnemonic('R');
		Icon registerIcon = new ImageIcon(getConfigValue("imagespath")+"/register.png");
		btnRegister.setBounds(27, 330, 117, 62);
		btnRegister.setIcon(registerIcon);
		getContentPane().add(btnRegister);
		
		
		rdbtnMale.setBounds(118, 223, 88, 23);
		getContentPane().add(rdbtnMale);
		
		
		rdbtnFemale.setBounds(241, 223, 141, 23);
		getContentPane().add(rdbtnFemale);
		bg.add(rdbtnFemale);
		bg.add(rdbtnMale);
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(31, 227, 61, 16);
		getContentPane().add(lblGender);
		
		
		cityCombo.addItem("Delhi");
		cityCombo.addItem("Mumbai");
		cityCombo.addItem("Shimla");
		
		cityCombo.setBounds(128, 269, 159, 27);
		getContentPane().add(cityCombo);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(31, 273, 61, 16);
		getContentPane().add(lblCity);
	}
	
	private void register(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(useridTxt.getText());
		userDTO.setPassword(String.valueOf(passwordField.getPassword()));
		if(rdbtnMale.isSelected()){
			userDTO.setGender(rdbtnMale.getText());	
		}
		else
			if(rdbtnFemale.isSelected())	
		{
			userDTO.setGender(rdbtnFemale.getText());
		}
		userDTO.setCity((String)cityCombo.getSelectedItem());
		UserDAO dao = new UserDAO();
		try {
			String message = dao.register(userDTO);
			if(message.equals(SUCCESS)){
				JOptionPane.showMessageDialog(this, "User Register SuccessFully !");
			}
			else
			if(message.equals(FAIL)){	
				JOptionPane.showMessageDialog(this, "Problem in User Register");
			}
			else
			if(message.equals(ERROR)){	
				JOptionPane.showMessageDialog(this, "Contact to System Vendor , there is some problem in Application");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "Contact to System Vendor , there is some problem in Application");
			e.printStackTrace();
		}
		
	}
}
