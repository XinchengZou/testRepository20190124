/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author alexzexis
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = {"Jack", "John", "Tom", "Nick", "Richard"};
        Student[] students = new Student[5];
        for(int i = 0; i<students.length; i++){
            students[i]= new Student(names[i]);
        }
        for(int j = 0; j<students.length; j++){
            System.out.println(students[j].getName());
        }
    }
    
}
