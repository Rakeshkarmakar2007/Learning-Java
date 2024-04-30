import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
class myPanel extends JPanel implements KeyListener,ActionListener {
    Random r1=new Random();
    int OvalPosx = 320;
    int OvalPosy = 500 - 20;
    final int OvalDia = 20;
    int padalx = 300;
    int padaly = 500;
    final int padalW = 70;
    final int padalH = 10;
    int ballxdir=-3;
    int ballydir=-r1.nextInt(-2,3);
    int[][] arr={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    int brickPos=30;
    int brickposy=30;
    int i,j;
    int score=0;
    myPanel(int delay) {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        Timer timer = new Timer(delay, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g);



        g.setColor(Color.RED);
        g.fillOval(OvalPosx, OvalPosy, OvalDia, OvalDia);//ball
        g.setColor(Color.blue);
        g.fillRect(padalx, padaly, padalW, padalH);//padal
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        g.drawString("Score:-"+score,400,20);
        for(i=0;i< arr.length;i++) {
            for(j=0;j<arr[0].length;j++) {
                if (arr[i][j] == 1) {
                    brickposy = 40;
                    g.setColor(Color.BLACK);
                    g.drawRoundRect(brickPos = 30 + 60 * i, brickposy=30+43*j, 50, 40, 6, 6);
                    g.setColor(Color.green);
                    g.fillRoundRect(brickPos = 30 + 60 * i, brickposy=30+43*j, 50, 40, 6, 6);//brick
                }
                if ((OvalPosy < brickposy + 40) && (OvalPosx > brickPos) && (OvalPosx < brickPos + 50)) {
                    arr[i][j] = 0;
                    ballydir=-ballydir;
                    score++;
                }
            }
        }
        if(OvalPosy>=570){
            g.setColor(Color.RED);
            g.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
            g.drawString("Game over",150,300);
            //System.exit(0);
        }
        if(score==36){
            g.setColor(Color.RED);
            g.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
            g.drawString("you won",150,300);
            g.setFont(new Font(Font.MONOSPACED,Font.ITALIC,30));
            g.drawString("Your score is"+score,150,320);
        }


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle key pressed event
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            //Do something when left arrow key is pressed
            padalx = padalx - 50;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            padalx = padalx + 50;

        }
        padalx = Math.max(0, Math.min(getWidth() - padalW, padalx));

        // Repaint the panel to reflect the changes
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        OvalPosy +=ballydir;
        OvalPosx += ballxdir;
        if(OvalPosx < 0) { // if ball hits the left wall then it bounces back
            ballxdir =-ballxdir;
        }
        if(OvalPosy < 0) {  // if ball hits the top wall then it bounces back
            ballydir=-ballydir;

        }
        if(OvalPosx > 570) { // if ball hits the right wall then it bounces back
            ballxdir=-ballxdir;

        }
        if((OvalPosx>padalx && OvalPosx<padalx+padalW)&&OvalPosy>padaly-OvalDia){
            ballydir=-ballydir;}



        repaint();
    }

}



public class graphics extends JFrame{
    static int delay=20;
    public static void main(String[] args){
        JFrame frame = new JFrame("Graphics Demo");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myPanel m1 = new myPanel(delay);
        m1.setBackground(Color.yellow);

        frame.add(m1); // Adding myPanel directly to the JFrame

        frame.setVisible(true);// Make the frame visible
        String path = "C:\\Users\\karma\\OneDrive\\Documentos\\Programming\\music.wav";
        Scanner sc = new Scanner(System.in);
        Playaudio player = new Playaudio();
        player.Audio(path);


    }
}