package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;
    

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    @Test
    public void alkusaldoOnOikein(){
        assertEquals("saldo: 0.10", kortti.toString());
    }
    @Test
    public void latausKasvattaaSaldoa(){
        kortti.lataaRahaa(10);
        assertEquals("saldo: 0.20", kortti.toString());
    }
    @Test
    public void saldoVaheneeJosTarpeeksiRahaa(){
        kortti.otaRahaa(2);
        assertEquals("saldo: 0.8", kortti.toString());
    }
    @Test
    public void saldoEiMuutuJosEiTarpeeksiRahaa(){
        kortti.otaRahaa(200);
        assertEquals("saldo: 0.10", kortti.toString());
    }
    @Test
    public void onkoTarpeeksiRahaaPalauttaakoTrue(){
        assertEquals(kortti.otaRahaa(3),true);
    }
    @Test
    public void onkoTarpeeksiRahaaPalauttaakoFalse(){
        assertEquals(kortti.otaRahaa(300),false);
    }
    @Test
    public void kutsutaanSaldoa(){
        kortti.lataaRahaa(3);
        kortti.saldo();
        assertEquals("saldo: 0.13", kortti.toString());
    }
}
