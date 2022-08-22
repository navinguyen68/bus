package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Street {
    private int idStreet;
    private int distance;
    private int stopNumber;
    public static int Auto_idStreet = 1000;
    List<Street> streets = new ArrayList<>();
    public Street(){}

    public Street(int idStreet, int distance, int stopNumber) {
        this.idStreet = idStreet;
        this.distance = distance;
        this.stopNumber = stopNumber;
    }

    public int getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(int idStreet) {
        this.idStreet = idStreet;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(int stopNumber) {
        this.stopNumber = stopNumber;
    }
    public void inputStreet(){
        System.out.println("Nhap ma tuyen duong: ");
        this.idStreet = Auto_idStreet++;
        this.setIdStreet(new Scanner(System.in).nextInt());
        System.out.println("Nhap khoang cach: ");
        this.setDistance(new Scanner(System.in).nextInt());
        System.out.println("Nhap so diem dung: ");
        this.setStopNumber(new Scanner(System.in).nextInt());
    }

    @Override
    public String toString() {
        return "Tuyen duong {" +
                "Ma tuyen duong:" + idStreet +
                ", Khoang cach: " + distance +
                ", Diem dung:" + stopNumber +
                '}';
    }
    public void showStreet() {
        System.out.println(this);
    }
}
