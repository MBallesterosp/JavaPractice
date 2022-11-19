/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.leccion1;

/**
 *
 * @author [ ]
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //repeatInfiniteTimes();
        repeatFiniteTimes();
    }

    public static void repeatInfiniteTimes() {
        System.out.println("algo");
        repeatInfiniteTimes();
    }
    
    static int count = 0;

    public static void repeatFiniteTimes() {
        count ++ ;
        if (count <= 20) {
            System.out.println(count);
            repeatFiniteTimes();
        }
    }
    
    //helpme
    public static int factorial(int n){
        n-- ;
        if (n == 1) {
            System.out.println(n);
            factorial(n);   
        }
        return 1;
    }
}
