/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc508.structuredata;

/**
 *
 * @author feadrick
 */
public class MyStack extends MyLinkedList{
   private int currentsize;
   private  int MAX_SIZE;
    public MyStack(int max){
        this.MAX_SIZE=max;
        this.currentsize=0;
    }
    
    public MyStack(){
    this.MAX_SIZE=0;
    this.currentsize=0;
    
    }
    public void push(Object o){
        if(!isFull()){
        addFirst(o);
        ++currentsize;
        }else{
            System.out.println(" fail to insert object !!stack is full");
        }
            
    }
    public Object pop(){
        Object obj=null;
        if(!isEmpty()){
        obj=head.obj;
        head=head.ptr;
        --currentsize;
        }
        return obj;
    }
    
    public boolean isFull(){
    return currentsize==MAX_SIZE;
    }
}
