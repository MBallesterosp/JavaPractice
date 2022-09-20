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
public class BasicOperators {

    String a;
    static String b;
    final String C_D;

    public BasicOperators() {
        this.a = "hola";
        this.b = "adios";
        this.C_D = "mimir";
    }

    public BasicOperators(String a, String b) {
        this.a = a;
        this.b = b;
        this.C_D = "mimir";
    }

    public void aritmeticos() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        float c = 10;
        float d = 20;
        System.out.println(c / d);
        System.out.println(a % b);
        System.out.println(11 % 12);
        System.out.println(12 % 12);
        System.out.println(13 % 12);
        System.out.println(18 % 12);
        System.out.println(12 % 24);
        System.out.println(10 + 18 % 12 * 10);
        System.out.println(((10 + 18) % 12) * 10);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println(z);
    }

    public static void relational() {
        System.out.println("relational");
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a >= a);
        System.out.println(a <= b);
        System.out.println(b <= b);
    }

    public static void bitwise() {
        System.out.println("bitwise");
        int a = 5;
        int b = 5;
        System.out.println("and");
        System.out.println(a & b);
        a = 32;
        b = 14;
        System.out.println(a & b);
        a = 5;
        b = 5;
        System.out.println("xor");
        System.out.println(a ^ b);
        a = 4;
        b = 8;
        System.out.println(a ^ b);
        System.out.println("or");
        a = 2;
        b = 4;
        System.out.println(a | b);
        a = 7;
        b = 9;
        System.out.println(a | b);
        System.out.println("left shift");
        System.out.println(10 << 2);
        System.out.println(10 << 3);
        System.out.println("right shift");
        System.out.println(10 >> 2);
        System.out.println(10 >> 3);
        System.out.println("shift");
        System.out.println(10 >>> 2);
        System.out.println(10 >>> 3);
        System.out.println("shift");
        System.out.println(-10 >>> 2);
        System.out.println(-10 >>> 3);
    }

    public static void assigment() {
        System.out.println("assigment");
        int a = 4;
        int b = a;
        System.out.println(b);
        a = 5;
        System.out.println(b);
        a += 5;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
        a <<= 2;
        System.out.println(a);
        a >>= 2;
        System.out.println(a);
        a &= 2;
        System.out.println(a);
        a ^= 2;
        System.out.println(a);
        a |= 2;
        System.out.println(a);
    }

    public void logical() {
        System.out.println("logical and");
        System.out.println(false && true);
        System.out.println("logical or");
        System.out.println(false || true);
        System.out.println("logical not");
        System.out.println(!true);
    }

    public void conditional() {
        int a;
        int b;
        a = 10;
        b = true ? 20 : 30;
        System.out.println(b);
        b = false ? 20 : 30;
        System.out.println(b);
        b = (a == 1) ? 20 : 30;
        System.out.println(b);
        b = ((a - 9) == 1) ? 20 : 30;
        System.out.println(b);
        String hola = "Hola";
        String adios = "Adios";
        boolean meVoy = true;
        boolean meVengo = true;
        System.out.println(meVoy?adios:hola);
        System.out.println(meVengo?hola:adios);
    }

    public void reflective() {
        System.out.println("reflective");
        Integer a = 10;
        Long c = 50L;
        Short d = 45;
        Byte j = 8;
        Float q = 2.3f;
        Double z = 3.22d;
        Character g = 'a';
        Character das = '\u0000';
        Boolean s = true;
        int l = 12;
        System.out.println(a.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        String b = "Hola";
        boolean result;
        result = b instanceof String;
        System.out.println(result);
        System.out.println(a instanceof Integer);
        System.out.println(a instanceof Number);
    }
}
