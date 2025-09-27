package ua.hotel_managment;

/**
 * Represents a hotel room with details such as room number, type of room, capacity and price.
 * Provides validation for input data through setters.
 */
public class Room {
	
	private int roomNumber;
	private String type;
	private int capacity; // maximal count of people in the room
	private double price;
	
	/**
	 * Returns number of the room.
	 * @return roomNumber room's number
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	/**
	 * Returns type of the room.
	 * @return type room's type
	 */
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Returns maximum count of people in the room .
	 * @return capacity room's capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
