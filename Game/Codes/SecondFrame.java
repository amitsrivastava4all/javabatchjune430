import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SecondFrame extends JFrame {
	JLabel lblNewLabel = new JLabel("");
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					SecondFrame frame = new SecondFrame();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public SecondFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ok();
				//SecondFrame.this.getContentPane().setBackground(Color.RED);
				//JOptionPane.showMessageDialog(SecondFrame.this, "U Click on Ok");
			}
		});
		btnOk.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnOk.setBounds(53, 60, 117, 29);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFrame.this.getContentPane().setBackground(Color.YELLOW);
				//JOptionPane.showMessageDialog(SecondFrame.this, "U Click on Cancel");
			}
		});
		btnCancel.setBounds(190, 61, 117, 29);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		textField.setBounds(82, 131, 267, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(102, 18, 205, 30);
		contentPane.add(lblNewLabel);
	}
	private void ok(){
		String txt = textField.getText();
		lblNewLabel.setText(txt);
	}
}
