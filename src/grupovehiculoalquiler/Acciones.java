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
import com.itextpdf.text.DocumentException;
import java.util.Scanner;

/**
 *
 * @author alx-pc
 */
public class Acciones {
    private String enviar;
    private String salir;

    /**
     *
     * @return
     */
    public String getSalir() {
        return salir;
    }

    /**
     *
     * @param salir
     */
    public void setSalir(String salir) {
        this.salir = salir;
    }
    
    /**
     *
     * @return
     */
    public String getEnviar() {
        return enviar;
    }

    /**
     *
     * @param enviar
     */
    public void setEnviar(String enviar) {
        this.enviar = enviar;
    }
    
    /**
     *
     */
    public Acciones() {
    }
    
    Scanner entrada = new Scanner(System.in);
    short opc1,opc2,aux;
    Vehiculo autos[]= null;
    Vehiculo aux2;
    
    Hora tiempo = new Hora();
    
    /**
     *
     */
    public void printArr(){
        if(autos!=null){
            for (int i = 0; i < autos.length; i++) {
                System.out.print("Lugar ["+i+"] = ");
                System.out.println(autos[i]);
            }
        }
        else    System.out.println("-El estacionamiento esta cerrado-");
    }
    
    /**
     *
     * @param abrirEst
     */
    public void abrirEst(int abrirEst){
        
        if(autos==null){
            this.autos = new Vehiculo[abrirEst];
            System.out.println("-Estacionamiento abierto-");
            System.out.println("Tiempo actual: "+ tiempo.horaActual());
        }
        else    System.out.println("-El estacionamiento ya fue abierto-");
        printArr();
    }
    
    /**
     *
     * @throws DocumentException
     */
    public void asignarLugar() throws DocumentException{
        if(autos != null){
            System.out.println("\nIngrese el lugar para estacionar el vehiculo:");
            opc1 = entrada.nextShort();
            
            
            
            if(opc1>=0 && opc1<autos.length ){
                System.out.println("Ingrese la matricula del vehiculo: ");
                String matricula = entrada.next();
                System.out.println("Ingrese el modelo del vehiculo: ");
                String modelo = entrada.next();
                
                System.out.println("Ingrese el color del vehiculo: ");
                String color = entrada.next();
                
                System.out.println("Digite el tipo de vehiculo, acontinuacion las opciones:");
                System.out.println(" ->  moto");
                System.out.println(" ->  carro");
                System.out.println(" ->  camion");
                String tipo = entrada.next();
                
                Hora h = new Hora();
                
                autos[opc1]=new Vehiculo(matricula,modelo,color,tipo);
                autos[opc1].setHora(h.horaActual());
                
                this.enviar = autos[opc1].toString(); 
                System.out.print("\nAutomovil asignado en lugar ["+opc1+"] : "+autos[opc1]); 
                
                Imprimir i = new Imprimir ();
                i.imprimirEntrada(enviar);
                
                
                System.out.print("\n\n\n ***Revise el archivo en la ruta:\n /GrupoVehiculoAlquiler/ticket.pdf***\n"); 
                
            }
            else    System.out.println("Lugar invalido - fuera de rango");
        }
        else    System.out.println("-El estacionamiento esta cerrado-");
    }
    
    /**
     *
     */
    public void moverVehic(){
        if(autos != null){
            System.out.println("\nIngrese el lugar ACTUAL del automovil:");
            opc1 = entrada.nextShort();
            if(opc1>=0 && opc1<=autos.length){
                System.out.println("\nIngrese el NUEVO lugar del automovil :");
                opc2 = entrada.nextShort();
                if(autos[opc2] != null)System.out.println("El lugar "+opc2+" esta ocupado por : "+autos[opc2]);
                else {
                    autos[opc2] = autos[opc1];
                    System.out.print("\nAutomovil asignado de lugar ["+opc1+"] : "+autos[opc1]);
                    autos[opc1] = null;
                    System.out.print("\nAutomovil asignado al lugar ["+opc2+"] : "+autos[opc2]); 
                }
            }
            else    System.out.println("-Lugar inexistente en el estacionamiento-");
        }
        else    System.out.println("-El estacionamiento esta cerrado-");
    }
    
    /**
     *
     */
    public void cambiarDatos(){
        if(autos != null){
            System.out.println("Ingrese el lugar del vehiculo : ");
            opc1 = entrada.nextShort();

                if(autos[opc1] != null){
                    System.out.println("Ingrese la matricula del auto: ");
                    autos[opc1].setMatricula(entrada.next());
                    System.out.println("Ingrese la modelo del auto: ");
                    autos[opc1].setModelo(entrada.next());
                    
                    System.out.println("Ingrese el color del auto: ");
                    autos[opc1].setColor(entrada.next());
                    System.out.print("\nDatos del Automovil modificados en lugar ["+opc1+"] : "+autos[opc1]); 
                }
                else    System.out.println("-No existe un vehiculo en ese lugar-");
        }
        else    System.out.println("-El estacionamiento esta cerrado-");
    }
    
    /**
     *
     * @throws DocumentException
     */
    public void retirarVehic() throws DocumentException{
        if(autos != null){
            System.out.println("Ingrese el lugar a retirar : ");
            opc1 = entrada.nextShort();
            if(autos[opc1]!=null){
                
                System.out.println(autos[opc1].toString());
                this.salir = autos[opc1].toString();
                
                
                
                //autos[opc1].setHora(h.horaActual());
                                
                Imprimir i = new Imprimir ();
                i.imprimirSalida(enviar, salir);
                
                
                System.out.print("\n\n\n ***Revise el archivo en la ruta:\n /GrupoVehiculoAlquiler/ticket.pdf***\n"); 
                
                
                System.out.println("\t"+autos[opc1]+" Eliminado del lugar ["+opc1+"]");
                
                
                
                autos[opc1] = null;
            }
            else    System.out.println("-No existe algun vehiculo en ese lugar-");
        }
        else    System.out.println("-El estacionamiento esta cerrado-");
    }
    
    /**
     *
     */
    public void cerrarEst(){
        if(autos != null){
            autos = null;
            System.out.println("<-El estacionamiento ha sido cerrado correctamente->");
        }
        else    System.out.println("-El estacionamiento no ha sido abierto aun-");
    }
    
    /**
     *
     */
    public void Cobro(){
        
    
    }
    
    /**
     *
     * @throws DocumentException
     */
    public void menu() throws DocumentException{
        do{
            System.out.println("\n  0. Salir");
            System.out.println("Modulo de Administracion");
            System.out.println("    1. Abrir y Asignar numero de Estacionamientos");
            System.out.println("    2. Asignar cobro de estacionamiento");
            System.out.println("Modulo de ingreso de vehiculos");
            System.out.println("    3. Ingresar un vehiculo");
            System.out.println("    4. Mover vehiculo de cajon");
            System.out.println("    5. Cambiar datos del vehiculo");
            System.out.println("Modulo de Retirar un vehiculo");
            System.out.println("    6. Retirar vehiculo");
            System.out.println("    7. Vaciar- cerrar estacionamiento");
            System.out.println("    8. Mostrar vehiculos");
            System.out.print("Seleccion: ");
            opc1 = entrada.nextShort();
            switch(opc1){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1: 
                    Scanner entradaEscaner = new Scanner (System.in);
                    System.out.println("Ingresa el numero de estacionamientos");
                    int ingreso = entradaEscaner.nextInt();
                    abrirEst(ingreso);
                    
                    break;
                case 2:
                    Scanner entradaEscanercobro = new Scanner (System.in);
                    System.out.println("Ingresa el numero cobro por segundos");
                    int ingresopago = entradaEscanercobro.nextInt();
                    
                    Pago p = new Pago(ingresopago);
                    System.out.println(p);
                            
                    break;
                    
                case 3:
                    asignarLugar();
                    break;
                case 4:
                    moverVehic();
                    break;
                case 5:
                    cambiarDatos();
                    break;
                case 6:
                    retirarVehic();
                    break;
                case 7:
                    cerrarEst();
                    break;
                case 8:
                    printArr();
                    break;
                default: 
                    System.out.println("-Opcion invalida-");
                    break;
            }
        }while(opc1!=0);
    }
    
    
}
