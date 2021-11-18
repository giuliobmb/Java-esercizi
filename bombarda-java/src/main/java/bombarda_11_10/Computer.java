/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bombarda_11_10;

/**
 *
 * @author giuliobmb
 */
public class Computer {
    private static int codice_base = 0;
    private int codice;
    private String marca;
    private String modello;
    private float velocita_del_processore;
    private float dimensione_ram;
    private float dimensione_disco;
    private float dimensione_monitor;
    private int anno_di_acquisto;

    public Computer(String marca, String modello, float velocita_del_processore, float dimensione_ram, float dimensione_disco, float dimensione_monitor, int anno_di_acquisto) {
        Computer.codice_base += 1;
        codice = Computer.codice_base;
        this.marca = marca;
        this.modello = modello;
        this.velocita_del_processore = velocita_del_processore;
        this.dimensione_ram = dimensione_ram;
        this.dimensione_disco = dimensione_disco;
        this.dimensione_monitor = dimensione_monitor;
        this.anno_di_acquisto = anno_di_acquisto;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
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

    public float getVelocita_del_processore() {
        return velocita_del_processore;
    }

    public void setVelocita_del_processore(float velocita_del_processore) {
        this.velocita_del_processore = velocita_del_processore;
    }

    public float getDimensione_ram() {
        return dimensione_ram;
    }

    public void setDimensione_ram(float dimensione_ram) {
        this.dimensione_ram = dimensione_ram;
    }

    public float getDimensione_disco() {
        return dimensione_disco;
    }

    public void setDimensione_disco(float dimensione_disco) {
        this.dimensione_disco = dimensione_disco;
    }

    public float getDimensione_monitor() {
        return dimensione_monitor;
    }

    public void setDimensione_monitor(float dimensione_monitor) {
        this.dimensione_monitor = dimensione_monitor;
    }

    public int getAnno_di_acquisto() {
        return anno_di_acquisto;
    }

    public void setAnno_di_acquisto(int anno_di_acquisto) {
        this.anno_di_acquisto = anno_di_acquisto;
    }
    
    
    
}
