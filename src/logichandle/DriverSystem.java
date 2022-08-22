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
        for (Driver drivers : driverLists) {
            drivers.show();
        }
    }

    public static void sortName() {
        System.out.println("Sap xep ten lai xe:");
        driverLists.stream().sorted(Comparator.comparing(Driver::getName)).forEach(System.out::println);
    }

    public static boolean idcheckDriver(int id) {
        boolean isExisted = false;
        for (int i = 0; i < driverLists.size(); i++) {
            if (driverLists.get(i).getId() == id) {
                isExisted = true;
                driverLists.get(id).setId(id);
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Khong tim thay ma lai xe nay\n", id);
        } else {
            System.out.printf("Thong tin lai xe nay la: \n ",id );

        } return true;
    }
}







