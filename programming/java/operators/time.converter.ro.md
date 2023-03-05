## Tipuri, operațiuni, conversie

> Există 5 operatori aritmetici binari de bază (adică aceștia operează pe 2 valori în același timp) ``` *, /, +, -,%. ``` Dacă expresia conține valori numerice (int, float, long, double etc.) în funcție de tipul valorilor și operația dintre valori va fi tratată ca atare. De exemplu, dacă declarăm ```int a, b; ``` atunci chiar și diviziunea lor ``` a / b ``` va fi un tip întreg!


* Să presupunem că avem o aplicație în care durata în zile este **periodDays**. Această aplicație ar trebui să convertească perioada în ani, luni, săptămâni și zile. Începând cu următoarea structură a programului:

     ```java
     public class PeriodConverterExample {

        public static void main(String[] args){

        // # DATA - CONSTANTS    
        final int YEAR_DAYS = 365;
        final int MONTH_DAYS = 30;
        // ???    

        // # DATA - variables
        int periodDays = 1234;
        int toYears;
        int toMonth;
        // ??? 

        // # CALCULATIONS
        // hint ;)
        toYears = periodDays / YEAR_DAYS; 
        // ???

        // # PRINT RESULTS

        }

    }
     ```
* Continuați codul astfel încât toate locurile marcate cu „???” sa fie completate logic
* Pentru convenție, considerăm că 1 an = 365 de zile, 1 lună - 30 de zile, 1 săptămână - 7 zile
* Calculați în câți ani, luni, săptămâni și zile puteți împărți intervalul de timp dat mai sus
* Afișați rezultatul în acest format (de exemplu, pentru o perioadă de 1234 de zile)
     ``` 1234 days  =  3 years, 4 months, 2 weeks and 5 days  ```
---
* Vă rugăm să observati ca în cod segmentele logice ale programului „DATA”, „CALCULATIONS”, ... sunt separate prin comentarii (în timp ce scrieți codul, învățați să împărțiți logica în secțiuni în funcție de scop)
* Folosiți diviziunea intreaga și restul diviziunii întregi
