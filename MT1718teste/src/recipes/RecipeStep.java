package recipes;

import java.util.ArrayList;

public class RecipeStep {
	private String name;
	private String action;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	private ArrayList<Float> quantities = new ArrayList<>();
	private float recipeStepQuantity;
	private RecipeStep recipeStep;
	


    public RecipeStep() {}
	public RecipeStep(String name, String action) {
	    if (name == null || action == null) throw new IllegalArgumentException();
		
	    this.name = name;
        this.recipeStep = null;
		this.action = action;
	}
	
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	
	public String getAction() {return action;}
	public void setAction(String action) {this.action = action;}
	
	
	public void addIngredient(Ingredient ingredient, float quantity) {
		
		for(Ingredient i : ingredients) {
			if(i.getName() == ingredient.getName()) return;
		}
		ingredients.add(ingredient);
		quantities.add(quantity);
		}
    public void addIngredient(RecipeStep recipe, float quantity) {
        this.recipeStepQuantity = quantity;
        this.recipeStep = recipe;
        this.action = "mix";
    }
	
	public int getIngredientCount() {
        if (recipeStep != null) {
            return ingredients.size() + 1;
        } else return ingredients.size();
	}
	
	public float getQuantity(Ingredient ingredient) {
	        for (int i = 0; i < ingredients.size(); i++) {
	            if (ingredients.get(i).getName() == ingredient.getName())
	                return quantities.get(i);
	        }
	        if (recipeStep != null) {
	            for (int i = 0; i < recipeStep.getIngredients().size(); i++) {
	                if (recipeStep.getIngredients().get(i).getName() == ingredient.getName())
	                    return recipeStepQuantity * recipeStep.getQuantities().get(i);
	            }
	        }
	        
	        return 0;
	}
    public float getQuantity(RecipeStep recipe) {
        return recipeStepQuantity;
    }
    
    public String toString() {
        String result = "to make " + this.name + ", " + this.action + " ";
        
        if (recipeStep != null) {
            result = result + recipeStepQuantity + " " + recipeStep.getName() + ", ";
            }

        for (int i = 0; i < ingredients.size(); i++) {
            result = result + quantities.get(i) + " " + ingredients.get(i).getName();
            if (i != ingredients.size() -1) result = result + ", ";
        }

        return result;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Float> getQuantities() {
        return quantities;
    }
}
