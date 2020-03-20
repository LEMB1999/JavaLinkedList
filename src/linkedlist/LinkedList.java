/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author esnai
 */
public class LinkedList {
 
    public static void main(String[] args) {
      // prueba de métodos
      ClassLinkedList list= new ClassLinkedList();
      list.pushFront(2);
      list.pushFront(1);
      list.pushBack(3);
      list.pushBackTail(4);
      list.Erase(4);
      list.pushBackTail(4);
      list.MostrarLista();
      System.out.println(list.countElements());
      System.out.println(list.find(3));
      System.out.println(list.isEmpty());
      list.MostrarLista();
      System.out.println(list.popBack());
      list.MostrarLista();
      list.MostrarLista();
      System.out.println(list.popFront());
      list.MostrarLista();
      System.out.println(list.topBack());
      System.out.println(list.topBackTail());
      System.out.println(list.topFront());
    }
    
    
}
