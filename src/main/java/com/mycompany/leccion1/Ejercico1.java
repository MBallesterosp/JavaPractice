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
public class Ejercico1 {

    public static void main(String[] args) {
        char[] options;
        options = new char[5];
        options[0] = 'a';
        options[1] = 'b';
        options[2] = 'c';
        options[3] = 'd';
        options[4] = 'z';
        combinacionesContiguas();
        combinaciones(options);
    }

    public static void combinacionesContiguas() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        int result = 0;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        System.out.println(i + "" + j + "" + k + "");
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static void combinaciones(char[] options) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        int result = 0;

        for (int i = 0; i < options.length; i++) {
            for (int j = 0; j < options.length; j++) {
                for (int k = 0; k < options.length; k++) {
                    if ((options[i] != options[j]) && (options[i] != options[k]) && (options[j] != options[k])) {
                        System.out.println(options[i] + "" + options[j] + "" + options[k] + "");
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
