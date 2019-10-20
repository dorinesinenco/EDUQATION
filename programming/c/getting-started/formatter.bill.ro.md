## Lucrul cu formatarea si cu tipurile de date in C

> Lista celor mai importanti specificatori de formate in c:

* %d	Integer Format Specifier
* %f	Float Format Specifier
* %c	Character Format Specifier
* %s	String Format Specifier
* %u	Unsigned Integer Format Specifier
* %ld	Long Int Format Specifier

> Lista functiilor de intrare iesire utilizate: 

* printf("text %format", value)
* printf("text %format1 %format2 %format3", value1, value2, value3)
* scanf("%format", &variable)

!!! Atentie, dupa cum vedeti in varianta 2 a **printf()** exista posibilitea de a indica cateva specificatoare de formate consecutiv, care vor fi inlocuite in aceiasi ordine de valorile indicate prin virgula

!!! Spre Exemplu:
```printf("%d-%d-%d", 10,10,19);``` va afisa ```10-10-19```

> Tipuri de date la care sa dati atentie in acest exemplu:


* float
* int
* short

!!! Atentie, daca se declara o variabila de tip intreg si i se atribuie o valoarea a unei operatiuni care returneaza numar cu virgula, valoarea va fi converita in numar intreg.

De exemplu: ```int r = 10.0/20.0``` va rezulta in valoarea intreaga ```0```, in timp ce ```float r = 10.0/20.0``` va rezulta in valoarea cu virgula ```0.500000```

---

### Problema

Sa presupunem ca se cere sa creati o aplicatie scopul final al careia este sa printeze pe ecran un bon de plata pentru un restaurant in baza produselor comandate. Bonul ar trebui afisat in urmatorul format:

```bash
########|  BON DE PLATA  |########
# 1. Pizza:  2 x 50MDL =  100MDL #
# 2. Burger: 1 x 85MDL =   85MDL #
# 3. Kebab:  1 x 45MDL =   45MDL #
# ------------------------------ #
# total:                  230MDL #
########|   20-10-2019   |########
```

Pentru a realiza aceasta aplicatie urmeaza sa:
1. fixati valorile preturilor in niste variabile predefinite, tipul alegeti-l dupa context
2. cereti sa se introduca de la tastatura cantitatea pentru fiecare din punctele sus-mentionate
3. calculati si stocati valoarea costului pentru fiecare tip de produs intr-o variabila in parte
4. calculati si stocati valoarea costului total intr-o variabila
5. afisati rezultatul formatandu-l ca sa apara exact ca in schema indicata mai sus

* Atentie!!! pentru simplificare puteti in acest exemplu denumirile variabililor sa le dati utilizand "short snake case" - scrierea cu subliniere prescurtata (de x. ``` float pr_pizza = 50.0; ```)