# Vaatimusmäärittely #
## Sovelluksen tarkoitus ##

Sovelluksen käyttäjä voi valita haluamansa aiheen ja vastata siihen liittyviin monivalintakysymyksiin. Käyttäjät voivat tarkastella kuinka hyvin he osaavat eri testien aihealueet.

## Toimintaympäristön rajoitteet ##
Ohjelman tulee toimia macOS ja Linux käyttöjärjestelmillä.
Ohjelmisto tehdään käyttäen Javaa.

## Käyttäjät ##
Sovelluksessa on vain yksi käyttäjärooli, normaali pelaaja. 

## Käyttöliittymäluonnos ##
Sovelluksessa on useita eri näkymiä, ensimmäinen on kirjautumissivu. Tästä voi mennä luomaan uuden käyttäjän tai siirtyä pelimenuun. Tässä pelimenu näkymässä voi valita mistä aiheesta haluaa tehdä testin tai
voi tarkastella omien pelien statistiikkaa. Tästä siirrytään sitten haluamalle sivulle, joko statistiikkasivulle tai kysymyksiin. Kysymysten loputtua näytetään viimeinen näkymä jossa näkyy montako vastausta meni oikein.
![maarittelydokumentti](https://user-images.githubusercontent.com/80842633/112718011-f77b0400-8ef8-11eb-9ef4-2fdcc7480d99.jpg)



## Perusversion tarjoama toiminnallisuus ##
## Ennen kirjautumista ##
Käyttäjä voi luoda uuden, käyttäjänimen jonka tulee olla uniikki ja siihen salasanan. TOIMII
Käyttäjä voi kirjautua sisään jos tiedot on oikein, jos ei niin järjestelmä kehottaa luomaan uuden käyttäjänimen tai kokeilemaan uudelleen TOIMII

## Kirjautumisen jälkeen ##
Käyttäjälle aukeaa pelimenu näkymä missä on lista peleistä ja myös nappi mistä painaa jos haluaa päästä katsomaan pelien statistiikkaa. TOIMII
Käyttäjä voi valita haluaako hän pelata peliä vai tarkastella pelien pelaamiseen liittyvää statistiikkaa. TOIMII
Käyttäjä voi kirjautua ulos.

### Pelaaminen ###
Käyttäjä näkee listan mahdollisista peleistä joista voi valita yhden ja avata pelinäkymän. TOIMII
Käyttäjä näkee kysymyksen ja voi valita 2-4 vaihtoehdosta haluamansa vastauksen ja siirtyä seuraavaan kysymykseen. TOIMII
	Tämä toistuu kunnes kysymykset loppuvat TOIMII
Käyttäjä näkee montako kysymystä sai oikein TOIMII
Käyttäjä voi palata pelimenu näkymään. TOIMII

### Statistiikka ###
Käyttäjä näkee mitä peliä on pelattu eniten ja vähiten sekä missä pelissä hän on onnistunut parhaiten ja huonoiten. EI TOIMI VIELÄ OIKEIN
Käyttäjä voi palata valikkoon.TOIMII

## Jatkokehitysideoita ##
Ohjelmaa voisi täydentää näillä ideoilla:
	
	Mahdollisuus kysyä vinkkiä kysymyksiin vastattaessa, esim 3 vinkkiä per peli
	
	Pääkäyttäjän luominen joka voisi poistaa käyttäjiä tai tarkastella kaikkien statistiikkaa
	
	Kavereiden lisääminen ja heitä vastaan pelaaminen
	
	Oman käyttäjän poistaminen
	
	Timer-ominaisuus, aikarajat kysymyksiin vastaamiselle
	
	Omien kysymyssettien luominengame


## Tällä hetkellä toimivat osat (YHTEENVETO) ##
Ohjelmassa toimii uuden käyttäjätunnuksen luominen ja sen tarkistus tietokannasta. Luoduilla tunnuksilla pääseen kirjautumaan sovellukseen ja avaamaan pelimenun jossa on napit kahdelle eri pelille ja näistä voi valita kumpaa pelaa. Ensimmäinen peli toimii (näät kysymykset, voit vastata niihin, edetä seuraavaan kysymykseen) ja niiden päätyttyä voi palata takaisin pelimenuun ja näet yksittäisen pelin pisteet. Stats sivu on tehty ja se toimii osittain mutta statsien laskeminen ja tietokantaan tiedon laittaminen/hakeminen on tältä osin vielä kesken. 
