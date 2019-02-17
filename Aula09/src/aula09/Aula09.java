package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa(" Marcelo", 20, " M");
        pessoa[1] = new Pessoa(" Aline", 25, " F");
        
        livro[0] = new Livro(" Aprendendo Java", " José da Silva", 250, pessoa[0]);
        livro[1] = new Livro(" Aprendendo Python", " Jeffeson Rodrigues", 150, pessoa[1]);
        livro[2] = new Livro(" Aprendendo POO", " Leandro Fagundes", 200, pessoa[0]);
        
        livro[0].abrir();
        livro[0].folhear(5);
        livro[0].avancarPag();
        
        livro[2].folhear(45);
        livro[2].voltarPag();
        
        for(int i = 0; i < 3; i++){
            System.out.println(livro[i].detalhes());
        }
    }   
}
