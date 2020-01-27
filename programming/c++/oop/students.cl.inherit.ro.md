* Sa se creeze o clasa numita "Student" cu urmatoarele proprietati:
    * firstName
    * lastName
    * avgMark
    * faculty
    * specialty
* Clasa "Student" tre sa contina constructorul default si unul cu parametri, default-ul nu executa nimic
* Adaugati metoda "print()" care afiseaza datele studentului in felul urmator:
    ```
    John Travolta ("Cybernetics"/"MIT", 9.5)
    ```

---

* Sa se creeze clasa "BudgetStudent" care mosteneste student si are urmatoarele proprietati in adaos:
    * stependsDegree (gradul bursei - gen A,B,C...)
    * stepends (bursa, marimea ei)
* Sa se adauge constructorul cu parametri care delegheaza o parte din logica clasei "Student"    
* Adaugati metoda "print()" care afiseaza datele studentului in felul urmator:
    ```
    John Travolta ("Cybernetics"/"MIT", 9.5)
    stepends: A, 4000USD
    ```
---
* Sa se creeze clasa "ContractStudent" care mosteneste student si are urmatoarele proprietati in adaos:
    * discountEnabled (beneficiaza oare de reduceri - gen true/false)
    * discountSize (valoarea reducerii in procente - diapazon 10..50%)
    * contract (contractul, suma achitata anual)
* Sa se adauge constructorul cu parametri care delegheaza o parte din logica clasei "Student"    
* Adaugati metoda "print()" care afiseaza datele studentului in felul urmator:
    ```
    John Travolta ("Cybernetics"/"MIT", 9.5)
    contract: 100000USD/year with discount of 25%
    ```
