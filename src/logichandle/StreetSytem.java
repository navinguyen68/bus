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
            int k = 1;
            for (Street st : streetLists) {
                System.out.println("Hien thi tuyen thu " + k + " la: ");
                st.showStreet();
            }
        }

    public static boolean isEmptyStreet(){
    System.out.println("Kiem tra danh sach tuyen duong co rỗng không ");
    for(int i =0; i < streetLists.size(); i++) {
        if (streetLists != null) {
            System.out.println("Danh sach rỗng");
            return false;
        }
    }return true;

}
    public static boolean idcheckStreet(int idS) {
        boolean isExisted = false;
        for (int i = 0; i < streetLists.size(); i++) {
            if (streetLists.get(i).getIdStreet() == idS) {
                isExisted = true;
                streetLists.get(idS).setIdStreet(idS);
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Khong tim thay ma tuyen duong nay\n", idS);
        } else {
            System.out.printf("Thong tin tuyen duong la: \n ", streetLists );

        } return true;
    }
}

