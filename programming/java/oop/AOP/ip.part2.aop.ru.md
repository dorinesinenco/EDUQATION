 
## Аспект Ориентированное Программирование

> ЧАСТЬ 2

---
* ПРИМЕЧАНИЕ: aspect можно написать в виде файла AspectName.aj применяя "чистый" синтаксис например:

  ```java
  public aspect LoggingAspect {
    pointcut callingMethod(): call(  public static void someMethod(..) );


    before(): callingMethod() {
     System.out.println( "STARTING METHOD!" );
    }
    ...
  }
  ```
  где **LoggingAspect** ведет себя как класс, **callingMethod()** - точка среза, **call(  public static int someMethod(..) )** - укаэывает момент где имено произвести срез. **before(): callingMethod() {** - как и что подключить в точке среза

  идентичный код можно написать пользуясь аннотациями и Java синтаксисом, создав файл AspectName.java:
  ```java
  public class TestAspect {

    @After(pointcut = "execution(void SomeClass.someMethod(..))")
    public void logInfo() {
       System.out.println("STARTING METHOD!" );
    }

```

* ПРИМЕЧАНИЕ: если необходимо например "перехватить" аргументы вызова метода в точке подключения ПЕРЕД выполнением, можно написать такой код:
 ```java

  @Before("execution(void SomeClass.someMethod(..))")
  public void letsCheckArguments(JoinPoint jp) {
      .... // do something with jp.getArgs()
  }

 ```
 **jp.getArgs()** даст доступ к списку значений аргументов
 
 
* ПРИМЕЧАНИЕ: если необходимо например "перехватить" результат выполнения метода в точке подключения ПОСЛЕ возврата результата:
 ```java

 	@AfterReturning(pointcut="execution(SomeReturnType SomeClass.someMethod(..))",returning = "someVal")
  public void doIt(Object someVal) {
    // do something with - someVal;
  }

 ```
 **returning = "someVal"** укажет куда передать результат, и сам аргумент нашего метода получит этот результат
 
  

* В коде обработчика изображений основаный на шаблоне наблюдателя, внести след. изменения:
 1. Создать пакет "aspects"
 2. Создать аспект **LoggingAspect** с двумя методами:
  1. **logBeforeProcessing()** - который запустится перед выполнением **process()** в процессоре изображения, его цель "перехватить аргумент" данного метода и узнать название обрабатываемого файла, вывести название в консоль
  2. **logAfterProcessing()** - вывести сообщение что обработка изображения завершена, если не возникнет **Exception** 
 3. Создать аспект **PerformanceBenchmarkAspect** - суть которого измерить время обработки изображения (), с двумя методами:
  1. **measureProcessingPerformance()** - который должен обернуть в себя реальный метод обработки, измерить время, вывести итог на экран
