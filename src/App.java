import classes.Animal;
import classes.Gato;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        listarPessaos();
    }
    public static void listarPessaos(){
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa(
        "Rafael",
        "1234567891",
        "29/08/1990",
        'M'
       );

     //   for (int i = 0; i < pessoas.length; i++) {
       //     System.out.println(pessoas[i].getNome());
       //     
      //  }
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.getNome());
                
            }
          //  System.out.println(pessoa);
            
        }

    }
    public static void listarAminias(){

      Animal[] animais = new Animal[5];
      animais[0] = new Gato("angora", "10", "preto", 0.20, 5, 'm');
      animais[1] = new Gato("ciames", "9", "preto", 0.20, 5.5, 'm');
    
        
    }
    }

