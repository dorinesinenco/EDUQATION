## Lucrul cu fisierele si datele structurate

* Sa presupunem ca avem urmatoarea structura de date

    ```c
    struct Student {
        char firstname[20];
        char lastname[20];
        int age;
    };
    ```

    se cere sa se declare o variabila de tip **struct Student**, sa se introduca de la tastatura datele acestuia si sa se salveze datele din structura in fisierul cu numele "student.info"