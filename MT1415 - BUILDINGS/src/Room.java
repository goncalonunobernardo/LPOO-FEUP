
import java.util.ArrayList;

public class Room extends Facility {
	private Building building;
	private String number;
	private int floor;
    private ArrayList<User> users = new ArrayList<>();
	
	public Room(Building building, String number, int floor) throws DuplicateRoomException{
		super(building.getName() + number, 0);
		if(floor < building.getMinFloor() || floor > building.getMaxFloor()) throw new IllegalArgumentException();
		this.building = building;
		this.number = number;
		this.floor = floor;
		 for (int i = 0; i < building.getRooms().size(); i++) {
	            if (building.getRooms().get(i).getNumber().equals(number))
	                throw new DuplicateRoomException();
	        }

	        building.addRoom(this);
	}
	public Room(Building building, String number, int floor, int capacity) throws DuplicateRoomException{
		super(building.getName() + number, capacity);
		this.building = building;
		this.number = number;
		this.floor = floor;
		if(floor < building.getMinFloor() || floor > building.getMaxFloor()) throw new IllegalArgumentException();
		 for (int i = 0; i < building.getRooms().size(); i++) {
	            if (building.getRooms().get(i).getNumber().equals(number))
	                throw new DuplicateRoomException();
	        }
		building.addRoom(this);
	}
	

	@Override
	public String toString() {
		return "Room(" + this.building.getName() + "," + this.number + ")";
	}
	
	public Building getBuilding() {
		return building;
	}

	public String getNumber() {
		return number;
	}

	public int getFloor() {
		return floor
				;
	}
	

    public void authorize(User user) {
        users.add(user);
    }

    public boolean canEnter(User u1) {
        return users.contains(u1);
    }


    public ArrayList<User> getUsers() {
        return users;
    }
}
