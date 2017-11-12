
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test {
    private JFrame frame;
    private JPanel canvas;

    public test(){
        frame = new JFrame("NoTitle");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
        frame.setLayout(new FlowLayout());
        canvas = new JPanel(){
            public void paintComponent(Graphics g0){
                super.paintComponent(g0);
                Graphics2D g = (Graphics2D)g0;
                g.fillOval(0, 0, 20, 20);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        test app;

        app = new test();
    }

}
