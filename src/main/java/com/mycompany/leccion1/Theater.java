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
public class Theater {

    private Backstage backstage;
    private Stage stage;
    public Backstage getBackstage(){
        return backstage;
    }
    public Stage getStage(){
        return stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Theater theater;
        theater = new Theater(1,1);
        theater.backstage.setName("Backstage José");
        Actor arnold;
        arnold = new Actor("Arnold Schwarzenegger");
        Actor leonard = new Actor("Leornado DiCaprio");
        System.out.println(theater.backstage);
        arnold.go(theater.backstage);
        System.out.println(theater.backstage);
        try {
            leonard.go(theater.backstage);
        } catch (ArrayIndexOutOfBoundsException ex) {
            arnold.go(theater.stage);
        }
        System.out.println(theater.backstage);
        System.out.println(theater.stage);
        new Audience().listen(arnold.say(new Line("Terminator", "I´ll be back")));
        new Actor("Angelina").go(theater.backstage);
        System.out.println(theater.backstage);
        
        

    }

    public Theater(int backstageLenght,int stageLenght) {
        this.backstage = new Backstage(backstageLenght);
        this.stage = new Stage(stageLenght);

    }
}
