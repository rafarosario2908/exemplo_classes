package classes;

public class Gato extends Animal{

    private int vidas;
    private int quantidadeOlhaos;

 

    public Gato(String nome, String idade, String cor, double tamanho, double peso, char genero) {
        super(nome, idade, cor, tamanho, peso, genero);
    }

    public Gato(String nome, String idade, String cor, double tamanho, double peso, char genero, int vidas, int quantidadeOlhaos) {
        super(nome, idade, cor, tamanho, peso, genero);
        this.vidas = vidas;
        this.quantidadeOlhaos=quantidadeOlhaos; 
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }


    
    
}
