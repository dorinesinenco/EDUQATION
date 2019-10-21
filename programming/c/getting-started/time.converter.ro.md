## Tipuri de date, operatii, formatare.

> Sunt 5 operatori aritmetici binari (adica opereaza cu 2 valori simultan) de baza ``` *, /, +, -, % . Atunci cand o expresie contine valori numerice (int, float, long, double, etc...) in dependenta de tipul valorilor si operatia va fi tratata ca atare. De exemplu daca declaram ```int a,b; ``` atunci chiar si impartirea lor ``` a / b ``` va fi de tip intreg! 


* Sa presupunem ca avem o aplicatie care citeste de la tastatura durata in zile **days** si are ca scop convertirea acesteia in ani, luni, saptamani si zile ramase. Pornind de la urmatorul schelet de program:

    ```c
    #include <stdio.h> 
    int main()
    {
        // observati cum pot fi definite variabilile de acelasi tip ? 
        int days, years, months, weeks;


        // aici cereti sa se introduca de la tastatura numarul de zile
        // ??? 

        // iata aici un "hint" referitor la - cum sa afli cati ani reprezinta perioada
        years = days/365; 

        // de dragul exemplului vom considera ca un an = 365 zile, o luna = 30

        // continuati aceasta idee astfel incat sa aflati si numarul de luni, saptamani si zile incluse
        // veti avea nevoie de aproape toti operatorii aritmetici in acest exercitiu

        // Intr-un final, afisati rezultatul formatat astfel incat el sa arate cam asa
        // daca introducem valoarea de 1234 de zile:

        // > 1234 days = 3 years, 4 months, 2 weeks and 5 days       

    }
    ```
* Solutionati punctele cerute in conditiile din comentarii  
---
ATENTIE in C exista asa un operator care este numit "restul impartirii intregi", de exemplu daca scriem ```r  = 10 % 3; ```    rezultatul va fi 1 - restul impartirii ;)