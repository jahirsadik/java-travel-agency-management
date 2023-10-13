package com.jahir;

public class Route {
    private String startingPlace;
    private String endingPlace;

    public Route(String startingPlace, String endingPlace) {
        this.startingPlace = startingPlace;
        this.endingPlace = endingPlace;
    }

    public String getStartingPlace() {
        return startingPlace;
    }

    public String getEndingPlace() {
        return endingPlace;
    }

    public void setStartingPlace(String startingPlace) {
        this.startingPlace = startingPlace;
    }

    public void setEndingPlace(String endingPlace) {
        this.endingPlace = endingPlace;
    }

    @Override
    public String toString() {
        return "Route{" + startingPlace + " to " + endingPlace + '}';
    }
}
