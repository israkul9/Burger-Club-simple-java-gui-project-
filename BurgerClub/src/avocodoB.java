import javax.swing.*;
import java.awt.*;

public class avocodoB extends JFrame {

    private ImageIcon img;
    private JLabel jl;


    private Container c;

    avocodoB() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(300, 200, 600, 700);
        this.setTitle("Avocodo Burger");
        this.setResizable(false);


        c = this.getContentPane();
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("avocodo.jpg"));
        jl = new JLabel(img);
        jl.setBounds(0, 50, 500, 600);
        c.add(jl);
        c.setBackground(Color.white);
    }



    public static void main(String[] args) {
 avocodoB ob = new avocodoB();
 ob.setVisible(true);
    }
}
