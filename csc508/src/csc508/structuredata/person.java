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
public class person {
    public String name;
    
    public person(){
    this.name="";
    }
    public String getName(){
    return this.name;
    }
    
    public person(String name){
    this.name=name;
    }
    
    @Override
    public String toString(){
    return "Name: "+name;
    }
}
