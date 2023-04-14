# Homeworks
Java – Spring Boot Course (SKB LAB)

### Домашка по лекции «Базы данных»:  
1) Создать контроллер, в котором:
    - endpoint, который на вход будет принимать данные в виде:
        {
               "name": "Мой список дел",
               "events": ["дело1", "delo2", "delo3"]
         }
    и сохранять их в базу

   - endpoint, который будет отдавать данные из бд в виде:
      [
          {
                "name": "Мой список дел",
                "events": ["дело1", "delo2", "delo3"]
          },
          {
               "name": "Мой список дел2",
               "events": ["дело1", "delo2", "delo3"]
           }
      ]

    - Проект должен запускаться одной кнопки (не должно быть необходимости руками запускать скрипты)

2) Спроектировать структуру БД для этих данных. В качестве БД можно взять любую БД.
    В pull-request приложить скрин спроектированной схемы
    
---------------------------------------

### Выполнение запросов для обеих баз:
![image](https://user-images.githubusercontent.com/98341388/231985470-2ceb6c2c-a812-4ecf-b88e-3367edf6b7c1.png)

![image](https://user-images.githubusercontent.com/98341388/231986900-6d27513a-bb67-4abd-bcab-99eef953d3b9.png)

![image](https://user-images.githubusercontent.com/98341388/231994784-aecc8877-1403-4830-99ec-c56a66137a15.png)


### Состояние базы H2:
![image](https://user-images.githubusercontent.com/98341388/231994903-5fd4f9d7-31f0-4686-a3a4-233e73e5a29c.png)

![image](https://user-images.githubusercontent.com/98341388/231995079-36c528ea-8792-4bfd-abd4-0b7c57065497.png)

### Состояние базы Postgres:
![image](https://user-images.githubusercontent.com/98341388/231997194-b28eda6e-9fa6-46e2-aeb7-97a9f811fa27.png)

![image](https://user-images.githubusercontent.com/98341388/231997246-421a8098-d35b-43f8-8eef-7f4759a17548.png)

---------------------------------------

### Структура базы:
![image](https://user-images.githubusercontent.com/98341388/231998281-1acb51e3-ac13-4a70-babc-a6bbb9e5351b.png)

