## Single Neuronal Model

Sa presupunem ca avem o matrice de numere (3x3) care arata in felul urmator

```
m = [
  [5, -1,  0],
  [2,  0, -5],
  [1,  1, -5],
] 

```

* valorile numerice vor fi mereu cuprinse in diapazonul -5 .. 5


Sa se alcatuiasca si sa se antreneze un model cu un singur neuron, care va fi capabil sa detecteze daca matricea contine numere pozitive in prima coloana

* modelul trebuie sa dea o valoarea mai mare de 0.7 la iesire atunci cand prima coloana din matrice are TOATE numerele pozitive si valori mai mici ca 0.7 atunci 
  cand pe prima coloana sunt fie numere negative fie zero


* deci pentru matricea de mai sus rezultatul neuronului ar fi > 0.7 (ideal 1)
