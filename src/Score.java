 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 
 
 
 
 public class Score extends JFrame implements ActionListener {

    Score(String name, int score){
         setBounds(400,150,750,550);
        /* its is the combination of setSize  and setLocation */
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/Score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

          JLabel heading = new JLabel ("Thankyou  "  +  name  + " for playing Quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new  Font ("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel lscore = new JLabel ("Your score is " +  score);
       lscore.setBounds(350,100,300,300);
        lscore.setFont(new  Font ("Tahoma",Font.PLAIN,26));
        add(lscore);

        JButton  submit = new JButton("Play Again");
         submit.setBounds(380,290,150,30);
         
         submit.setBackground(new Color(30,144,255));
         submit.setForeground(Color.WHITE);
         submit.addActionListener(this);
         add(submit);



    setVisible(true);


    }

    public void  actionPerformed(ActionEvent ae){
    
        setVisible(false);
        new Login();


    }
    public static void  main(String[] args){

        new Score("User", 0);
        
    }
    
}
