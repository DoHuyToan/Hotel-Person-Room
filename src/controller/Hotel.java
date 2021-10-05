package controller;

import model.Order;
import model.Room;
import model.User;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> roomArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();
    ArrayList<Order> orderArrayList = new ArrayList<>();

    public Hotel(ArrayList<Room> roomArrayList, ArrayList<User> userArrayList, ArrayList<Order> orderArrayList) {
        this.roomArrayList = roomArrayList;
        this.userArrayList = userArrayList;
        this.orderArrayList = orderArrayList;
    }

    public void  displayShowOrder(){        //show list khách ở các phòng
        for (Order o: orderArrayList) {
            System.out.println(o);
        }
    }

    public void displayShowRoom(){          //show list phòng
        for (Room r: roomArrayList) {
            System.out.println(r);
        }
    }

    public void displayShowUser(){         //show list khách
        for (User u: userArrayList) {
            System.out.println(u);
        }
    }

    public void checkRoom(){
        for (Room r:roomArrayList) {
            if (r.isStatus()){
                System.out.println("Phòng " + r + " trống");
            } else System.out.println("Phòng " + r + " có khách");
        }
    }

    public double getAllTotal(){        //tổng tiền order
        double total = 0;
        for (Order o: orderArrayList) {
            total += o.getTotalPrice();
        }
        return  total;
    }

    public void addRoom(Room room){    //thêm phòng
        roomArrayList.add(room);
    }



    public void removeRoom(String name){     //xóa phòng
        for (Room r: roomArrayList) {
            if(r.getRoomNumber().equals(name))
            roomArrayList.remove(r);
            break;
        }
    }

    public void addUser(User user){    //thêm tên
        userArrayList.add(user);
    }  //thêm khách

    public void editRoom(String name, Room newRoom){  //sửa phòng
        for (int i = 0; i<roomArrayList.size(); i++){
            if (roomArrayList.get(i).getRoomNumber().equals(name))
                roomArrayList.set(i, newRoom);
        }
    }

    public void editUser(String name, User newUser){      //sửa khách
        for (int i = 0; i<userArrayList.size(); i++){
            if(userArrayList.get(i).getName().equals(name));
            userArrayList.set(i, newUser);
        }
    }

    public void removeUser(String code){         //xóa khách
        for (User u: userArrayList) {
            if (u.getCode().equals(code))
                userArrayList.remove(u);
        }
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }
}
