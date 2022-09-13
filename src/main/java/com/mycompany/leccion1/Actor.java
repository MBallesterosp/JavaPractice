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
public class Actor implements Storable {   
    private String name;
    private Place whereabouts;
    public String getName(){
        return name;
    }
    public Place getWhereabouts(){
        return whereabouts;                 
    }
    public Actor(String name){
        this.name = name;
    }
    public String say(Line line){
        return line.text;
        
    }
    public void go(Place place){
        leave();
        place.add(this);
        this.whereabouts = place;
    }

    private void leave() {
        if(whereabouts == null){
            return;
        }
        whereabouts.remove(this);
        this.whereabouts = null;
        
    }
    @Override
    public String toString(){
        return name + "@" + whereabouts.name;
    }
        
}
