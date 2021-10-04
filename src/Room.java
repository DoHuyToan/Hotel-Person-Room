public class Room {
    private double price;
    private String typeRoom;
    private int day;

    public Room(double price, String typeRoom, int day) {
        this.price = price;
        this.typeRoom = typeRoom;
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
