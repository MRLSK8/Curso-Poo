package aula11;

public class Aula11 {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();  //Erro, class abstrata
         
        Visitante v1 = new Visitante();
        v1.setNome("Marcelo");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Aline");
        a1.setMatricula(123456);
        a1.setCurso("SI");
        a1.setIdade(25);
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(14588);
        b1.setNome("Nayara");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
      
    } 
}
