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
    
    public void procesarOrden(Orden orden,Pila ingredientes1, long timeStamp, int numero) {

		System.out.println("El Cocinero " + numero + 
				" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " +  orden.getClient() + 
				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");
                
                this.Ingredientes.push(ingredientes1.pop());

		for (int i = 0; i < orden.getTime(); i++) { 
				this.esperarXsegundos((int) orden.getTime()); 
				System.out.println("Procesado orden " + (i + 1) +  
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}

		/*System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");
                    */
	}
    
    private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
