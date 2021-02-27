public class Main {

    public static void main(String[] args) {

        //Создаем собак
        Dog dogBobik = new Dog ("Бобик");
        Dog dogLacy = new Dog("Лайси");
        Dog dogHachi = new Dog("Хатико");

        //Создаем кошек
        Cat catMurzik = new Cat("Мурзик");
        Cat catUgolek = new Cat("Уголек");

        //действия животных
        dogAction(dogBobik, 150, 30);
        dogAction(dogLacy, 600, 3);
        dogAction(dogBobik, 300, 2);

        catAction(catMurzik, 100, 1);
        catAction(catUgolek, 300, 2);

        /*
        * 4. * Добавить подсчет созданных котов, собак и животных.
        * */
        System.out.println("\nВсего животных создано:\t" + Animal.getTotalAnimals());
        System.out.println("Всего котов создано:\t" + Cat.getTotalCats());
        System.out.println("Всего собак создано:\t" + Dog.getTotalDogs());
    }

    private static void catAction(Cat cat, int runDistance, int swimDistance)
    {
        cat.run(runDistance);
        cat.swim(swimDistance);
        System.out.println();
    }

    private static void dogAction(Dog dog, int runDistance, int swimDistance)
    {
        dog.run(runDistance);
        dog.swim(swimDistance);
        System.out.println();
    }
}