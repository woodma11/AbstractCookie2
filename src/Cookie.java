public abstract class Cookie {
    public abstract String getName();
    public abstract void listIngredients();
    public abstract void bake();

    public void displayRecipe() {
        System.out.println("\n=== " + getName() + " ===");
        listIngredients();
        bake();
        System.out.println("----------------------");
    }
}
