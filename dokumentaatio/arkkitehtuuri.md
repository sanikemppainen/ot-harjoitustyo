
# Arkkitehtuurikuvaus #
## Rakenne ##
Ohjelma on rakennettu kolmitasoisesti noudattaen kerrosarkkitehtuuria. Tässä on näytetty koodin pakkausrakenne:



## Käyttöliittymä ##
Käyttöliittymässä on seitsemän erillistä näkymää: kirjautumisnäkymä, uuden käyttäjän rekisteröinti, pelimenu, peli 1, peli 2, peliohi ja statistiikka näkymät. Kaikki nämä on toteutettu omina Scene-olioina jotka on vuorollaan sijoitettu sovelluksen Stageen. Tämä käyttöliittymän rakennus on eriytetty täysin sovelluslogiikasta eli käyttöliittymä kutsuu tarvittaessa opintopiiri.domain luokkien metodeja jotka puolestaan tallentaa ja hakee tietoa opintopiiri.dao luokista.

## Sovelluslogiikka ##
Sovelluslogiikan muodostaa luokat Main, Functions ja User jotka kuvaa käyttäjiä ja pelin pelaamiseen tarvittavia tehtäviä. 

User luokka tarjoaa mahdollisuuden luoda uuden käyttäjän syöttämällä tietokantaan uuden käyttäjän tiedot (käyttäjänimi, salasana, monestikko 1 ja 2 pelejä on pelattu ja mitkä niiden keskiarvo pisteet ovat) ja tarvittaessa muokata ja hakea näitä tietoja tietokannasta.

Functions luokka toteuttaa UI:n tarvitsemat tapahtumat.

Main luokka käynnistää UI:n joka taas luo User ja Functions luokat.

## Tietojen tallennus ##
Tiedot käyttäjistä ja heidän pelien statistiikasta tallennetaan H2 tietokantaan ja luokassa UserDao näitä tietoja tallennetaan, muokataan ja haetaan. Luokissa Quiz2 ja Quiz3 on tallennettuna molemmille peleille tarvittavat kysymykset ja vastaukset.

## Päätoiminnallisuudet ##
Sovelluksen toimintalogiikkaa on kuvattuna sekvenssikaaviona:

### Käyttäjän sisään kirjautuminen ###
Kun kirjautumisnäkymässä täytetään käyttäjätunnus ja salasana kentät (olettaen että nämä on aiemmin rekisteröity tietokantaan ja ovat siis olemassa) ja painetaan Login nappia sovellus etenee seuraavanlaisesti:



