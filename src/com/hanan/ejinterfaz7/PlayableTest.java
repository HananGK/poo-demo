package com.hanan.ejinterfaz7;

public class PlayableTest {
    public static void main(String[] args) {
        Football football=new Football();
        Volleyball volleyball=new Volleyball();
        Basketball basketball=new Basketball();

        Playable[] playables = {football,volleyball,basketball};
        for(Playable playable:playables){
            playable.play();
        }
    }
}
