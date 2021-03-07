public class Main {

    public static void main(String[] args) {

        /*
        * 1. Расширить задачу про котов и тарелки с едой.
        *
        * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        * и потом вывести информацию о сытости котов в консоль.
        * */
        Cat[] cats = new Cat[5];
        //Создаем кошек
        cats[0] = new Cat("Мурзик", 15);
        cats[1] = new Cat("Уголек", 7);
        cats[2] = new Cat("Машка", 12);
        cats[3] = new Cat("Матроскин", 10);
        cats[4] = new Cat("Маруся", 5);

        Plate plate = new Plate(10);

        System.out.println("Первая кормешка:");
        for (int i = 0; i < cats.length; i ++)
        {
            cats[i].eat(plate);
        }

        //добавляем еды в миску
        plate.addFood(30);

        System.out.println("\nВторая кормешка:");
        for (int i = 0; i < cats.length; i ++)
        {
            cats[i].eat(plate);
        }

    }
}