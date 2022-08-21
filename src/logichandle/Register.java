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
        boolean idcheck = false;
        System.out.println("Xin moi nhap ma lai xe cua ban:  ");
        int idnum = new Scanner(System.in).nextInt();
        for (int i = 0; i < DriverSystem.driverLists.size(); i++) {
            if ( DriverSystem.driverLists.get(i).getId() == idnum){
                idcheck = true;
                DriverSystem.driverLists.get(i).setId(idnum);
                break;
            }
        } if ( !idcheck ) {
            System.out.printf("Ma lai xe khong ton tai\n", idnum);
            } else {
            System.out.println("Ma Id\n" +DriverSystem.driverLists.get(idnum).getId());
            System.out.println("Ten lai xe\n" +DriverSystem.driverLists.get(idnum).getName());
            System.out.println("Xin moi nhap mã tuyến đường muốn đăng ký: ");
            boolean idStr = false;
            int numberstreet = new Scanner(System.in).nextInt();
            for (int i =0; i < StreetSytem.streetLists.size(); i++) {
                if(StreetSytem.streetLists.get(i).getIdStreet() == numberstreet){
                    idStr = true;
                    StreetSytem.streetLists.get(i).setIdStreet(numberstreet);
                    break;
                } if (!idStr){
                    System.out.println(" Dang ky ma tuyen duong khong hop le:  ");
                }else {
                    System.out.println("Ma tuyen duong\n"+StreetSytem.streetLists.get(numberstreet).getIdStreet());
                    System.out.println("Khoang cach tuyen duong\n" +StreetSytem.streetLists.get(numberstreet).getDistance());
                    System.out.println("So diem dung\n"+StreetSytem.streetLists.get(numberstreet).getStopNumber());
                }

            }
        }
        }

    }




