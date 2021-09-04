/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupovehiculoalquiler;

import com.itextpdf.text.DocumentException;


/**
 *1
 * @author alx-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws com.itextpdf.text.DocumentException
     * 
     */
    public static void main(String[] args) throws DocumentException {
        // TODO code application logic here
        
        Acciones tVehiculo = new Acciones();
        tVehiculo.menu();
    }
    
}
