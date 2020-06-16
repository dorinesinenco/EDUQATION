# Operarea cu colectii si OOP


> Lucrul cu colectiile formate din obiectele claselor create de utilizator


---

* Exista clasa care descrie proprietatile unui obiect de tip **Student**:

    ```java
        class Student{
            String fullname;
            String specialty;
            Float  grade;
            // ???

        }
    ```
    * completati **Student** asa incat acesta sa contina constructor si metoda **toString()**
    * raspundeti la intrebarea - de ce cand declaram **toString()** in clasa, se zice ca de fapt noi il suprascriem ("override")?
     
* Exista metoda **main()** in clasa aplicatiei unde
   ```java

     ArrayList<Student> students = new ArrayList<Student>();  
     // ???
      
   ``` 
   * Adaugati 5 studenti in lista cu nume, specialitate si note diferite.
   * Gasiti **index** celui mai bun student din lista si pastrati-l in variabila ```indexOfTheBest```
   * Mariti nota acestuia cu 0.1 accesandu-l prin lista + index
   * Toti studentii care invata pe 8.0+ sa fie adaugati intr-o lista nou cu numele ```bestStudents```
   * Sa se afiseze lista initiala, apoi cea cu cei mai buni studenti
    
   
