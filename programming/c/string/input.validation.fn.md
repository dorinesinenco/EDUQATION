## Tipul de date sir de caractere. Tipuri compuse de date. Testarea caracterelor

> Deseori valorile de tip sir de caractere trebuiesc "validate" si "curatate" de simboluri speciale

> Acest program presupune operarea cu functii din urmatoarele biblioteci:
> * string.h - colectie de functii destinate operarii cu textele
> * ctype.h  - colectie de functii destinate operarii in special cu caracterele


* Sa presupunem ca ni se cere sa realizam o parte din aplicatia care permite utilizatorilor sa se "inregistreze" intr-un sistem (cu nume, parola si adresa de email). Iar in procesul de inregistrare ni se cere sa validam datele introduse (sa verificam daca aceste date corespund regulilor)

---

* In urmatorul fragment de text declaram 3 variabile de tip "string":

    ```c
    char user[31];
    char mail[31];
    char pass[31];
    ```
* Aceasta declaratie doar aloca memorie pentru 3 valori de tip sir de caractere diferite. 
* ATENTIE!!! pentru ca functiile si algoritmii care opereaza cu sirurile de caractere sa functioneze corect, in memorie sfarsitul "textului" trebuie marcat cu simbolul '\0' (terminatorul string). Acest marcher va fi necesar sa il setati voi uneori manual, alteori (datorita functiilor specializate) acest marcher va fi setat automat!   
* Adaugam un fragment de cod care ar permite unui utilizator sa se introduca datele:
    ```c
    printf("\n CREATE A NEW ACCOUNT \n");
    printf("username: ");
    scanf("%s", user); // <<< array of chars do not use "&"
    printf("email: ");
    scanf("%s", mail); 
    printf("password: ");
    scanf("%s", pass); 
    ```  
* Sa zicem ca atunci cand se executa ``` scanf("%s", user); ``` utilizatorul va introduce valoarea ```hacker``` si va apasa ENTER sau SPACE. Algoritmul functiei **scanf()** va plasa cele 6 caractere incepand cu indicile 0 in array-ul **user**, dupa care va seta la sfarsit "marcherul" \0. Adica in memorie valoarea introdusa va arata asa:
    ```
    ['h']['a']['c']['k']['e']['r']['\0'][ ? ][ ? ]....
      0    1    2    3    4    5    6     7 
    ```
    unde celulele marcate cu '?' reprezinta valori "starea" carora nu este cunoscuta, pentru ca in momentul operarii cu sirurile de caractere care isi schimba "lungimea" textului ocupat, nu se stie din start ce valori raman dupa marcherul de incheiere.

* Daca s-ar apela functia **strlen( user )** in continuare, lungimea returnata ar fi **6** pentru ca si aceasta functie opereaza in baza marcherului '\0'. Deci daca, dupa ce utilizatorul a introdus numele de utilizator pe care si-l doreste, noi am dori sa verificam daca lungimea acestuia este cel putin de 3 caractere am putea face asta prin 
  ```c
  if( strlen( user ) >= 3 ){
      ...
  }
  ```
---

* Se cere:
    1. Raspundeti la intrebarea - cate caractere maxim vom putea introduce in fiecare din cele 3 variabile declarate mai sus, ca sa garantam ca toate functiile vor opera "normal" ?
    2. Completati programul astfel incat acesta sa afiseze "Account Successfully Created!" doar si numai doar daca toate conditiile mentionate mai jos se indeplinesc:
       1. valoarea "user" trebuie neaparat sa fie cel putin 6 caractere
       2. valoarea "mail" trebuie sa fie cel putin 8 caractere, sa contina neaparat simbolul '@' sa contina neaparat simbolul '.' si simbolul '@' trebuie sa fie mai la stanga de '.'
       3. valoarea "pass" trebuie sa contina cel putin 8 caractere

BONUS!!! Sa se mai adauge o conditie pentru numele de utilizator "user" care sa se asigure ca se permite introducerea doar literelor din alfabetul latin mici - adica 'a'..'z'
<details>
    <summary>hint 1</summary>
    daca utilizam functia **islower( user[0] )** din biblioteca **ctype.h** vom afla doar daca prima litera din numele de utilizator nu este majuscula!
    
</details>