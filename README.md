# OPINTOPIIRI SOVELLUS #

Sovelluksen tarkoitus on antaa käyttäjän harjoitella monivalintakysymyksillä tietyn aihepiirin tietoja. Sovellus pitää yllä tietokantaa eri käyttäjistä ja näiden käyttäjien pelien datasta, kuten mitä peliä on pelattu eniten ja minkä pelin onnistumisprosentti on pienin. 

## Dokumentaatio ## 

  [Määrittelydokumentti](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/M%C3%A4%C3%A4rittelydokumentti.md)

  [Harjoitustyöhön käytetyt tunnit](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/tuntikirjanpito.md)
  
   [Arkkitehtuuri](https://github.com/sanikemppainen/ot-harjoitustyo/blob/1e0b0cd524cc92335ad43e255511abeb4475e670/dokumentaatio/arkkitehtuuri.md)
   
   
 
## Komentorivitoiminnot ##
### Suoritus

Ohjelma suoritetaan opintopiiri kansiosta komennolla 

```
mvn compile exec:java -Dexec.mainClass=opintopiiri.domain.Main
```

### Testaus

Testit suoritetaan opintopiiri kansiossa komennolla

```
mvn test
```

Testikattavuusraportti luodaan opintopiiri kansiossa komennolla

```
mvn jacoco:report
```

### Suoritettavan jarin generointi
Komennolla

```
mvn package
```

### Checkstyle
Checkstylen tarkistukset tehdään komennolla
```
mvn jxr:jxr checkstyle:checkstyle
```

