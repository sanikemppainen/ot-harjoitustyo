/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ksani
 */
public class KassapaateTest {
    Kassapaate kassapaate;
    Maksukortti kortti;
    
    @Before
    public void setUp() {
        kassapaate=new Kassapaate();
        kortti=new Maksukortti(1000);
    }
    @Test
    public void alussaLuotuOikeatMaaratRahaa(){
        kassapaate.kassassaRahaa();
        assertEquals(kassapaate.kassassaRahaa(), 100000);
    }
    @Test
    public void edullisiaLounaitaAlussaNolla(){
        assertEquals(kassapaate.edullisiaLounaitaMyyty(),0);
    }
    @Test
    public void maukkaitaLounaitaAlussaNolla(){
        assertEquals(kassapaate.maukkaitaLounaitaMyyty(),0);
    }
    @Test
    public void kateinenJosMaksuRiittavaRahamaaraKasvaaEdullisella(){
        kassapaate.syoEdullisesti(240);
        assertEquals(kassapaate.kassassaRahaa(), 100240);
    }
    @Test
    public void kateinenJosMaksuRiittavaRahamaaraKasvaaMaukkaalla(){
        kassapaate.syoMaukkaasti(400);
        assertEquals(kassapaate.kassassaRahaa(), 100400);
        
    }
    @Test
    public void kateinenJosMaksuRiittavaVaihtorahaPaivittyyEdullinen(){
        //kassapaate.syoEdullisesti(300);
        assertEquals(kassapaate.syoEdullisesti(300), 60);
    }
    @Test
    public void kateinenJosMaksuRiittavaVaihtorahaPaivittyyMaukas(){
        assertEquals(kassapaate.syoMaukkaasti(500), 100);

    }
    @Test
    public void kateinenJosMaksuRiittavaMyydytLounaatKasvaaEdullinen(){
        kassapaate.syoEdullisesti(240);
        assertEquals(kassapaate.edullisiaLounaitaMyyty(), 1);
    }
    @Test
    public void kateinenJosMaksuRiittavaMyydytLounaatKasvaaMaukas(){
        kassapaate.syoMaukkaasti(400);
        assertEquals(kassapaate.maukkaitaLounaitaMyyty(), 1);
    
    }
    @Test
    public void kateinenJosMaksuEiRiittavaKassanRahaEiMuutu(){
        kassapaate.syoEdullisesti(100);
        kassapaate.syoMaukkaasti(200);
        assertEquals(kassapaate.kassassaRahaa(),100000);
    }
    @Test
    public void kateinenJosMaksuEiRiittavaMyytyLounasEiMuutuEdullinen(){
        kassapaate.syoEdullisesti(100);
        assertEquals(kassapaate.edullisiaLounaitaMyyty(), 0);
    }
   @Test
    public void kateinenJosMaksuEiRiittavaMyytyLounasEiMuutuMaukas(){
        kassapaate.syoMaukkaasti(300);
        assertEquals(kassapaate.maukkaitaLounaitaMyyty(), 0);
    
    }
    @Test
    public void kateinenVaihtorahaPalautataanKokonaanJosEiTarpeeksiRahaa(){
        assertEquals(kassapaate.syoEdullisesti(100), 100);

    }
    @Test
    public void korttiJosTarpeeksiRahaaVeloitaKortiltaEdullinen(){
        kassapaate.syoEdullisesti(kortti);
        assertEquals("saldo: 7.60",kortti.toString());
        
    }
    @Test
    public void korttiJosTarpeeksiRahaaVeloitaKortiltaMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        assertEquals("saldo: 6.0",kortti.toString());
        
    }
    @Test
    public void korttiJosTarpeeksiRahaaVeloitaKortiltaEdullinenPalTrue(){
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kassapaate.syoEdullisesti(kortti), true);
    }
    @Test
    public void korttiJosTarpeeksiRahaaVeloitaKortiltaMaukasPalTrue(){
         kassapaate.syoMaukkaasti(kortti);
         assertEquals(kassapaate.syoMaukkaasti(kortti), true);
    }
    @Test
    public void korttiJosTarpeeksiRahaaLounasKplKasvaaEdullinen(){
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kassapaate.edullisiaLounaitaMyyty(),1);
    }
    @Test
    public void korttiJosTarpeeksiRahaaLounasKplKasvaaMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(kassapaate.maukkaitaLounaitaMyyty(),1);
        
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaKortinRahamaaraEiMuutuEdullinen(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        //nyt liian vähän rahaa kortilla, on 200
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kortti.saldo(), 200);
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaKortinRahamaaraEiMuutuMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(kortti.saldo(), 200);
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaLounaidenKplEiMuutuEdullinen(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        //nyt liian vähän rahaa kortilla, on 200
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kassapaate.edullisiaLounaitaMyyty(),0);
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaLounaidenKplEiMuutuMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(kassapaate.maukkaitaLounaitaMyyty(), 2);
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaPalFalseEdullinen(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kassapaate.syoEdullisesti(kortti), false);
    }
    @Test
    public void korttiJosEiTarpeeksiRahaaPalFalseMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(kassapaate.syoMaukkaasti(kortti), false);
    
        
    }
    @Test
    public void kassanRahamaaraEiMuutuKortillaOstettaessaEdullinen(){
        kassapaate.syoEdullisesti(kortti);
        assertEquals(kassapaate.kassassaRahaa(),100000);
    }
    @Test
    public void kassanRahamaaraEiMuutuKortillaOstettaessaMaukas(){
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(kassapaate.kassassaRahaa(),100000);
      
    }
    @Test
    public void kortilleLadataanKortinSaldoPaivittyy(){
        kassapaate.lataaRahaaKortille(kortti, 2000);
        assertEquals(kortti.saldo(), 3000);
    }
    @Test
    public void kortilleLadattavaSaldoKasvattaaKassaa(){
        kassapaate.lataaRahaaKortille(kortti, 1000);
        assertEquals(kassapaate.kassassaRahaa(),101000);
    }
    @Test
    public void kortilleLadataanNegatiivinenSummaPalFlase(){
        kassapaate.lataaRahaaKortille(kortti, -100);
        assertEquals(kassapaate.kassassaRahaa(), 100000);
    }
    
}