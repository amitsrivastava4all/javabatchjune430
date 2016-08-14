import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private boolean isVisible = true;
	private JLabel lblNewLabel = new JLabel("Game-2016");
	private Timer timer  ;
	private void doAnimation(){
		timer = new Timer(100,(e)->{
			lblNewLabel.setVisible(isVisible);
			isVisible = !isVisible;
		});
		timer.start();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mnGame.add(mntmTictactoe);
		
		JMenuItem mntmLogoquiz = new JMenuItem("LogoQuiz");
		mnGame.add(mntmLogoquiz);
		
		JMenuItem mntmHangman = new JMenuItem("HangMan");
		mnGame.add(mntmHangman);
		
		JMenuItem mntmSnake = new JMenuItem("Snake");
		mnGame.add(mntmSnake);
		
		JMenuItem mntmAircrash = new JMenuItem("AirCrash");
		mnGame.add(mntmAircrash);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnGame.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutus = new JMenuItem("AboutUs");
		mnHelp.add(mntmAboutus);
		
		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mnHelp.add(mntmTutorial);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		doAnimation();
	}

}
