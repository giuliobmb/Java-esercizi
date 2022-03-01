/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombarda;

/**
 *
 * @author CC2-PC11
 */
public class Veicolo {
    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int posti;

    public Veicolo(String targa, String marca, String modello, int posti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.posti = posti;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    @Override
    public String toString() {
        return "Veicolo{" + "codice=" + codice + ", targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", posti=" + posti + '}';
    }
    
    
}
