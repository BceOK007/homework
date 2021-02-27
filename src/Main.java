public class Main {

    public static void main(String[] args) {

        /*
        * 4. Создать массив из 5 сотрудников.
        * */
        Employee[] employeeArray = new Employee[5];
        //Заполняем массив сотрудниками
        employeeArray[0] = new Employee("Иванов Иван Иванович", "Генеральный директор", "iii@ya.ru", "+79057772565", (float)90000, 56);
        employeeArray[1] = new Employee("Петров Пётр Петрович", "Инженер", "ppp@ya.ru", "84957775522", (float)70000.74, 47);
        employeeArray[2] = new Employee("Сидорова Галина Николаевна", "Бухгалтер", "SidorovaGN@ya.ru", "84991632274 (доб. 123)", (float)60000, 35);
        employeeArray[3] = new Employee("Калинин Владимир Геннадьевич", "Кладовщик", "KalininVG@ya.ru", "84991632274 (доб. 481)", (float)45000, 32);
        employeeArray[4] = new Employee("Гоцман Сильвестр Владленович", "Охранник", "SuperSecurity@ya.ru", "84991632274 (доб. 555)", (float)25000.55, 64);

        /*
        *5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        * */
        for (int i = 0; i < employeeArray.length; i++)
        {
            if (employeeArray[i].getAge() > 40)
            {
                employeeArray[i].getInfo();
                System.out.println();
            }
        }
    }
}