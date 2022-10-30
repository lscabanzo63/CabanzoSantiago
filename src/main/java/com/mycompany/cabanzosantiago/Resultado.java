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
public class Resultado {
        private Date fecha;

    public Resultado(Date fecha) {
        this.fecha = fecha;
    }



public boolean ejecutoConError(){
    return false;
}
public boolean ejecutoOk(){
    return true;
}
public void ejecutoConAdvertencia(){
    
}

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
