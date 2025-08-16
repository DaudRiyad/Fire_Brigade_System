package controller;

public class PSOCoordinateUnitsController {
    PSOCoordinateUnitsController = String location, time

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PSOCoordinateUnitsController(String location, String time) {
        this.location = location;
        this.time = time;
    }

    @Override
    public String toString() {
        return "PSOCoordinateUnitsController{" +
                "location='" + location + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
