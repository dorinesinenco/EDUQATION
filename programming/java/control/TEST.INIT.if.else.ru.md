* Дан код

```java
public class TestInitApp {

    public static void main(String[] args) {
        
        float x = 0.5;
        float y = 0.25;
        
        

        if ( x >= 0 ) {
            float z = x * y;
        } else {
            float z = x / y;
        }

        System.out.printf( "(%f,%f) -> %f", x,y,z );
	}
}
```

* Исправить код, так чтобы программа заработала без ошибок.
* При заданных "x", "y" на экране результат должен быть
    ```
    (0.500000,0.250000) -> 0.125000
    ```