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
public class Pesce extends Esemplare{
    
    protected float profondita;
    
    public Pesce(String id, LocalDate nascita, float profondita) {
        super(id, nascita);
        this.profondita = profondita;
    }

    public float getProfondita() {
        return profondita;
    }

    public void setProfondita(float profondita) {
        this.profondita = profondita;
    }

    @Override
    public String toString() {
        return "Pesce{" + "profondita=" + profondita + ", id=" + super.id + "}";
    }
    
    
}
