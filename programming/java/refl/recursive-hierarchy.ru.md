## Применение рефлексии - рекурсивный поиск вверх по иерархии

* Представьте себе что вам дали написать софт который поможет разработчику написать код - подсказывая в виде списка какой метод или какое свойство есть у объекта с которым он будет работать. Вы таким софтом уже пользуйтесь каждый раз когда используйте авто завершение кода в IDE. Теперь настал час самому написать "плагин" с похожим поведением! Для этого вам надо будет использовать рефлексию и рекурсию!


* Представим себе что у вас в проекте есть 2 пакажа: **ide** (это вам помогающий код) и **source** (код который ваш софт из IDE Должен сканировать)
* Создайте в **source** классы (предположим разработчик которому ваш код помогает работает над проектом посвященным GUI тематике):

    1. Класс простой кнопки (код метода не укомплектовывать! нас интересует только КАРКАС класса)

    ```java
    public class Button {
        public void click(){ /* dummy function */}
    }
    ``` 

    2. Класс кнопки с обратным отсчетом

    ```java
    public class CountDownButton extends Button {
        public void startTimer(){ /* dummy function */}
        public void stopTimer(){ /* dummy function */}
    }
    ``` 
    
    3. Класс кнопки с анимацией

    ```java
    public class AnimatedButton extends Button {
        public void startAnimation(){ /* dummy function */}
        public void stopAnimation(){ /* dummy function */}
    }
    ``` 

* В пакете **ide** создайте два класса:
     
    1. Класс главного "редактора" кода (типо блокнота) 

    ```java
    public class EditorApplication {
        public static void main(String[] args){ 
            
        }
    }
    ``` 

    2. Класс вашего "ассистента разработчика" 

    ```java
    public class DeveloperAssistantPlugin {
        public static List<String> getSuggestions(Class<?> sourceClass){ 

        }
    }
    ``` 

    Суть метода **getSuggestions** - принять ссылку на любой класс (вы пока его пробуйте с классом **AnimatedButton** - т е в **main()** -> ``` ... DeveloperAssistantPlugin.getSuggestions(AnimatedButton.class) ...```  ) и вернуть список ВСЕХ методов которые есть у этого класса! 
    
    Рекомендуется использовать:
      - Class.getMethods()
      - Class.getDeclaredMethods()
      - Class.getSuperclass()


    В вашем случае если просканировать класс  **AnimatedButton** результат должен содержать 3 метода!