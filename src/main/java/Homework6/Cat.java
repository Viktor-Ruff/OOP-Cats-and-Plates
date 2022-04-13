package Homework6;

public class Cat extends Animal {

    static int runLimit = 200;
    static int swimLimit;
    static int countCats = 0;
    static String kindOfAnimal = "Кот";

    private int appetite;
    private int satietyCat;

    public Cat(String name, int appetite, int satietyCat) {
        super(name);
        this.appetite = appetite;
        this.satietyCat = satietyCat;
        if (this.satietyCat > this.appetite) {
            this.satietyCat = this.appetite;
        }
        countCats++;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public static int getCountCats() {
        return countCats;
    }

    public static void setCountCats(int countCats) {
        Cat.countCats = countCats;
    }

    public void run(int runDistance) {
        if (runDistance <= runLimit) {
            System.out.println(kindOfAnimal + " " + getName() + " пробежал: " + runDistance + " метров\n_________________________________");
        } else {
            System.out.println(kindOfAnimal + " " + getName() + " не может пробежать такую дистанцию\n_________________________________");
        }
    }

    public void swim(int swimDistance) {
        System.out.println(kindOfAnimal + " не умеет плавать \n_________________________________");
    }

    public void eat(Bowl bowl) {
        int deltaAppetite;
        deltaAppetite = this.appetite - this.satietyCat;
        if (bowl.checkAmountFood(deltaAppetite) && deltaAppetite != 0) {
            bowl.decreaseAmountFood(deltaAppetite);
            this.satietyCat += deltaAppetite;
            System.out.println(kindOfAnimal + " " + getName() + " ест из миски " + deltaAppetite + " единиц пищи.");
        } else if (deltaAppetite == 0) {
            System.out.println(kindOfAnimal + " " + getName() + " не голоден.");
        } else if (bowl.amountFoodInBowl == 0) {
            System.out.println(kindOfAnimal + " " + getName() + " не смог покушать, миска пуста.");
        } else {
            deltaAppetite = bowl.amountFoodInBowl;
            bowl.decreaseAmountFood(deltaAppetite);
            this.satietyCat += deltaAppetite;
            System.out.println(kindOfAnimal + " " + getName() + " доел " + deltaAppetite + " единиц пищи. Миска пуста");
        }
    }

    public boolean printSatietyCat() {

        if (this.appetite == this.satietyCat) {
            System.out.println(kindOfAnimal + " " + getName() + " сыт.");
            return true;
        } else {
            System.out.println(kindOfAnimal + " " + getName() + " голоден.");
        }
        return false;
    }

    public int getSatietyCat() {
        return satietyCat;
    }

    public void setSatietyCat(int satietyCat) {
        this.satietyCat = satietyCat;
    }

    public void printSatietyCat1() {

        int percentSatietyCat;
        percentSatietyCat = (this.satietyCat * (this.appetite / 100));
        System.out.println(getName() + " сыт на " + percentSatietyCat + "%");
    }
}
