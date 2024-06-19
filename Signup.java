package bank.mgt.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
    
    JTextField textField4,textField5,textField7,textField8,textField10,textField11,textField12,textField13;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,r4,r5;
    JButton button;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    JOptionPane optionPane;

    
    Signup() {
        super("Application Form");
        ImageIcon aa1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image aa2 = aa1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon aa3 = new ImageIcon(aa2);
        JLabel image7 = new JLabel(aa3);
        image7.setBounds(25, 10, 100, 100);
        add(image7);

        JLabel label1 = new JLabel("APPLICATION FORM NO : " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 35);
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setForeground(Color.BLACK);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290, 100, 600, 40);
        label3.setForeground(Color.BLACK);
        add(label3);

        JLabel label4 = new JLabel("Name : ");
        label4.setFont(new Font("Ralway", Font.BOLD, 20));
        label4.setBounds(100, 200, 100, 28);
        label4.setForeground(Color.BLACK);
        add(label4);

        JTextField textField4=new JTextField(100);
        textField4.setFont(new Font("Ralway",Font.BOLD,14));
        textField4.setBounds(350,200,400,28);
        add(textField4);


        JLabel label5 = new JLabel("Father's name : ");
        label5.setFont(new Font("Ralway", Font.BOLD, 20));
        label5.setBounds(100, 250, 500, 28);
        label5.setForeground(Color.BLACK);
        add(label5);

        JTextField textField5=new JTextField(100);
        textField5.setFont(new Font("Ralway",Font.BOLD,14));
        textField5.setBounds(350,250,400,28);
        add(textField5);

        JLabel label6 = new JLabel("Gender : ");
        label6.setFont(new Font("Ralway", Font.BOLD, 20));
        label6.setBounds(100, 300, 500, 28);
        label6.setForeground(Color.BLACK);
        add(label6);

        //To add RadioButtons
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(204,229,255));
        r1.setBounds(350,300,60,28);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(204,229,255));
        r2.setBounds(450,300,80,28);
        add(r2);

        //To group Radiobuttons
        ButtonGroup bGroup=new ButtonGroup();
        bGroup.add(r1);
        bGroup.add(r2);



        JLabel label7 = new JLabel("Date of Birth : ");
        label7.setFont(new Font("Ralway", Font.BOLD, 20));
        label7.setBounds(100, 350, 500, 28);
        label7.setForeground(Color.BLACK);
        add(label7);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(350,350,400,28);
        add(dateChooser);

        JLabel label8 = new JLabel("Email Address : ");
        label8.setFont(new Font("Ralway", Font.BOLD, 20));
        label8.setBounds(100, 400, 500, 28);
        label8.setForeground(Color.BLACK);
        add(label8);

        JTextField textField8=new JTextField(100);
        textField8.setFont(new Font("Ralway",Font.BOLD,14));
        textField8.setBounds(350,400,400,28);
        add(textField8);

        JLabel label9 = new JLabel("Marital Status : ");
        label9.setFont(new Font("Ralway", Font.BOLD, 20));
        label9.setBounds(100, 450, 500, 28);
        label9.setForeground(Color.BLACK);
        add(label9);

        r3=new JRadioButton("Married");
        r3.setBounds(350,450,90,28);
        r3.setBackground(new Color(204,229,255));
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setBounds(480,450,100,28);
        r4.setBackground(new Color(204,229,255));
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        add(r4);

        r5=new JRadioButton("Others");
        r5.setBounds(620,450,90,28);
        r5.setBackground(new Color(204,229,255));
        r5.setFont(new Font("Ralway",Font.BOLD,14));
        add(r5);

        ButtonGroup bGroup2=new ButtonGroup();
        bGroup2.add(r3);
        bGroup2.add(r4);
        bGroup2.add(r5);

       
        JLabel label10 = new JLabel("Address : ");
        label10.setFont(new Font("Ralway", Font.BOLD, 20));
        label10.setBounds(100, 500, 500, 28);
        label10.setForeground(Color.BLACK);
        add(label10);

        JTextField textField10=new JTextField(100);
        textField10.setFont(new Font("Ralway",Font.BOLD,14));
        textField10.setBounds(350,500,400,28);
        add(textField10);


        JLabel label11 = new JLabel("City : ");
        label11.setFont(new Font("Ralway", Font.BOLD, 20));
        label11.setBounds(100, 550, 500, 28);
        label11.setForeground(Color.BLACK);
        add(label11);

        JTextField textField11=new JTextField(100);
        textField11.setFont(new Font("Ralway",Font.BOLD,14));
        textField11.setBounds(350,550,400,28);
        add(textField11);


        JLabel label12 = new JLabel("State :");
        label12.setFont(new Font("Ralway", Font.BOLD, 20));
        label12.setBounds(100, 600, 500, 28);
        label12.setForeground(Color.BLACK);
        add(label12);

        JTextField textField12=new JTextField(100);
        textField12.setFont(new Font("Ralway",Font.BOLD,14));
        textField12.setBounds(350,600,400,28);
        add(textField12);


        JLabel label13 = new JLabel("Pin Code : ");
        label13.setFont(new Font("Ralway", Font.BOLD, 20));
        label13.setBounds(100, 650, 500, 28);
        label13.setForeground(Color.BLACK);
        add(label13);

        JTextField textField13=new JTextField(100);
        textField13.setFont(new Font("Ralway",Font.BOLD,14));
        textField13.setBounds(350,650,400,28);
        add(textField13);

        button=new JButton("Next");
        button.setBounds(620,710,80,30);
        button.setBackground(Color.BLACK);
        button.setFont(new Font("Ralway",Font.BOLD,14));
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);


        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("Icon/back2.png"));
        Image a2 = a1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image8 = new JLabel(a3);
        image8.setBounds(0, 0, 850, 800);
        add(image8);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    /**
     * @param <Connection1>
     * @param e
     */
    
    @Override
    public  void  actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textField4.getText();
        String fname=textField5.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText(); 
        String gender=null;
        if(r1.isSelected())
        {
            gender="Male";
        }
        else if(r2.isSelected())
        {
            gender="Female";   
        }
        String email=textField8.getText();
        String marritalS=null;
        if(r3.isSelected())
        {
            marritalS="Married";
        }
        else if(r4.isSelected())
        {
            marritalS="Unmarried";
        }
        else if(r5.isSelected())
        {
            marritalS="Others";
        }
        String address=textField10.getText();
        String city=textField11.getText();
        String state=textField12.getText();
        String pincode=textField13.getText();
        
        try {
            if(textField4.getText().equals(" "))
            {
                JOptionPane.showMessageDialog(null,"Fill all th field");
            }
            else {
                Connection1 con1=new Connection1();
                String q="insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"''"+email+"','"+marritalS+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
            
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();

    }

   
}
