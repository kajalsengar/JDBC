package Swing.TODO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
        LoginPage() {
           JFrame Loginpage = new JFrame("Login Page");

           JLabel wName= new JLabel("login");
           wName.setBounds(200,20,190,20);

           JLabel email= new JLabel("e-mail");
           email.setBounds(120,50,80,20);

           JTextField emailTF = new JTextField();
           emailTF.setBounds(250,50,100,20);

           JLabel password = new JLabel("Password");
           password.setBounds(120,75,80,30);

           JTextField passwordTF = new JTextField();
           passwordTF.setBounds(250,80,100,20);

           JButton submit = new JButton("login");
           submit.setBounds(120,120,100,30);

           submit.addActionListener( e-> {
                       String Password = passwordTF.getText();
                       if (Password.equals("@kajal"))
                           System.out.println("you are logined...:)");
                       else System.out.println("Incorrect password, Try Again..");

                       new ProfilePage();
                       Loginpage.dispose();
                   }
                   );

           JButton reset = new JButton("Reset");
           reset.setBounds(250,120,100,30);

           reset.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   emailTF.setText("");
                   passwordTF.setText("");
               }
           });


            Loginpage.add(wName);
            Loginpage.add(email);
            Loginpage.add(emailTF);
            Loginpage.add(password);
            Loginpage.add(passwordTF);
            Loginpage.add(submit);
            Loginpage.add(reset);

            Loginpage.setSize(500,500);
            Loginpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Loginpage.setLayout(null);
            Loginpage.setVisible(true);

        }
        public static void main(String[] args) {
            new LoginPage();
        }
    }

