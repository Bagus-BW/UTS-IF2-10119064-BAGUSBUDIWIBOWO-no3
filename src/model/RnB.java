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
public class RnB extends MusikGenre implements Blues, Jazz{

    @Override
    public void genreBluess(String artistName) {
        System.out.println(artistName + "adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName + "adalah musisi Jazz");
    }
    
}
