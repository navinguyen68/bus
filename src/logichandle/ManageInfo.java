package logichandle;

import entity.Driver;
import entity.Schedule;
import entity.Street;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageInfo {
        public static void showDriverlist() {
            System.out.println("1. Them lai xe vao danh sach: ");
            List<Driver> driverLists = new ArrayList<>();
            System.out.println(" Nhap tong so lai xe muon them: ");
            int numberTotal = new Scanner(System.in).nextInt();
            for (int i = 0; i < numberTotal; i++) {
                System.out.println("Nhap thong tin lai xe thu " + (i + 1) + " la: ");
                Driver driver = new Driver();
                driver.inputinfo();
                driverLists.add(driver);
                System.out.println("Hien thi thong tin lai xe: ");
                for (Driver drivers : driverLists) {
                    drivers.show();
                }
            }
        }


            public static void showStreetlist() {
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
                    int k = 1;
                    for (Street st : streetLists) {
                        System.out.println("Hien thi tuyen thu " + k + " la: ");
                        st.showStreet();
                    }
                }
            }
        }


