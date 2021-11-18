/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author giuliobmb
 */
public class Persona {
    
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(int eta, String nome, String sesso, String professione) {
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }
    
    public String chiSei(){
        return "Sono una persona di nome: " + nome + " sesso: " + sesso + " età: " + eta + " professione: " + professione;
    }
}
