package logichandle;

import entity.Schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
    static List<Schedule> scheduleList = new ArrayList<>();

    public static void driverRegister() {
        Schedule schedule = new Schedule();
        scheduleDriver(schedule);
        boolean idcheck = false;
        System.out.println("Xin moi nhap ma lai xe cua ban:  ");
        int idnum = new Scanner(System.in).nextInt();
        for (int i = 0; i < DriverSystem.driverLists.size(); i++) {
            if (DriverSystem.driverLists.get(i).getId() == idnum || schedule.getDriver().getId() == idnum) {
                idcheck = true;
                System.out.println("Thong tin lai xe nay" + DriverSystem.driverLists.get(i));
                System.out.println("\n --- Xin moi dang ky tuyen duong --- \n");
                System.out.println("Xin moi nhap ma tuyen duong muon dang ky");
            }
            int is = new Scanner(System.in).nextInt();
            for (int k = 0; k < StreetSytem.streetLists.size(); k++) {
                if (StreetSytem.streetLists.get(k).getIdStreet() == is || schedule.getStreetArange().get(k).getStreets().getIdStreet() == is) {
                    System.out.println("Thong tin tuyen duong muon dang ky la: " + StreetSytem.streetLists.get(k));
                } else {
                    System.out.println("Ma lai xe khong ton tai. Xin moi nhap lai");
                }
            }
            return;
        }
    }
    public static void scheduleDriver(Schedule schedule) {
        scheduleList.add(schedule);
      scheduleList.stream().forEach(s -> System.out.println(s));
    }


    public static void scheduleDriver() {
    }
}


       /*
            System.out.println("Ma Id\n" +DriverSystem.driverLists.get(idnum).getId());
            System.out.println("Ten lai xe\n" +DriverSystem.driverLists.get(idnum).getName());
            System.out.println("Xin moi nhap mã tuyến đường muốn đăng ký: ");
            boolean idStr = false;
            int numberstreet = new Scanner(System.in).nextInt();
            for (int i =0; i < StreetSytem.streetLists.size(); i++) {
                if(StreetSytem.streetLists.get(i).getIdStreet() == numberstreet){
                    idStr = true;
                    break;
                } if (!idStr){
                    System.out.println(" Dang ky ma tuyen duong khong hop le:  ");
                }else {
                    System.out.println("Ma tuyen duong\n"+StreetSytem.streetLists.get(numberstreet).getIdStreet());
                }

            }
        }*/







