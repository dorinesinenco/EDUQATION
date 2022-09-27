## Dezvoltarea e-shopului in Django | ORM-ul & SQL

* NOTA: umplerea automata a campurilor va fi discutata la ore

1. Modelului Client sa i se adauge campul  "created" care va fi umplut ulterior automat cu data/ora cand clientul si-a facut cont pe website (a se vedea in docs: DateField, DateTimeField)
2. Modelului Bag sa i se adauge  campul  "created" care va fi umplut ulterior automat cu data/ora cand cosul clientului a fost creat
3. Modelului Bag sa i se adauge  campul  "modified" care va fi umplut ulterior automat cu data/ora cand cosul a fost modificat


* SA SE SCRIE CODUL CORESPUNZATOR URMATOARELOR SCENARII (le puteti testa intr-o ruta, este pur pentru a va obisnui sa ganditi in Django):

1. Sa fie gasit clientul dupa email si parola (ar corespunde cu logarea pe site)
2. Sa fie gasit cosul clientului dupa id-ul clientului
3. Sa fie gasite toate itemurile din cosul clientului dupa id-ul clientului 
4. Sa fie numarate toate itemurile din cosul clientului dupa id-ul clientului 
5. Sa fie returnat True daca o cantitate dorita pentru un anumit produs este in stock si False daca nu este

