/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupovehiculoalquiler;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alx-pc
 */
public class Imprimir{
    private String guardar;
    
    /**
     *
     */
    public Imprimir() {
    }

    /**
     *
     * @return
     */
    public String getGuardar() {
        return guardar;
    }

    /**
     *
     * @param guardar
     */
    public void setGuardar(String guardar) {
        this.guardar = guardar;
    }

    /**
     *
     * @param enviar
     */
    public Imprimir(String enviar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @param p
     * @throws DocumentException
     */
    public void imprimirEntrada(String p) throws DocumentException{ 
    
    try {   
            Hora h = new Hora();
            Document document = new Document();
            String dest = "ticketentrada.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
            
            
            Phrase header = new Phrase("***");
            var a = new Phrase("\n\n                    Ticket\n\n\n Hora entrada: ");
            this.guardar = h.horaActual();
            var b = new Phrase(h.horaActual());
            var c = new Phrase(p);
            var d = new Phrase("\n\n\n\n                  Bienvenido!");
            
            document.add(a);
            document.add(b);
            document.add(c);
            document.add(d);
            document.close();
             
            System.out.println("Ticket creado");
             
        } catch (FileNotFoundException | java.util.InputMismatchException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param ab
     * @param bb
     * @throws DocumentException
     */
    public void imprimirSalida(String ab, String bb) throws DocumentException{ 
    
    try {   
            
            Hora h = new Hora();
            Vehiculo v = new Vehiculo();
        
            Document document = new Document();
            String dest = "ticketsalida.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
            
            
            Phrase header = new Phrase("***");
            var a = new Phrase("\n\n            Ticket\n\n\n Hora de salida: ");
            var b = new Phrase(h.horaActual());
            var g = new Phrase(v.getHora());
            var c = new Phrase(ab);
            var d = new Phrase("\n");
            var e = new Phrase(bb);
            var f = new Phrase("\n\n\n\n          Regresa pronto!");
            
            document.add(a);
            document.add(b);
            document.add(g);
            document.add(c);
            document.add(d);
            document.add(e);
            document.add(f);
            
            document.close();
             
            System.out.println("Ticket creado");
             
        } catch (FileNotFoundException | java.util.InputMismatchException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
