# Homeworks / 4-ConfigurationProfiles
Java – Spring Boot Course (SKB LAB)

### Домашка по лекции «Конфиги и профили»:
1) Создать 3 профиля - dev, test, prod, каждый из которых будет включать в себя:
   - конфиг с листом из нескольких значений
   - название приложения
   - конфиг с переменной окружения, по дефолту значение - default
2) Создать 3 бина: 
   - один создается, только если профиль test
   - другой, если существует первый бин
   - третий, если в конфиге EXAMPLE_TEST (env var) не “default”
 
---------------------------------------
 
### Запуск профиля “dev” с переменной окружения EXAMPLE_TEST со значением по умолчанию (“default”)
![image](https://user-images.githubusercontent.com/98341388/229203471-4341f45b-d09e-411d-ad2f-81a8737e72d8.png)

### Запуск профиля “test” с переменной окружения EXAMPLE_TEST со значением по умолчанию (“default”)
![image](https://user-images.githubusercontent.com/98341388/229204249-cc2e2098-cd4c-465d-a360-968c9b8dce8d.png)

### Запуск профиля “test” с переменной окружения EXAMPLE_TEST со значением “not_default”
![image](https://user-images.githubusercontent.com/98341388/229204644-aed0b530-896f-4c04-b79d-f03b11c1b951.png)

### Запуск профиля “prod” с переменной окружения EXAMPLE_TEST со значением “not_default”
![image](https://user-images.githubusercontent.com/98341388/229205146-a278434b-6739-47c3-9309-50f63cc4e767.png)
