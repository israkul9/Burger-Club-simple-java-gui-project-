import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends JFrame {

    private Container c;

    JButton burger, dr;

    private ImageIcon bur, drinks;

    MenuPage() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(350, 150, 800, 500);
        this.setTitle("WELCOME TO THE MENU");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);


        bur = new ImageIcon(getClass().getResource("burger.jpg"));
        burger = new JButton(bur);
        burger.setBounds(70, 50, 270, 300);
        c.add(burger);
        burger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BurgerHere ob = new BurgerHere();
                ob.setVisible(true);
            }
        });


        drinks = new ImageIcon(getClass().getResource("drinks.jpg"));
        dr = new JButton(drinks);
        dr.setBounds(490, 70, 180, 260);
        c.add(dr);
        dr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrinksHere ob = new DrinksHere();
                ob.setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        MenuPage mp = new MenuPage();
        mp.setVisible(true);

    }

}
