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
public class Libretto {
    Scene[] scenes;

    private static class Scene {
        Action[] actions;
        Dialogue dialogue;
        SceneHeading sceneHeading;

        public Scene() {
        }
    }

    private static class Action {
        String description;

        public Action() {
        }
    }

    private static class Dialogue {
        Line[] lines;

        public Dialogue() {
        }
    }


    private static class SceneHeading {
        String place;
        String time;

        public SceneHeading() {
        }
    }
    
}
