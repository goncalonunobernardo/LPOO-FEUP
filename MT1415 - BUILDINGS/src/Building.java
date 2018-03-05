import java.util.ArrayList;


public class Building extends Facility {
	private int minFloor;
	private int maxFloor;
	
	private ArrayList<Room> rooms = new ArrayList<>();

	public int getMinFloor() {
		return minFloor;
	}

	public int getMaxFloor() {
		return maxFloor;
	}


	public Building(String name, int minFloor, int maxFloor) throws IllegalArgumentException {
		super(name,0);
		if (minFloor > maxFloor) throw new IllegalArgumentException();
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
	}
	public Building(String name, int minFloor, int maxFloor, int capacity) throws IllegalArgumentException {
		super(name, capacity);
		
		if (minFloor > maxFloor) throw new IllegalArgumentException();
	}
	
    public void addRoom(Room room) {
        rooms.add(room);
        this.setCapacity(this.getCapacity() + room.getCapacity());
    }
    
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	@Override
	public String toString() {
		return "Building(" + super.getName() + ")";
	}
	

    public boolean canEnter(User u1) {
        for (Room room : rooms) {
            if (!room.getUsers().contains(u1)) return false;
        }
        return true;
    }
    
}
