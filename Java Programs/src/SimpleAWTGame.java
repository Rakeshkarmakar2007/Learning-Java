import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleAWTGame extends Frame implements KeyListener {

    private int x = 100;
    private int y = 100;

    public SimpleAWTGame() {
        setTitle("Simple AWT Game");
        setSize(400, 300);
        setVisible(true);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        SimpleAWTGame game = new SimpleAWTGame();
        game.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x -= 10;
        } else if (key == KeyEvent.VK_RIGHT) {
            x += 10;
        } else if (key == KeyEvent.VK_UP) {
            y -= 10;
        } else if (key == KeyEvent.VK_DOWN) {
            y += 10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }
}
