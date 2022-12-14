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

    static int[] myRandomArray;

    static int n = 20;
    static int[] myOrderedArray = new int[n];

    public static void main(String[] args) throws NoSuchPieceExistsException {
        String[] myStringArray;
        myStringArray = new String[5];
        myStringArray[0] = "Rafael";
        myStringArray[1] = "Miguel";
        myStringArray[2] = "Uriel";
        myStringArray[3] = "Gabriel";
        myStringArray[4] = "Mario";
        String[] mySupremeArray;
        mySupremeArray = new String[4];
        mySupremeArray[0] = "Rafael";
        mySupremeArray[1] = "Miguel";
        mySupremeArray[2] = "Uriel";
        mySupremeArray[3] = "Raul";
        int[] testValues = {3, 4, 1};
        initialize();
        for (int testValue : testValues) {
            printArrayInReverseSkippingUsingWhile(myOrderedArray, testValue);
        }
        printArrayUsingForOnlyEven(myOrderedArray);
        printArrayUsingDoWhileSkipping(myOrderedArray);
        printArrayUsingWhile(myOrderedArray);
        printArrayUsingForOnlyEven(myOrderedArray);
        char[] myCharArray = {'a', 'd', 'i', 'o', 's'};
        printArrayUsingForOnlyEven(myCharArray);
        printArray(myStringArray);
        printArray(swap(myStringArray, 1, 3));
        printArray(copy(myStringArray));
        printArray(reverse(myStringArray));
        System.out.println(equals(myStringArray, myStringArray));
        System.out.println(equals(myStringArray, mySupremeArray));
        String[] array;
        array = new String[3];
        array[0] = "";
        array[1] = "helpme";
        array[2] = "ireallyneedsleep";
        System.out.println(array[0]);
        String piece;
        piece = new String();
        System.out.println(piece);
        System.out.println(contains(array, piece));
        System.out.println("a" == "a");
        System.out.println("a" == new String("a"));
        System.out.println(new String("a") == new String("a"));
        System.out.println(new String("a").equals("a"));
        System.out.println(new String("a").equals(new String("a")));
        System.out.println(indexOf(array, piece));
    }

    public static int indexOf (String[] array, String piece) 
            throws NoSuchPieceExistsException{
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        for (int i = 0; i < array.length; i++) {
            if (piece.equals(array[i])) {
                return i;
            }
        }
        throw new NoSuchPieceExistsException();
    }
    
    public static boolean contains(String[] array, String piece) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        for (int i = 0; i < array.length; i++) {
            if (piece.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals(String[] a, String[] b) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        if (a.length != b.length) {
            return false;
        }
        int i;
        i = 0;
        while (i < a.length) {
            boolean c = (a[i] == b[i]);
            if (a[i] == b[i]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String[] copy(String[] original) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        String[] copy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static String[] swap(String[] args, int i, int j) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        String aux = args[i];
        args[i] = args[j];
        args[j] = aux;
        return args;
    }

    public static String[] reverse(String[] args) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int j = args.length - 1;
        for (int i = 0; i < (args.length / 2); i++) {
            String aux = args[i];
            args[i] = args[j];
            args[j] = aux;
            j--;
        }
        return args;

    }

    public static void printArray(String[] args) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void initialize() {
        int[] myEmptyArray = {};
        int[] myEmptyArrayTwo = new int[5];
        int[] myEmptyArrayThree = { , };
        int[] myArray = {12};
        int[] myArrayTwo = {12, 30};
        char[] myChars = {'h', 'e', 'l', 'l', 'o'};
        String hello = new String(myChars);
        myRandomArray = new int[10];
        Random generator = new Random();
        int i = 0;
        while (i < myRandomArray.length) {
            myRandomArray[i] = generator.nextInt();
            i++;
        }
        int j = 0;
        while (j < myOrderedArray.length) {
            myOrderedArray[j] = j + 1;
            j++;
        }
        int k = myOrderedArray.length - 1;
        while ((-1 < k) && (k < myOrderedArray.length)) {
            myOrderedArray[k] = myOrderedArray.length - k;
            k--;
        }
    }

    //mealone
    public static void printArrayUsingForOnlyEven(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 1) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    public static void printArrayUsingForOnlyEven(char[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 1) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    public static void printArrayUsingForEach(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void printArrayUsingDoWhileSkipping(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        do {
            if ((i % 2) == 0) {
                System.out.println(array[i]);
            }
            i++;
        } while (i < array.length);
    }

    public static void printArrayUsingDoWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
    }

    public static void printArrayUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    //mealone
    public static void printArrayWithTrueUsingFor(int[] array) {
        for (int i = 0; true; i++) {
            System.out.println(array[i]);
            if (i != array.length) {
                break;
            }
        }
    }

    public static void printArrayWithTrueUsingWhile(int[] array) {
        int i = 0;
        while (true) {
            System.out.println(array[i]);
            i++;
            if (i == array.length) {
                break;
            }
        }
    }

    //mealone
    public static void printArrayNormalUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void printArrayNormalUsingFor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //tengo dudas
    public static void printArrayValueUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    //mealone
    public static void printArrayEvenNumbersUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i += 2;
        }
    }

    public static void printArrayEvenNumbersUsingFor(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    //mealone
    public static void printArrayOddNumbersUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = 1;
        while (i < array.length) {
            System.out.println(array[i]);
            i += 2;
        }
    }

    public static void printArrayOddNumbersUsingFor(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    public static void printArrayInReverseUsingWhile(int[] array) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int i = array.length - 1;
        while (i > -1) {
            System.out.println(array[i]);
            i--;
        }
    }

    public static void printArrayInReverseUsingFor(int[] array) {
        for (int i = array.length - 1; i != -1; i--) {
            System.out.println(array[i]);
        }
    }

    public static void printArrayInReverseSkippingUsingWhile(int[] array, int j) {
        int i = array.length - 1;
        while (-1 < i) {
            System.out.println(array[i]);
            i -= j;
        }
    }

    public static void printArrayInReverseSkippingUsingFor(int[] array, int j) {
        for (int i = array.length - 1; i > -1; i -= j) {
            System.out.println(array[i]);
        }
    }
}
