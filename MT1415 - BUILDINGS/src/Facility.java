
public abstract class Facility {
	private String name;
	private int capacity;
	
	public Facility(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;

	}

	
	public int getCapacity() {
		return capacity;
	}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
	public String getName() {
		return name;
	}

    public boolean canEnter(User u1) {
        return false;
    }
}
