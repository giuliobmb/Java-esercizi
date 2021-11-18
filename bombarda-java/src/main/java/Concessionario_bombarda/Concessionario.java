/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concessionario_bombarda;

import java.util.Arrays;

/**
 *
 * @author giuliobmb
 */
public class Concessionario {

    private Auto[] automobili;
    private int nAuto;

    public Concessionario() {
        automobili = new Auto[15];
        nAuto = 0;
    }

    public int addAuto(Auto a) {
        try {
            automobili[nAuto] = a;
            nAuto++;
            return 0;
        } catch (Exception e) {
            System.out.println("C'è stato un errore nel inserimento della auto");
            return -1;
        }
    }

    public Auto[] getAuto() {
        return automobili;
    }

    public Auto cercaColore(String colore) {
        for (int i = 0; i < nAuto; i++) {
            if (colore.equals(automobili[i].getColore())) {
                return automobili[i];
            }
        }
        return null;
    }

    public Auto[] sortMarchio() {
        Auto[] autoOrdinate;
        autoOrdinate = automobili;

        Arrays.sort(autoOrdinate);

        return autoOrdinate;

    }

       public int getnAuto(){
           return nAuto;
       }
}
