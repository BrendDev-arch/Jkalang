package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import java.awt.Color;     // Para definir cores
import java.awt.Font;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSplash extends JFrame {
    
    private JPanel panelFundo;


    public JSplash(){

        panelFundo = new JPanel();
        panelFundo.setBackground(Color.GRAY);
        panelFundo.setLayout(new BorderLayout());
        add(panelFundo);
        // Formulário
        
        setTitle("JKalango Adventure");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        // Botão
        JButton starButton =  new JButton("Start");
        add(starButton);

        // evento ao botão que ao clicar mostre a mensagem
        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                new JGame();
            }      
        });
        
        // mostrar o formulário
        setVisible(true);


    }

 

}
    
