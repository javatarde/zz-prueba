/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zz.prueba;

/**
 *
 * @author Formacion
 */
public class ZzPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche = new Coche("Porsche", 550);
        
        System.out.println("El coche es: " + coche.getMarca()+" de "+ coche.getPotencia());
                
    }
    
}
