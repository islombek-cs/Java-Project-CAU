import java.util.List;

public class Main {
    public static void main(String[] args) {

        RecipeManager manager = new RecipeManager();

        Recipe recipe1 = new Recipe("Pasta Carbonara",
                List.of("Spaghetti", "Bacon", "Egg", "Parmesan cheese", "Black pepper"),
                "Cook spaghetti. Fry bacon until crisp. Beat egg with grated cheese. Mix everything.",
                20);
        Recipe recipe2 = new Recipe("Chicken Curry",
                List.of("Chicken", "Onion", "Tomato", "Ginger", "Garlic", "Spices", "Coconut milk"),
                "Cook onion, ginger, and garlic. Add spices. Add chicken and cook. Add tomatoes and coconut milk. Simmer.",
                30);
        Recipe recipe3 = new Recipe("Chocolate Cake",
                List.of("Flour", "Sugar", "Cocoa powder", "Baking powder", "Egg", "Milk", "Butter"),
                "Mix dry ingredients. Beat egg with milk. Mix everything. Bake.",
                45);


        manager.addRecipe(recipe1);
        manager.addRecipe(recipe2);
        manager.addRecipe(recipe3);

        System.out.println("All Recipes:");
        manager.displayAllRecipe();

        System.out.println("\nSearching for recipe by name:");
        manager.searchByName("Chicken Curry");

        Recipe updatedRecipe = new Recipe("Chicken Curry (Spicy)",
                List.of("Chicken", "Onion", "Tomato", "Ginger", "Garlic", "Spices", "Coconut milk", "Chili"),
                "Cook onion, ginger, and garlic. Add spices and chili for extra spice. Add chicken and cook. Add tomatoes and coconut milk. Simmer.",
                35);
        manager.updateRecipe("Chicken Curry", updatedRecipe);

        System.out.println("\nAll Recipes after update:");
        manager.displayAllRecipe();


        manager.deleteRecipe("Pasta Carbonara");


        System.out.println("\nAll Recipes after deletion:");
        manager.displayAllRecipe();


    }
}