## РАБОТА С ДБ на уровне JPA используя EclipseLink И ТРАНЗАКЦИИ

> Транзакция (англ. transaction, от лат. transactio — соглашение, договор) — минимальная логически осмысленная операция, которая имеет смысл и может быть совершена только полностью. Без транзакций, работа с ДБ (особенно при обращении к данным с операциями записи/чтения параллельно) может быть не надежной. 
> Например перевод денег с одного счета на другой это как минимум две операции - снять со счета источника и добавить в счет получателя. Эти две операции необходимо сгруппировать в транзакцию. Транзакции обеспечивают атомарность операций!

* А текущем простом примере, можно обходится без транзакций, но они были добавлены для наглядности.

* Суть примера установить связь с ДБ через JPA и выполнить следующее:
  1. Создать таблицу студентов "Student"
  2. Создать нового студента с id = 11 и fullName = "John Doe"
  3. Запомнить студента в ДБ
  4. Найти студента по id и вывести на экран
  5. ------
  6. Во-первых дополнить класс Student сеттерами/геттерами, конструкторами и toString()
  7. Так как мы работаем с sqlite через JPA лучше в сущности студента закоментить эту строку
     ```java
    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)   
    private Long id;
     ```
     так как SQLITE плохо дружит с разными видами стратегий автоматического назначения ID через JPA
  8. Добавим еще метод **install()** в приложение
     ```java
        public static void install() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
            EntityManager em = factory.createEntityManager();
            
            em.getTransaction().begin();

            em
              .createNativeQuery("Create table Student(id INTEGER PRIMARY KEY, fullName VARCHAR(30));")
              .executeUpdate();

            em.getTransaction().commit();
            
        }
     ```
     суть метода проста - запустить запрос который создаст таблицу студентов в ДБ "university" (это .createNativeQuery() )
     но обратите внимание что до и после того как мы подготовили запрос есть этап **em.getTransaction().begin()** и 
     этап **em.getTransaction().commit()**. Эти два "маркера" задают начало и конец транзакции
  9. Добавим еще метод **addOneStudent()** в приложение
     ```java
      	public static void addOneStudent(Student s) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
            EntityManager em = factory.createEntityManager();
            
            em.getTransaction().begin();

            em.persist(s);

            em.getTransaction().commit();
        }
     ```
     суть метода проста - запустить запрос который сохранит в таблицу студентов переданный объект студента 
     но обратите внимание что до и после того как мы подготовили запрос есть этап **em.getTransaction().begin()** и 
     этап **em.getTransaction().commit()**. Эти два "маркера" задают начало и конец транзакции
  
  10. Добавим еще метод **findOneStudent()** в приложение
     ```java
        public static Student findOneStudent(Long id) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
            EntityManager em = factory.createEntityManager();
            
            em.getTransaction().begin();

            Student s = em.find(Student.class,id);

            em.getTransaction().commit();
            return s;
        }
     ```
     суть метода проста - запустить запрос который найдет и в таблице и вернет студента по переданному ID, 
     но обратите внимание что до и после того как мы подготовили запрос есть этап **em.getTransaction().begin()** и 
     этап **em.getTransaction().commit()**. Эти два "маркера" задают начало и конец транзакции
  11. В **main()** вызовите новые методы вашего приложения так чтобы выполнить пункты с 1 по 4