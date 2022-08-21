package main;

import entity.Driver;
import entity.Schedule;
import entity.Street;
import logichandle.Register;
import logichandle.ManageInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainrun {
    public static  List<Driver> driverList = new ArrayList<>();
    public static List<Street> streets = new ArrayList<>();
    public static List<Schedule> schedules = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean isExit = false;
        do {
            int functionchoice = functionchoice();
            switch (functionchoice) {
                case 1:
                    ManageInfo.showDriverlist(); // them lai xe va hien thi lai xe
                    break;
                case 2:
                    ManageInfo.showStreetlist(); // them tuyen duong
                    break;
                case 3:
                    Register.driverRegister(); // he thong lai xe dang ky tuyen duong
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionchoice() {
        showmenu();
        System.out.println("\n\n\n ---- Chon chuc nang ---\n\n\n");
        int choice = 1;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Lua chon khong hop le !");
        } while (true);
        return choice;
    }

    private static void showmenu() {
        System.out.println("1. Them và hien thi danh sach lai xe : ");
        System.out.println("2. Them va hien thi danh sach tuyen duong: ");
        System.out.println("3. Nhap Danh sach lai xe dang ky tuyen xe chay: ");
        System.out.println("4. Hien thi danh sach lai xe dang ky tuyen duong");
        System.out.println("5. Sap xep danh sach phan cong theo ten");
        System.out.println("6. Sap xep tuyen dam nhan trong ngay ");
        System.out.println("7. Bang ke tong khoang cach trong ngay cua lai xe: ");
    }
}