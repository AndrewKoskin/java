package Module3.Enums.Homework3;

public class Chicken extends Food{
    FoodType food = FoodType.MEAT;
    String name = "Chicken";

    @Override
    public FoodType getFoodType() {
        return this.food;
    }
}

class Pork extends Food{
    FoodType food = FoodType.MEAT;
    String name = "Pork";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return this.food;
    }

}

class Cucumber extends Food {
    FoodType food = FoodType.VEGETABLE;
    String name = "Cucumber";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public FoodType getFoodType() {
        return this.food;
    }

}