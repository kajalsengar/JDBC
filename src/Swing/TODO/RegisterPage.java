package Swing.TODO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage {
    RegisterPage(){
        JFrame RegisterPage = new JFrame("Regisreation page");

        JLabel heading = new JLabel("data of user");
        heading.setBounds(200,20,190,20);

        JLabel Name = new JLabel("User Name");
        Name.setBounds(120,50,80,20);

        JTextField nameTF = new JTextField();
        nameTF.setBounds(250,50,100,20);

        JLabel Email = new JLabel("e-mail");
        Email.setBounds(120,75,80,30);

        JTextField emailTF = new JTextField();
        emailTF.setBounds(250,80,100,20);

        JLabel Password = new JLabel("Password");
        Password.setBounds(120,110,80,20);

        JTextField passwordTF = new JTextField();
        passwordTF.setBounds(250,110,100,20);

        JButton submit = new JButton("Register");
        submit.setBounds(175,150,100,30);

        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameTF.getText();
                String email = emailTF.getText();
                String password= passwordTF.getText();

                System.out.println(name);
                System.out.println(email);
                System.out.println(password);

                new LoginPage();
                RegisterPage.dispose();
            }
        });

        JButton reset = new JButton("Reset");
        reset.setBounds(140 ,120,100,30);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTF.setText("");
                emailTF.setText("");
                passwordTF.setText("");
            }
        });

        RegisterPage.add(Name);
        RegisterPage.add(nameTF);
        RegisterPage.add(Email);
        RegisterPage.add(emailTF);
        RegisterPage.add(Password);
        RegisterPage.add(passwordTF);
        RegisterPage.add(submit);
        RegisterPage.add(reset);

        RegisterPage.setVisible(true);
        RegisterPage.setLayout(null);
        RegisterPage.setSize(500,500);
        RegisterPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RegisterPage();
    }
}
