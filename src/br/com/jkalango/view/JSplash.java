package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSplash extends JFrame {

    public JSplash(){
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
    
