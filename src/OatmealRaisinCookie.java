public class OatmealRaisinCookie extends Cookie {

    @Override
    public String getName() {
        return "Oatmeal Raisin Cookie";
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: oats, flour, sugar, butter, eggs, raisins, cinnamon");
    }

    @Override
    public void bake() {
        System.out.println("Mix ingredients and scoop onto baking sheet.");
        System.out.println("Bake at 350°F for 10-12 minutes.");
    }
}
