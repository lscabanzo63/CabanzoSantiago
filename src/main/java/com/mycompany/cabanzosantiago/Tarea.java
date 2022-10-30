/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabanzosantiago;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Tarea {
    private boolean habilitada;
    private boolean deshabilitarSiFalta;

    public Tarea(boolean habilitada, boolean deshabilitarSiFalta) {
        this.habilitada = habilitada;
        this.deshabilitarSiFalta = deshabilitarSiFalta;
    }
    
    public void ejecutar(){
        
    }
    public void doEjecutar(){
        
    }
    public Date ultimaEjecucion(){
       return new Date(); 
    }
    public Date vecesQueSeEjecuta(Date a, Date b){
       return new Date(); 
    }
    public void vecesQueSeDioError(Date a, Date b){
       
    }
    /**
     * @return the habilitada
     */
    public boolean isHabilitada() {
        return habilitada;
    }

    /**
     * @param habilitada the habilitada to set
     */
    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    /**
     * @return the deshabilitarSiFalta
     */
    public boolean isDeshabilitarSiFalta() {
        return deshabilitarSiFalta;
    }

    /**
     * @param deshabilitarSiFalta the deshabilitarSiFalta to set
     */
    public void setDeshabilitarSiFalta(boolean deshabilitarSiFalta) {
        this.deshabilitarSiFalta = deshabilitarSiFalta;
    }
}
