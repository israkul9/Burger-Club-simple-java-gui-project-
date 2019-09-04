import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private Container c;
    private JButton menu;
    private JLabel jl;
    ImageIcon img;
    private Font font;

    Main() {

        initCom();
    }


    public void initCom() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        img = new ImageIcon(getClass().getResource("first.png"));
        jl = new JLabel(img);
        jl.setBounds(0, 0, 500, 500);
        menu = new JButton("Click here for Menu Card");
        menu.setBounds(515, 150, 250, 70);
        font = new Font("Courier", Font.BOLD, 17);
        menu.setFont(font);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuPage ob = new MenuPage();
                ob.setVisible(true);
            }
        });

        c.add(menu);
        c.add(jl);
    }

    public static void main(String[] args) {


        Main f = new Main();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(350, 150, 800, 500);
        f.setLocationRelativeTo(null);
        f.setTitle("WELCOME TO Mr JUCY");
        f.setResizable(false);


    }
}
