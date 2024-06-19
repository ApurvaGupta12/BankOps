package bank.mgt.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login()
    {
        super("Bank Management System");

        //To add Bank Image in Frame
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image I2=I1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//To scale the image
        //To visible the image in frame
        ImageIcon I3=new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(350,10,100,100);
        add(image);

        //To add Card Image in Frame
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image1=new JLabel(i3);
        image1.setBounds(630,350,100,100);
        add(image1);

        //To add 'Welcome' Text in Frame

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);        

        //To add card number

        label2 =new JLabel("Card No : ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        //To add TextField

        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);
       
        //To add Pin number

        label3=new JLabel("Pin No : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,240,375,30);
        add(label3);
        
        //To add Password Field

        passwordField3=new JPasswordField();
        passwordField3.setBounds(325,240,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        //To add Button1

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        //To add Button2

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);
  
        
        //To add Button3
        
        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);


        //To set Image in Background
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image ii2=ii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel image2=new JLabel(ii3);
        image2.setBounds(0,0,850,480);
        add(image2);
  
        setLayout(null);
        setSize(850,480);
        setVisible(true);
        setLocation(450,200);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try{
            if(e.getSource()==button1)
            {

            }
            else if(e.getSource()==button2)
            {
                textField2.setText("");
                passwordField3.setText("");
            }
            else
            {

            }

        }
        catch(Exception E)
        {

        }

        
    }
    public static void main(String[] args) {
        new Login();
        
    }

}
