
# Arkkitehtuurikuvaus #
## Rakenne ##
Ohjelma on rakennettu kolmitasoisesti noudattaen kerrosarkkitehtuuria. Tässä on näytetty koodin pakkausrakenne:

<img src="https://user-images.githubusercontent.com/80842633/118365651-5af2eb00-b5a6-11eb-86ef-dda98bddfd09.jpeg" width="300">

Opintopiiri.domain sisältää Functions ja User luokat, opintopiiri.ui sisältää käyttöliittymän sisältävän luokan Ui ja opintopiiri.dao sisältää UserDao, Quiz1 ja Quiz2 luokat.

## Käyttöliittymä ##
Käyttöliittymässä on seitsemän erillistä näkymää: kirjautumisnäkymä, uuden käyttäjän rekisteröinti, pelimenu, peli 1, peli 2, peli ohi ja statistiikka näkymät. Kaikki nämä on toteutettu omina Scene-olioina jotka on vuorollaan sijoitettu sovelluksen Stageen. Tämä käyttöliittymän rakennus on eriytetty täysin sovelluslogiikasta eli käyttöliittymä kutsuu tarvittaessa opintopiiri.domain luokkien metodeja jotka puolestaan tallentaa ja hakee tietoa opintopiiri.dao luokista.

<img src="https://user-images.githubusercontent.com/80842633/118365713-ab6a4880-b5a6-11eb-9af4-ec9525c0d00e.jpeg" width="400"/>

## Sovelluslogiikka ##
Socelluslogiikan suhdetta muihin osiin kuvaa tämä luokka/pakkauskaavio:
<img src="https://user-images.githubusercontent.com/80842633/118366174-50395580-b5a8-11eb-99b9-39dd4cdad810.jpeg" width="400"/>


Sovelluslogiikan muodostaa luokat Functions ja User jotka kuvaa käyttäjiä ja pelin pelaamiseen tarvittavia tehtäviä. 

User luokka tarjoaa mahdollisuuden luoda uuden käyttäjän syöttämällä tietokantaan uuden käyttäjän tiedot (käyttäjänimi, salasana, monestikko 1 ja 2 pelejä on pelattu ja mitkä niiden keskiarvo pisteet ovat) ja tarvittaessa muokata ja hakea näitä tietoja tietokannasta.

Functions luokka toteuttaa UI:n tarvitsemat tapahtumat.

Main luokka käynnistää UI:n joka taas luo User ja Functions luokat.

![60651850-3D6D-432D-A3BE-3362E801D530](https://user-images.githubusercontent.com/80842633/118365755-da80ba00-b5a6-11eb-99bc-5d64f025a51d.jpeg)


## Tietojen tallennus ##
Tiedot käyttäjistä ja heidän pelien statistiikasta tallennetaan H2 tietokantaan ja luokassa UserDao näitä tietoja tallennetaan, muokataan ja haetaan. Luokissa Quiz2 ja Quiz3 on tallennettuna molemmille peleille tarvittavat kysymykset ja vastaukset.

![B28AF8B3-AC7B-449E-80B3-487088A711D7](https://user-images.githubusercontent.com/80842633/118365853-09972b80-b5a7-11eb-91a5-c4cacf97c860.jpeg)


## Päätoiminnallisuudet ##


### Käyttäjän sisään kirjautuminen ###
Kun kirjautumisnäkymässä täytetään käyttäjätunnus ja salasana kentät (olettaen että nämä on aiemmin rekisteröity tietokantaan ja ovat siis olemassa) ja painetaan Login nappia sovellus etenee seuraavanlaisesti:

![3F9A82FA-75F8-4FCA-B72A-0036F0B9919D](https://user-images.githubusercontent.com/80842633/118365873-1fa4ec00-b5a7-11eb-8230-c0e4f4810962.jpeg)


### Uuden käyttäjän luominen

![5FED1263-E5E1-49C5-8428-44885BD4155E](https://user-images.githubusercontent.com/80842633/118365928-50852100-b5a7-11eb-88b7-55d0a43c8e8d.jpeg)

### Pelin valitseminen

<img src="https://user-images.githubusercontent.com/80842633/118365960-6eeb1c80-b5a7-11eb-9bf7-033f46e9b650.jpeg" width="400"/>

### Pelin pelaaminen

<img src="https://user-images.githubusercontent.com/80842633/118366001-980bad00-b5a7-11eb-95ce-1a9ac51406ae.jpeg" width="600"/>

### Pisteiden talletus

![18339A9E-2873-49D3-8643-2CE62F58BC85](https://user-images.githubusercontent.com/80842633/118366075-ef118200-b5a7-11eb-8e73-7b0f18b3452f.jpeg)

### Pelistatistiikan katsominen

<img src="https://user-images.githubusercontent.com/80842633/118366098-07819c80-b5a8-11eb-90aa-975f6971009f.jpeg" width="500"/>

## Ohjelman rakenteeseen jääneet heikkoudet

- Käyttöliittymän metodia start olisi voinut pilkkoa pienemmiksi metodeiksi. 
- Pelien keskiarvopisteiden ja pelattujen pelien määrä jäi pysyväistallennuksen ulkopuolelle
