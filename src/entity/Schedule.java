package entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Driver driver;
    private List<StreetArange> streetArange = new ArrayList<>() ;
    public int roundTotal;// lượt và tổng số lượt bé hơn 15

    public Schedule(Driver driver, List<StreetArange> streetArange, int roundTotal) {
        this.driver = driver;
        this.streetArange = streetArange;
        this.roundTotal = roundTotal;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<StreetArange> getStreetArange() {
        return streetArange;
    }

    public void setStreetArange(List<StreetArange> streetArange) {
        this.streetArange = streetArange;
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
                ", streetArange=" + streetArange +
                ", roundTotal=" + roundTotal +
                '}';
    }
}

