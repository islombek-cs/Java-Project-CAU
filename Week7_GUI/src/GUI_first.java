import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

public class GUI_first {

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple JLabel Example");


        ImageIcon icon = new ImageIcon("D:\\Java_Coding\\Week7_GUI\\resources\\test_moving.png");
        JLabel label = new JLabel("Hello, JLabel!", icon, JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);

        frame.getContentPane().add(label);

        frame.setMinimumSize(new Dimension(300, 200)); // Width: 300, Height: 200

        frame.pack();
//        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
