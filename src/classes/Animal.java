package classes;

public class Animal {
    private String nome;
    private String idade;
    private String cor;
    private double tamanho;
    private double peso;
    private char genero;

    public Animal(String nome, String idade, String cor, double tamanho, double peso, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
}
