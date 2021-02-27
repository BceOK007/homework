/*
* 1. Создать классы Собака и Кот с наследованием от класса Животное.
* */
public abstract class Animal
{
    private static int totalAnimals;

    protected String name;
    protected int maxRunningDistance;
    protected int maxSwimmingDistance;

    public Animal(String name, int maxRunningDistance, int maxSwimmingDistance)
    {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
        totalAnimals++;
    }

    /*
    * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');*/

    //бег
    void run(int distance)
    {
        if (distance > maxRunningDistance)
        {
            System.out.printf("%s пробежал(а) %s м. из %s м., т.к. указанное расстояние превышает максимальное расстояние бега.\n", name, maxRunningDistance, distance);
        }
        else
        {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    //плаванье
    public abstract void swim(int distance);

    //Получаем кол-во созданных животных
    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
