package Homework6;

public class Bowl {
    private String name;
    private int sizeBawl;
    protected int amountFoodInBowl;

    public Bowl(int amountFoodInBowl, int sizeBawl, String name) {
        this.amountFoodInBowl = amountFoodInBowl;
        this.sizeBawl = sizeBawl;
        this.name = name;
        if (this.amountFoodInBowl > sizeBawl) {
            this.amountFoodInBowl = sizeBawl;
            System.out.println("Вы положили слишком много корма в " + this.name + ", излишки растекаются по полу!");
        }
    }

    public String getName() {
        return name;
    }

    protected void fillTheBowl() {
        int deltaFood;
        deltaFood = this.sizeBawl - this.amountFoodInBowl;
        this.amountFoodInBowl += deltaFood;
        System.out.println("В миску доложили " + deltaFood + " единиц пищи. Миска полна");

    }

    public void decreaseAmountFood(int foodDelta) {
        if (foodDelta > amountFoodInBowl) {
        } else {
            amountFoodInBowl -= foodDelta;
        }
    }

    public boolean checkAmountFood(int foodDelta) {
        return foodDelta <= amountFoodInBowl;
    }

    protected void printBowlFilling() {
        System.out.println(this.name + ": " + amountFoodInBowl + " единиц пищи.");

    }

    // Рабочий метод пополнения миски. Только он заполняет миску не полностью, а на конкретное значение!
    /*    protected void fillTheBowl(int sizeFood) {
        if (sizeFood > sizeBawl) {
            System.out.println("Миска вмещает " + sizeBawl + " едениц пищи. Миска полна.");
            amountFoodInBowl = sizeBawl;
        } else if (sizeFood < 0) {
            System.out.println("В миске не может быть отрицательного количества пищи. Миска пуста.");
            amountFoodInBowl = 0;
        } else {
            amountFoodInBowl += sizeFood;
        }
        System.out.println("В миску доложили " + sizeFood + " единиц пищи.");

    }*/

}


