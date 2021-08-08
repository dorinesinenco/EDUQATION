## Dezvoltarea laturii "Product"

### Model
1. Adaugati un model nou numit Money, acesta reprezinta o suma de bani si este compus din:
  * amount    (like  50.00)
  * currency  (like "USD")
2. Adaugati produsului urmatoarele caracteristici/modificari:
  * in loc de imageUrl - produsul va avea un Array cu mai multe imagini, proprietatea se va numi imageUrls
  * price - campul care va contine un POJO simplu care va poate sa contina o valoare de tip Money pe urmatoarele chei: "standart", "discount" , fiecare din acestea reprezinta o variatie a pretului produsului. Adica de exemplu un produs cu 
      ```js
       ...price = {
          standard: new Money(100.00, "USD"),
          discount: new Money(50.00, "USD"),
       }
      ```
      ar insemna ca se vinde la pret standart cu 100 iar in la reducere cu 50 de dolari
  * description - camp textual (String)
  * attributes - un Array din modele de tip Attribute
3. Adaugati modelul Attribute, acesta consta din:
  * name
  * value

ATENTIE!!! Convingeti-va ca toate modelele au constructor, toPOJO(), toJSON()
  



### Imbunatatirea modelului vizual

- Este oare Money in model de date universal? - da!, respectiv partea care il reprezinta vizual in DOM poate fi facuta tot universala!

1. Creati in mapa POTRIVITA! componenta vizuala Money, care corespunde sumei de bani, aceasta tre sa afiseze intr-o linie valoarea si valuta
2. Tot aceasta componenta trebuie sa se poata afisa in urmatoarele moduri (variatiile de modalitati pentru aceasta componenta o faceti prin render conditionat intr-o singura functie):
  - std     ( standard, by default)   ```[100.00USD]```
  - old      (valoare veche, poate fi folosita pentru a arata eventual un pret cu reducere) - va aparea la fel doar ca TAIATA cu o LINIE pe mijloc
  - act      (active, adica, selectata sau evidentiata ) - va aparea cu un font mai evident, de exemplu - bold

- Este oare componenta Attribute una care poate fi utilizata universal? (atribut insemnand de exemplu - greutate, latime, inaltime, culoare, etc) 

1. Creati in mapa POTRIVITA! componenta vizuala Attribute, care corespunde unei caracteristic a produsului, aceasta tre sa afiseze intr-o linie denumirea si valoarea acestuia, de ex ``` color: green ``` 


---

Modificati codul principal al aplicatiei astfel incat:
1. Sa fie creata o lista cu 3 produse fiecare cu cate 2-3 poze si doua preturi
2. Sa fie afisate aceste produse in regim full (cu toate detaliile) astfel incat preturile acestora (daca sunt reduceri) sa fie afisate in ambele variante
3. In acest regim, imaginile produselor trebuiesc afisate toate
