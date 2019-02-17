package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Funcionario f = new Funcionario();
        
        p.setNome("Marcelo");
        p.setSexo("M");
        p.setIdade(20);
        
        a.setNome("Aline");
        a.setSexo("F");
        a.setIdade(25);
        
        pr.setNome("Rayane");
        pr.setSexo("F");
        pr.setIdade(16);
        
        f.setNome("Nayara");
        f.setSexo("F");
        f.setIdade(15);
        
        System.out.println(p.detalhesPessoa());
        System.out.println(a.detalhesPessoa());
        System.out.println(pr.detalhesPessoa());
        System.out.println(f.detalhesPessoa());
    }
}
