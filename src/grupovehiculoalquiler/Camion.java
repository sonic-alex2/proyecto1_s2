/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupovehiculoalquiler;

/**
 *
 * @author soportesw
 */
public class Camion extends Vehiculo {
    
    private String tipo;

    public Camion() {
        this.tipo = "Camion";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
