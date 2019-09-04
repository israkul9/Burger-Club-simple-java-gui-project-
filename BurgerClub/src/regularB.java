import javax.swing.*;
import java.awt.*;

public class regularB extends JFrame {

    private ImageIcon img;
    private JLabel jl;


    private Container c;

    regularB() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 400, 500);
        this.setTitle("Regular Burger");
        this.setResizable(false);


        c = this.getContentPane();
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("regular.jpg"));
        jl = new JLabel(img);
        jl.setBounds(30, 50, 300, 400);
        c.add(jl);
        c.setBackground(Color.orange);


    }


    public static void main(String[] args) {

        regularB ob = new regularB();
        ob.setVisible(true);

    }
}
