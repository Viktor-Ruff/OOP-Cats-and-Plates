package Homework6;

public class Dog extends Animal {

    final String kindOfAnimal = "Пёс";
    private static int countDogs = 0;

    final int runLimit = 500;
    final int swimLimit = 10;

    public Dog(String name) {
        super(name);

        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    public static void setCountDogs(int countDogs) {
        Dog.countDogs = countDogs;
    }

    protected void run(int runDistance) {
        if (runDistance <= runLimit) {
            System.out.println(kindOfAnimal + " " + getName() + " пробежал: " + runDistance + " метров\n_________________________________");

        } else {
            System.out.println(kindOfAnimal + " " + getName() + " не может пробежать такую дистанцию\n_________________________________");
        }
    }

    protected void swim(int swimDistance) {
        if (swimDistance <= swimLimit) {
            System.out.println(kindOfAnimal + " " + getName() + " проплыл: " + swimDistance + " метров\n_________________________________");

        } else {
            System.out.println(kindOfAnimal + " " + getName() + " не может проплыть такую дистанцию\n_________________________________");
        }
    }

}
