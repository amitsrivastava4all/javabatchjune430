import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class AirCrash extends JFrame {
	private final int LEFT_ARROW = 37;
	private final int RIGHT_ARROW = 39;
	private final int TOP_ARROW = 38;
	private final int BOTTOM_ARROW = 40;
	private JPanel contentPane;
	private int currentX = 62;
	private int currentY=258;
	
	JLabel skylbl = new JLabel();
	JLabel plane = new JLabel();
	Timer bombTimer ;
	private final JLabel bomb1 = new JLabel("");
	private final JLabel bomb2 = new JLabel("");
	private JLabel bomb3 = new JLabel("");
	int bomb1X=62;
	int bomb1Y=19;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					AirCrash frame = new AirCrash();
					frame.setVisible(true);
				
	}
	private boolean collision(){
		
		return plane.getBounds().intersects(bomb1.getBounds());
	}
	private void bombLaunch(){
		bomb1.setVisible(true);
		bombTimer = new Timer(20,(e)->{
			bomb1Y++;
			bomb1.setBounds(bomb1X,bomb1Y,100,100);
			if(collision()){
				bombTimer.stop();
				plane.setVisible(false);
				bomb1.setVisible(false);
				JOptionPane.showMessageDialog(AirCrash.this, "Game Over");
			}
			if(bomb1Y>this.getHeight()-50){
				bombTimer.stop();
				bomb1.setVisible(false);
			}
		});
		bombTimer.start();
	}
	private void movePlane(int direction){
		if(direction==TOP_ARROW){
			currentY-=3;
		}
		else
		if(direction==BOTTOM_ARROW){	
			currentY+=3;
		}
		else
		if(direction==LEFT_ARROW){	
			currentX-=3;
		}
		else
		if(direction==RIGHT_ARROW){	
			currentX+=3;
		}
		plane.setBounds(currentX, currentY, 100, 65);
	}

	/**
	 * Create the frame.
	 */
	public AirCrash() {
		Icon planeImage = new ImageIcon(AirCrash.class.getResource("airplane.png"));
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("PRESS "+e.getKeyChar()+" "+e.getKeyCode());
				movePlane(e.getKeyCode());
			}
		});
		plane.setHorizontalAlignment(SwingConstants.RIGHT);
		plane.setVerticalAlignment(SwingConstants.BOTTOM);
		plane.setIcon(planeImage);
				Icon skyImage = new ImageIcon(AirCrash.class.getResource("sky.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(null);
		
		
		plane.setBounds(62, 258, 100, 65);
		getContentPane().add(plane);
		
		
		bomb3.setBounds(385, 19, 61, 16);
		getContentPane().add(bomb3);
		bomb1.setBounds(62, 19, 100, 100);
		
		getContentPane().add(bomb1);
		bomb2.setBounds(214, 19, 61, 16);
		bomb1.setVisible(false);
		Icon bomb1Img = new ImageIcon(AirCrash.class.getResource("bomb.jpg"));
		bomb1.setIcon(bomb1Img);
		getContentPane().add(bomb2);
		skylbl.setIcon(skyImage);
		
		
		skylbl.setBounds(6,6, 700, 600);
		getContentPane().add(skylbl);
		bombLaunch();
		
	}
}
