
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class test {
    private JFrame frame;
    private int x;
    private int y;
    private int size;
    private int dx;
    private int dy;
    private JPanel canvas;
    private Timer timer;

    public test(){
        frame = new JFrame("NoTitle");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
        frame.setLayout(new FlowLayout());
        x = 0;
        y = 100;
        size = 20;
        dx = 1;
        dy = 0;
        canvas = new JPanel(){
            public void paintComponent(Graphics g0){
                super.paintComponent(g0);
                Graphics2D g = (Graphics2D)g0;
                g.fillOval(x, y, size, size);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        frame.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_UP){
                    dx = 0;
                    dy = -1;
                }
                else if(key == KeyEvent.VK_DOWN){
                    dx = 0;
                    dy = 1;
                }
                else if(key == KeyEvent.VK_LEFT){
                    dx = -1;
                    dy = 0;
                }
                else if(key == KeyEvent.VK_RIGHT){
                    dx = 1;
                    dy = 0;
                }
            }
            public void keyReleased(KeyEvent e){};
            public void keyTyped(KeyEvent e){};
        });
        timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                x += dx * size;
                y += dy * size;
                if(x < 0 || x > 500 || y < 10 || y > 500){
                    timer.stop();
                }
                canvas.repaint();
            }
        });
        timer.start();
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        test app;

        app = new test();
    }

}
