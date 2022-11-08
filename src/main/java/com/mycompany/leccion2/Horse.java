/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion2;

/**
 *
 * @author Ztr4w
 */
public class Horse extends Animal implements Edible, Slaughterable, Domesticable {
    
    @Override
    public void eat(Edible food) {
        System.out.println("I'm eating like a horse");
    }

    @Override
    public void beDigested() {
        System.out.println("I'm being digested like a horse");
    }
    
}
