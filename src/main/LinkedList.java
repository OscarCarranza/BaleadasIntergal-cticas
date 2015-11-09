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
public class LinkedList {
            
  protected Nodo first;

  public LinkedList() {
    first = null;
  }

  public void insert(Object o) {

    Nodo temp = new Nodo(o, null);

    temp.setNext(first);
    first = temp;
  }

  public Object extract() {
    Object out = null;

    if (!isEmpty()) {
      out = first.getData();
      first = first.getNext();
    }

    return out;
  }

  public void print(int n) {
    if (!isEmpty()) {
      Nodo temp = first;

      for (int i = 0; i < n; i++) {
        temp = temp.getNext();
        if (temp == null)
          return;
      }
      System.out.println(temp.getData());
    }
  }

  public void print() {
    if (!isEmpty()) {
      Nodo temp = first;
      while (temp != null) {
        System.out.println(temp.getData());
        temp = temp.getNext();
      }
    }
  }

  public boolean isEmpty() {
    if (first == null)
      return true;
    else
      return false;
  }
}
