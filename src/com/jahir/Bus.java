package com.jahir;


public class Bus{
    private static Integer totalBusNo = 1;
    private String company_id, company_name;
    private Route route;

    public Bus(String company_name, String start, String end) {
        this.company_name = company_name;
        this.route = new Route(start, end);
        this.company_id = totalBusNo.toString();
        totalBusNo++;
    }

    public void enrollAgency(BasicTravelAgency basicTravelAgency, Bus bus){
        basicTravelAgency.addAffiliates(bus);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", route=" + route +
                '}';
    }

    public static Integer getTotalBusNo() {
        return totalBusNo;
    }

    public String getCompany_id() {
        return company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public Route getRoute() {
        return route;
    }

    public static void setTotalBusNo(Integer totalBusNo) {
        Bus.totalBusNo = totalBusNo;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
