public class SugarCookie extends Cookie {

    @Override
    public String getName() {
        return "Sugar Cookie";
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: flour, sugar, butter, eggs, vanilla extract");
    }

    @Override
    public void bake() {
        System.out.println("Roll dough and cut into shapes.");
        System.out.println("Bake at 350°F for 8-10 minutes.");
    }
}
