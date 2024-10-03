/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch1;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Cual es su edad"));
        
        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "El valor digitado es 1");
                break;
             case 2:
                JOptionPane.showMessageDialog(null, "El valor digitado es 2");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Cualquiera");
        }
    }
    
}
