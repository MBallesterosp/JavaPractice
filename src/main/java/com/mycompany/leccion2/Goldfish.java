/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion2;

/**
 *
 * @author Ztr4w
 */
public class Goldfish extends Animal implements Domesticable {
    @Override
    public void eat(Edible food) {
        System.out.println("I'm eating like a Goldfish");

    }
    @Override
    public void breathe(){
        System.out.println("I'm using my gills");
        
    }
}
