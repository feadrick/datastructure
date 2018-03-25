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
public class MyLinkedList
{
 public class Node
 {
 public Object obj;
 public Node ptr;
 public Node()
 {
 obj = ptr = null;
 }
 public Node(Object obj)
 {
 this.obj = obj;
 ptr = null;
 }
 }
 public Node head, tail, curr, news;
 public MyLinkedList()
 {
 head=tail=curr=news=null;
 }
 public boolean isEmpty()
 {
 if(head==null)
 return true;
 else
 return false;
 }
 private void createNode(Object o)
 {
 news = new Node(o);
 }
 public void addLast(Object o)
 {
 createNode(o);
 if(isEmpty())
 head=news;
 else
 tail.ptr=news;
 tail=news;
 }
 public void addFirst(Object o)
 {
 createNode(o);
 if(isEmpty())
 head=tail=news;
 else{
 news.ptr=head;
 head=news;
 }
 }
 public Object getFirst()
 {
 Object o;
 if(!isEmpty()){
 o=head.obj; curr=head;
 return o;
 }
 return null;
 }
 public Object getNext()
 {
 Object o;
 if((curr==null)||(curr==tail))
 return null;
 else{
 curr=curr.ptr; o=curr.obj;
 return o;
 }
 }
}