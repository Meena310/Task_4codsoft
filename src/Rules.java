import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    public String name;
    JButton  start,back;

    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading =  new JLabel("Welcome " + name + " to Quiz Rules");
        heading.setBounds(50,20,700,35);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        heading.setForeground(Color.BLUE);
        /*You can also create a object for setForground in r,g,d mode */
        add(heading);

        JLabel rules =  new JLabel("");
        rules.setBounds(20,50,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,15));
        rules.setForeground(Color.BLUE);
        /*You can also create a object for setForground in r,g,d mode */
        rules.setText( "<html>" + 
        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
        "4. Crying is allowed but please do so quietly." + "<br><br>" +
        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
    "<html>"
);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,400,100,30);
        /*rules.setForeground(new Color(30,144,254)); */
        /*                   (Color.WHITE) */
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,400,100,30);
        /*rules.setForeground(new Color(30,144,254)); */
        /*                   (Color.WHITE) */
        start.addActionListener(this);
        add(start);



      setSize(800,500);
      setLocation(350,100);
      setVisible(true);

    }

    public void  actionPerformed(ActionEvent ae){
        if (ae.getSource()==start){
            setVisible(false);
            new Quiz(name);

        }else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void  main(String[] args){
        new Rules("User");
    }
}
