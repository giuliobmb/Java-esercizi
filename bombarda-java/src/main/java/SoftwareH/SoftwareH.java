/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoftwareH;

/**
 *
 * @author giuliobmb
 */
public class SoftwareH {
    private Programma libreria[];
    private int dim;
    
    public SoftwareH(int dim){
        libreria = new Programma[dim];
    }
    
    public void addSw(Programma sw){
        libreria[dim] = sw;
        dim++;
    }
    
    public Programma[] getLibreria(){
        return libreria;
    }
    public int getDim(){
        return dim;
    }
    
    public int confrontaSW(SoftwareH sw){
        int common = 0;
        for(int i=0;i<sw.getDim();i++){
            for(int j=0;j<dim;j++){
                if(sw.getLibreria()[i].getNome().equalsIgnoreCase(libreria[j].getNome()))
                    common++;
            }    
        }
        return common;
    }
    
}
