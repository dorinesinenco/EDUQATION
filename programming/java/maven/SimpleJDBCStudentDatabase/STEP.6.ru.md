### Добавления нового элемента в модель базы данных

* Создать класс Group (группа учащихся студентов) с войствами
  * Integer id
  * String name
  * String code
  * конструктор, set/get toString()

* Создать класс GroupRepository, Он должен иметь похожий функционал на StudentRepository
* в "main" создать класс GroupProvider с методом "Group provideOneGroup()" и методом "ArrayList<Group> provideManyGroups(int quantity)" которые благодаря Faker генерят новые обьекты с рэндомными значениями свойств.
* CКонцентрировать логику классов StudentRepository, GroupRepository в базовый класс "Repository" - аккуратно с "private" и пользуйтесь активно "super"


!!! ДЛЯ начала проверьте работу с группами (CRUD) независимо от студентов в этом же проекте, потом расскажу как их собрать!  