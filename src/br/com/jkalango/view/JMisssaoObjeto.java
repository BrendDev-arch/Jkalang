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

import br.com.jkalango.bo.IColor;



public class JMisssaoObjeto extends JFrame implements IColor {

    public JMisssaoObjeto(){

        setTitle("JKalango Adventure");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel();
       
    
 
        label.setText( "<html><body style='text-align: center; color: white; font-family: \\\"Press Start 2P\\\", cursive; font-size: 10px; text-shadow: 1px 1px 2px black;'>"
        + "Um dia, a paz da floresta foi quebrada por um lamento distante, um som que fez os pássaros se calarem e as "
        + "folhas pararem de sussurrar. Era o chamado desesperado da Velha Araucária, a árvore mais antiga e sábia da "
        + "região, que há séculos protegia a floresta. "
        + "JKalango, formiga e abelinha, vós sois os escolhidos para restaurar o equilíbrio da floresta. Cada um de vós "
        + "representa um objeto único, com características e comportamentos distintos, mas todos com um propósito "
        + "comum: salvar nossa casa."
        + "</body></html>"); 
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        //label.setFont(new Font("Serif", Font.PLAIN, 16));
        


        //JPanel panelFundo = new JPanel();
        //panelFundo.setBackground(Color.BLUE);
        //panelFundo.setLayout(new BorderLayout());
        //add(panelFundo);

        
    
    
        JButton starButton =  new JButton("Continua");
        starButton.setFocusPainted(false);

        
        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelButton.setBackground(Color.BLACK);
        panelButton.add(starButton);
        add(panelButton, BorderLayout.SOUTH);

        add(label, BorderLayout.CENTER);

       

        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(JMisssaoObjeto.this, "segunda missão concluida");
            }      
        });

        
        setVisible(true);


    }

    @Override
    public void Mudarcor() {
        JPanel panelFundo = new JPanel();
        panelFundo.setBackground(Color.BLUE);
        panelFundo.setLayout(new BorderLayout());
        add(panelFundo);



    }





}
