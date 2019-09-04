import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class BurgerHere extends JFrame {
    private Container c;
    private JLabel ll  ;
    private  Font ft;
 public    int totalBill = 0;
   public int cnt = 0 ;

    private JButton conf , pay;

    private  JTextArea txt , txt2;


    private String [] box ={"Regular Burger" ,"Ham Burger" ,
             "Jumbo Burger","Avocodo Burger" } ;
    private  JComboBox cb;

    BurgerHere()
    {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(350, 150, 800, 500);
        this.setTitle("Burger List");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        ft = new Font("Arial",Font.BOLD,20);
        ll = new JLabel("Select Burges for Order :");
        ll.setBounds(40,-90,600,250);
        ll.setFont(ft);
        c.add(ll);

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



        conf = new JButton("Confirm order");
        conf.setBounds(60 , 420 , 200 , 30);
        conf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String t = String.valueOf(totalBill);
               String c = String.valueOf(cnt);
               txt2.append("Total Burgers : "+c+"\n");
               txt2.append("Total Amount : "+t+ " BDT"+"\n");

            }
        });
        c.add(conf);


        pay = new JButton("Pay Order finally:");
        pay.setBounds(420 , 420 , 200 , 30);
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lastPage ob = new lastPage();
                ob.setVisible(true);


                String t = String.valueOf(totalBill);
                String c = String.valueOf(cnt);

               ob. txt3.append("Total Burgers : "+c+"\n");
               ob. txt3.append("Final Burger Amount : "+t+ " BDT"+"\n\n\n");
               ob.txt3.append("  ------ THANK YOU------- \n");

            }
        });
        c.add(pay);




        cb = new JComboBox(box);
        cb.setBounds(40,100,200,35);





        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = cb.getSelectedItem().toString();
                if(str=="Regular Burger")
                {
                    cnt++;
                    txt.append(str+" "+" : 200 BDT\n");
                    totalBill+=200;
                    regularB ob = new  regularB();
                    ob.setVisible(true);

                }
                else if(str=="Ham Burger")
                {
                    cnt++;
                    txt.append(str+" "+" : 215 BDT\n");
                    totalBill+=215;
                    hamB ob = new hamB();
                    ob.setVisible(true);

                }
                    else if(str=="Jumbo Burger")
                    {cnt++;
                        totalBill+=410;
                        txt.append(str+" "+" : 410 BDT\n");
                        jumB ob = new jumB();
                        ob.setVisible(true);
                    }

                    else if(str=="Avocodo Burger")
                    {cnt++;
                        totalBill+=230;
                        txt.append(str+" "+" : 230 BDT\n");
                        avocodoB ob = new avocodoB();
                        ob.setVisible(true);
                    }
            }
        });
        c.add(cb);


    }


    public static void main(String[] args) {
        BurgerHere ob = new BurgerHere();
        ob.setVisible(true);

    }
}
