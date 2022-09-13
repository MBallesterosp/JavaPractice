package com.mycompany.leccion1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class TravellingSalesMan {
    
    private final City outer;

    public TravellingSalesMan(final City outer) {
        this.outer = outer;
    }
    
    public double getDistance(City a, City b){
        double horizontalDistance = Math.pow(a.location.x - b.location.x, 2);
        double verticalDistance = Math.pow(a.location.y - b.location.y, 2);
        double sum = horizontalDistance + verticalDistance;
        double distance = Math.sqrt(Math.pow(a.location.x - b.location.x, 2));
        return distance; 
    }
    
    
}
