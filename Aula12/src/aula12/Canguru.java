package aula12;

public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        // super.locomover();
        System.out.println("Saltando");
    }
    
}
