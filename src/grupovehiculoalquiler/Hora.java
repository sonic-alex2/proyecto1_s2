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
import java.util.Calendar;

public class Hora {
   
    
    private String hora_registro;
    
    Calendar calendario = Calendar.getInstance();
    
    public Hora(){
        
        this.hora_registro = "00:00:00";
    }
    
   

    public void setHora_registro(String hora_registro) {
        this.hora_registro = hora_registro;
    }

    public String getHora_registro() {
        return hora_registro;
    }
    
    public String horaActual(){
        int seg = calendario.get(Calendar.SECOND);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        return hora+":"+minutos+":"+seg;
    }
    
}
