/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bombarda_11_10;

import bombarda_11_10.Cd;

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
        
        Auto car1 = new Auto("cd404kl", "Lancia", "Y", 1200, 2002, 5);
        System.out.println(car1.getMarca());
        
        Cd cd1 = new Cd("Nevermind", "Nirvana", 7, 48.3f);
        System.out.println(cd1.toString());
        
        Programma pg1 = new Programma("NetBeans", "Apache", "14.3", "windows", "2021");
        System.out.println(pg1.toString());
        
        Computer pc1 = new Computer("Dell", "Ispiron", 4, 8, 180, 27, 2021);
        Computer pc2 = new Computer("Dell", "Ispiron", 4, 16, 180, 27, 2021);
        
        System.out.println("Codice Pc1 = " + pc1.getCodice() + " Codice Pc2 = " + pc2.getCodice());
        
        
    }
    
}
