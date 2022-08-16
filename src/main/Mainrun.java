package main;

import entity.Driver;
import logichandle.Subcription;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("\n\n\n ---- Chon huc nang ---\n\n\n");
        System.out.println("1. Them lai xe vao danh sach: ");
        System.out.println("2. Danh sach lai xe: ");
        System.out.println("3. Them danh sach tuyen moi: ");
        System.out.println("4. Danh sach tuyen xe lai xe dang ky chay: ");
        System.out.println("5. Sap xep danh sach phan cong theo ten");
        System.out.println("6. Sap xep tuyen dam nhan trong ngay ");
        System.out.println("7. Bang ke tong Khoang cach trong ngay cua lai xe: ");
        boolean isExit = false;
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.println("Lua chon khong hop le");
        } while (true);
        switch (choice) {
            case 1:
                Subcription.showDriverlist();
                break;
            case 2:
                break;
            case 3:
                Subcription.showStreetlist();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);
                isExit = true;
        }
    }
}
