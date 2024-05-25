package Swing.TODO;

import org.w3c.dom.Text;

import javax.swing.*;

public class ProfilePage {
    ProfilePage(){
        JFrame profilepage = new JFrame("Profile Page");

        JLabel name=new JLabel("Name:-");
        name.setBounds(250,50,100,120);

        JLabel email= new JLabel("E-mail:-");
        email.setBounds(250,80,100,120);

        JButton title1 =new JButton("Title1");
        title1.setBounds(100, 120,300,50);

        JButton title2 =new JButton("Title1");
        title2.setBounds(100, 190,300,50);

        JButton add = new JButton("+");
        add.setBounds(400,400,50,30);

        add.addActionListener(e -> {
            new TextPage();
            profilepage.dispose();
        });

        profilepage.add(name);
        profilepage.add(email);
        profilepage.add(title1);
        profilepage.add(title2);
        profilepage.add(add);

        profilepage.setSize(500,500);
        profilepage.setLayout(null);
        profilepage.setVisible(true);
        profilepage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProfilePage();
    }
}
