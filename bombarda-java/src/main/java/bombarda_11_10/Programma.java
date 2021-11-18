/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bombarda_11_10;

/**
 *
 * @author giuliobmb
 */
public class Programma {
    
    private String denominazione;
    private String produttore;
    private String versione;
    private String sistema_operativo;
    private String anno;

    public Programma(String denominazione, String produttore, String versione, String sistema_operativo, String anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistema_operativo = sistema_operativo;
        this.anno = anno;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Programma{" + "denominazione=" + denominazione + ", produttore=" + produttore + ", versione=" + versione + ", sistema_operativo=" + sistema_operativo + ", anno=" + anno + '}';
    }

    
    public boolean compareAnno(Programma obj){
        if(obj.getAnno() == this.anno)
            return true;
        else
            return false;
    }
    
}
