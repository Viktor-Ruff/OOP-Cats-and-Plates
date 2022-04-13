package Homework6;

public class TestAnimal {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 70, 20);
        Cat cat2 = new Cat("Васька", 50, 30);
        Cat cat3 = new Cat("Рыжик", 60, 10);
        Cat cat4 = new Cat("Тёмка", 30, 5);
        Cat cat5 = new Cat("Дымок", 45, 15);
        Cat cat6 = new Cat("Яшка", 65, 0);

        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Барон");
        Bowl catBowl = new Bowl(100, 200, "Кошачья миска");

        cat1.run(150);
        cat1.swim(2);
        dog1.run(400);
        dog1.swim(5);
        cat2.run(50);
        cat2.swim(5);
        dog2.run(700);
        dog2.swim(11);
        cat3.printInfo();

        catBowl.printBowlFilling();
        //dogBowl.printBowlFilling();

        catBowl.fillTheBowl();
        catBowl.printBowlFilling();

        Cat[] arrayCat = {cat1, cat2, cat3, cat4, cat5, cat6};
        for (Cat cat : arrayCat) {
            cat.eat(catBowl);
            if (!cat.printSatietyCat()) {
                catBowl.fillTheBowl();
                cat.eat(catBowl);
            }
            cat.printSatietyCat1();
        }

        System.out.println("Общее количество животных: " + Animal.getCountAnimals());
        System.out.println("Общее количество котов: " + Cat.getCountCats());
        System.out.println("Общее количество собак: " + Dog.getCountDogs());
    }
}

