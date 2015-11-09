/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Time;

/**
 *
 * @author isaac
 */
public class Cocineros {
    Pila Ingredientes;
    Time TiempoRestante;
    Orden OrdenEnEjecucion;

    public Cocineros(Pila Ingredientes, Time TiempoRestante, Orden OrdenEnEjecucion) {
        this.Ingredientes = Ingredientes;
        this.TiempoRestante = TiempoRestante;
        this.OrdenEnEjecucion = OrdenEnEjecucion;
    }
    
    public Cocineros(){
        this.Ingredientes = null;
        this.TiempoRestante = null;
        this.OrdenEnEjecucion = null;
    }
    
    public Pila getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(Pila Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public Time getTiempoRestante() {
        return TiempoRestante;
    }

    public void setTiempoRestante(Time TiempoRestante) {
        this.TiempoRestante = TiempoRestante;
    }

    public Orden getOrdenEnEjecucion() {
        return OrdenEnEjecucion;
    }

    public void setOrdenEnEjecucion(Orden OrdenEnEjecucion) {
        this.OrdenEnEjecucion = OrdenEnEjecucion;
    }
    
    
}
