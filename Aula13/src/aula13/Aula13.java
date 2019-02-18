package aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Mamifero m = new Mamifero();
        m.emitirSom();
        
        System.out.println("\n-----------------\n");
        
        c.reagir("ola");
        c.reagir("Vai apanhar");
        c.reagir(true);
        c.reagir(false);
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
