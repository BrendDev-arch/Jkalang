public class Kalango extends Personagem{

    @Override
    public void mover() {
        System.out.println(" O Kalango Trabalhando: " + "\n");
        int energy = super.getEnergia();
        boolean continuar = true;
        energy = 12;
        if (continuar) { 
            while (energy > 4) { 
                continuar = false;
                energy = energy - 3;
                System.out.println("Movendo.... Energia: "+ energy + "\n");
            }
        }
    }
        
    @Override
    public void fazerSom() {
        System.out.println( "Fazendo som: Tssss!");
        
    }

    @Override
    public void dormir(int energia) {    
        super.dormir(energia);
        boolean continuar = true;
        if(continuar) {  
            while (energia < 25){
                continuar = false;
                energia = energia + 5; 
            }
            System.out.println("Dormindo... Energia: " + energia);      
        }
    }
    public void comer() {
        int energiaComendo = super.getEnergia();
        energiaComendo = 25;
        if (energiaComendo <= 45 ) {
            for(int i = 0 ; i <= 10 ; i++){
                energiaComendo++;  
            }
            System.out.println("Comendo... Energia: " + energiaComendo);
        }
    }
    @Override
    public void cansado() {
        int energy = super.getEnergia();
        energy = 5;            
        if (energy <= 5 ){
            for(int i = 0 ; i <= 2 ; i++){
                energy--;  
            }
            System.out.println("cansada... Energia: " + energy);
        }
    } 

    public void setNome(String nome){
        super.setNome(nome);
        System.out.println(super.getNome());     
    }
}
