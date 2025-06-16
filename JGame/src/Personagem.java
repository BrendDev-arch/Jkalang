public abstract class Personagem {
    protected int energia;

    private String nome;

    public abstract void mover();

    public abstract void fazerSom();

    public abstract void comer();

    public abstract void cansado();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void dormir(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return energia;
    }

}