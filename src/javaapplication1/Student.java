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
    public Student(){
        this.name = "noName";
    }
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
