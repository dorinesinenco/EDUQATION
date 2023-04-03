## Programare funcțională în contextul unei clase. Primul pas către OOP.

> Metodele în Java sunt o secvență completă de acțiuni (instrucțiuni), un bloc de cod care vizează rezolvarea unei anumite probleme specifice. De fapt, acestea sunt funcții (subrutine).
 
> Metodele în Java sunt declarate în corpul (structura) clasei
 
> Metodele pot primi valori din exterior ca argumente, argumentul este o variabilă cu scop special
 
> Metodele sunt capabile să returneze valori în exterior


* Luați în considerare un exemplu de clasă simplă cu o metodă „main()”.
  
    ```java
    public class CalculatorMethodsApp {
        // CLASS BEGIN
        
        public static void main(String[] args) {

        }

        // CLASS END
    }
    ```
    
     metoda **main()** este o metodă specială pe care o declarăm doar, iar programul „însuși” o apeleaza "magic" in locul nostru.
     Privind formula acestei metode, dacă nu sunteți foarte familiarizat cu conceptele de POO, trebuie să acordați atenție la:
      1. numele metodei **main()**, utilizați camelCase (de exemplu, myMethod(), getData(), toMoreComplexData())
      2. argument **args** - tip String[]
      3. returnează nimic - tipul de returnare **void**
      4. disponibil direct din această clasă **static**
      5. corpul a ceea ce va face metoda **{ ... }**
     Pentru incepatori, sa stabilim deocamdata aceasta regula simpla: NU declarati o metoda IN AFARA CLASEI!

     În codul de mai sus, teritoriul clasei **CalculatorMethodsApp** este stabilit de marcherele „CLASS BEGIN”, „CLASS END”

     Pentru un începător, o clasă este o cutie în care „setăm” o metodă datorită cuvântului cheie „static”.

* Clasa **CalculatorMethodsApp** este numită astfel deoarece va conține logica de calcul/operare pe care o face un calculator de buzunar simplu
* Adaugam o metodă care „simplifica” afișarea rezultatului
   ```java
   static void printResult(int result) {
       System.out.printf("result: %08d\n",result);
   }
   ```
   această metodă nu returnează nimic, ia un număr întreg în variabila (argument) **rezultat** și afișează valoarea formatata in consola
  
    - Vrei să testati metoda?
   ```java
     public static void main(String[] args) {
         printResult(0);
         printResult(10);
         printResult(99999999);
         printResult(999999999);
         printResult(-100);
     }
   ```
   rețineți modul in care este apelata - ne referim la metodă doar după nume, deoarece este în aceeași classa (cutie) cu metoda **main()** care o apelează

* După cum puteți vedea, metoda noastră **printResult(int result)** nu poate funcționa cu numere mai mari de 8 cifre - deoarece formatarea nu funcționează. Prin urmare, este necesar să adăugați o condiție în interiorul metodei care va afișa „ERROR” dacă numărul de caractere necesare pentru afișarea valorii întregi **result** depășește 8

* Să adăugăm o metodă care va „înfrumuseța” rezultatul nostru pe ecran, care nu necesită argumente (deoarece face întotdeauna același lucru - fără intervenție externă) și care nu va returna nimic - void
     ```java
     static void printDivider() {
         System.out.println("###############");
     }
     ```
     verificam in **main()**

     ```java
     printDivider();
     printResult(10);
     printDivider();
     ```

     ar trebui sa vedeti in consola

     ```
     #################
     result:  00000010
     #################
     ```

* adaugam o metodă pentru adunarea a două numere, care acceptă două numere întregi, returnează un rezultat întreg
     ```java
     static int add(int a, int b) {
         int r = a + b;
         return r;
     }
     ```
     Cum să înțelegi **return**? în momentul în care metoda execută această linie, execuția ei este finalizată și valoarea este returnată la locul din care a fost apelată metoda, de exemplu, în
    
     ```java
     printDivider();
     printResult( add(1,2) );
     printDivider();
     ```
     **add(1,2)** va returna rezultatul în **printResult( ... )** în loc de **...**

* Se cere sa:
   1. Adăugați mai multe metode **int sub(int a, int b)**, **int mul(int a, int b)**, **int div(int a, int b)** - care funcționează corespunzător - scăderea, înmulțirea, împărțirea a doua numere intregi
   2. Adăugați o altă metodă **int pow(int v, int e)** - ridicarea la putere i.e. - de exemplu ```pow(10,3)``` este ```1000```. ACEASTA METODĂ TREBUIE să calculeze în mod iterativ puterea folosind o buclă **for()**.
   3. După aceea, în **main()** folosind toate aceste metode - rezolvați și afisati următoarea formulă ```1 + 2^3 * 3 / 4 - 5``` (unde 2^3 este doi în puterea a 3-a)
