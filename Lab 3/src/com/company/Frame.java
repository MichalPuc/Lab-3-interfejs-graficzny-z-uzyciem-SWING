package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;


public class Frame extends JFrame  {
    private HashMap<String,String> login_i_haslo = new HashMap<String,String>();


    Frame(){
        login_i_haslo.put("user","password");
        login_i_haslo.put("user1","password1");
        login_i_haslo.put("user2","password2");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(4,4,4,4));
        panel.setBackground(Color.WHITE);

        JButton button = new JButton("Login");
        JButton button2 = new JButton("Reset");
        JLabel label2 = new JLabel("Password:");
        JLabel label = new JLabel("User:");
        JTextField text = new JTextField();
        JTextField text2 = new JTextField();

        button.setBounds(120,120,80,20);
        button2.setBounds(200,120,80,20);
        label.setBounds(40,40,200,20);
        label2.setBounds(40,90,200,20);
        text.setBounds(110,40,180,20);
        text2.setBounds(110,90,180,20);
        panel.add(button);
        panel.add(button2);
        panel.add(text);
        panel.add(text2);
        panel.add(label);
        panel.add(label2);


        button.addActionListener(e ->
        {
            if (login_i_haslo.containsKey(text.getText()) && text2.getText().equals(login_i_haslo.get(text.getText())))
                panel.setBackground(Color.GREEN);
            else panel.setBackground(Color.RED);
        });
        button2.addActionListener(e ->
        {
            text.setText("");
            text2.setText("");
            panel.setBackground(Color.WHITE);
        });

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(400, 200);
        this.setTitle("Lab 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
