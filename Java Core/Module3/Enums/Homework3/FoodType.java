package Module3.Enums.Homework3;

public enum FoodType {
    PORRIDGE(true), BREAD(false), SOUP(false), VEGETABLE(true), NUT(true),
    FRUIT(true), DAIRY(false), FISH(false), GREENS(true), MEAT(false),
    UNKNOWN(false);

    private boolean isVegan;

    FoodType(boolean isVegan) {
        this.isVegan = isVegan;
    }

    public boolean getIsVegan() {
        return this.isVegan;
    }
}
