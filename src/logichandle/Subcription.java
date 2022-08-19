package logichandle;

import entity.Driver;
import entity.Street;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subcription {
    public static void showDriverlist() {
        System.out.println("Them lai xe vao danh sach: ");
        System.out.println("Nhap tong so lai xe muon them: ");
        List<Driver> driverLists = new ArrayList<>();
        int numberTotal = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberTotal; i++) {
            System.out.println("Nhap thong tin lai xe thu " + (i + 1) + " la: ");
            Driver driver = new Driver(i);
            driver.inputinfo();
            driverLists.add(driver);
            System.out.println("Hien thi thong tin lai xe!");
            int j =1 ;
            for (Driver dv : driverLists) {
                System.out.println("Hien thi lai xe thu " + j + " la: ");
                dv.showDriver();
            }
        }
    }
    public static void showStreetlist(){
        System.out.println("Nhap danh sach tuyen xe moi");
        System.out.println("Nhap tong tuyen xe muon them:  ");
        List<Street> streetLists = new ArrayList<>();
        int numberStreet = new Scanner(System.in).nextInt();
        for (int j = 0; j < numberStreet; j++) {
            System.out.println("Nhap thong tin tuyen thu " + (j + 1) + " la: ");
            Street street = new Street();
            street.inputStreet();
            streetLists.add(street);
            System.out.println("Hien thi thong tin tuyen duong");
            int k =1 ;
            for (Street st : streetLists) {
                System.out.println("Hien thi tuyen thu " + k + " la: ");
                st.showStreet();
            }

            }


    }
}
