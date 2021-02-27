/*
* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
* */
public class Employee
{
    private String fullName;
    private  String position;
    private String email;
    private String phone;
    private Float salary; //float т.к. для денег нужны копейки
    private int age;

    /*
    * 2. Конструктор класса должен заполнять эти поля при создании объекта.
    * */
    Employee(String fullName, String position, String email, String phone, Float salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /*
    * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    * */
    void getInfo()
    {
        System.out.println("Карточка сотрудника:\nФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }

    int getAge() {return this.age;}
}

