import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements ActionListener {

	JButton onebt = new JButton("");
	JButton twobt = new JButton("");
	JButton threebt = new JButton("");
	JButton fourbt = new JButton("");
	JButton fivebt = new JButton("");
	JButton sixbt = new JButton("");
	JButton sevenbt = new JButton("");
	JButton eightbt = new JButton("");
	JButton ninebt = new JButton("");
	private boolean isXOrZero = false;
	//ActionEvent is a class which contains the current action happen on Button
	@Override
	public void actionPerformed(ActionEvent e){
		 
		printXOrZero(e);
	}
	
	private void resetGame(){
		onebt.setText("");
		twobt.setText("");
		threebt.setText("");
		fourbt.setText("");
		fivebt.setText("");
		sixbt.setText("");
		sevenbt.setText("");
		eightbt.setText("");
		ninebt.setText("");
	}
	
	private void printXOrZero(ActionEvent e){
		JButton button  = (JButton)e.getSource();
		if(button.getText().trim().length()==0){
		if(!isXOrZero){
			button.setText("X");
		}
		else
		{
			button.setText("0");
		}
		if(isWin()){
			String winner = isXOrZero?"0 Win":"X Win";
			JOptionPane.showMessageDialog(this, "Game Over and "+winner);
			resetGame();
			isXOrZero=false;
		}
		isXOrZero = !isXOrZero;
		}
		
		
	}
	private boolean isNotBlank(String buttonValue){
		if(buttonValue.trim().length()>0){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean isRowNotBlank(JButton one, JButton two, JButton three){
		if(isNotBlank(one.getText()) && isNotBlank(two.getText()) && isNotBlank(three.getText())){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean isWin(){
		if(isRowNotBlank(onebt, twobt, threebt)){
			if(onebt.getText().equals(twobt.getText()) && onebt.getText().equals(threebt.getText())){
				return true;
			}
		}
		if(isRowNotBlank(fourbt, fivebt, sixbt)){
			if(fourbt.getText().equals(fivebt.getText()) && fourbt.getText().equals(sixbt.getText())){
				return true;
			}
			
		}
		return false;
			
	}
	
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		onebt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		onebt.setBounds(22, 46, 117, 49);
		getContentPane().add(onebt);
		
		
		twobt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		twobt.setBounds(151, 46, 117, 49);
		getContentPane().add(twobt);
		
		
		threebt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		threebt.setBounds(293, 46, 117, 49);
		getContentPane().add(threebt);
		
		
		fourbt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		fourbt.setBounds(22, 124, 117, 49);
		getContentPane().add(fourbt);
		
		
		fivebt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		fivebt.setBounds(151, 124, 117, 49);
		getContentPane().add(fivebt);
		
		
		sixbt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		sixbt.setBounds(293, 124, 117, 49);
		getContentPane().add(sixbt);
		
		
		sevenbt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		sevenbt.setBounds(22, 204, 117, 49);
		getContentPane().add(sevenbt);
		
		
		eightbt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		eightbt.setBounds(151, 204, 117, 49);
		getContentPane().add(eightbt);
		
		
		ninebt.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		ninebt.setBounds(293, 204, 117, 49);
		getContentPane().add(ninebt);
		
		onebt.addActionListener(this);
		twobt.addActionListener(this);
		threebt.addActionListener(this);
		fourbt.addActionListener(this);
		fivebt.addActionListener(this);
		sixbt.addActionListener(this);
		sevenbt.addActionListener(this);
		eightbt.addActionListener(this);
		ninebt.addActionListener(this);
	}
}
