package aula07;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
        
        if(l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada com sucesso!\n");
        }else{
            System.out.println(" A luta não pôde acontecer");
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(Lutador l1, Lutador l2){
        if(this.isAprovado()){
            System.out.println(" -*-*-*-*-*-*- NOVA LUTA -*-*-*-*-*-*-");
            System.out.println("Apresentando os lutadores....");
            System.out.println("Lutador 1: ");
            this.getDesafiado().apresentar();
            System.out.println("Lutador 2: ");
            this.getDesafiante().apresentar();
            
            Random random = new Random();
            int vencedor = random.nextInt(3);
            System.out.println("############### Resultado ##################");
            switch(vencedor){
                case 0:
                    System.out.println("A luta empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                break;
                case 1:
                    System.out.println("Vitoria do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                break;                 
                case 2:
                    System.out.println("Vitoria do " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                break;
            }
            
        }else{
            System.out.println(" A luta não pode acontecer porque não foi aprovada!\n\n");
        }
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
