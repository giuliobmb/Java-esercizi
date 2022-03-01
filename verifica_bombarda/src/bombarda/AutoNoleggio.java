/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombarda;

import java.util.ArrayList;

/**
 *
 * @author CC2-PC11
 */
public class AutoNoleggio {
    private String nome;
    
    private ArrayList veicoli;
    private int cod;
    
    public AutoNoleggio(String nome, int n){
        this.nome = nome;
        veicoli = new ArrayList(n);
        this.cod = 0;
    }
    
    public void addVeicolo(Veicolo v){
        v.setCodice(cod);
        veicoli.add(v);
        cod++;
    }
    
    public ArrayList getVeicoli(){
        return veicoli;
    }
    
    //ritorna posizione del codice inserito o altrimenti -1
    public int ricercaCodice(int codice){
        for(int i=0;i<veicoli.size();i++){
            if(codice == ((Veicolo)veicoli.get(i)).getCodice())
                return i;
        }
        return -1;
    }
    
    //ritorna 1 se successo, 0 se fallito
    public int delVeicolo(int codice){
        int pos = ricercaCodice(codice);
        if(pos != -1){
            for(int i=pos;i<veicoli.size()-1;i++){
                veicoli.add(i, ((Veicolo)veicoli.get(i+1)));
            }
            return 1;
        }else{
            return 0;
        }
    }
    
    //ritorna 1 se successo, 0 se fallito
    public int modificaTarga(int codice, String targa){
        int pos = ricercaCodice(codice);
        if(pos != -1){
            ((Veicolo)veicoli.get(pos)).setTarga(targa);
            return 1;
        }else
            return 0;
    }
    
    public void ordinaMarca(){ 
        Veicolo temp;
        for(int i=0;i<veicoli.size();i++){
            for(int j=0;j<veicoli.size();j++){
                if(((Veicolo)veicoli.get(i)).getMarca().compareToIgnoreCase(((Veicolo)veicoli.get(i)).getMarca()) < 0){
                    temp = ((Veicolo)veicoli.get(i));
                    veicoli.add(i, ((Veicolo)veicoli.get(j)));
                    veicoli.add(i, temp);
                }
                    
            }
        }
    }
    
}
