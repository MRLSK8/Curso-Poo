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
public class Aula_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[2];
        Viewer viewer[] = new Viewer[2];
        
        v[0] = new Video(" Aula de poo");
        v[1] = new Video(" Aula de php");
        
        viewer[0] = new Viewer("Marcelo", 20, "M", "mrlsk8");
        viewer[1] = new Viewer("Aline", 25, "F", "Nyne");
        
        
        Visualizacao vi = new Visualizacao(viewer[0], v[1]);
        vi.avaliar();
        
        Visualizacao vs = new Visualizacao(viewer[0], v[0]);
        vs.avaliar(15);
       
        
        Visualizacao va = new Visualizacao(viewer[0], v[1]);
        va.avaliar(10);
        
        Visualizacao vb = new Visualizacao(viewer[1], v[0]);
        vb.avaliar(50.0f);
        
        
        System.out.println(viewer[0].descricao());
        System.out.println(viewer[1].descricao());
        
        System.out.println(v[1].descricao());
        System.out.println(v[0].descricao());
    }
    
}
