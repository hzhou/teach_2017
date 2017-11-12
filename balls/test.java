
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test {
    private JFrame frame;

    public test(){
        frame = new JFrame("NoTitle");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        test app;

        app = new test();
    }

}
