package Homework6;

abstract class Animal {

    private static int countAnimals = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        countAnimals ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public static void setCountAnimals(int countAnimals) {
        Animal.countAnimals = countAnimals;
    }

    abstract void run(int runDistance);

    abstract void swim(int swimDistance);

    @Override
    public String toString() {
        return String.format("Это животное зовут %s", this.name);
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

}
