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
    
    public static void main(String[] args){
        
    }
    
    public static void initialize(){
        int[] myEmptyArray = {};
        int[] myEmptyArrayTwo = new int[5];
        int[] myEmptyArrayThree = { , };
        int[] myArray = {12};
        int[] myArrayTwo = {12, 30};
        int[] myRandomArray = new int[10];
        Random generator = new Random();
        int i = 0;
        while(i < myRandomArray.length){
            myRandomArray[i] = generator.nextInt();
            i++;
        }
    }
    
    public static void printArray(int[] array){
        int i = 0;
        System.out.println(array[i]);
        while (){
            
        }
    }
}
