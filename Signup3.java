package bank.mgt.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    Signup3()
    {
        super("APPLICATION FORM ");


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(40,10,100,100);
        add(image);

        JLabel l1=new JLabel("Page No : 3");
        l1.setBounds(250,50,120,30);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Ralway",Font.BOLD,20));
        add(l1);
        

        JLabel l2=new JLabel("Additional Details");
        l2.setBounds(250,80,200,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Ralway",Font.BOLD,20));
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setBounds(120,150,200,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Ralway",Font.BOLD,18));
        add(l3);

        r1=new JRadioButton("Current Account");
        r1.setBounds(130,200,150,25);
        r1.setFont(new Font("Ralway",Font.BOLD,15));
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setBounds(360,200,230,25);
        r2.setFont(new Font("Ralway",Font.BOLD,15));
        add(r2);


        r3=new JRadioButton("Saving Account");
        r3.setBounds(130,250,150,25);
        r3.setFont(new Font("Ralway",Font.BOLD,15));
        add(r3);


        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBounds(360,250,230,25);
        r4.setFont(new Font("Ralway",Font.BOLD,15));
        add(r4);

        ButtonGroup bGroup=new ButtonGroup();
        bGroup.add(r1);
        bGroup.add(r2);
        bGroup.add(r3);
        bGroup.add(r4);

        JLabel l4=new JLabel("Card Number : ");
        l4.setBounds(120,300,200,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        add(l4);

        JLabel l5=new JLabel("PIN : ");
        l5.setBounds(120,350,60,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Ralway",Font.BOLD,18));
        add(l5);


        
        JLabel l6=new JLabel("Services Required : ");
        l6.setBounds(120,400,200,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        add(l6);

        c1=new JCheckBox("ATM CARD");
        c1.setBounds(130,450,145,25);
        c1.setFont(new Font("Ralway",Font.BOLD,15));
        add(c1);

        c2=new JCheckBox("Mobile Banking");
        c2.setBounds(130,500,145,25);
        c2.setFont(new Font("Ralway",Font.BOLD,15));
        add(c2);

        c3=new JCheckBox("Cheque Book");
        c3.setBounds(130,550,145,25);
        c3.setFont(new Font("Ralway",Font.BOLD,15));
        add(c3);

        c4=new JCheckBox("Internet Banking");
        c4.setBounds(450,450,150,25);
        c4.setFont(new Font("Ralway",Font.BOLD,15));
        add(c4);

        c5=new JCheckBox("EMAIL Alerts");
        c5.setBounds(450,500,150,25);
        c5.setFont(new Font("Ralway",Font.BOLD,15));
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBounds(450,550,150,25);
        c6.setFont(new Font("Ralway",Font.BOLD,15));
        add(c6);

        c7=new JCheckBox("I hearby declares that the above entered details are correct to the best of my knowledge");
        c7.setBounds(130,650,500,20                                                                                                                                                              );
        c7.setFont(new Font("Ralway",Font.BOLD,10));
        add(c7);


        JButton b1=new JButton("Submit");
        b1.setBounds(350,700,90,30);
        b1.setFont(new Font("Ralway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        JButton b2=new JButton("Cancel");
        b2.setBounds(500,700,90,30);
        b2.setFont(new Font("Ralway",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);


      

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("Icon/back4.png"));
        Image I2=I1.getImage().getScaledInstance(850, 800,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel icon=new JLabel(I3);
        icon.setBounds(0,0,850,800);
        add(icon);
        
        setBounds(400,50,850,800);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Signup3();
    }

}
