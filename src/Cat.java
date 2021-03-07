public class Cat extends Animal
{
    private static final int catMaxRunDistance = 200;
    private static final int catMaxSwimDistance = 0;
    private static  int totalCats;
    private int appetite;
    /*
    * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    * Если коту удалось покушать (хватило еды), сытость = true.
    * */
    private boolean isSatiety;

    Cat(String name, int appetite) {
        //Для создания кошки нам нужна только кличка, ограничения у всех кошек одинаковые
        super(name, catMaxRunDistance, catMaxSwimDistance);
        this.appetite = appetite;
        this.isSatiety = false;
        totalCats++;
    }


    @Override
    public void swim(int distance)
    {
        System.out.printf("Кот %s не умеет плавать.\n", name);
    }

    //Получаем кол-во созданных котов
    public static int getTotalCats() {
        return totalCats;
    }

    /*
    * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    * (например, в миске 10 еды, а кот пытается покушать 15-20).
    *
    * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    * */
    void eat(Plate plate)
    {
        if (isSatiety) {//если кот сыт, то валим отсюда
            System.out.println(name + " сыт(а).");
        }
        else if (plate.isEnoughFood(appetite)) {//проверка на достаточность еды в миске
            plate.decreaseFood(appetite);
            System.out.println(name + " наелся(ась).");
            isSatiety = true;
        }
        else {
            System.out.println("Для " + name + " недостаточно еды в тарелке!");
        }
    }
}
