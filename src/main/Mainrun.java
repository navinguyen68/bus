package main;

import entity.Driver;
import entity.Schedule;
import entity.Street;
import logichandle.Register;
import logichandle.DriverSystem;
import logichandle.StreetSytem;

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
                    DriverSystem.addDriver(); // them lai xe va hien thi lai xe
                    break;
                case 2:
                    DriverSystem.showDriverlist();
                    break;
                case 3:
                    DriverSystem.sortName();
                    break;
                case 4:
                    DriverSystem.idcheckDriver();
                    break;
                case 5:
                    StreetSytem.addStreet();
                    break;
                case 6:
                    StreetSytem.showStreetlist();
                    break;
                case 7:
                    StreetSytem.isEmptyStreet();
                    break;
                case 8:
                    StreetSytem.idcheckStreet();
                    break;
                case 9:
                    Register.driverRegister();
                    break;
                case 10:

                    break;
                case 11:
                    break;
                case 12:
                   break;
                case 13:
                    break;
                case 14:
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
            if (choice >= 1 && choice <= 14) {
                break;
            }
            System.out.println("Lua chon khong hop le !");
        } while (true);
        return choice;
    }

    private static void showmenu() {
        System.out.println("1. Them thong tin lai xe vao danh sach lai xe : ");
        System.out.println("2. Hien thi thong tin lai xe trong danh sach : ");
        System.out.println("3. Sap xep ten lai xe theo danh sach : ");
        System.out.println("4. Kiem tra mã lái xe có tồn tại không");
        System.out.println("5. Them tuyen duong vao danh sach ");
        System.out.println("6. Hien thi thong tin tuyen duong");
        System.out.println("7. Kiem tra he thong tuyen duong co rong khong ");
        System.out.println("8. Kiem tra Ma tuyen duong co trong he thong khong ");
        System.out.println("9. Nhap Danh sach lai xe dang ky tuyen xe chay: ");
        System.out.println("10. Hien thi danh sach lai xe dang ky tuyen duong");
        System.out.println("11. Sap xep danh sach phan cong theo ten");
        System.out.println("12. Sap xep tuyen dam nhan trong ngay ");
        System.out.println("13. Bang ke tong khoang cach trong ngay cua lai xe: ");
        System.out.println("14. Thoat");
    }
}