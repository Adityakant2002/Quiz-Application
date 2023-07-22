
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(60, 80, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(234, 123, 67));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(60, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+
            "1. Every question has four option out of which only one is correct." + "<br> <br>" +
            "2. Each question contains 10 marks." + "<br> <br>" +
            "3. Every question has a 15 sec time limit." + "<br> <br>" +
            "4. If you fail to mark within the time limit you will automatically be sent to the next question." + "<br> <br>" +
            "5. You will be getting a lifeline which can be used only once." + "<br> <br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(234, 123, 67));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(234, 123, 67));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}