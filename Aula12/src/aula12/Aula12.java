package aula12;

public class Aula12 {

    public static void main(String[] args) {
       // Animal a = new Animal(); // Erro, Class Animal é abstrata
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru c = new Canguru();
       Cobra co = new Cobra();
       Tartaruga t = new Tartaruga();
       GoldFish g = new GoldFish();
       Arara ar = new Arara();
       Cachorro ca = new Cachorro();
      
       
       m.locomover();
       ca.locomover();
       a.locomover();
       p.locomover();
       r.locomover();
       c.locomover();
       
       System.out.println("\n");
       
       m.emitirSom();
       ca.emitirSom();
       a.emitirSom();
       p.emitirSom();
       r.emitirSom();
       c.emitirSom();
          
    }  
}
