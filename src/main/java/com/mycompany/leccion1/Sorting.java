/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion1;

import java.util.Random;

/**
 *
 * @author Ztr4w
 */
public class Sorting {

    public static void main(String[] args) {
        int[] testValues = {3, 4, 1};
        initialize();
        for (int testValue: testValues){
            printArray7(myOrderedArray, testValue);
        }
    }
    static int[] myRandomArray;
    
    static int n = 20;
    static int[] myOrderedArray = new int[n];

    public static void initialize() {
        int[] myEmptyArray = {};
        int[] myEmptyArrayTwo = new int[5];
        int[] myEmptyArrayThree = { , };
        int[] myArray = {12};
        int[] myArrayTwo = {12, 30};
        myRandomArray = new int[10];
        Random generator = new Random();
        int i = 0;
        while (i < myRandomArray.length) {
            myRandomArray[i] = generator.nextInt();
            i++;
        }
        int j = 0;
    }

    public static void printArray0(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void printArray1(int[] array) {
        int i = 0;
        while (true) {
            System.out.println(array[i]);
            i++;
            if (i == array.length){
                break;
            }
        }
    }
    
    public static void printArray2(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);            
        }
    }
    
    public static void printArray3(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }
    
    public static void printArray4(int[] array) {
        for(int i = 0; i < array.length; i += 2){
            System.out.println(array[i]);            
        }
    }
    
    public static void printArray5(int[] array) {
        for(int i = 1; i < array.length; i += 2){
            System.out.println(array[i]);            
        }
    }
    
    public static void printArray6(int[] array) {
        for(int i = array.length - 1; i != -1; i--){
            System.out.println(array[i]);
        }
    }
    
    public static void printArray7(int[] array, int j) {
        for(int i = array.length - 1; i > -1; i -= j){
            System.out.println(array[i]);
        }
    }
}
