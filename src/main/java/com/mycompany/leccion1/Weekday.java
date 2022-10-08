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
public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    public static void main(String[] args){
        for(Weekday d: Weekday.values()){
            System.out.println(d);
        }
    }
}
