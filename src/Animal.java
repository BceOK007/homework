
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
