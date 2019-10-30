## Имплементирование на уровне JDBC

> Чтобы лучше понять JPA, необходима хорошая практика и на уровне баз данных и JDBC

* Этот этап прост, суть перейти с SQLite на Postgre, Mysql и что угодно другое что является RDBMS:
  1. За основу берите пример где вы уже работали с SQLite и склонируйте его
  2. При помощи maven установите соответствующий коннектор [PostgreSQL](https://mvnrepository.com/artifact/org.postgresql/postgresql) или [MySQL](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
  3. Так как тут вы имеете дело с "реальными" ДБ, система сама базу не создаст как в случае SQLite, так что через командную строку на соответствующем диалекте напишите "создать базу university" (для PostreSQL, MySQL - "CREATE DATABASE university");
  4. Строку подключения DriverManager.getConnection("jdbc:postgresql://localhost:5432/university", "postgres", "?????")) использовать с такой модификацией где ???? - заменить на ваш пароль для доступа к базе
  5. Далее все запросы что у вас в репозиториях можете протестировать и есть шанс что местами придется чутос переделать их под движок базы данных (к слову если в SQLite поле для идентификатора объявляется через AUTOINCREMENT, то для Postgre - SERIAL)