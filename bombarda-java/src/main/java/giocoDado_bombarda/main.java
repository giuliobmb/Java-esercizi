/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giocoDado_bombarda;

/**
 *
 * @author Studente Turno B
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        consoleIn in = new consoleIn();
        Dado d1, d2;
        Giocatore g1, g2;
        
        System.out.println("Inserisci quante facce avra' il dado: ");
        d1 = new Dado(in.readInt());
        d2 = new Dado(d1.getFacce());
        
        System.out.println("Inserisci il nome del primo giocatore: ");
        g1 = new Giocatore(in.readLine());
        
        System.out.println("Inserisci il nome del secondo giocatore: ");
        g2 = new Giocatore(in.readLine());
        
        do{
            System.out.println(g1.getNome() + " digita l per lanciare il dado");
            d1.lancia();
            in.readChar();
            System.out.println(g2.getNome() + " digita l per lanciare il dado");
            d2.lancia();
            in.readChar();
            System.out.println(g1.getNome() + ": " + d1.getNum());
            System.out.println(g2.getNome() + ": " + d2.getNum());
            
            if(d1.getNum() > d2.getNum()){
                g1.addPunteggio();
                System.out.println("Ha vinto " + g1.getNome() + " il suo punteggio e' di: " + g1.getPunteggio());
            }else if(d1.getNum() == d2.getNum())
                System.out.println("Pareggio, si continua il gioco");
            else{
                g2.addPunteggio();
                System.out.println("Ha vinto " + g2.getNome() + " il suo punteggio e' di: " + g2.getPunteggio());
            }
        }while(g1.getPunteggio() <= 100 || g2.getPunteggio() <= 100);
        
        
        if(g1.getPunteggio() > g2.getPunteggio())
            System.out.println("Game over ha vinto " + g1.getNome());
        else
            System.out.println("Game over ha vinto " + g2.getNome());
        
        
    }   
}
    
