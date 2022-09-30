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
            printArrayInReverseSkippingUsingWhile(myOrderedArray, testValue);
        }
        printArrayUsingFor(myOrderedArray);
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
        while (j < myOrderedArray.length) {
            myOrderedArray[j] = j+1;
            j++;
        }
        int k = myOrderedArray.length-1;
        while ((-1 < k) && (k < myOrderedArray.length)) {
            myOrderedArray[k] = myOrderedArray.length-k;
            k--;
        }
    }

    //mealone
    public static void printArrayUsingFor(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    public static void printArrayUsingWhile(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    //mealone
    public static void printArrayWhitTrueUsingFor(int[] array) {
        for(int i = 0; true; i++){
            System.out.println(array[i]);
            if(i != array.length){
                break;
            }
        }
    }
    
    public static void printArrayWhitTrueUsingWhile(int[] array) {
        int i = 0;
        while (true) {
            System.out.println(array[i]);
            i++;
            if (i == array.length){
                break;
            }
        }
    }

    //mealone
    public static void printArrayNormalUsingWhile(int[] array) {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);        
        int i = 0;
        while(i < array.length){
            System.out.println(array[i]);    
            i++;
        }
    }
    
    public static void printArrayNormalUsingFor(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);            
        }
    }

    //tengo dudas
    public static void printArrayValueUsingWhile(int[] array){
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        while( i < array.length){
            System.out.println(array[i]);
            i++;
        }
    }
    
    public static void printArrayValueUsingFor(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }

    //mealone
    public static void printArrayEvenNumbersUsingWhile(int[] array) {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);        
        int i = 0;
        while(i < array.length){
            System.out.println(array[i]);            
            i += 2;
        }
    }
    
    public static void printArrayEvenNumbersUsingFor(int[] array) {
        for(int i = 0; i < array.length; i += 2){
            System.out.println(array[i]);            
        }
    }

    //mealone
    public static void printArrayOddNumbersUsingWhile(int[] array) {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);        
        int i = 1;
        while(i < array.length){
            System.out.println(array[i]);
            i += 2;
        }
    }
    
    public static void printArrayOddNumbersUsingFor(int[] array) {
        for(int i = 1; i < array.length; i += 2){
            System.out.println(array[i]);          
        }
    }
    
    public static void printArrayInReverseUsingWhile(int[] array) {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = array.length -1;
        while(i > -1){
            System.out.println(array[i]);
            i--;
        }
    }
    
    public static void printArrayInReverseUsingFor(int[] array) {
        for(int i = array.length - 1; i != -1; i--){
            System.out.println(array[i]);
        }
    }
    
    public static void printArrayInReverseSkippingUsingWhile(int[] array, int j) {
        int i = array.length-1;
        while(-1 < i){
            System.out.println(array[i]);
            i -= j;         
        }
    }
        
    public static void printArrayInReverseSkippingUsingFor(int[] array, int j) {
        for(int i = array.length - 1; i > -1; i -= j){
            System.out.println(array[i]);
        }
    }
}
