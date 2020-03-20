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
      ClassLinkedList list= new ClassLinkedList();
      list.pushBack(1);
      list.pushBack(2);
      list.pushBack(3);
      list.pushBack(4);
      list.pushFront(0);
      list.MostrarLista();
      list.Erase(4);
      list.MostrarLista();       
    }
    
    
}
