package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
    private Driver driver;
    private List<Street>streetList = new ArrayList<>();

    public Schedule(Driver driver, List<Street> streetList) {
        this.driver = driver;
        this.streetList = streetList;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Street> getStreetList() {
        return streetList;
    }

    public void setStreetList(List<Street> streetList) {
        this.streetList = streetList;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "driver=" + driver +
                ", streetList=" + streetList +
                '}';
    }

    public void registerInfo(){
        ArrayList<Driver> schedulearr = new ArrayList<>();
        Driver driver1 = new Driver();
        driver1.inputinfo();
        schedulearr.add(driver1);
        System.out.println("Nhap thong tin tuyen duong muon dang ky: ");
        Street street1 = new Street();
        street1.inputStreet();
    }
    public void showSchedule(){
    System.out.printf("%-5d %-20s \n", driver, streetList, toString());3
    }
}
