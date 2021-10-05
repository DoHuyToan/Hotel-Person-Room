package model;

public class Room {
    private String roomNumber;
    private String type;
    private double price;
    private boolean status = true;

    public Room() {
    }

    public Room(String name, String type, double price) {
        this.roomNumber = name;
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room: " +
                "roomNumber= " + roomNumber + '\'' +
                ", type= " + type ;
    }
}
