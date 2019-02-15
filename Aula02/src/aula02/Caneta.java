package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! A caneta está tampada, não pode rabiscar!");
        }else{
            System.out.println("Rabiscando....");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void status(){
        System.out.println("Uma caneta de cor: " + this.cor + ", modelo: " + this.modelo + " e ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }
}
