/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc508.lab2;
import java.util.regex.*;
import java.util.Stack;
/**
 *
 * @author feadrick
 */
public class lab2csc508 {
    public static void main(String[]args){task2("222*(8+5)");}
    
    public static <Gen>void task1(Gen a){
            //palindrome characteristic 
            //odd string size
            //original== reverse
            String originalstring="";
            String reverse="";
            if(a.getClass()==Integer.class){
               originalstring=a.toString();
            }else{
            originalstring=
            originalstring=a.toString();
            }
                reverse=new StringBuffer(originalstring).reverse().toString();
            if(reverse.equals(originalstring)){
                 System.out.println("object is palindrome");
            }else{
                System.out.println("object is not palindrome");
            }
    
    }
    
    public static void task2(String expression){
        
        int i=0;
        Stack <String>operand=new Stack<>();
        Stack <String>operator=new Stack<>();
        String strconcat="";
        String s="";
        while(i<expression.length()){
            s=expression.substring(i,i+1);
            if(s.compareTo("*")==0||s.compareTo("+")==0||s.compareTo("-")==0||
               s.compareTo("/")==0||s.compareTo("(")==0||s.compareTo(")")==0){
                operator.push(s);
                if(strconcat!=""){
                    
                       operand.push(strconcat);
                        strconcat="";
                }
             
            }else{
                strconcat+=s;
                //System.out.println(strconcat);
            }
        i++;
        }
        
//                System.out.println(operator.size());
        while(!operator.isEmpty()){
        System.out.println(operator.pop());
        }
    }
    
    
}
