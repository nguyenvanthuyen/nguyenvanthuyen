package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private String name;
    private String location;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public Hotel (String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName  = ownerName;
    }

    static ArrayList<String> arrHotel = new ArrayList<>(10);
    static Scanner scanner = new Scanner(System.in);


    public Hotel(){
        super();
    }

    public void inputInfo(){
        System.out.println("Nhap ten khach san:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Nhap vi tri:");
        location = scanner.nextLine();

        System.out.println("Nhap ten chu so huu:");
        ownerName = scanner.nextLine();

    }

    public  void printInfo(){
        System.out.println("Thong tin khach san:");
        System.out.println(name+" - vi tri:"+location);
    }
}