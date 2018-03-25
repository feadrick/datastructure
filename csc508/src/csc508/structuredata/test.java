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
public class test {
    
    public static void main(String[] args) {
//        MyStack stack=new MyStack(3);
//        stack.push(new person("fead"));
//        stack.push(new person("masdin"));
//        stack.push(new person("erick"));
//        System.out.println(" stack==="+stack.peek());
//        stack.pop();
//        System.out.println(" stack1==="+stack.peek());
        MyQueue queue=new MyQueue();
        queue.enqueue(new person("fead"));
        queue.enqueue(new person("masdin"));
        queue.enqueue(new person("erick"));
        System.out.println(queue.getFirst().toString());
    }  
}
