package logichandle;

import entity.Street;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreetSytem {
    static List<Street> streetLists = new ArrayList<>();
    public static void addStreet() {
        System.out.println("Them tuyen duong moi vao danh sach");
        System.out.println("Nhap tong tuyen xe muon them:  ");
        int numberStreet = new Scanner(System.in).nextInt();
        for (int j = 0; j < numberStreet; j++) {
            System.out.println("Nhap thong tin tuyen thu " + (j + 1) + " la: ");
            Street street = new Street();
            street.inputStreet();
            streetLists.add(street);
        }
    }
    public static void showStreetlist(){
            System.out.println("Hien thi thong tin tuyen duong");
          /*  for (Street st : streetLists) {
                st.showStreet();
            }*/
        streetLists.stream().forEach(s -> System.out.println(s));
        }

    public static boolean isEmptyStreet(){
    System.out.println("Kiem tra danh sach tuyen duong co rỗng không ");
    for(int i =0; i < streetLists.size(); i++) {
        if (streetLists != null) {
            System.out.println("Danh sach co du lieu");
            return false;
        }
    }return isEmptyStreet();

}
    public static boolean idcheckStreet() {
        boolean isExisted = false;
        System.out.println("Nhap ma tuyen duong can tim kiem: ");
        int ids = new Scanner(System.in).nextInt();
        for (int i = 0; i < streetLists.size(); i++) {
            if (streetLists.get(i).getIdStreet() == ids) {
                isExisted = true;
                System.out.println("Ma tuyen duong co trong he thong: " + streetLists.get(i));
            } else {
                System.out.println("Ma tuyen duong khong ton tai");
            }
        } return isExisted;
    }

}

