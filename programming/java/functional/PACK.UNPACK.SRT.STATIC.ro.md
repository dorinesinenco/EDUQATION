## Programare funcțională în contextul unei clase. Primul pas către OOP.


> Când lucrăm cu metode, datorită faptului că pot returna doar o singură valoare în întregime, dacă este necesar să returnăm mai multe valori, trebuie să returnăm datele împachetate într-o matrice, colecție sau orice altă structură. Deoarece nu avem voie să folosim ```return value1, value2, value3``` în metode pentru a returna multe valori dintr-o singură miscare.

> În exemplul nostru actual, va trebui să transmitem înapoi 3 numere întregi din metode. Pentru a realiza acest lucru, vom folosi o versiune simplificată a ceea ce se numește „serializing” (serializare). Acest proces (transformare) este adesea necesar pentru ca seturile de valori să poată fi transmise secvenţial printr-o reţea sau alte tehnologii.

> Serialization (Serializarea) este un proces care traduce un obiect (valori) într-o secvență de octeți, din care apoi poate fi complet restaurat.

* Imaginează-ți că trebuie să trimitem și să primim 3 numere întregi în același timp. Vom face acest lucru cu două metode, una care va „împacheta” numerele într-un șir și una care le va „despacheta”.


* Luați în considerare un exemplu de clasă simplă cu o metodă „main()”.
  
     ```java
     clasă publică PackUnpackDataApp {
        
        
         public static void main(String[] args) {

         }
     }
     ```
   
 
* Adaugam o metodă - pentru „impachetare”
 
   ```java
   static String packIntegers(int a, int b, int c) {
       returnează "" + a + " " + b + " " + c;
   }
   ```
   această metodă returnează un șir (String), obținem un șir până acum într-un mod primitiv (lipind valori împreună), ea primeste 3 numere intregi si returneaza un string cu ele "impachetate" prin spatiu
   ```java
   packIntegers(10,100,1000)
   ```
   vom primi
   ```
   „10 100 1000”
   ```
   acordați atenție separatorului (spațiu - va ajuta la scanarea valorilor)
  
    - testam metoda?
   ```java
     public static void main(String[] args) {
        System.out.println( packIntegers(10,100,1000) );
     }
   ```
  * Adaugam o metodă - pentru „despachetare”
 
   ```java
   static void unpackIntegers(String data) {
       Scanner in = new Scanner(data);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       System.out.println( "a = " + a );
       System.out.println( "b = " + b);
       System.out.println( "c = " + c);
   }
   ```
   această metodă nu returnează nimic, are nevoie de un șir (String) și ATENȚIE! inițializează Scanner() de data aceasta folosind **data** - ca sursa - un sir de caractere  (deci datele NU sunt introduse de la tastatura ci preluate dintr-un text!) si le afiseaza in consola, apeland:
   ```java
   upackIntegers(„10 100 1000”)
   ```
   vom primi
   ```
   a = 10
   b = 100
   c = 1000
   ```
  ---

* Se cere sa:
   1. Creați o clasă „PackUnpackTemperaturesApp” cu „main()”
   2. Adăugați metoda ```static String packTemperatures(int t1, int t2, ..., int t7)``` care va lua 7 valori de temperatură pentru toate zilele săptămânii începând de luni și le va impacheta prin spatiu intr-un string
   3. Adăugați metoda ```static int avgTemperature(int t1, int t2, ..., int t7)``` care va obține 7 valori și va returna temperatura medie pentru săptămână
   4. Adăugați metoda ```static void unpackTemperatures(String data)```, care va despacheta 7 valori din text, după care va apela ```avgTemperature(int t1, int t2, ... )``` și va afisa rezultatul ultimei operatoo pe ecran cu .println()
   5. Rulați codul folosind 
     ```java
     public static void main(String[] args) {
        unpackTemperatures( packTemperatures(-5, 5, 0, -5, 5, 0, -5) );
     }
     ```
