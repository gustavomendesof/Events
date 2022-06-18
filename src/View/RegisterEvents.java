package View;

import java.util.Scanner;

public abstract class RegisterEvents {
    Scanner sc = new Scanner(System.in);

    private String nameEvent, placeEvent, info, startTime, finalTime;
    private int capacity;

    public RegisterEvents() {}

    public RegisterEvents(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity) {
        this.nameEvent = nameEvent;
        this.placeEvent = placeEvent;
        this.info = info;
        this.startTime = startTime;
        this.finalTime = finalTime;
        this.capacity = capacity;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getPlaceEvent() {
        return placeEvent;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPlaceEvent(String placeEvent) {
        this.placeEvent = placeEvent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
