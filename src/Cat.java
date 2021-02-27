public class Cat extends Animal
{
    /*
     * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     * */
    private static final int catMaxRunDistance = 200;
    private static final int catMaxSwimDistance = 0;
    private static  int totalCats;

    Cat(String name) {
        //Для создания кошки нам нужна только кличка, ограничения у всех кошек одинаковые
        super(name, catMaxRunDistance, catMaxSwimDistance);
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
}
