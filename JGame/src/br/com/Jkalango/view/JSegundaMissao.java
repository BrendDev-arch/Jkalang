package br.com.Jkalango.view;
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

import br.com.Jkalango.bo.IColor;



public class JSegundaMissao extends JFrame implements IColor {

    private JPanel panelFundo;

    public JSegundaMissao(){

        setTitle("JKalango Adventure");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel();
       
    
 
        label.setText( "<html><body style='text-align: center; color: white; font-family: \\\"Press Start 2P\\\", cursive; font-size: 10px; text-shadow: 1px 1px 2px black;'>"
        + "Vocês possuem a maior das tarefas, Jkalango, JFormiga e Abelinha, salvar a princesa do JMago." 
        + " Escolha qual o melhor caminho para salvar a princesa:  "
        + "</body></html>"); 
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        //label.setFont(new Font("Serif", Font.PLAIN, 16));
        


        
    
    
        JButton starButton =  new JButton(" próxima missão ");
        starButton.setFocusPainted(false);

        JButton botaoDeSim = new JButton("Caminho 1 ");
        botaoDeSim.setFocusPainted(false);
        botaoDeSim.setBounds(150, 100, 120, 30);
        add(botaoDeSim);

        JButton botaoDoNao = new JButton("Caminho 2 ");
        botaoDoNao.setFocusPainted(false);
        botaoDoNao.setBounds(180,100,120,30);
        add(botaoDoNao);


        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelButton.setBackground(Color.BLACK);
        panelButton.add(starButton);
        add(label, BorderLayout.CENTER);
        add(panelButton, BorderLayout.SOUTH);
    

       

        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Mudarcor();
                new JSegundaMissao();
            }      
        });

        botaoDeSim.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e){

              

            }
        });

        
        setVisible(true);


    }

    @Override
    public void Mudarcor() {
        panelFundo.setBackground(Color.MAGENTA);      
        
         

    }





}