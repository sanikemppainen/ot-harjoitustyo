
# Testausdokumentti

Ohjelmaa on pääasiassa testattu automatisoidusti Junitilla. Käyttöliittymää on testattu manuaalisesti järjestelmätasolla. 

## Automatisoidut testit

Kansion opintopiiri.dao luokkia testataan DaoTests kansion testiluokilla. QuizesTest.java testaa Quiz1 ja Quiz2 luokkia ja UserDaoTest.java testaa UserDao luokkaa. Samalla logiikalla opintopiiri.Domain kansion luokkia testaa DomainTests kansion FunctionsTest.java ja UserTest.java tiedosto.

Osa testeistä testaa useiden luokkien tai metodien yhteistoimintaa. Esimerkiksi checkIfMoreQuestionsIfIndexOver8() metodi testaa niin kysymksen hakevaa metodia sekä sitä metodia joka tarkistaa onko kysymyksiä enää jäljellä.
<img src="https://user-images.githubusercontent.com/80842633/118359578-c9c34a80-b58c-11eb-964a-5eff4a801579.png" width="600">


## Testauskattavuus
Sovelluksen rivikattavuus on 91% ja haarautumiskattavuus on 76%. Käyttöliittymä ei ole huomioitu näissä testeissä.
![opintopiiritestit](https://user-images.githubusercontent.com/80842633/118362912-7bb54380-b59a-11eb-9f61-c5c01cdc8137.png)

## Järjestelmätestaus
Sovellusta on testattu manuaalisesti niin Linux kuin OSX käyttöjärjestelmillä. Kaikki [määrittelydokumentin](https://github.com/sanikemppainen/ot-harjoitustyo/blob/main/dokumentaatio/M%C3%A4%C3%A4rittelydokumentti.md) listaamat toiminnalisuudet on testattu läpi ja ne toimivat. 
