## Как в Eclipse JAVA IDE получить простой запускаемый JAR файл!

1. Создаем приложение 

    [image 1](./rjar1.png)

2. Экспортируем как **RUNNABLE**

    [image 2](./rjar2.png)

    [image 3](./rjar3.png)

3. Настраиваем **MANIFEST** - основной класс, так же указываем путь до результирующего файла, и опцию "package required libraries into the jar file" - чтобы все необходимые библиотеки были там!

    [image 4](./rjar4.png)

4. Так как это у нас приложение консольное (нет окон )) )    то запускаем из командной строки

    ```
    java -jar myAppPackageName.jar
    ```