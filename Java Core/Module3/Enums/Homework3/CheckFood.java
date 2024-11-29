package Module3.Enums.Homework3;

public class CheckFood {
    public static boolean isVegeterian(Food[] foods){
        Boolean vegeterian = true;
        for (Food food: foods) {
            vegeterian = food.getFoodType().getIsVegan();
            if (!vegeterian){
                vegeterian = false;
                break;
            }
        }
        return vegeterian;
    }

    public static void main(String[] args) {
        Food[] foods = new Food[3];
        foods[0] = new Chicken();
        foods[1] = new Pork();
        foods[2] = new Cucumber();

        Food[] foods1 = new Food[3];
        foods1[0] = new Cucumber();
        foods1[1] = new Cucumber();
        foods1[2] = new Cucumber();


        System.out.println(CheckFood.isVegeterian(foods));
        System.out.println(CheckFood.isVegeterian(foods1));
    }
}
