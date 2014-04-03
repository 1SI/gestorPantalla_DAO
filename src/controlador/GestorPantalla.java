/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import utils.IOperaciones;

/**
 *
 * @author A7
 */
public class GestorPantalla {
    IOperaciones escuchador;
    
    public GestorPantalla(IOperaciones operaciones) {
        super();
        this.escuchador = operaciones;
    }
    
    public void actualizarMensaje(){
//        Pantalla.getInstance().notificarMensaje(mensaje);
    }
    
    public void addMensaje(){
        escuchador.notificarMensaje("Hola desde Acciones");
    }
    
    public void deleteMensaje(){
//        Pantalla.getInstance().notificarMensaje(mensaje);
    }
}
