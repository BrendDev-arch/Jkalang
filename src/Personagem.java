public abstract class Personagem {
    protected int energia;

    public abstract void mover();

    public abstract void fazerSom();

    public void dormir(int energia){
        this.energia = energia;
    }

    public int getEnergia() {
        energia+=10;
        return energia;
    }

    
}
