public class Formiga extends Personagem{
    @Override
    public void mover() {
        System.out.println(" Formiga Trabalhando: " + "\n");
        int energy = super.getEnergia();
        boolean continuar = true;
        energy = 10;
        if (continuar) { 
            while (energy > 4) { 
                continuar = false;
                energy = energy - 2;
                System.out.println("Movendo.... Energia: " +  energy + "\n");
            }
        } 
    }
    
        
    @Override
    public void fazerSom() {
        System.out.println( "Fazendo som: Fzzzz!");
        
    }

    @Override
    public void dormir(int energia) {    
        super.dormir(energia);
        boolean continuar = true;
        if(continuar) {  
            while (energia < 14){
                continuar = false;
                energia = energia + 2; 
            }
            System.out.println("Dormindo... Energia: " + energia);      
        }
    }

    @Override
    public void comer() {
        int energiaComendo = super.getEnergia();
        energiaComendo = 14;
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
        if (energy <=  5 ){
            for(int i = 0 ; i <= 2 ; i++){
                energy--;  
            }
            System.out.println("cansada... Energia: " + energy);
        }
    }


    public void setNome(String nome){
        super.setNome(nome);
        System.out.println( super.getNome());
        
    }
    
}






    

   



