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
public class Coche {
    String marca;
    int potencia;

    public Coche(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
