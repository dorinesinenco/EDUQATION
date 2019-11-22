## Условные выражения.  



---

* Дан код

```java
public class BrainFfForApp {

    public static void main(String[] args) {
        
        int a=1,b=2,c=1;
		
		for( b=a++; c<++b; a=c+=2 ) {
			System.out.printf("%d %d %d\n",--a,--b, c);
		}
        
	}
}
```

* Запустить, объяснить пошагово результат в комментах (на подобье 1. устанавливается a = 1, 2. ....)
