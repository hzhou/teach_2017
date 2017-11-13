
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class test {
    private JFrame frame;
    private double f_theta;
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
        f_theta = 0;
        canvas = new JPanel(){
            public void paintComponent(Graphics g0){
                super.paintComponent(g0);
                Graphics2D g = (Graphics2D)g0;
                int x;
                int y;

                x = 250 + (int)(100 * Math.cos(f_theta));
                y = 250 + (int)(100 * Math.sin(f_theta));
                g.fillOval(x, y, 20, 20);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        timer = new Timer(1000/60, new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                f_theta += 0.05;
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
