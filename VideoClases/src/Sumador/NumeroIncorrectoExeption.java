/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumador;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */

public class NumeroIncorrectoExeption extends Exception {

    public NumeroIncorrectoExeption(String msg) {
        super(msg);
        
    }
    
    public void mensaje(){
        
        JOptionPane.showMessageDialog(null, "Dato no valido");
    }
    
  
}