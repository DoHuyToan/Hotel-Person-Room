package view;

import controller.Hotel;
import model.Order;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User duy = new User("Duy", "1991", "01345");
        User tuan = new User("Tuan", "1996", "02468");
        ArrayList<User> users = new ArrayList<>();
        users.add(duy);
        users.add(tuan);

        Room r1 = new Room("001", "Vip", 100);
        Room r2 = new Room("002", "Vip",100);
        Room r3 = new Room("003", "Normal",70 );
        Room r4 = new Room("004", "Normal",70 );
        Room r5 = new Room("005", "Normal",70 );

        ArrayList<Room> rooms =new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);

        Order o1 = new Order(LocalDate.of(2021,10,1), LocalDate.of(2021,10,3), duy, r1);
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(o1);

        Hotel DoToan = new Hotel(rooms, users, orders);

        System.out.println("Danh sách khách theo phòng");
        DoToan.displayShowOrder();
        System.out.println(DoToan.getAllTotal());

        System.out.println("Danh sách phòng");
        DoToan.displayShowRoom();

        System.out.println("Thêm phòng");
        DoToan.addRoom(new Room("005", "Normal",70 ));
        DoToan.displayShowRoom();

        System.out.println("Xóa phòng");
        DoToan.removeRoom("001");
        DoToan.displayShowRoom();

        System.out.println("Sửa phòng");
        DoToan.editRoom("002", new Room("005", "Normal",70 ));
        DoToan.displayShowRoom();

        System.out.println("Danh sách khách");
        DoToan.displayShowUser();

        System.out.println("Thêm khách");
        DoToan.addUser(new User("Thao", "1991", "01111"));
        DoToan.displayShowUser();

        System.out.println("Sửa khách");
        DoToan.editUser("Duy", new User("Dinh", "1998", "02222"));
        DoToan.displayShowUser();
        //đang lỗi

//        DoToan.checkRoom();





    }
}
