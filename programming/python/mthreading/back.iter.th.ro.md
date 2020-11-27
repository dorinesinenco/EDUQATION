 ## Operarea cu firele de executie in Python
 
 ---
 
 * Sa se declare o clasa **BackCounter** care reprezinta un mostenitor al clasei **Thread**
 * Sa se creeze o variabila globala **count** setata intr-o valoare de start
 * Sa se creeze 3 obiecte de tip **BackCounter** in asa mod incat acestea 3 impreuna sa numere invers de la valoarea indicata in **count** initial pana la 1, afisand fiecare - valoarea iterata, cu alte cuvinte - dupa ce ati declarat si creat obiectele, daca ati avea urmatorul fragment de cod:
  ```python
  
   # declarati clasa apoi
   count = 10
   bc1 = BackCounter("first")
   bc2 = BackCounter("second")
   bc3 = BackCounter("third")

   bc1.start()
   bc2.start()
   bc3.start()
  ```
   atunci rezultatul executiei acestuia ar fi ceva de genul:
    
   ```
   first  >> 10
   second >> 9
   third  >> 8
   second >> 7
   first  >> 6
   third  >> 5
   ...
   third  >> 1
   ```
   
   cu alte cuvinte, toate trei, ar numara impreuna doar 10 iteratii, fara a se repeta si fara sa se tina cont de ordinea in care ruleaza firele de executie.
  
