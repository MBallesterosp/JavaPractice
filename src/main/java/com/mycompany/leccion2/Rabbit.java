/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion2;

/**
 *
 * @author Ztr4w
 */
public class Rabbit extends Animal implements Edible, Slaughterable {
    @Override
    public void eat(Edible food) {
        System.out.println("I'm eating like a rabbit");
    }
    @Override
    public void beDigested() {
        System.out.println("I'm being digested like a rabbit");
    }
    
}
