import javax.swing.*;
import java.awt.*;

public class hamB extends JFrame {


    private ImageIcon img;
    private JLabel jl;


    private Container c;

    hamB() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(200, 150, 400, 500);
        this.setTitle("Ham Burger");
        this.setResizable(false);


        c = this.getContentPane();
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("ham.jpg"));
        jl = new JLabel(img);
        jl.setBounds(0, 50, 400, 400);
        c.add(jl);
        c.setBackground(Color.white);
    }

    public static void main(String[] args) {

        hamB ob = new hamB();
        ob.setVisible(true);
    }
}
