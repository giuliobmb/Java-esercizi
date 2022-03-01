/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calcolatrice;

import java.awt.*;
import java.awt.event.*;


import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Studente Turno B
 */
public class GraficaC extends Frame implements ActionListener, WindowListener {
    
    public ArrayList bottoni;
    public Panel pText;
    public Panel pButtons;
    public TextField text;
    public Calcolatrice c;
    
    public GraficaC(){
        super("Calcolatrice");
        
        c = new Calcolatrice();
        
        super.setSize(500, 500);
        
        super.addWindowListener(this);
        
        bottoni = new ArrayList();
        pText = new Panel();
        pButtons = new Panel();
        text = new TextField("0", 50);
        
        super.add(pText, BorderLayout.NORTH);
        super.add(pButtons, BorderLayout.CENTER);
       
        text.setSize(100, 100);
        pText.add(text);
        
        pButtons.setLayout(new GridLayout(4, 3));
        
        for(int i=0;i<9;i++){
            bottoni.add(new Button(String.valueOf(i+1)));
            pButtons.add((Button)bottoni.get(i));
            ((Button)bottoni.get(i)).addActionListener(this);
        }
        bottoni.add(new Button(String.valueOf(0)));
        pButtons.add((Button)bottoni.get(9));
        ((Button)bottoni.get(9)).addActionListener(this);
        
        Button plus = new Button("+");
        Button equals = new Button("=");
        //Button reset = new Button("C");
        
        pButtons.add(plus);
        pButtons.add(equals);
        //pButtons.add(reset);
        
        plus.addActionListener(this);
        equals.addActionListener(this);
        //reset.addActionListener(this);
        
        super.setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            switch(((Button)e.getSource()).getLabel()){
                case "0":
                    c.add("0");
                    text.setText(c.getBuffer());
                    break;
                case "1":
                    c.add("1");
                    text.setText(c.getBuffer());
                    break;
                case "2":
                    c.add("2");
                    text.setText(c.getBuffer());
                    break;
                case "3":
                    c.add("3");
                    text.setText(c.getBuffer());
                    break;
                case "4":
                    c.add("4");
                    text.setText(c.getBuffer());
                    break;
                case "5":
                    c.add("5");
                    text.setText(c.getBuffer());
                    break;
                case "6":
                    c.add("6");
                    text.setText(c.getBuffer());
                    break;
                case "7":
                    c.add("7");
                    text.setText(c.getBuffer());
                    break;
                case "8":
                    c.add("8");
                    text.setText(c.getBuffer());
                    break;
                case "9":
                    c.add("9");
                    text.setText(c.getBuffer());
                    break;
                case "+":
                    c.setState(1);
                    text.setText(c.getBuffer());
                    break;
                case "=":
                    text.setText(c.sum());
                    c.reset();
                    break;

                
            }
             
        }catch(Exception ex){}
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Chiusura programma");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
