# OPINTOPIIRI SOVELLUS #

Sovelluksen tarkoitus on antaa käyttäjän pelata eri monivalintakysymyspelejä. Sovellus pitää yllä tietokantaa eri käyttäjistä ja näyttää pelaajalle peleistä kerättyä dataa, kuten monesti mitäkin peliä on pelattu ja mikä on keskiverto tulos jokaisesta pelistä.

## Dokumentaatio ## 

  [Määrittelydokumentti](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/M%C3%A4%C3%A4rittelydokumentti.md)

  [Harjoitustyöhön käytetyt tunnit](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/tuntikirjanpito.md)
  
   [Arkkitehtuuri](https://github.com/sanikemppainen/ot-harjoitustyo/blob/1e0b0cd524cc92335ad43e255511abeb4475e670/dokumentaatio/arkkitehtuuri.md)
   
   [Käyttöohje](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/K%C3%A4ytt%C3%B6ohje.md)
   
   [Testausdokumentti]()


## Releaset
[Viikko 5](https://github.com/sanikemppainen/ot-harjoitustyo/releases/tag/viikko5)

[Viikko 6](https://github.com/sanikemppainen/ot-harjoitustyo/releases/tag/viikko6)

 
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
Opintopiiri kansiosta komennolla

```
mvn package
```

### JavaDoc
JavaDocin saa generoitua komennolla

```
mvn javadoc:javadoc
```

### Checkstyle
Checkstylen tarkistukset tehdään komennolla
```
mvn jxr:jxr checkstyle:checkstyle
```
Virheilmoitukset voi selvittää avaamalla target kansioon luodun /site/checkstyle.html tiedoston selaimella.
