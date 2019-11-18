## Functii si structuri de control


* Acest program va permite intr-un mod interactiv utilizatorului sa modifice si sa afiseze o valoare pastrata permanent in memorie.
* Sa presupunem ca avem o valoare pastrata intr-o variabila globala **value** setata in **1000** din start. Utilizatorul are dreptul sa execute 3 actiuni asupra acestei valori:
  1. Sa afiseze valoarea pe ecran
  2. Sa incrementeze valoarea cu 10
  3. Sa decrementeze valoarea cu 10
  aceste 3 actiuni sunt afisate in meniul principal ( in **main()** ).
* Variabila **action** o vom utiliza pentru a scana "aciunea" dorita a fi aplicata de catre utilizator
* Datorita acestui rand de cod ``` action = scanf("%d", &action); ``` de la tastatura se introduce numarul actiunii care trebuie executata.
* Mai jos, o constructie de tip **switch()/case** alege ce functie sa apeleze in dependenta de valoarea introdusa  
* Se cere sa:
  * Complectati codul din cele 3 functii, astfel incat utilizatorul sa poata executa cele 3 actiuni de baza asupra lui value! 
```c
#include <stdio.h>

int value = 1000;
int action = -1;

void print_value(){
    // ???
}
void inc_value(){
    // ???
}
void dec_value(){
    // ???
}

int main(void) {

    do {
        printf("\n##### MENU #####\n");
        printf("\n1. Print the \"value\"\n");
        printf("\n2. Increment \"value\" by 10\n");
        printf("\n3. Decrement \"value\" by 10\n");
        printf("\n0. Exit the program\n");
        printf("\n################\n");
        printf("\nYour choice ? \n");

        action = scanf("%d", &action);

        switch (action) {
            case 1: print_value(); break;
            case 2: inc_value(); break;
            case 3: dec_value(); break;
        }
        
    } while (action!=0);
}
```

---
BONUS: Adaugati inca 2 actiuni "4. Increment by 100" si "5. Decrement by 100" si realizati-le!