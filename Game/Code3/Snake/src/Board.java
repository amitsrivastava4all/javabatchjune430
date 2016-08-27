import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private final int BOARD_WIDTH = 300;
    private final int BOARD_HEIGHT = 300;
    private final int SNAKE_BODY_DOT_SIZE = 10; 
    private final int ALL_DOTS = 900;  // Screen can have 900 dots (BOARD_WIDTH * BOARD_HEIGHT)
    private final int APPLE_RANDOM_POSITION = 29;
    private final int GAME_SPEED = 140;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int snakeLength;
    private int apple_x;
    private int apple_y;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean gameStart = true;

    private Timer timer;
    private Image snakeBody;
    private Image apple;
    private Image snakeHead;

    public Board() {

        addKeyListener(new KeyMoveAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        loadImages();
        initGame();
    }
    // Initialize Images for Game
    private void loadImages() {

        ImageIcon snakeBody = new ImageIcon(Board.class.getResource("dot.png"));
        this.snakeBody = snakeBody.getImage();

        ImageIcon fruit = new ImageIcon(Board.class.getResource("apple.gif"));
        apple = fruit.getImage();

        ImageIcon snakeHead = new ImageIcon(Board.class.getResource("dot.png"));
        this.snakeHead = snakeHead.getImage();
    }

    private void initGame() {

        snakeLength = 3; //Snake Start with 3 Length

        for (int z = 0; z < snakeLength; z++) {
            x[z] = 50 - z * 10; // Logic to Print On X Position (Snake Head to Tail )
            y[z] = 50;
        }

        printApple();

        timer = new Timer(GAME_SPEED, this);
        timer.start();
    }
    private void printApple() {

        int r = (int) (Math.random() * APPLE_RANDOM_POSITION);
        apple_x = ((r * SNAKE_BODY_DOT_SIZE));

        r = (int) (Math.random() * APPLE_RANDOM_POSITION);
        apple_y = ((r * SNAKE_BODY_DOT_SIZE));
    }
    // repaint will call this method, repaint is call from KEYAdapter 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        
        if (gameStart) {

            g.drawImage(apple, apple_x, apple_y, this);

            for (int z = 0; z < snakeLength; z++) {
                if (z == 0) {
                    g.drawImage(snakeHead, x[z], y[z], this);
                } else {
                    g.drawImage(snakeBody, x[z], y[z], this);
                }
            }

            //Toolkit.getDefaultToolkit().sync();

        } else {

            gameOver(g);
        }        
    }

    private void gameOver(Graphics g) {
        
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (BOARD_WIDTH - metr.stringWidth(msg)) / 2, BOARD_HEIGHT / 2);
    }

    private void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {

        	snakeLength++;
        	printApple();
        }
    }

    private void move() {
    		
        for (int z = snakeLength; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= SNAKE_BODY_DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += SNAKE_BODY_DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= SNAKE_BODY_DOT_SIZE;
        }

        if (downDirection) {
            y[0] += SNAKE_BODY_DOT_SIZE;
        }
    }

    private void checkCollision() {
        final int SNAKE_HEAD =0;
        // Traverse from Tail to Head
        for (int tail = snakeLength; tail > SNAKE_HEAD; tail--) {
        		
            if ((tail > 4) && (x[SNAKE_HEAD] == x[tail]) && (y[SNAKE_HEAD] == y[tail])) {
                gameStart = false;
            }
        }
        // Checking HEAD is Out of Board
        if (y[0] >= BOARD_HEIGHT) {
        	gameStart = false;
        }

        if (y[0] < 0) {
        	gameStart = false;
        }

        if (x[0] >= BOARD_WIDTH) {
        	gameStart = false;
        }

        if (x[0] < 0) {
        	gameStart = false;
        }
        
        if(!gameStart) {
            timer.stop();
        }
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (gameStart) {

            checkApple();
            checkCollision();
            move();
        }

        repaint();  // this will call paintComponent 
    }

    private class KeyMoveAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }
}