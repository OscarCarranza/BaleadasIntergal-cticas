/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author isaac
 */
public class Nodo {

    Object data;
    Nodo next;

    public Nodo() {
        data = null;
        next = null;
    }

    Nodo(Object o, Nodo n) {
        setData(o);
        setNext(n);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
