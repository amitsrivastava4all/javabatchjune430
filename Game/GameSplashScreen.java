import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GameSplashScreen extends JWindow {
	JProgressBar progressBar = new JProgressBar();
	private JPanel contentPane;
	int counter = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
					frame.doProgress();
			
	}
	Timer timer ;  // Instance Variables
	private void doProgress(){
		// timer is a local varible 
		// and new ActionListener is Anonymous class and Anonymous can't
		// modify the local variables.
		 timer  = new Timer(50,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				progressBar.setValue(counter);
				if(counter==100){
					timer.stop();
					GameSplashScreen.this.setVisible(false);
					TicTacToe toe = new TicTacToe();
					toe.setVisible(true);
				}
				counter++;
			}
		});
		timer.start();
				
		
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 900, 700);
		getContentPane().setLayout(null);
		
		Icon icon = new ImageIcon(GameSplashScreen.class.getResource("splash.gif"));
		
		JLabel lblTictactoegame = new JLabel("TicTacToe-Game -2016");
		lblTictactoegame.setForeground(Color.RED);
		lblTictactoegame.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblTictactoegame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoegame.setBounds(101, 334, 293, 32);
		getContentPane().add(lblTictactoegame);
		
		
		progressBar.setForeground(Color.YELLOW);
		progressBar.setBackground(Color.GREEN);
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		progressBar.setStringPainted(true);
		progressBar.setBounds(30, 227, 679, 49);
		getContentPane().add(progressBar);
		
		JLabel imglbl = new JLabel("");
		imglbl.setIcon(icon);
		imglbl.setBounds(10, 10, 850, 650);
		getContentPane().add(imglbl);
	}
}
