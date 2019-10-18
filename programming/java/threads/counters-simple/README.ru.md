```java
package th;
public class Intro {

	public static void main(String[] args) {
		Thread in1 = new Thread(new Incrementals("Thread 1"));
		Thread in2 = new Thread(new Incrementals("Thread 2"));
		
		in1.start();
		in2.start();
		

	}

}

class Incrementals implements Runnable {
	private static int counter = 0;
	private String name;
    // почему при таком объявлении нужен монитор? просто synchronized может мониторить только объекты а не примитивы, если "counter" объявить "Integer" - тогда сам counter - может быть монитором ;)
	private static Object monitor = new Object();
	
	public Incrementals(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
        // старый вариант не рабочий почему - тут в цикле метод инкремент был синхронным НО
        // кто гарантирует что например "i < 1_000_000; i++" - будет мониториться правельно?
        // потому я перекинул логику проверки и остановки цикла прямо в метод который мониторится

        // for (int i = 0; i < 1_000_000; i++) {
		// 	increment();			
		// }
		while(increment());
		System.out.println(name+" : "+counter);
	}
	
	private boolean increment() {
		synchronized (monitor) {
            // так как проверка внутри synchronized - шансы на сбой минимальны
			if( counter<1_000_000 ) {
				counter++;
				return true;
			} else {
				return false;
			}
		}
	}
//	private synchronized void increment() {
//			counter++;
//	}
}
```