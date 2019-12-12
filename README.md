1. Создать класс <a href=src/main/java/StringHelper.java>StringHelper</a> с методами:

<b>generate (int stringLength)</b>: принимает параметр типа int, возвращает alpha-numeric строку со случайными символами длиной, равной переданному параметру (прим.: generate(5) => "aNr4d")

<b>reverse (String str)</b>: принимает параметр типа String, возвращает перевернутую строку (прим.: reverse("qwerty") => "ytrewq")
  
<b>format (String []args)</b>: принимает строку(которую необходимо отформатировать) и аргументы для вставки. Аргументы вставляются в определенных местах, указанных через "{index}", т.е. {1}, {2}, {3}.. (прим.: входная строка "This {1} is {2}.", аргументы "string", "formatted". Выходная строка "This string is formatted"))
  
<b>camelCase (String strInput)</b>: принимает строку, возвращает строку в которой все буквы поочередно идут в разном регистре, начиная с заглавной("hello WORLD!" => "HeLlO wOrLd!")

2. Написать класс <a href=src/test/java/StringHelperTest.java>StringHelperTest</a> c unit тестами на реализованные методы.

3. В классе <a href=src/test/java/ReverseParameterizedTest.java>ReverseParameterizedTest</a> реализовать параметризованный тест (org.junit.runners.Parameterized) для метода reverse на 5 запусков.

4. Создать класс <a href=src/main/java/IdGenerator.java>IdGenerator</a> с полем типа StringHelper и методом generateId принимающим длину идентификатора, который нужно сгенерить и возвращающий сгенерированный идентификатор строкой.

5. Написать unit тесты на метод generateId с использованием mock и stub. Классы <a href=src/test/java/IdGeneratorStubTest.java>IdGeneratorStubTest</a> и <a href=src/test/java/IdGeneratorMockTest.java>IdGeneratorMockTest</a>

6. Создать класс <a href=src/main/java/Repository.java>Repository</a> с полем типа IdGenerator и методом save, принимающим Object и возвращающим строку. Метод имитирует сохранение в базу, т.е. генерит идентификатор (через IdGenerator) для сущности (всегда длиной 7 символов), печатает в консоль что сущность с "{id}" сохранена и возвращает id данной сущности. В случае если переданный объект null, выбрасывается непроверяемое исключение <a href=src/main/java/EmptyObjectException.java>EmptyObjectException</a> (создать соответсвующий класс) с сообщением "Entity must not be null".

7. Написать класс <a href=src/test/java/RepositoryTest.java>RepositoryTest</a> - unit тесты для класса Repository(случай с выбрасыванием EmptyObjectException должен быть покрыт отдельным тестом)
