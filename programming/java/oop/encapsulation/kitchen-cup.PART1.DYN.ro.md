## Principiul capsulei. Set-eri si Get-eri.

> partea 1

* Sa presupunem ca avem clasa unei "cani" Cup care este caracterizata prin 2 proprietati:
  1.  liquidName - denumirea lichidului din interior
  2.  liquidVolume - volumul lichidului din interior in ml

* Se cere:
  1. alegeti tipurile "TypeA" si "TypeB" astfel incat clasa sa corespunda descrierii de mai sus
  2. INTERBARE - Se aplica oare capsula asupra acestei clase?
  3. Adaugati set/get pentru fiecare proprietate luand in consideratie ca:
     1. In canile acestei clase poate fi turnat doar "Water", "Milk","Tea"                                                             
     2. Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!
  4. Plasati clasa "Cup" in package "kitchen" iar in package "main" creati clasa "Application" cu metoda "main()"
  5. In "Application / main()" creati doua obiecte de tip "cana":
     1. cupA = cu 300 ml lapte
     2. cupB = cu 500 ml apa
     3. varsati 50 ml de lapte din cana "cupA"
     4. adaugati inca 50ml de apa in cana "cupB"
     5. afisati in consola informatia despre  "cupA" si "cupB"

* ATENTIE - in codul clasei "Cup" tre sa existe doar metodele si proprietatile mentionate, nimic in plus!!! 

```java
class Cup {

    private /* TypeA */ liquidName;
    private /* TypeB */ liquidVolume;

    Cup(){

    }
    Cup( /* TypeA */ liquidName, /* TypeB */ liquidVolume ){
        this.liquidName = liquidName;
        this.liquidVolume = liquidVolume;
    }

    // ??? +set/+get
}

```
