import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    /**
     * 
     */
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("photo.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(0,0,450,500);
        add(image);

        JLabel heading =  new JLabel("Welcome in Quiz");
        heading.setBounds(500,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        /*You can also create a object for setForground in r,g,d mode */
        add(heading);

        JLabel name =  new JLabel("Enter your name");
        name.setBounds(500,140,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(Color.BLUE);
        /*You can also create a object for setForground in r,g,d mode */
        add(name);
         tfname = new JTextField();
        tfname.setBounds(500,200,230,30);
        tfname.setFont(new Font("Times Now Roman", Font.BOLD,20));
        add(tfname);

         rules = new JButton("Rules");
        rules.setBounds(500,250,150,25);
        /*rules.setForeground(new Color(30,144,254)); */
        /*                   (Color.WHITE) */
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(715,250,150,25);
        /*rules.setForeground(new Color(30,144,254)); */
        /*                   (Color.WHITE) */
        back.addActionListener(this);
        add(back);


        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);

    }


    
    public void  actionPerformed(ActionEvent  ae){
        if(ae.getSource() == rules){
            String name =tfname.getText();
            setVisible(false);
            new Rules(name);

            
        }else if (ae.getSource() == back){
            setVisible(false);

        }

    }

    public static void main(String[] args){
        new Login();
    }
}
