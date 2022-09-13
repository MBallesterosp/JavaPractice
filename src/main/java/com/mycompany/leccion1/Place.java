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
public class Place {

    String name;

    Storable[] contents;
    int index;

    public Place(int size, String name) {
        this.contents = new Storable[size];
        this.index = 0;
        this.name = name;
    }

    @Override
    public String toString() {
        String place = name + ": ";
        for (int i = 0; i < contents.length; i++) {
            place = place + contents[i];
        }
        return place;
    }

    public void add(Storable storable) {

        contents[index] = storable;
        this.index++;
    }

    void remove(Storable storable) {
        int j = 0;
        for (int i = 0; i < contents.length; i++) {
            if (contents[i].getName().equals(storable.getName())  ) {
                contents[i] = null;
            }
            j = i;
        }
        index = j;
    }

    public void setName(String name) {
        this.name = name;
    }

}
