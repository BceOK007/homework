public class Plate {

    private int food;

    public Plate (int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("plate^ ");
    }

    void decreaseFood(int appetite)
    {
        if (!isEnoughFood(appetite))
            return;

        this.food -= appetite;
    }

    //проверка на достаточнось еды
    public boolean isEnoughFood(int appetite)
    {
        return food >= appetite;
    }

    /*
    * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    * */
    void addFood(int food){
        this.food += food;
    }

}
