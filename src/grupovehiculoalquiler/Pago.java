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
public class Pago {
    double monto;
    

    public Pago(double monto) {
        this.monto = monto;
        
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    /**
     *
     * @param segundosusados
     * @return
     */
    public double totalPago(int segundosusados){
        double total = this.monto *segundosusados;
        return total;
    }   

    @Override
    public String toString() {
        return "Pago{" + "monto=" + monto + '}';
    }
    
}
