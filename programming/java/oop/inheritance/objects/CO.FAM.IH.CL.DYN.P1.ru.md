## Классы, Интерфейсы, Динамическое использование - объекты. Наследование, Полиморфизм

### Компания [часть 1]

* Предположим у нас есть софт который "помогает" компании выбирать и брать на работу будущих сотрудников. Основной класс компании **Company** в пакете "co" (сокр - company). В подпакете "co.departments" находятся классы департаментов компании (их в итоге мы вложим в объект компании). В подпакете "co.jobs" есть интерфейсы и классы соответствующие "профессиям" внутри данной компании.
 
* Начните с структуры:

```
CompanyComplexOOPExample
 - src/
   - main
     - Application(Class + static main())
   - co
     - Company  
   - co.departments
     - CompanyHRDepartment
     - CompanyITDepartment
   - co.jobs
     - DeveloperInterface
     - TesterInterface
   - tests
     - SimpleTest(Class)  
```

* ОБРАТИТЕ ВНИМАНИЕ! что формула наименования под пакетов сводится к "parent.child.descedant. ..."!

* Код класса компании 

  ```java
  public class Company {
    private String name;  
    private int year;  
    private CompanyHRDepartment hr;
    private CompanyITDepartment it;
    // ...
  }
  ```
  где **name** - имя компании, **year** - год ее основания, **CompanyHRDepartment** - объект департамента кадров, **CompanyITDepartment** - объект департамента IT.

* Добавить конструкторы, гет/сет и **toString()** для компании!


* Код класса департамента HR 

  ```java
  public class CompanyHRDepartment {

    private Company company;

    public boolean hireDeveloper(DeveloperInterface developer){
        
    }  
    public boolean hireTester(TesterInterface tester){

    }  
    // ...
  }
  ```
 