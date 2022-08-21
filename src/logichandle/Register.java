package logichandle;

import entity.Driver;
import entity.Schedule;
import entity.Street;
import main.Mainrun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Register {
    public static void driverRegister() {
        System.out.println("Nhap tong lai xe dang ky tuyen duong: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap thong tin lai xe thu" + (i + 1) + "la: ");
            Schedule schedule = new Schedule();
            schedule.registerInfo();
            }
        }

    }




