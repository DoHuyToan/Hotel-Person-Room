import java.time.LocalDate;

public class Customer {
    private String name;
    private String birthday;
    private String identityCard;
    private int roomNumber;
    private Room room;

    public Customer(String name, String birthday, String identityCard, int roomNumber, Room room) {
        this.name = name;
        this.birthday = birthday;
        this.identityCard = identityCard;
        this.roomNumber = roomNumber;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", roomNumber=" + roomNumber +
                ", room=" + room +
                '}';
    }
}
