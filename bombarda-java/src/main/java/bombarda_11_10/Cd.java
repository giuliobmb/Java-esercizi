/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bombarda_11_10;

/**
 *
 * @author giuliobmb
 */
public class Cd {
    
    private String titolo;
    private String autore;
    private int numero_brani;
    private float durata;

    public Cd(String titolo, String autore, int numero_brani, float durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numero_brani = numero_brani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumero_brani() {
        return numero_brani;
    }

    public void setNumero_brani(int numero_brani) {
        this.numero_brani = numero_brani;
    }

    public float getDurata() {
        return durata;
    }

    public void setDurata(float durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Cd{" + "titolo=" + titolo + ", autore=" + autore + ", numero_brani=" + numero_brani + ", durata=" + durata + '}';
    }
    
    public boolean compareDurata(Cd obj){
        if(obj.getDurata() == this.durata)
            return true;
        else
            return false;
    }
    
}
