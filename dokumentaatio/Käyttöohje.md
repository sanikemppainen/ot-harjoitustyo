# Käyttöohje

## Ohjelman käynnistys
Voit käynnistää sovelluksen lataamalla viimeisimmän releasen [src tiedoston](https://github.com/sanikemppainen/ot-harjoitustyo/releases/tag/viikko7) joka sitten tulee purkaa. Sitten avaa kansio opintopiiri komentoriviltä jossa voit luoda käskyllä:
```
mvn package
```
jar tiedoston jonka voit sitten ajaa menemällä target kansioon ja ajamalla käskyn:
```
java -jar opintopiiri-1.0-SNAPSHOT.jar
```
## Kirjautuminen 
Ohjelma avaa ensin kirjautumisnäytön johon voit syöttää käyttäjänimen, salasanan ja painaa Login nappia.
![login](https://user-images.githubusercontent.com/80842633/117018156-ecd43b80-acfc-11eb-9fb7-2989c09f12e5.png)

## Rekisteröityminen
Jos et ole vielä luonut käyttäjätunnusta, voit painaa Register nappia joka ohjaa sinut rekisteröintisivulle.
Syötä annettuihin kenttiin tarvittavat tiedot ja paina Create a New User nappia. Jos tämän niminen käyttäjä on jo olemassa, ohjelma ilmoittaa siitä.
Siinä tapauksessa syötä uusi nimi ja salasana.

![register](https://user-images.githubusercontent.com/80842633/117018180-f2ca1c80-acfc-11eb-8bb9-96b4cbbd3358.png)

Tämän jälkeen ohjaannut uudelleen kirjautumisnäytölle jonne voit nyt syöttää luomasi käyttäjätunnuksen tiedot.

## Pelimenu
Sitten aukeaa pelimenu josta voit valita kahden pelin välillä tai voit katsella pelien statistiikkaa Stats napista tai sulkea sovelluksen Quit napista.
Pääset pelaamaan pelejä painamalla joko Quiz 1: Fish tai Quiz 2: Dinosaurs nappeja. 
![pelimenu](https://user-images.githubusercontent.com/80842633/117018208-f78ed080-acfc-11eb-8136-e1af997ad38f.png)

## Pelinäkymä
Valitsitpa peli 1 tai 2 niin sinulle aukeaa samantyylinen pelinäkymä. Näät kysymyksen ja siihen annetut neljä vaihtoehtoa. Kirjoita haluamasi vastaus tekstikenttään ja paina Next nappia.
Sitten näät seuraavan kysymyksen ja tämä toistuu kunnes kysymyksiä ei enää ole. 
![peli](https://user-images.githubusercontent.com/80842633/117018244-fe1d4800-acfc-11eb-8a56-4d836fdd6235.png)

Pelinäkymä ilmoittaa jos yrität syöttää epäkelvon vastauksen.
![wrong](https://user-images.githubusercontent.com/80842633/117018258-01b0cf00-acfd-11eb-8b7d-d4cf8c87027a.png)


## Peli ohi näkymä
Pelin kysymysten loputtua saavut 'peli ohi' näkymään jossa näkyy yhteenveto ansaituista pisteistä. Voit palata pelimenuun 'Go back to menu' napista. 

![gameover](https://user-images.githubusercontent.com/80842633/117018309-0c6b6400-acfd-11eb-9f04-3a178e77f9a3.png)

## Stats näkymä
Täällä näät monestikko olet pelannut mitäkin peliä ja mikä on keskiverto pistesi kummastakin pelistä. Voit palata pelimenuun.
![gameover](https://user-images.githubusercontent.com/80842633/118287530-329eba00-b4dc-11eb-987b-985a3953a0d5.png)
)

Voit sammuttaa pelin joko pelimenun Quit napista tai milloin vain punaisesta rastista. 
