package logichandle;

import entity.Driver;
import entity.Street;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DriverSystem {
    static List<Driver> driverLists = new ArrayList<>();

    public static void addDriver() {
        System.out.println("1. Them lai xe vao danh sach: ");
        System.out.println(" Nhap tong so lai xe muon them: ");
        int numberTotal = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberTotal; i++) {
            System.out.println("Nhap thong tin lai xe thu " + (i + 1) + " la: ");
            Driver driver = new Driver();
            driver.inputinfo();
            DriverSystem.driverLists.add(driver);
        }
    }

    public static void showDriverlist() {
        System.out.println("Hien thi thong tin lai xe: ");
        /*for (Driver drivers : driverLists) {
            drivers.show();}*/
        driverLists.stream().forEach(s -> System.out.println(s));

    }

    public static void sortName() {
        System.out.println("Sap xep ten lai xe:");
        driverLists.stream().sorted(Comparator.comparing(Driver::getName)).forEach(System.out::println);
    }
    public static boolean isEmpty() {
        System.out.println("Kiem tra danh sach tuyen duong co rỗng không ");
        for (int i = 0; i < driverLists.size(); i++) {
            if (driverLists != null) {
                System.out.println("Danh sach co du lieu");
                return false;
            }
        }
        return isEmpty();
    }

    public static boolean idcheckDriver() {
        boolean isExisted = false;
        System.out.println("Xin moi nhap ma lai xe: ");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverLists.size(); i++) {
            if (driverLists.get(i).getId() == id) {
                isExisted = true;;
                System.out.println("Thong tin lai xe nay la: " +driverLists.get(i));
            } else {
                System.out.printf("Khong tim thay ma lai xe nay %d\n", id);
            }
        } return isExisted;
    }
}







