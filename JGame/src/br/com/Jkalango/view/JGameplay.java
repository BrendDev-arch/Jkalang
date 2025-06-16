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

public class JGameplay extends JFrame implements IColor{

    private JPanel panelFundo;

    public JGameplay() {

        setTitle("JKalango Adventure");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel();
       
    
 
        label.setText( "<html><body style='text-align: center; color: white; font-family: \\\"Press Start 2P\\\", cursive; font-size: 10px; text-shadow: 1px 1px 2px black;'>"
        + "A brisa quente da manhã balançava as folhas da Floresta Sussurrante, onde Jkalango, um jovem "
        + "lagarto com escamas verde-esmeralda e olhos curiosos, passava seus dias caçando insetos e "
        + "sonhando com grandes feitos. Ele era pequeno, é verdade, mas seu coração era do tamanho de "
        + "um cajueiro. A paz da floresta foi quebrada por um lamento distante, um som que fez os pássaros "
        + "se calarem e as folhas pararem de sussurrar. Era o chamado desesperado da Velha Araucária, a "
        + "árvore mais antiga e sábia da região, que há séculos protegia a floresta."
        + " Vocês possuem a maior das tarefas, Jkalango, JFormiga e Abelinha, salvar a princesa do JMago."
        + " Escolha qual o melhor caminho para salvar a princesa:  "
        + "</body></html>"); 
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        //label.setFont(new Font("Serif", Font.PLAIN, 16));
        


        panelFundo = new JPanel();
        panelFundo.setBackground(Color.GRAY);
        panelFundo.setLayout(new BorderLayout());
        add(panelFundo);
  
        JButton starButton =  new JButton(" Vamos para a primeira missão ");
        starButton.setFocusPainted(false);

        add(label, BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelButton.setBackground(Color.BLACK);
        panelButton.add(starButton);
        add(panelButton, BorderLayout.SOUTH);

       

        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new JSegundaMissao();
                Mudarcor();
            }      
        });

        
        setVisible(true);


    }

    @Override
    public void Mudarcor() {
        panelFundo.setBackground(Color.GREEN);
        
    }

    

 




}