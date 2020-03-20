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
public class Node {

    
    private Node sig;    
    private int valor;    

    public Node(int valor){
        this.valor=valor;    
        Node sig=null;    
    }
    
    public void setSig(Node sig){
        this.sig=sig;
    }
    
    public Node getSig(){
        return this.sig;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    
    
    
}
