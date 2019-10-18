# Конкурентное программирование в Java. Первый пример с счетчиком.
* Посмотрите внимательно на код ниже и попытайтесь дать ответ на следующие вопросы:
    1. Почему для нового объекта приложения не создается переменная например ``` CounterRacingSimple simple = new CounterRacingSimple()``` ?
    2. Объясните строку кода что ниже этого маркера - как из Интерфейса **Runnable** мы получаем объект трида?
    3. При запуске **run()** сколько раз повторится цикл **for()** ?
    4. Почему если мы например запускаем 3 раза под ряд приложение **println()** из одного трида выводит непонятное (рэндомное число) а второй всегда ровно 2000000? к слову вот 3 результата:
       *  t2: 1965177 t1: 2000000
       *  t1: 1468796 t2: 2000000
       *  t2: 1562664 t1: 2000000
    5. Почему при выводе триды меняются порядком ) ?

```java
public class CounterRacingSimple {

	public static void main(String[] args) {
        // 1)
		new CounterRacingSimple().doCounter();
	}
	
	private int count = 0;
	
	private synchronized void increment() {
		count++;
	}
	
	private void doCounter() {
        // 2)
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
                // 3)
				for(int i = 0; i < 1_000_000; i++) {
					increment();
				}
                System.out.println("t1: " + count);
				
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1_000_000; i++) {
					increment();
				}
                System.out.println("t2: " + count);
				
			}
		});
		// 4)
		t1.start();
		t2.start();
	}

}
```