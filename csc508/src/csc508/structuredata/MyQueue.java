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
public class MyQueue extends MyLinkedList {
    public int MAX_SIZE;
    public int currentsize;
    
    public MyQueue(int max){
    this.MAX_SIZE=max;
    this.currentsize=0;
    }
    public MyQueue(){
    this.currentsize=0;
    this.MAX_SIZE=0;
    }
    
    public void enqueue(Object o){
        addLast(o);
    }
    
    public Object dequeue(){
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
    public Object getfirst(){
        Object a=null;
    if(!isEmpty()){
    a=getFirst();
    }
    return a;
    }
    public Object getLast(){
        Node tempnode=head;
        while(tempnode.ptr!=null){
            tempnode=tempnode.ptr;
        }
        return tempnode.obj;
    }
}
