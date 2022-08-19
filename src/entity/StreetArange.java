package entity;

public class StreetArange {
    private Street streets;
    private int round;

    public StreetArange(Street streets, int round) {
        this.streets = streets;
        this.round = round;
    }

    public Street getStreets() {
        return streets;
    }

    public void setStreets(Street streets) {
        this.streets = streets;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}

