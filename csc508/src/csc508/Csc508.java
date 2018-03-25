package csc508;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author feadrick
 * date:8/3/2018
 * 
 */

import java.util.*;
public class Csc508 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        task5();
    }    
    public static void task1(){
        Integer arr[]=new Integer[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));    
    }
    
    public static void task2(){
        int[] array={1,2,3,4,5,6,7,8};
        int temp=0;
        int temp1=0;
        for(int i=0;i<array.length/2;i++){
        temp=array[array.length-i-1];
        temp1=array[i];
        array[array.length-i-1]=temp1;
        array[i]=temp;
        }
        
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
        }
    }
    
    public static void task3(){
         int [] array={3,4,5,6,7,8,9,10,2,3,4,5,6,7,89};
         int key=1;
         boolean isfound=false;
         for(int i=0;i<array.length;i++){
         if(key==array[i]){
         isfound=true;
         }
         }
         
         if(isfound){
             System.out.println( key+ " is found on array");
         }else{
             System.out.println( key+ " is not found on array");
         }
    }

    public static void task4(){
        int[] array={45,6,7,1,3};
        int temp=0;
            for(int lp=0;lp<array.length;lp++){
                for(int i=0;i<array.length-1;i++){
                    if(array[i]>array[i+1]){
                        temp=array[i+1];
                        array[i+1]=array[i];
                        array[i]=temp;
                    }
                }
            }
        
            for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            }
    }
    
    public static void task5()
    {
    String [] arr={"one","two","three","four"};
    String temp="";
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j].substring(0,1).compareToIgnoreCase(arr[j+1].substring(0,1))>0){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }else if(arr[j].substring(0,1).compareToIgnoreCase(arr[j+1].substring(0,1))==0){
                if(arr[j].substring(1,2).compareToIgnoreCase(arr[j+1].substring(1,2))>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    } 
    System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
    }
    
    public static void task6(){
    int[] array1={4,5,6,7,9,2,0,1};
    int[] array2={4,5,6,7,9,2,0,1};
    boolean IsSame=true;
        //compare size of array
        if(array1.length==array2.length){
            //compare the value of every element with the same index value
            for(int i=0;i<array1.length;i++){
                if(array1[i]!=array2[i]){
                    IsSame=false;
                }
            }
        }else{
        IsSame=false;
        }
        
        if(IsSame){
            System.out.println("the array is similar");
        }else{
            System.out.println("the array is different");
        }
    }
    
    
    public static void task7(){
        //before convert 
        
        String []str={"no pain no gain","practice make perfect"};
        System.out.println("before covert:");
        System.out.println(str[0]);
        System.out.println(str[1]);
        
        for(int i=0;i<str.length;i++){
            str[i]=str[i].replaceFirst(str[i].substring(0,1),str[i].substring(0,1).toUpperCase());
        }
        System.out.println("\n\n\nafter convert:");
        System.out.println(str[0]);
        System.out.println(str[1]);
    }
    
    public static void task8(){
        int[] arr={3,2,2,2,3,1,1,1,4,5,4,5,4,5,6,7,8,6,7,8,1,90,90};
        boolean similar=false;
        boolean unique=false;
        ArrayList<Boolean> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        similar=false;
                        list.add(similar);
                        }else if(arr[i]!=arr[j]){
                        similar=true;
                        list.add(similar);
                        }
                }
            }
            if(!list.contains(false)){
            unique=true;
            break;
            }
            list.removeAll(list);   
        }
        if(unique){
        System.out.print(" array contain  unique elements");
        }else{
        System.out.print(" array not contain  unique elements");
        }
    }
}
