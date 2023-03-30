## Clase. contextul static


* Să presupunem că există un astfel de fișier „DataFlowApp.java”
  ```java
    // main class
    public class DataFlowApp {
        public static void main(String[] args) {

        }
    }

    // secondary class
    class DataTransformer {

    }

  ```
   unde există 1 clasă principală cu **main()** și 1 clasă helper **DataTransformer**

* Esența clasei **DataTransformer**, așa cum o dictează și numele, este transformarea datelor, sau mai degrabă, conversia valorilor numerice de la un tip la altul. Să presupunem că metodele clasei **DataTransformer** trebuie să aduca o anumită valoare la tipul indicat (adică - ```(type)value```). În același timp, metodele trebuie să avertizeze dacă valoarea transmisa iese din limitele admisibile ale tipului în care trebuie convertită valoarea!
* Apropo, să presupunem că există o metodă în clasă
   ```java
   octet static integerToByte( int value ) {

   }
   ```
   această metodă ar trebui să returneze valoarea transmisă de la **int** la **byte**, dar în același timp, dacă **value** depășește (-128..127) - emite o eroare / avertizare. Adică, dacă apelăm **integerToByte(10000)** folosind „System.err.println()”, ar trebui să afisam următorul text de eroare în consola : "WARNING! the value "10000" overflows "byte" range. DATA will was lost!"
* Dezvoltati logica pentru următoarele funcții ale clasei **DataTransformer**:
   - integerToByte()
   - byteToInteger()
   - doubleToInteger()
   - integerToDouble()
   - shortToInteger()
   - integerToShort()

* Testați comportamentul fiecărei metode separat
*!!! BONUS - convertiți valoarea 1,5 din double în short
