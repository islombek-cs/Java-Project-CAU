import java.util.ArrayList;

public class RecipeManager {
    ArrayList<Recipe> recipes;

    public RecipeManager() {
        recipes =  new ArrayList<>();
    }
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }


    public void displayAllRecipe(){
        for(Recipe r: recipes)
            System.out.println(r.getName());
    }


    public void searchForRecipe(String name){
        for (Recipe r: recipes){
            if(r.getName().equalsIgnoreCase(name)){
                displayRecipeDetails(r);
            }
        }
    }

    private void displayRecipeDetails(Recipe r) {
        System.out.println("Recipe details of  "+ r.getName());
        System.out.println("Name: "+r.getName());
        System.out.println("Ingredients"+r.getIngredients());
        System.out.println("Instructions: "+r.getInstructions());
        System.out.println("Cooking time: "+r.getCookingTime());
        System.out.println("------------------------------------");


    }

    public void updateRecipe(String name, Recipe updatedR){
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                recipes.set(i, updatedR);
                System.out.println("Recipe updated successfully.");
                return;
            }
        }
        System.out.println("Recipe not found with name: " + name);
    }
    public void deleteRecipe(String name){
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                recipes.remove(i);
                System.out.println("Recipe deleted successfully.");
                return;
            }
        }
        System.out.println("Recipe not found with name: " + name);
    }
    public void searchByIngredient(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                displayRecipeDetails(recipe);
            }
        }
    }
    public void searchByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                displayRecipeDetails(recipe);
                return;
            }
        }
        System.out.println("Recipe not found with name: " + name);
    }
}
