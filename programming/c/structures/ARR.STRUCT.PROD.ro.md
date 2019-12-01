## Lucrul cu structurile de date

> Tipul de date **struct** in C reprezinta un fel de "simple object" din programarea OOP.


* Sa presupunem ca pana la functia **main()** ati declarat tipul de date structurat care tine minte datele personale ale unui student. 
  ```c
  struct student {
     char fullname[30];
     char specialty[30];
     float mark;
     int age;
  };
  ``` 
  vom declara si initia din start un tabel cu 3 structuri de tip student

  ```c
  int main() {
    struct student  students[3] = {
        {
            "John Ivanovici",
            "C Programming",
            9.5,
            20
        },
        {
            "Ivy Popovici",
            "Java Programming",
            9.6,
            19
        },
        {
            "Clode Varanoy",
            "C Programming",
            9.2,
            20
        }
    };

  }
  ```

  daca am dori sa afisam in acest caz sa zicem separat - numele primului student, codul ar arata asa
  ```c
  printf("%s", students[0].fullname);
  ```

---
* Se cere:
    1. Sa se afiseze prin ciclul **for()** toate datele despre toti studentii formatat astfel:
       ```
       |   fullname              |   specialty      |   mark  |  age  |
       ----------------------------------------------------------------
       |   John Ivanovici        | C Programming    |   9.5  |  20    |
       |   Ivy Popovici          | Java Programming |   9.6  |  19    |
       ....
       ``` 
    2. Sa se caute iterativ (cautarea maximului) si sa se afiseze Numele si varsta acelui student care invata cel mai bine in aceasta lista.   