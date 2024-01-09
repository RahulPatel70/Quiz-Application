package quiz.application;
import javax.swing.*;
import java.awt.*;
//click event on button
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField tfname;
    Login(){
        //for crest frame
       try{ getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icone/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0,600,500);
      add(image);
      //if you can write into fram then you can jlabel
      JLabel heading = new JLabel("Simple Mind");
     heading.setBounds(750,60,300,45);
      heading.setFont(new Font("Algerian",Font.BOLD ,40));
     // heading.setForeground(Color.BLUE);       or
      heading.setForeground(new Color(30,144,254));
      add(heading);
      
      JLabel Name = new JLabel("Enter Your Name");
     Name.setBounds(810,150,300,20);
     Name.setFont(new Font("Mongolian Baiti",Font.BOLD ,20));
     // heading.setForeground(Color.BLUE);       or
      Name.setForeground(new Color(30,144,254));
      add(Name);
      
      //for create box
       tfname=new JTextField();
      tfname.setBounds(735,200,300,25);
      tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
      add(tfname);
      
      //for button
      rules=new JButton("Rules");
      rules.setBounds(735,270,120,25);
      rules.setBackground(new Color(30,144,254));
      rules.setForeground(Color.WHITE);
      rules.addActionListener(this);
      add(rules);
      
       back=new JButton("Back");
      back.setBounds(915,270,120,25);
      back.setBackground(new Color(30,144,254));
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
//      
      
       }
       catch(NullPointerException e){
           System.out.print("Null Pointer exception catch");
       }
//       add(image);
        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);
}
    //agar aap apni class me kisi bhi inter face ko implement karte ha to apko sabhi abstract method ko override karna parega
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
   public static void main(String[]args){
       new Login();
   } 
}
