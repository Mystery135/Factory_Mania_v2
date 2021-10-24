package com.websiteofgames.factorymania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher extends JFrame{

    private JPanel panel;
    private JButton startButton;
    private JLabel FactoryManiaJlabel;

    private JLabel LauncherBackgroundImageLabel;

    public Launcher(){
        ImgReg imgReg = new ImgReg();

        setContentPane(panel);
setTitle("Factory Mania Launcher");
setSize(800,600);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);
FactoryManiaJlabel.setFont(new Font(null,Font.BOLD,20));
startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
LauncherBackgroundImageLabel = new JLabel(imgReg.LauncherBackgroundImage);


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm Listening!");
            }
        });
    }

    public static void main(String[] args) {
Launcher launcher = new Launcher();
    }


    private void createUIComponents() {



    }
}
