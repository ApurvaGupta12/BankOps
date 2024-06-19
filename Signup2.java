package bank.mgt.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame{

    JRadioButton r1,r2,r3,r4;
    JTextField textPan,textAadhar;
    @SuppressWarnings("rawtypes")
    JComboBox comboBox,c1,c2,c3,c4;
    
    Signup2()
    {
        super("APPLICATION FORM ");

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel image1=new JLabel(ii3);
        image1.setBounds(25,10,100,100);
        add(image1);

        JLabel form=new JLabel("Form No : ");
        form.setBounds(600,15,90,20);
        form.setFont(new Font("Ralway",Font.BOLD,14));
        form.setForeground(Color.BLACK);
        add(form);

        JLabel pageNo=new JLabel("Page 2 :");
        pageNo.setBounds(200,50,120,30);
        pageNo.setForeground(Color.BLACK);
        pageNo.setFont(new Font("Ralway",Font.BOLD,20));
        add(pageNo);

        JLabel Ad=new JLabel("Additional Details  ");
        Ad.setBounds(200,80,200,30);
        Ad.setForeground(Color.BLACK);
        Ad.setFont(new Font("Ralway",Font.BOLD,20));
        add(Ad);



        JLabel label1=new JLabel("Religion : ");
        label1.setBounds(100,180,100,30);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Ralway",Font.BOLD,20));
        add(label1);

        String Religion[]={"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox=new JComboBox<>(Religion);
        comboBox.setBounds(350,180,280,25);
        comboBox.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox.setForeground(Color.BLACK);
        comboBox.setBackground(Color.WHITE);
        add(comboBox);


        JLabel label2=new JLabel("Category : ");
        label2.setBounds(100,230,120,30);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        add(label2);


        String Category[]={"General","OBC","SC","ST","Others"};
        c1=new JComboBox<>(Category);
        c1.setBounds(350,230,280,25);
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Ralway",Font.BOLD,14));
        add(c1);



        JLabel label3=new JLabel("Income : ");
        label3.setBounds(100,280,100,30);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        add(label3);

        String Income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c2=new JComboBox<>(Income);
        c2.setBounds(350,280,280,25);
        c2.setForeground(Color.BLACK);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Ralway",Font.BOLD,14));
        add(c2);



        JLabel label4=new JLabel("Educational Qualification : ");
        label4.setBounds(100,330,155,30);
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Ralway",Font.BOLD,20));
        add(label4);


        String EQ[]={"Non Graduate","Graduate","Post Graduate","Doctrate","Others"};
        c3=new JComboBox<>(EQ);
        c3.setBounds(350,330,280,25);
        c3.setForeground(Color.BLACK);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Ralway",Font.BOLD,14));
        add(c3);


        JLabel label5=new JLabel("Occupation : ");
        label5.setBounds(100,380,150,30);
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("Ralway",Font.BOLD,20));
        add(label5);


        String Occupation[]={"Salaried","Business","Student","Retired","Others"};
        c4=new JComboBox<>(Occupation);
        c4.setBounds(350,380,280,25);
        c4.setForeground(Color.BLACK);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Ralway",Font.BOLD,14));
        add(c4);


        JLabel label6=new JLabel("PAN Number : ");
        label6.setBounds(100,430,170,30);
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("Ralway",Font.BOLD,20));
        add(label6);

        JTextField textPan=new JTextField();
        textPan.setBounds(350,430,280,25);
        textPan.setFont(new Font("Ralway",Font.BOLD,14));
        add(textPan);

        JLabel label7=new JLabel("Aadhar Number : ");
        label7.setBounds(100,480,180,30);
        label7.setForeground(Color.BLACK);
        label7.setFont(new Font("Ralway",Font.BOLD,20));
        add(label7);
        
        JTextField textAadhar=new JTextField();
        textAadhar.setBounds(350,480,280,25);
        textAadhar.setFont(new Font("Ralway",Font.BOLD,14));
        add(textAadhar);


        JLabel label8=new JLabel("Senior Citizen : ");
        label8.setBounds(100,530,180,30);
        label8.setForeground(Color.BLACK);
        label8.setFont(new Font("Ralway",Font.BOLD,20));
        add(label8);

        r1=new JRadioButton("Yes");
        r1.setBounds(350,530,60,25);
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(51,153,255));
        r1.setFont(new Font("Ralway",Font.BOLD,15));
        add(r1);

        r2=new JRadioButton("No");
        r2.setBounds(450,530,60,25);
        r2.setBackground(new Color(51,153,255));
        r2.setForeground(Color.BLACK);
        r2.setFont(new Font("Ralway",Font.BOLD,15));
        add(r2);

        ButtonGroup bGroup=new ButtonGroup();
        bGroup.add(r1);
        bGroup.add(r2);
        
        JLabel label9=new JLabel("Existing Account : ");
        label9.setBounds(100,580,180,30);
        label9.setForeground(Color.BLACK);
        label9.setFont(new Font("Ralway",Font.BOLD,20));
        add(label9);

        r3=new JRadioButton("Yes");
        r3.setBounds(350,580,60,30);
        r3.setBackground(new Color(51,153,255));
        r3.setForeground(Color.BLACK);
        r3.setFont(new Font("Ralway",Font.BOLD,15));
        add(r3);

        r4=new JRadioButton("No");
        r4.setBounds(450,580,60,30);
        r4.setBackground(new Color(51,153,255));
        r4.setForeground(Color.BLACK);
        r4.setFont(new Font("Ralway",Font.BOLD,15));
        add(r4);

        ButtonGroup bGroup1=new ButtonGroup();
        bGroup1.add(r3);
        bGroup1.add(r4);


        JButton button=new JButton("Next");
        button.setBounds(600,660,80,30);
        button.setFont(new Font("Ralway",Font.BOLD,14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/back8.png"));
        Image i2=i1.getImage().getScaledInstance(850, 800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,850,800);
        add(image);
       
       
        setLayout(null); 
        setBounds(400,50,850,800);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Signup2();
    }

}
