package model;

import model.Room;

public class User {
    private String name;
    private String birthday;
    private String code;

    public User() {
    }

    public User(String name, String birthday, String code) {
        this.name = name;
        this.birthday = birthday;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User: " +
                "name= " + name +
                ", code= " + code + " " ;
    }
}
