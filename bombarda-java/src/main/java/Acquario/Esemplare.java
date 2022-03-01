/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acquario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Studente Turno B
 */
public class Esemplare {
    protected String id;
    protected LocalDate nascita;
    public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Esemplare(String id, LocalDate nascita) {
        this.id = id;
        this.nascita = nascita;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }

    @Override
    public String toString() {
        return "Esemplare{" + "id=" + id + ", nascita=" + nascita + ", formatter=" + formatter + '}';
    }
    
    
}


