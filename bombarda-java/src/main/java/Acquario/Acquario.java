/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acquario;

import java.util.ArrayList;

/**
 *
 * @author Studente Turno B
 */
public class Acquario {
    private ArrayList acquario;
    
    public Acquario(){
        this.acquario = new ArrayList();
    }
    
    public int addEsemplare(Object e){
        if(e.getClass() == Mammifero.class || e.getClass() == Pesce.class){
            acquario.add(e);
            return 1;
        }
        return 0;
    }
    public ArrayList getAcquario(){
        return acquario;
    }
    
    public void delEsemplare(String id){
        acquario.forEach((Object Es) -> {
            if(((Esemplare)Es).id.compareToIgnoreCase(id) == 0){
                acquario.remove(Es);
            }
        });
    }
    public int contaFemmine(){
        int cont=0;
        acquario.forEach((Object Es) -> {
            if(((Esemplare)Es).getClass() == Mammifero.class && ((Mammifero)Es).getSesso().compareToIgnoreCase("F") == 0){
                cont += 1;
            }
        });
        return cont;
    }
    
}
