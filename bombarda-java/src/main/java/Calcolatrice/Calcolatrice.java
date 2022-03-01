/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calcolatrice;

/**
 *
 * @author Studente Turno B
 */
public class Calcolatrice {
    public String operatore;
    public String operando;
    public int state;
    
    public Calcolatrice(){
        operatore = "0";
        operando = "0";
        state = 0;
    }
    public void add(String s){
        if(state == 0){
            operatore += s;
        }else{
            operando += s;
        }
    }
    
    public String getBuffer(){
        if(state == 0)
            return operatore;
        else
            return operando;
    }
    
    public String sum(){
        return String.valueOf(Integer.parseInt(operatore) + Integer.parseInt(operando));
    }
    
    public void reset(){
        operatore = "0";
        operando = "0";
        state = 0;
    }
    
    public void setState(int state){
        this.state = state;
    }

    @Override
    public String toString() {
        return "Calcolatrice{" + "operatore=" + operatore + ", operando=" + operando + ", state=" + state + '}';
    }
    
    
}
