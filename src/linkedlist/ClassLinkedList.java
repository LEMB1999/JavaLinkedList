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
public class ClassLinkedList {
    private Node head;
    private Node tail;
    public ClassLinkedList(){
        this.head=null;
        this.tail=null;
    }
    
    public void pushFront(int valor){
        if(head==null){
            head=new Node(valor);
            tail=head;
        }else{
            Node node= new Node(valor);
            node.setSig(head);
            head=node;
        }
    }
    
    public int popFront(){
        int valor=0;
        if(head==null){
            System.out.println("La lista esta Vacia");
        }else{
            Node aux=head;
            valor=aux.getValor();
            head=head.getSig();
        }
      return valor;
    }
    
    public int topFront(){
        if(head==null){
            System.out.println("La lista esta Vacia");
            return 0;
        }else{
            return head.getValor();
        }
            
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public int countElements(){
        int valor=0;
        if(head==null){
            valor=0;
        }else{
            valor=1;
            Node aux=head;
            while(aux.getSig()!=null){
                aux=aux.getSig();
                valor++;
            }
        }
        return valor;
    }
    
    //without tail
    public void pushBack(int valor){
        if(head!=null){
            Node aux=head;
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            aux.setSig(new Node(valor));
            tail=aux.getSig();
        }else{
            head=new Node(valor);
            tail=head;
        }
    }
    public int topBack(){
        int valor=0;
        if(head!=null){
            Node aux=head;
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
         valor=aux.getValor();
        }else
            System.out.println("La lisa esta Vacia");
        return valor;
    }
 
    //with tail
    public void pushBackTail(int valor){
        if(head!=null){
            tail.setSig(new Node(valor));
            tail=tail.getSig();
        }else{
            head=new Node(valor);
            tail=head;
        }
    }
    public int topBackTail(){
        int valor=0;
        if(head!=null){
           valor=tail.getValor();
        }else
            System.out.println("La lisa esta Vacia");
        return valor;
    }
    
    public int popBack(){
        int valor=0;
        if(head==null){
            System.out.println("La lista esta Vacia");
        }else{
            Node aux=head;
            while(aux.getSig().getSig()!=null){
                  aux=aux.getSig();
            }
            valor=aux.getSig().getValor();
            tail=aux;
            aux.setSig(null);
        }
        return valor;
    }
    
    
    public void Erase(int key){
        if(head==null){
            System.out.println("La lista esta vacia");
        }else{
                Node aux=head;
                Node auxAnterior=head;
                
                if(head.getValor()==key){
                    head=head.getSig();
                }else{
                         while(aux.getSig()!=null){    
                               auxAnterior=aux;
                               aux=aux.getSig();
                               if(aux.getValor()==key){
                                  auxAnterior.setSig(aux.getSig());
                                  //si se elimina el ultimo nodo actualizar el tail
                                  if(tail.equals(aux)){
                                      tail=auxAnterior;
                                    }
                                }
                        }
            }
     }
}
    
     
    public boolean find(int key){
        boolean estado=false;
        if(head==null){
            System.out.println("La lista esta Vacia");
        }else{
                Node aux=head;
                do{
                    if(aux.getValor()==key){
                        estado=true;
                        break;
                    }
                     aux=aux.getSig();
                }while(aux!=null);
             }
            return estado;
        }
    
    
    
    /*public void addBefore(){
        
    }
    public void addAfter(){
        
    }
    */
    
    
    public void MostrarLista(){
        if(head==null){
            System.out.println("La lista esta Vacia");
        }else{
            Node aux=head;
            do{
                System.out.print(aux.getValor()+" ");
                aux=aux.getSig();
            }    
            while(aux!=null);
            System.out.println("");
        }
    }
}