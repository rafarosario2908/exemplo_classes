package classes;

public class Cachorro extends Animal {

    private int vidas;

    public Cachorro(String nome, String idade, String cor, double tamanho, double peso, char genero) {
        super(nome, idade, cor, tamanho, peso, genero);
        this.vidas =1; 
       
    }

    public int getVidas() {
        return vidas;
    }
    
    
}
