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
public class Cola {
    Nodo first;
    Nodo last;
    int size; 
    
    public Cola(){
        last = null;
        size = 0;
    }
    
    public void Queue(Object o){
        Nodo new_node = new Nodo();
        if(first == null){
            first = new_node;
            last = new_node;
        }else{
            last.next= new_node;
            last = new_node;
        }
        size++;
    }
    
    public Object Unqueue(){
        if(first==null)
            return null;
        ;
        Object o = first.data;
        first = first.next;
        size--;
        return o;
    }
    
    public boolean isEmpty(){
        return(size==0);
    }
    public int size(){
        return size;
    }
    public Object first(){
        if(first==null)
            return null;
        else
            return first.data;
    }
}
