/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion2;

/**
 *
 * @author Ztr4w
 */
public class Carrot extends Plant implements Edible, Domesticable {
    @Override
    public void beDigested() {
        System.out.println("I'm being digested like a carrot");
    }
}
