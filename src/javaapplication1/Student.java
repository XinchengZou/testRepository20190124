/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author alexzexis
 */
public class Student {
    private String name;
    private String id;
    public Student(){
        this.name = "noName";
        this.id = "0";
    }
    public Student(String name){
        this.name = name;
        this.id = "0";
    }
    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    public void setName(String newName){
        this.name = newName;
    }
    

}
