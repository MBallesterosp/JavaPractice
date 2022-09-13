/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leccion1;

import java.text.MessageFormat;

/**
 *
 * @author mario
 */
public class DataTypes {

    String name;

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        everyByte();
    }

    public static void primitives() {
        // Boolean
        boolean myBoolean = true;
        myBoolean = false;
        // Character
        char myChar = 'a';
        myChar = 'b';
        // Integer
        byte myByte = 0;
        myByte = 1;
        myByte = 126;
        short myShort = 16;
        myShort = 17;
        myShort = 32767;
        int myInt = 8;
        myInt = 16;
        long myLong = 64L;
        myLong = 65L;
        // Floating point
        float myFloat = 1.25f;
        myFloat = 1.26f;
        double myDouble = 1.27d;
        myDouble = 1.28d;
    }

    public void arrays() {
        byte[] myBytes = new byte[1];
        myBytes[0] = 1;
        myBytes = new byte[2];
        String[] myStrings = new String[1];
        myStrings[0] = "1";
        myStrings = new String[2];
        name = "Mario";
    }

    public static void classTypes() {
        String myString = "2";
        myString = "3";
        MyClassType mario = new MyClassType("Mario");
        MyClassType raul = new MyClassType("Raul");
    }

    public static void everyByte() {
        byte counter;
        counter = 0;
        while (true) {
            String binaryCounter = Integer.toBinaryString(counter);
            binaryCounter = String.format("%32s", binaryCounter);
            binaryCounter = binaryCounter.replace(' ', '0');
            binaryCounter = binaryCounter.substring(24);
            String pattern = "{0} = {1}";
            String message = MessageFormat.format(pattern, binaryCounter, counter);
            counter = (byte) (counter + 1);
            System.out.println(message);
            if (counter == -1) {
                break;
            }
        }
    }

}
