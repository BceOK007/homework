public class Dog extends Animal
{
    /*
    * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    * */
    private static final int dogMaxRunDistance = 500;
    private static final int dogMaxSwimDistance = 10;
    private static  int totalDogs;

    Dog(String name) {
        //Для создания собаки нам нужна только кличка, ограничения у всех собак одинаковые
        super(name, dogMaxRunDistance, dogMaxSwimDistance);
        totalDogs++;
    }

    @Override
    public void swim(int distance)
    {
        if (distance > maxSwimmingDistance)
        {
            System.out.printf("Для собаки %s указанная дистанция (%s м.) велика, поэтому была проплыта дистанция %s м.\n", name, distance, maxSwimmingDistance);
        }
        else
        {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        }
    }

    //Получаем кол-во созданных собак
    public static int getTotalDogs() {
        return totalDogs;
    }
}
