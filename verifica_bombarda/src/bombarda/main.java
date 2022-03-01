/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombarda;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author CC2-PC11
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        AutoNoleggio a = new AutoNoleggio("NoleggioAuto", 100);
        int c;
        
        a.addVeicolo(new Veicolo("aa112bb", "lancia", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "opel", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "dacia", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "alfa", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "alfa", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "alfa", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "alfa", "y" , 5));
        a.addVeicolo(new Veicolo("aa112bb", "opel", "y" , 5));
        //veicoli messi manualmente per debug
        do{
            System.out.println("Premi 1 per inserire un veicolo\npremi 2 per visualizzare i veicoli\npremi 3 per eliminare un veicolo dato il codice\npremi 4 per ordinare i veicoli rispetto alla marca\npremi 5 per modificare la targa dato il codice\npremi 6 per visualizzare il numero di veicoli di ogni marca\n=>");
            c = sc.nextInt();
            switch(c){
                case 1:
                    Veicolo v = defV();
                    if(v != null)
                        a.addVeicolo(v);
                    break;
                case 2:
                    System.out.println(a.getVeicoli().toString());
                    break;
                case 3:
                    System.out.println("Inserisci il codice: ");
                    if(a.delVeicolo(sc.nextInt()) == 1)
                        System.out.println("Veicolo eliminato");
                    else
                        System.out.println("errore");
                    break;
                case 4:
                    a.ordinaMarca();;
                    break;
                case 5:
                    System.out.println("Inserisci il codice: ");
                    int codice = sc.nextInt();
                    System.out.println("Inserisci la nuova targa: ");
                    String ta = sc.nextLine(); // non so perchè questa nextLine() non la prende
                    ta = sc.nextLine();
                    if(a.modificaTarga(codice, ta) == 1)
                        System.out.println("targa aggiornata");
                    else
                        System.out.println("errore");
                    break;
                case 6:
                    a.ordinaMarca();
                    ArrayList vc = a.getVeicoli();
                    
                    int nVeicoli=0;
                    
                    for(int i=0;i<vc.size();i++){
                        for(int j=0;j<vc.size();j++){
                           if(((Veicolo)vc.get(i)).getMarca().equalsIgnoreCase(((Veicolo)vc.get(j)).getMarca()) == true)
                               nVeicoli++;
                        }
                        System.out.println("Marca: " + ((Veicolo)vc.get(i)).getMarca() + " Qauntità: " + nVeicoli);
                        i += nVeicoli-1;
                        nVeicoli = 0;
                 
                    }
                    break;    
            }
        }while(c != 0);
        
        
    }
    
    public static Veicolo defV(){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Inserisci targa: ");
        String t = sc.nextLine();
        System.out.println("Inserisci marca: ");
        String marca = sc.nextLine();
        System.out.println("Inserisci modello: ");
        String modello = sc.nextLine();
        System.out.println("Inserisci posti: ");
        int posti = sc.nextInt();
        return new Veicolo(t, marca, modello, posti);
        }catch(Exception e){
            System.out.println("Errore: " + e.getMessage());
            return null;
        }
        
    }
}
