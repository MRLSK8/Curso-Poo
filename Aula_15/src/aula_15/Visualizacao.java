/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_15;

/**
 *
 * @author Aline
 */
public class Visualizacao {
    private Viewer espectador;
    private Video filme;

    public Visualizacao(Viewer espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Viewer getEspectador() {
        return espectador;
    }

    public void setEspectador(Viewer espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    };
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    };
      
    public void avaliar(float porc){
        int tot;
        
        if (porc <= 20) {
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    };

    public String descricao() {
        return "Visualizacao -> " + "espectador = " + espectador.descricao() + ", filme = " + filme.getTitulo() + "\n";
    }
    
    
}
