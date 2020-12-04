/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119064.bagusbudiwibowo.no3;

import model.BlackMetal;
import model.DeathCoreKepiting;
import model.DeathMetal;
import model.Folk;
import model.Grindcore;
import model.HardRock;
import model.Metal;
import model.MusikGenre;
import model.NewSkul;
import model.RnB;
import model.Rockabilly;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini adalah program untuk menampilkan nama artist musik
 * serta genre yang dibawakannya
 */
public class UTSIF210119064BAGUSBUDIWIBOWONo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MusikGenre musikGenre = new MusikGenre();
        
        Metal rnb = new Metal(),
              hardRock = new Metal(),
              metal = new Metal();
                 
        musikGenre.setArtistName("Jimmy Hendrik " );
        rnb.genreBluess(musikGenre.getArtistName());
        
        musikGenre.setArtistName("Chad Baker ");
        rnb.genreJazz(musikGenre.getArtistName());
        
        Folk folk = new Folk();
        musikGenre.setArtistName("Bob Dylan ");
        folk.genreFolk(musikGenre.getArtistName());
        
        Rockabilly rockabilly = new Rockabilly();
        musikGenre.setArtistName("Elvis Presley ");
        rockabilly.genreRockabilly(musikGenre.getArtistName());
        
        
        musikGenre.setArtistName("DreamTheater ");
        hardRock.genreProgressiveRock(musikGenre.getArtistName());
        
        musikGenre.setArtistName("The Doors ");
        hardRock.genrePsychedelicRock(musikGenre.getArtistName());
        
        musikGenre.setArtistName("Kiss ");
        hardRock.genrePopRock(musikGenre.getArtistName());
        
        musikGenre.setArtistName("MXPX ");
        metal.genrePunk(musikGenre.getArtistName());
        
        musikGenre.setArtistName("METALLICA ");
        metal.genreHeavyMetal(musikGenre.getArtistName());
        
        Grindcore grindcore = new Grindcore();
        musikGenre.setArtistName("Mesin Tempur ");
        grindcore.genreGrindcore(musikGenre.getArtistName());
        
        DeathMetal deathMetal = new DeathMetal();
        musikGenre.setArtistName("JASAD ");
        deathMetal.genreDeathMetal(musikGenre.getArtistName());
        
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        musikGenre.setArtistName("Revenge The Fate ");
        deathCoreKepiting.genreDeathCoreKepiting(musikGenre.getArtistName());
        
        BlackMetal blackMetal = new BlackMetal();
        musikGenre.setArtistName("Behemoth ");
        blackMetal.genreBlackMetal(musikGenre.getArtistName());
        
        NewSkul newSkul = new NewSkul();
        musikGenre.setArtistName("HATEBREED ");
        newSkul.genreNewSkul(musikGenre.getArtistName());
    }
    
}
