package entity;

import constant.LevelDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private int id;
    public static int Auto_id = 10000;
    private String name;
    private String address;
    private int numberphone;
    private String level;
    public Driver (int i) {}



    public Driver(int id, String name, String address, int numberphone, String level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberphone = numberphone;
        this.level = level;
    }

    public Driver(Driver driver) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public void inputinfo(){
        List<Driver> drivers = new ArrayList<>();
        System.out.println("Nhap ma id lai xe: ");
        this.id = Auto_id++;
        this.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhap ten lai xe: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap dia chi lai xe: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhap so dien thoai lai xe: ");
        this.setNumberphone(new Scanner(System.in).nextInt());
        System.out.println("Nhap trinh do lai xe: ");
        this.inputDriverType();

    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberphone=" + numberphone +
                ", level='" + level + '\'' +
                '}';
    }

    public void inputDriverType(){
        System.out.println("Chon loai trinh do lai xe: ");
        System.out.println("1. Loai A");
        System.out.println("2. Loai B");
        System.out.println("3. Loai C");
        System.out.println("4. Loai D");
        System.out.println("5. Loai E");
        System.out.println("6. Loai F");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 6) {
                break;
            }
            System.out.println("Lua chon khong hop le, vui long chon lai");
        } while (true);
        switch (choose){
            case 1:
                this.setLevel(LevelDriver.Loai_A.value);
                System.out.println("Loai A");
                break;
            case 2:
                this.setLevel(LevelDriver.Loai_B.value);
                System.out.println("Loai B");
                break;
            case 3:
                this.setLevel(LevelDriver.Loai_C.value);
                System.out.println("Loai C");
                break;
            case 4:
                this.setLevel(LevelDriver.Loai_D.value);
                System.out.println("Loai D");
                break;
            case 5:
                this.setLevel(LevelDriver.Loai_E.value);
                System.out.println("Loai E");
                break;
            case 6:
                this.setLevel(LevelDriver.Loai_F.value);
                System.out.println("Loai F");
                break;
        }}

    public void showDriver() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", id, name, address, numberphone,level);
    }
}
