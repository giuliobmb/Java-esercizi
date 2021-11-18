/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bombarda_11_10;

/**
 *
 * @author giuliobmb
 */
public class Auto {
    
    private String targa;
    private String marca;
    private String modello;
    private int cilindrata;
    private int anno_di_acquisto;
    private int numero_di_posti;

    public Auto(String targa, String marca, String modello, int cilindrata, int anno_di_acquisto, int numero_di_posti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.anno_di_acquisto = anno_di_acquisto;
        this.numero_di_posti = numero_di_posti;
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

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getAnno_di_acquisto() {
        return anno_di_acquisto;
    }

    public void setAnno_di_acquisto(int anno_di_acquisto) {
        this.anno_di_acquisto = anno_di_acquisto;
    }

    public int getNumero_di_posti() {
        return numero_di_posti;
    }

    public void setNumero_di_posti(int numero_di_posti) {
        this.numero_di_posti = numero_di_posti;
    }
    
}
