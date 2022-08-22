package entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Driver driver;
   List<StreetArange> streetAranges = new ArrayList<>() ;
    public int roundTotal;// lượt và tổng số lượt bé hơn 15

    public Schedule(Driver driver, List<StreetArange> streetArange, int roundTotal) {
        this.driver = driver;
        this.streetAranges = streetArange;
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

    public List<StreetArange> getStreetArange() {
        return streetAranges;
    }

    public void setStreetArange(List<StreetArange> streetArange) {
        this.streetAranges = streetArange;
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
                "driver=" + driver +
                ", streetArange=" + streetAranges +
                ", roundTotal=" + roundTotal +
                '}';
    }
}

