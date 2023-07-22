import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JButton rules, exit;
    JTextField tfname;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0,600 , 500);
        add(image);
        
        JLabel heading= new JLabel("Simple Minds");
        heading.setBounds(740, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(234, 123, 67));
        add(heading);

        JLabel name= new JLabel("Enter Your Name");
        name.setBounds(810, 150,300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(234, 123, 67));
        add(name);

        tfname= new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735,250,120,20);
        rules.setBackground(new Color(234,123,67));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        exit = new JButton("Exit");
        exit.setBounds(915,250,120,20);
        exit.setBackground(new Color(234,123,67));
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);

        setLocation(200, 150);
        setSize(1100, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==exit){
            setVisible(false);
        } 
    }

    public static void main(String[] args) {
        new login();    
    }
}
