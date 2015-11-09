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
public class Pila {
   private Nodo raiz;
   public Pila(){
       raiz = null;
   }
   
   public void push(Object x){
       Nodo nuevo;
       nuevo = new Nodo();
       nuevo.data = x;
       if(raiz == null){
           nuevo.next = null;
           raiz = nuevo;
       }
       else{
           nuevo.next = raiz;
           raiz = nuevo;
       }
   }
    
   public Object pop(){
       if(raiz!=null){
           Object info = raiz.data;
           raiz = raiz.next;
           return info;
       }
       else{
           return Integer.MAX_VALUE;
       }
   }
   
   public void peek(){
       Nodo n = raiz;
       System.out.println(n.getData());
   }
}
