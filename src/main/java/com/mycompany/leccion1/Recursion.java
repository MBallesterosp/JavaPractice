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
        int n = 4;
        System.out.println(factorial(n));
        n = 9;
        System.out.println(fibonacci(n));
    }

    public static void repeatInfiniteTimes() {
        System.out.println("algo");
        repeatInfiniteTimes();
    }

    static int count = 0;

    public static void repeatFiniteTimes() {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        count++;
        if (count <= 20) {
            System.out.println(count);
            repeatFiniteTimes();
        }
    }

    public static int factorial(int n) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        System.out.println(n);
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
