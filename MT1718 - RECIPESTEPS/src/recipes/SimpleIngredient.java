package recipes;

public class SimpleIngredient extends Ingredient implements Comparable{

	public SimpleIngredient(String name) {
		super(name);
	    if (name == null) throw new IllegalArgumentException();
	}
	  
    @Override
    public int compareTo(Object ingredient) {
        return (this.getName().compareTo(((SimpleIngredient) ingredient).getName()));
    }
}
