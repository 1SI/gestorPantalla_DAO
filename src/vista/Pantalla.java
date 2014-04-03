/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import utils.IOperaciones;

/**
 *
 * @author Alejandro Sáez Martínez
 */
public class Pantalla implements IOperaciones{
    
    
    
//    private static Pantalla miPantalla = null;
//    
//    public static Pantalla getInstance(){
//        if (miPantalla == null) {
//            miPantalla = new Pantalla();
//        }
//        return miPantalla;
//    }
    
    /* 
     * Patrón singleton
     */
    private Pantalla() {
    }
    
//    public void notificarMensaje(String mensaje){
//        System.out.println(mensaje);
//    }
    
    @Override
    public void notificarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
    
}
