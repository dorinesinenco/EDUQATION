## Procesarea fisierelor textuale.

> Amintiti-va cum se opereaza cu tipul de date "String" si "Array"
> Functii utile (posibile) "String.split()", "Array.push()", "Array.forEach()", "fs.readFile()"
 

* Pornind de la urmatorul fragment de cod [index](./index.js) sa se citeasca toate datele de contact din fisierul [original.emails.list.txt](./original.emails.list.txt) si sa se separe numerele de telefon de adresele de email in cele doua array-uri declarate la inceputul "index.js"
* Dupa separarea acestora in 2 array-uri - afisatile consecutiv in consola, rezultatul ar trebui sa arate asa:

```text
1) +123-45678
2) +234-56789
3) +345-67890

1) jony@test.mail.com
2) valy@test.mail.com
3) gigi@test.mail.com
```
---

> Pentru ca acest exemplu sa va reuseasca utilizati urmatorul lantz de apel:
> 1. Mai intai cititi fisierul, in calitate de callback() dati-i "parseContactsList"
> 2. Dupa ce ati incarcat fisierul ca "String", acesta va contine multe linii de text fiecare fiind separata de cealalta linie prin "\n" - acesta este semnul trecerii din rand nou sau "ENTER"
> 3. Impartiti acest text (separati-l, explodati-l) prin "\n" drept separator, ca rezultat veti obtine un Array de linii, ceva de genul ```["+123-45678 jony@test.mail.com", "+234-56789 valy@test.mail.com", ...]```
> 4. Cu ajutorul unui ciclu (sau Array.forEach()) parcurgeti colectia de linii de text si separati-o prin **" "** spatiu gol
> 5. Adaugati valorile separate in cele doua colectii
> 6. Afisati cu cate un ciclu separat fiecare colectie ca rezultatul sa corespunda cerintei de mai sus

--- 
BONUS - numerele de telefon sa fie aduse la forma "+(123)/45678" in procesul prelucrarii




