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
public class MyArrayList
{
 private Object[] data;
 private int num, size;
 public MyArrayList(int k)
 {
 size = k;
 data = new Object[size];
 for(int i = 0; i < size; ++i)
 data[i] = null;
 num = 0;
 }
 // Insert an element at the back of the array list
 public void addLast(Object k){
 if(isNotFull())
 {
 data[num] = k;
 num = num + 1;
 }else
 throw new ArrayListException("The Array List is full");
 }
 // Insert an element at the front of the array list
 public void addFirst(Object k){
 add(0,k);
 }
 private void add(int i, Object k)
 {
 if(!isNotFull())
 throw new ArrayListException("The Array List is full");
 else if ((i < 0) || (i > num))
 throw new ArrayListException("Index is out of bounds");
 else{
 for(int j = num-1; j >= i; --j)
 data[j + 1] = data[j];
 num = num + 1;
 data[i] = k;
 }
 }
 // Return the number of elements in the array list
 public int num(){
 return num;
 }
 // Return the size of the array list
 public int size(){
 return size;
 }
 // Return data at the specified location
 public Object getData(int i) {
 if (isEmpty())
 throw new ArrayListException("It is empty");
 else if((i < 0) || (i > num-1))
 throw new ArrayListException("Index is out of bounds");
 return data[i];
 }
 // Set data at the specified location
 public void setData(int i, Object k)
 {
 if (isEmpty())
 throw new ArrayListException("It is empty");
 else if((i < 0) || (i > num-1))
 throw new ArrayListException("Index is out of bounds");
 data[i] = k;
 }
 // Remove data at the specified location
 public Object removeData(int i){
 if (isEmpty())
 throw new ArrayListException("It is empty");
 else if((i < 0) || (i > num-1))
 throw new ArrayListException("Index is out of bounds");

 if ( i == (num-1))
 {
 num = num - 1;
 return data[i];
 }

 for(int j = i; j < num - 1; ++j)
 data[j] = data[j+1];

 num = num - 1;
 return data[i];
 }
 // Clear all the elements in the Array List
 public void clear(){
 num = 0;
 }
 // Return true if the Array List is not full otherwise false
 public boolean isNotFull(){
 return num < size;
 }
 // Return true if the Array List is empty otherwise false
 public boolean isEmpty(){
 return num == 0;
 }
 // for displaying the element in the Array List
 public String toString(){
 String str ="(";
 if (num == 0)
 return "( )";
 else
 {
 for(int i = 0; i < num; ++i)
 str += data[i]+",";
 return str+")";
 }
 }
}