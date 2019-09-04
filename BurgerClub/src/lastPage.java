import javax.swing.*;
import java.awt.*;

public class lastPage extends JFrame {
    private Container c;
    private Font ft;
    public JTextArea txt3;

    lastPage()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(200, 150, 400, 500);
        this.setTitle("Final Bill");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
      c.setBackground(Color.green);


        ft = new Font("Arial",Font.BOLD,20);
        txt3 = new JTextArea();
        txt3.setBounds(40,110,250,240);
        txt3.setLineWrap(true);
        txt3.setWrapStyleWord(true);
        txt3.setFont(ft);
        c.add(txt3);

     //   String ans1  = String.valueOf().toString();

      //  txt3.append();

    }

    public static void main(String[] args) {
        lastPage ob = new lastPage();
        ob.setVisible(true);
    }
}
