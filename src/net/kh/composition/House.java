package net.kh.composition;
import java.util.*;

public class House {
	
	private Room refRoom;
	
	public Room getRefRoom() {
		return refRoom;
	}
	public void setRefRoom(Room refRoom) {
		this.refRoom = refRoom;
	}
	
	public House() {
		refRoom = new Room();
	}
	
	private List<Room> rooms = new ArrayList<Room>();

	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
