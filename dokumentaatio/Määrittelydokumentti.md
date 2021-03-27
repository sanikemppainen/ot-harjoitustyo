# Vaatimusmäärittely #
## Sovelluksen tarkoitus ##

Sovelluksen käyttäjä voi valita haluamansa aiheen ja vastata siihen liittyviin monivalintakysymyksiin. Käyttäjät voivat tarkastella kuinka hyvin he osaavat eri testien aihealueet.

## Käyttäjät ##
Sovelluksessa on vain yksi käyttäjärooli, normaali pelaaja. 

## Käyttöliittymäluonnos ##
Sovelluksessa on useita eri näkymiä, ensimmäinen on kirjautumissivu. Tästä voi mennä luomaan uuden käyttäjän tai siirtyä pelimenuun. Tässä pelimenu näkymässä voi valita mistä aiheesta haluaa tehdä testin tai
voi tarkastella omien pelien statistiikkaa. Tästä siirrytään sitten haluamalle sivulle, joko statistiikkasivulle tai kysymyksiin. Kysymysten loputtua näytetään viimeinen näkymä jossa näkyy montako vastausta meni oikein.
![maarittelydokumentti](https://user-images.githubusercontent.com/80842633/112718011-f77b0400-8ef8-11eb-9ef4-2fdcc7480d99.jpg)



## Perusversion tarjoama toiminnallisuus ##
## Ennen kirjautumista ##
Käyttäjä voi luoda uuden, käyttäjänimen jonka tulee olla uniikki ja siihen salasanan
Käyttäjä voi kirjautua sisään jos tiedot on oikein, jos ei niin järjestelmä kehottaa luomaan uuden käyttäjänimen tai kokeilemaan uudelleen

## Kirjautumisen jälkeen ##
Käyttäjälle aukeaa pelimenu näkymä missä on lista peleistä ja myös nappi mistä painaa jos haluaa päästä katsomaan pelien statistiikkaa.
Käyttäjä voi valita haluaako hän pelata peliä vai tarkastella pelien pelaamiseen liittyvää statistiikkaa.
Käyttäjä voi kirjautua ulos.

### Pelaaminen ###
Käyttäjä näkee listan mahdollisista peleistä joista voi valita yhden ja avata pelinäkymän.
Käyttäjä näkee kysymyksen ja voi valita neljästä vaihtoehdosta haluamansa vastauksen ja siirtyä seuraavaan kysymykseen.
	Tämä toistuu kunnes kysymykset loppuvat
Käyttäjä näkee montako kysymystä sai oikein
Käyttäjä voi palata pelimenu näkymään tai pelata saman pelin uudelleen

### Statistiikka ###
Käyttäjä näkee mitä peliä on pelattu eniten ja vähiten sekä missä pelissä hän on onnistunut parhaiten ja huonoiten.
Käyttäjä voi palata valikkoon

## Jatkokehitysideoita ##
Ohjelmaa voisi täydentää näillä ideoilla:
	
	Mahdollisuus kysyä vinkkiä kysymyksiin vastattaessa, esim 3 vinkkiä per peli
	
	Pääkäyttäjän luominen joka voisi poistaa käyttäjiä tai tarkastella kaikkien statistiikkaa
	
	Kavereiden lisääminen ja heitä vastaan pelaaminen
	
	Oman käyttäjän poistaminen
	
	Timer-ominaisuus, aikarajat kysymyksiin vastaamiselle
	
	Omien kysymyssettien luominengame




