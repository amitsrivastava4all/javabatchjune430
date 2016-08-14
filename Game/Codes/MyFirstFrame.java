import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Step - 1 extends JFrame
public class MyFirstFrame extends JFrame implements ActionListener {
	
	public void actionPerformed(ActionEvent e){
		String buttonLabel = e.getActionCommand();
		System.out.println("Button Label is "+buttonLabel);
		if(buttonLabel.equalsIgnoreCase("ok")){
		JOptionPane.showMessageDialog(this, "Hello User U click on Ok ");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Hello User U click on Cancel ");
		}
	}
	// Design - Must be In constructor
	MyFirstFrame(){
		
		this.setSize(400,400); // width , height
		this.setLocation(200, 100);
		this.setTitle("My Frame - 2016");
		JButton ok = new JButton("Ok");
		JButton cancel = new JButton("Cancel");
		JButton welcome = new JButton("welcome");
		this.getContentPane().setLayout(null);
		//this.getContentPane().setLayout(new GridLayout(2, 2));
		//this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(ok);
		ok.setBounds(10, 10, 90, 50);
		cancel.setBounds(110, 10, 90, 50);
		this.getContentPane().add(cancel);
		this.getContentPane().add(welcome);
		//ok.addActionListener(this);  // Register Event on Button
		//cancel.addActionListener(this);
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(MyFirstFrame.this, "U Click on Ok");
			}
		});
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(MyFirstFrame.this, "U Click on Cancel");
			}
		});
		//this.getContentPane().add(ok, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstFrame obj = new MyFirstFrame();
		obj.setVisible(true);
		
	}

}
