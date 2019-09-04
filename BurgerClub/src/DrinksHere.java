import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinksHere extends JFrame {

    private Container c;
    private  JComboBox cb;
    private JTextArea txt , txt2;
    private Font ft;
   public int tot_pepsi = 0 ;
   public int tot_cnt = 0;
    private JButton conf2,pay1;

    String Drinks[] = {"Pepsi regular" , "Pepsi Large" ,};

    DrinksHere()
    {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(350, 150, 800, 500);
        this.setTitle("Burger List");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        cb = new JComboBox(Drinks);
        cb.setBounds(40,100,200,35);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ss = cb.getSelectedItem().toString();
                if(ss=="Pepsi regular")
                {
                    txt.append(ss+" :  price 99 BDT\n");
                    tot_pepsi+=99;
                    tot_cnt++;
                }
                else if(ss=="Pepsi Large")
                {
                    txt.append(ss+" :  price 202 BDT\n");
                    tot_pepsi+=202;
                    tot_cnt++;
                }
            }
        });


        c.add(cb);

        ft = new Font("Arial",Font.BOLD,20);
        txt = new JTextArea();
        txt.setBounds(40,160,250,240);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        txt.setFont(ft);
        c.add(txt);




        txt2 = new JTextArea();
        txt2.setBounds(380,160,250,240);
        txt2.setLineWrap(true);
        txt2.setWrapStyleWord(true);
        txt2.setFont(ft);
        c.add(txt2);



        conf2 = new JButton("Confirm order");
        conf2.setBounds(60 , 420 , 200 , 30);
        c.add(conf2);

        conf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = String.valueOf(tot_pepsi);
                String c = String.valueOf(tot_cnt);
                txt2.append("Total drinks : "+tot_cnt+"\n");
                txt2.append("Total Amount : "+tot_pepsi+ " BDT"+"\n");
            }
        });



        pay1 = new JButton("Pay Order finally:");
        pay1.setBounds(420 , 420 , 200 , 30);
        pay1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                lastPage ob = new lastPage();
                ob.setVisible(true);
                String t = String.valueOf(tot_pepsi);
                String c = String.valueOf(tot_cnt);
               ob. txt3.append("Total drinks : "+tot_cnt+"\n");
                ob.txt3.append("Final Drinks Amount : "+tot_pepsi+ " BDT"+"\n\n\n");
                ob.txt3.append("  ------ THANK YOU-------\n");


            }
        });
        c.add(pay1);


    }


    public static void main(String[] args) {
       DrinksHere ob = new DrinksHere();
        ob.setVisible(true);
    }
}
