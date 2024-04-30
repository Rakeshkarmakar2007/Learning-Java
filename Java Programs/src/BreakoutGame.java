import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BreakoutGame extends JFrame implements ActionListener, KeyListener {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;
    private static final int BALL_SIZE = 20;

    private int paddleX = WIDTH / 2 - PADDLE_WIDTH / 2;
    private int ballX = WIDTH / 2 - BALL_SIZE / 2;
    private int ballY = HEIGHT - 100980;
    private int ballSpeedX = 50;
    private int ballSpeedY = -20;

    public BreakoutGame() {
        setTitle("Breakout Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addKeyListener(this);

        Timer timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.BLUE);
        g.fillRect(paddleX, HEIGHT - 30, PADDLE_WIDTH, PADDLE_HEIGHT);

        for(int i=0;i<5;i=i+1){
            g.fillRect(20+i,20+i,50,50);
        }

        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
    }

    public void actionPerformed(ActionEvent e) {
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Ball collision with walls
        if (ballX <= 0 || ballX >= WIDTH - BALL_SIZE) {
            ballSpeedX = -ballSpeedX;
        }
        if (ballY <= 0 || ballY >= HEIGHT - BALL_SIZE) {
            ballSpeedY = -ballSpeedY;
        }

        // Ball collision with paddle
        if (ballY + BALL_SIZE >= HEIGHT - 30 && ballX >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
            ballSpeedY = -ballSpeedY;
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 100;
        }

        // Move paddle right
        if (key == KeyEvent.VK_RIGHT && paddleX < WIDTH - PADDLE_WIDTH) {
            paddleX += 100;
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BreakoutGame game = new BreakoutGame();
            game.setVisible(true);
        });
    }
}