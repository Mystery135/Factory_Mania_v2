package com.websiteofgames.factorymania;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher {
    private JPanel panel;
    private JButton startButton;

    public Launcher() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factory Mania Launcher");
frame.setContentPane(new Launcher().panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(800,600);
frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here




    }
}

