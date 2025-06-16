package br.com.Jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import br.com.Jkalango.bo.IColor;

import java.awt.Color;     // Para definir cores
import java.awt.Font;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSplash extends JFrame implements IColor{
    
    private JPanel panelFundo;

    public JSplash(){
        // Formulário
        
        setTitle("JKalango Adventure");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        panelFundo = new JPanel();
        panelFundo.setBackground(Color.GRAY);
        panelFundo.setLayout(new BorderLayout());
        add(panelFundo);
        
        // Botão
        JButton starButton =  new JButton("Start");
        add(starButton);

        // evento ao botão que ao clicar mostre a mensagem
        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new JGameplay();
            }      
        });
        
        // mostrar o formulário
        setVisible(true);


    }

    @Override
    public void Mudarcor() {
        panelFundo.setBackground(Color.GREEN);
             
    }


}
    