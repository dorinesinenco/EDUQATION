## Tipul de date string, prelucrarea datelor de tip string


* Operatorul **in** poate fi utilizat in Python ca masura de verificare a prezentei unui fragment de text in interiorul altui text, de exemplu:

    ```python
    if "A" in "Abc":    
      print("YES!")
    ``` 

* Sa presupunem ca vi se da un text care contine cuvinte interzise (black listed words) separate prin spatiu:
   ```python
   black_words = "dude stupid garbage douchebag wtf"
   ```     
    programul accepta de la tastatura un mesaj care consta din cuvinte introduse prin spatiu si il pastreaza intr-o variabila. Dupa aceasta, programul va trebui cuvant cu cuvant sa verifice daca macar unul din cuvintele din lista neagra se afla in acel masaj - programul va trebui sa respinga mesajul, daca nu, va accepta mesajul.

    Pentru a realiza programul e nevoie sa impartiti (split) textul din cuvinte interzise - ca sa obtineti o lista, apoi sa parcurgeti fiecare cuvant din lista printr-un ciclu (for) si printr-o constructie conditionala gen if/else cu operatorul **in** sa verificati daca fiecare cuvant interzis nu este in mesajul introdus de la tastatura!

    Prin urmare, executia programului ar trebui sa arate asa

    ```
    ENTER A MESSAGE: Hi douchebag!

    ANSWER: Message Rejected! Reason: contains bad words!
    ```

    ```
    ENTER A MESSAGE: Hi friend!

    ANSWER: Message Accepted!
    ```