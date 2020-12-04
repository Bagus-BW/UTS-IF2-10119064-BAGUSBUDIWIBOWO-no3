/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 */
public class HardRock extends RnB implements PopRock, ProgressiveRock, PsychedelicRock{

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + "adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + "adalah musisi ProgressiveRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName + "adalah musisi PsychedelicRock");
    }
    
}
