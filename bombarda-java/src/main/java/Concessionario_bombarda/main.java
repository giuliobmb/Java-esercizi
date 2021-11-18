/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Concessionario_bombarda;

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
        consoleIn input = new consoleIn();

        Concessionario c1 = new Concessionario();
        int choose;
        do {
            System.out.println("1. inserire una nuova auto\n2. Visualizzare tutte le auto\n3. Visualizzare i dati della prima auto che abbia il colore passato per parametro\n4. visualizzare i dati di  tutte le auto del concessionario ordinate per marca\n=> ");
            choose = input.readInt();
            switch (choose) {
                case 1:
                    System.out.println("Inserisci la marca: ");
                    String marca = input.readLine();
                    System.out.println("Inserisci il colore");
                    String colore = input.readLine();
                    c1.addAuto(new Auto(marca, colore));
                    break;
                case 2:
                    Auto[] a = c1.getAuto();
                    for (int i = 0; i < c1.getnAuto(); i++) {
                        System.out.println(a[i].toString());
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il colore");
                    String c = input.readLine();
                    Auto am = c1.cercaColore(c);
                    if (am != null) {
                        am.toString();
                    }
                    break;
                case 4:
                    Auto[] atm = c1.sortMarchio();
                    for (int i = 0; i < c1.getnAuto(); i++) {
                        System.out.println(atm[i].toString());
                    }
                    break;

                default:
                    System.out.println("Scelta errata");

            }
        } while (choose != 0);

    }

}
