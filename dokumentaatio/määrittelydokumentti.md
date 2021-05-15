# Vaatimusmäärittely #
## Sovelluksen tarkoitus ##

Sovelluksen käyttäjä voi valita haluamansa aiheen ja vastata siihen liittyviin monivalintakysymyksiin. Käyttäjät voivat tarkastella kuinka monta pistettä he saivat kustakin pelistä. 

## Toimintaympäristön rajoitteet ##
Ohjelman tulee toimia macOS ja Linux käyttöjärjestelmillä.
Ohjelmisto tehdään käyttäen Javaa.

## Käyttäjät ##
Sovelluksessa on vain yksi käyttäjärooli, normaali pelaaja. 

## Käyttöliittymäluonnos ##
Sovelluksessa on useita eri näkymiä, ensimmäinen on kirjautumissivu. Tästä voi mennä luomaan uuden käyttäjän tai siirtyä pelimenuun. Tässä pelimenu näkymässä voi valita mistä aiheesta haluaa pelata pelin tai
voi tarkastella omien pelien statistiikkaa. Tästä siirrytään sitten haluamalle sivulle, joko statistiikkasivulle tai kysymyksiin. Kysymysten loputtua näytetään viimeinen näkymä jossa näkyy montako vastausta meni oikein.

![kayttoliittymaluonnos](https://user-images.githubusercontent.com/80842633/118363207-efa41b80-b59b-11eb-915c-6de4ef920593.png)

## Perusversion tarjoama toiminnallisuus ##
## Ennen kirjautumista ##
- Käyttäjä voi luoda uuden käyttäjänimen jonka tulee olla uniikki ja siihen salasanan. 
- Käyttäjä voi kirjautua sisään jos tiedot on oikein, jos ei niin järjestelmä kehottaa luomaan uuden käyttäjänimen tai kokeilemaan uudelleen.

## Kirjautumisen jälkeen ##
- Käyttäjälle aukeaa pelimenu näkymä missä on lista peleistä ja myös nappi mistä painaa jos haluaa päästä katsomaan pelien statistiikkaa. 
- Käyttäjä voi valita haluaako hän pelata peliä vai tarkastella pelien pelaamiseen liittyvää statistiikkaa. 
- Käyttäjä voi sulkea sovelluksen.

### Pelaaminen ###
- Käyttäjä voi valita yhden peleistä ja klikkaamalla sitä nappia hän voi avata pelinäkymän. 
- Käyttäjä näkee kysymyksen ja voi valita 4 vaihtoehdosta haluamansa vastauksen ja kirjoittaa sen annettuun kenttään ja siirtyä seuraavaan kysymykseen painamalla nappia.
	- Tämä toistuu kunnes kysymykset loppuvat
- Pelin päätyttyä käyttäjä näkee montako kysymystä sai oikein.
- Käyttäjä voi palata pelimenu näkymään. 

### Statistiikka ###
- Käyttäjä näkee monestikko kutakin peliä on pelattu ja mikä on hänen keskiarvo tulos kussakin pelissä.
- Käyttäjä voi palata valikkoon

## Jatkokehitysideoita ##
Ohjelmaa voisi täydentää näillä ideoilla:
	
	Mahdollisuus kysyä vinkkiä kysymyksiin vastattaessa, esim 3 vinkkiä per peli
	
	Pääkäyttäjän luominen joka voisi poistaa käyttäjiä tai tarkastella kaikkien statistiikkaa
	
	Kavereiden lisääminen ja heitä vastaan pelaaminen
	
	Oman käyttäjän poistaminen
	
	Timer-ominaisuus, aikarajat kysymyksiin vastaamiselle
	
	Omien kysymyssettien luominen
	
	Pelattujen pelien määrä ja keskivertopisteet voisi myös tallentaa tietokantaan jolloin ne olisivat pysyvässä muistissa kuten kirjautumistiedot ovat.
