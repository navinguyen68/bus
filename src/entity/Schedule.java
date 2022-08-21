package entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Driver driver;
    private Street street;
    public int roundTotal;// lượt và tổng số lượt bé hơn 15
    public Schedule(Driver driver, Street street, int roundTotal) {
        this.driver = driver;
        this.street = street;
        this.roundTotal = roundTotal;
    }

    public Schedule() {

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public int getRoundTotal() {
        return roundTotal;
    }

    public void setRoundTotal(int roundTotal) {
        this.roundTotal = roundTotal;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                ",idDriver=" + driver.getId() +
                ",nameDriver =" + driver.getName()+
                ", idstreet=" + street.getIdStreet() +
                ", roundTotal=" + roundTotal +
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
}
