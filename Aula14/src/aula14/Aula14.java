/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Aline
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[2];
        
        v[0] = new Video(" Aula de poo");
        v[1] = new Video(" Aula de php");
        
        System.out.println(v[0].descricao());
        System.out.println(v[1].descricao());
        
        System.out.println("\n --------------------------------- \n");
        
        Viewer viewer[] = new Viewer[2];
        
        viewer[0] = new Viewer("Marcelo", 20, "M", "mrlsk8");
        viewer[1] = new Viewer("Aline", 25, "F", "Nyne");
         
        System.out.println(viewer[0].descricao());
        System.out.println(viewer[1].descricao());

    }
    
}
