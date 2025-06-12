
import java.awt.BorderLayout;

import javax.swing.JLabel;

import br.com.jkalango.view.JGame;
import br.com.jkalango.view.JSplash;

public class App {
    public static void main(String[] args) throws Exception {
        Formiga f  = new Formiga();
        f.setNome("------Formiga----" + "\n");
        System.out.println("\n");
        f.mover();
        System.out.println("\n");
        f.cansado();
        System.out.println("\n");
        f.fazerSom();
        System.out.println("\n");
        f.dormir(10);
        System.out.println("\n");
        f.comer();
        System.out.println("\n");
        f.atacar();
        System.out.println("\n");
        Kalango k = new Kalango();
        k.setNome("-------Kalango----------"  + "\n");
        System.out.println("\n");
        k.mover();
        System.out.println("\n");
        k.cansado();
        System.out.println("\n");
        k.fazerSom();
        System.out.println("\n");
        k.dormir(10);
        System.out.println("\n");
        k.comer();
        System.out.println("\n");
        k.atacar();
        System.out.println("\n");
        Abelinha A = new Abelinha();
        A.setNome("------Abelinha----"  + "\n");
        System.out.println("\n");
        A.mover();
        System.out.println("\n");
        A.cansado();
        System.out.println("\n");
        A.fazerSom();
        System.out.println("\n");
        A.dormir(10);
        System.out.println("\n");
        A.comer();
        System.out.println("\n");
        A.atacar();

    
       JGame janela = new JGame();

       JLabel label = new JLabel();
       String textoLong = " A brisa quente da manhã balançava as folhas da Floresta Sussurrante, onde Jkalango, um jovem" + "\n"+
                "lagarto com escamas verde-esmeralda e olhos curiosos, passava seus dias caçando insetos e" + "\n" + 
                "sonhando com grandes feitos. Ele era pequeno, é verdade, mas seu coração era do tamanho de " + "\n" + 
               " um cajueiro. A paz da floresta foi quebrada por um lamento distante, um som que fez os pássaros" + "\n" +
                "se calarem e as folhas pararem de sussurrar. Era o chamado desesperado da Velha Araucária, a" + "\n" +
                " árvore mais antiga e sábia da região, que há séculos protegia a floresta.";

       label.setText("<html><body style='width: 200px;'>" + textoLong + "</body></html>"); 

       janela.add(label, BorderLayout.CENTER);



       

       

    }
}
