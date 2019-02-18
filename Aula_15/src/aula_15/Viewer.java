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
public class Viewer extends Pessoa{
    private String login; 
    private int totalAssistido;

    public Viewer(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    
    public void verMaisUm(){
        this.totalAssistido += 1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String descricao() {
        return super.descricao() + "login = " + login + ", totalAssistido = " + totalAssistido + "\n";
    }
}
