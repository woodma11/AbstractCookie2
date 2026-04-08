public class ChocolateChipCookie extends Cookie {

    @Override
    public String getName() {
        return "Chocolate Chip Cookie";
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: flour, sugar, butter, eggs, chocolate chips");
    }

    @Override
    public void bake() {
        System.out.println("Bake at 350°F for 10-12 minutes.");
    }
}
