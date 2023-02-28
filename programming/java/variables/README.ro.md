## Declararea variabilelor simple, folosind tipuri primitive

> VARIABILE ( Variable ) este elementul principal de stocare a informațiilor într-un program Java. O variabilă este caracterizată printr-o combinație de identificator, tip și domeniu de vizibilitate.
> Modul recomandat de a alege numele variabilelor în Java este CamelCase. Aceasta înseamnă că numele compuse din cuvinte / litere simple sunt scrise cu o literă inițială mică, iar în nume compuse - fiecare cuvânt ulterior este scris cu majuscule la început. Și este, de asemenea, recomandat să te limitezi la un set de litere latine (a..zA..Z)

* Apropo, dacă ni s-ar fi dat să declarăm variabile de coordonate, am putea scrie într-un simplu
    ```java
    int x = 10;
    int y = 20;
    ```

* Dacă ni s-a cerut să folosim un „cod expres” pentru a indica că aceste coordonate sunt, de exemplu, locația unei mașini pe o hartă
    ```java
    int carX = 10;
    int carY = 20;
    ```

* Dacă ni s-ar fi permis să anunțăm, de exemplu, „numărul de zile de vacanță pentru studenți” și „numărul de ore de practică în cadrul unei companii”
    ```java
    int studentHolidayDays = 30;
    int studentCompanyPracticeHours = 100;
    ```

* În unele situații, vi se va cere chiar să introduceți o unitate de măsură în numele în sine pentru „mai multă expresivitate”

---

* Înainte de a începe să vă faceți temele, nu uitați că scriem TOT acest cod în cadrul funcției **main()**
  
* Este necesar să se creeze o nouă aplicație cu funcția „main()” ca fișier (clasă) numit „DateVariablesApp”
* Cu acest schelet (fișier DateVariablesApp.java)
     ```java
         public class DateVariablesApp {

                public static void main(String[] args){

                    int year  = 2019;
                    int month = 5;
                    int day   = 25;


                    System.out.print("Today is: ");
                    System.out.print( year );
                    System.out.print("-")
                    System.out.print( month );
                    System.out.print("-");
                    System.out.print( day );

                    // 1) rulati si verificati executia codului
                    // 2) refaceti codul astfel incat acesta sa afiseze urmatorul mesaj:
                        //  > Today is: 25-5-2019

                }

            }
     ```

* Rulați codul, apare o eroare, remediați-o și rulați din nou și verificați!
* În program, am declarat [3 variabile de tip întreg](./README.ro.md#L37-L39):
   1. Dați-le valori corespunzătoare datei curente
   2. Dați acestor trei variabile nume mai „expresive”, astfel încât să fie clar că aceasta este DATA PREZENTĂ (data de astăzi)
   3. Rescrieți codul în care aceste [variabile sunt folosite pentru ieșire](./README.ro.md#L43) astfel încât programul să le acceseze folosind noile nume pe care le-ați atribuit
   4. Modificați codul astfel încât să afișeze mesajul în următoarea ordine:
     ```Today is: 25-5-2019```

---
BONUS - răspunde la următoarele întrebări:
1. Care este diferența dintre funcțiile **print()** și **println()**?
2. Pe lângă tipul simplu „int”, ce alte tipuri simple există în Java?
