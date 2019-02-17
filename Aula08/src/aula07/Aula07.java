package aula07;

import java.util.Random;

public class Aula07 {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];
        
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f);
        
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f);
        
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f);
        
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f);
        
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f);
        
        lutadores[5] = new Lutador("Nerdaart ", "EUA", 30, 1.81f, 105.f);
        
        Luta UFC = new Luta();
        
        for(int i = 0; i < 5; i++){
            Random num_aleatorio = new Random();
            int num1 = num_aleatorio.nextInt(5);
            int num2 = num_aleatorio.nextInt(5);
            
            UFC.marcarLuta(lutadores[num1], lutadores[num2]);
            UFC.lutar(lutadores[num1], lutadores[num2]);
            if(UFC.isAprovado()){
                lutadores[num1].apresentar();
                lutadores[num2].apresentar();
            }
        }
    }   
}
