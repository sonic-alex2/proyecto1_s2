/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupovehiculoalquiler;

/**
 *
 * @author alx-pc
 */
public class Moto extends Vehiculo{
    private String tipo1;

    /**
     *
     * @param tipo1
     * @param matricula
     * @param modelo
     * @param color
     * @param tipo
     */
    public Moto(String tipo1, String matricula, String modelo, String color, String tipo) {
        super(matricula, modelo, color, tipo);
        this.tipo1 = tipo;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTipo() {
        return tipo1;
    }

    /**
     *
     * @param tipo
     */
    @Override
    public void setTipo(String tipo) {
        this.tipo1 = tipo;
    }

    @Override
    public String toString() {
        return "Moto{" + "tipo=" + tipo1 + '}';
    }
    
    
    
    
}
