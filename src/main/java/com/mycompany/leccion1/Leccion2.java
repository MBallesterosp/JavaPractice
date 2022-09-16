/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leccion1;

/**
 *
 * @author mario
 */
public class Leccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicOperators basicOperators = new BasicOperators();
        basicOperators.aritmeticos();
        BasicOperators.relational();
        BasicOperators.bitwise();
        BasicOperators.assigment();
        basicOperators.logical();
        
        BasicOperators x = new BasicOperators();        
        BasicOperators y = new BasicOperators();
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println("-------------------");
        x.a = "Hello";
        x.b = "Goodbye";
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println("-------------------");
        BasicOperators z = new BasicOperators();
        z.b = "Sayonara";
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println("-------------------");
    }
    
}
