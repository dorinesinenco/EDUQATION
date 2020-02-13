## Принцип капсулы. Сеттеры и Геттеры. Внешний

* Вот схема "документа" (**PaperDocumentInterface**) - подразумевает любой бумажный документ (контракт, фактура, ордер, ...)

    ```java
    interface PaperDocumentInterface {
        public void setType(String type);
        public String getType();
        public void setTitle(String title);
        public String getTitle();
        public void setContent(String content);
        public String getContent();
    }
    ```

* Класс **Xerox** - копировальная машина, содержит два метода - оба копируют переданный документ (клонируют основные свойства документа **original**). Второй метод создает много копий одного и того же документа
 
    ```java
    class Xerox {

       public PaperDocumentInterface copy(PaperDocumentInterface original){
           // ???
       }
       public List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity){
           // ???
       }

    }
    ```
* ТРЕБУЕТСЯ:
 1. Создать класс **PaperDocument** имплементирующий интерфейс с таким же именем
 2. Добавить классу **PaperDocument** конструкора, сет/гет и ```toString()```
 3. Добавить код в ```// ???``` чтобы методы копировали (клонировали) документы и возвращали копии
 4. В **main()** провести тест:
    1. создать документ тип которого "Contract", титул - "Java Developer Hiring Contract", И контент - "1. Working hours per day: 6\n2. Earn per hour: 15EUR\n3. Hollidays per year: 30days."
    2. Сделать копию, изменить ее тип на "Contract Copy"
    3. Сделать 3 копии с копии контракта, изменить их тип на "Archived Contract Copy"
    4. Проверить все полученные копии - println() - ом
