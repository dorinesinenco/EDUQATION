# Structuri de control. Cicluri

> Constructia **while** permite repetarea codului ATAT TIMP cat o CONDITIE este adevarata
> Daca apelam **break** in interiorul corpului **while** ciclul se opreste in locul respectiv
> Daca apelam **continue** in interiorul corpului **while** ciclul se ignora restul codului si se intoarce la inceput


* Sa presupunem ca avem un cod de start care arata asa:
    ```python
    while True:
        print("BOO YA!")
        answer = input("Do you wan't me to stop ?")
        # ???
    ```
    Acest cod afiseaza in permanenta un mesaj, In urma caruia asteapta un raspuns din partea utilizatorului. Sa se adauge fragmentul lipsa de cod, care ar opri ciclul doar in momentul in care raspunsul (**answer**) introdus de utilizator este egal cu "yes!"



