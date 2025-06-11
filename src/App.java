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

        
    }
}
