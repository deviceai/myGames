import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private  JavaSweeper(){
        initPanel();
        initFrame();
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        add(panel);
    }

    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
}
