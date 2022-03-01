/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patente;
package java.time.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author giuliobmb
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        
        LocalDate data = LocalDate.of(2004, 8, 6);
        
        System.out.println(data.isBefore(LocalDate.now()));
        
    }
    
}
