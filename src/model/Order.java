package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private LocalDate chekin;
    private LocalDate checkout;
    private User user;
    private Room room;

    public double getTotalPrice(){
        double result;
        double numDay = DAYS.between(chekin, checkout);
        double price = room.getPrice();
        result = numDay*price;
        return result;
    }

    public Order() {
    }

    public Order(LocalDate chekin, LocalDate checkout, User user, Room room) {
        this.chekin = chekin;
        this.checkout = checkout;
        this.user = user;
        this.room = room;
    }

    public LocalDate getChekin() {
        return chekin;
    }

    public void setChekin(LocalDate chekin) {
        this.chekin = chekin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return user.toString() + room.toString() + ", Tiền phòng " + getTotalPrice();
    }
}
