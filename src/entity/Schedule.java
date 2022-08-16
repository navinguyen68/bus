package entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Driver driver;
    private List<Street>streetList = new ArrayList<>();

    public Schedule(Driver driver, List<Street> streetList) {
        this.driver = driver;
        this.streetList = streetList;
    }
}
