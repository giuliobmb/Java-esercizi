/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SoftwareH;

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
        SoftwareH s1 = new SoftwareH(5);
        SoftwareH s2 = new SoftwareH(5);
        
        s1.addSw(new Programma("netbeans"));
        s2.addSw(new Programma("netbeans"));
        
        s1.addSw(new Programma("vscode"));
        s2.addSw(new Programma("vscode"));
        
        System.out.println(s1.confrontaSW(s2));
        
    }
    
}
