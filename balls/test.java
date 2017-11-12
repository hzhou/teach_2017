
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class test {
    private JFrame frame;
    private int x;
    private int y;
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
        x = 200;
        y = 100;
        canvas = new JPanel(){
            public void paintComponent(Graphics g0){
                super.paintComponent(g0);
                Graphics2D g = (Graphics2D)g0;
                g.fillOval(x, y, 20, 20);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        timer = new Timer(1000/5, new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                y += 5;
                canvas.repaint();
            }
        });
        timer.start();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        test app;

        app = new test();
    }

}
