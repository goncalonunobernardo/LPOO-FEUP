package recipes;

import java.util.ArrayList;

public class Recipe{
    private String name;
    private ArrayList<RecipeStep> steps = new ArrayList<>();

    public Recipe(String name) {
    }

    
	public String getName() {
		return name;
	}
	
	public int getStepCount() {
		return steps.size();
	}
	
	public void addStep(RecipeStep recipeStep) {
        for (RecipeStep recipe : steps) {
            if (recipe.getName() == recipeStep.getName()) return;
        }
        steps.add(recipeStep);
    }

}
