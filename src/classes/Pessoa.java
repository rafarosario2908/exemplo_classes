package classes;
public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private char genero;
    private String email;

    //metodo construtor
    //metodo construtor vazio
    public Pessoa(){

        
    }
    public Pessoa(String nome, String cpf, String dataNascimento, char genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static void mensagen(){
        System.out.println("esse é um metodo statico");
    }
    

}
