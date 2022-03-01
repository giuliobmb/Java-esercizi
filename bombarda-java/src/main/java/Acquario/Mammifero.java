/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acquario;

import java.time.LocalDate;

/**
 *
 * @author Studente Turno B
 */
public class Mammifero extends Esemplare {
    
    protected String sesso;
    protected int gestazione;

    public Mammifero(String id, LocalDate nascita, String sesso) {
        super(id, nascita);
        this.sesso = sesso;
        this.gestazione = 0;
    }
    
    public Mammifero(String id, LocalDate nascita, String sesso, int gestazione) {
        super(id, nascita);
        this.sesso = sesso;
        this.gestazione = gestazione;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getGestazione() {
        return gestazione;
    }

    public void setGestazione(int gestazione) {
        this.gestazione = gestazione;
    }

    @Override
    public String toString() {
        return "Mammifero{" + "sesso=" + sesso + ", gestazione=" + gestazione + '}';
    }
    
}
