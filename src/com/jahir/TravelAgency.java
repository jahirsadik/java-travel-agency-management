package com.jahir;

import java.util.ArrayList;

public abstract class TravelAgency {
    private String company_id, company_name;
    private Integer budget;
    private String company_status;
    protected ArrayList<Bus> affiliates;

    protected TravelAgency(String company_id, String company_name, Integer budget, String company_status){
        this.company_id = company_id;
        this.company_name = company_name;
        this.budget = budget;
        this.company_status = company_status;
        affiliates = new ArrayList<>();
    }

    protected void addBudget(Integer amount){
        this.budget += amount;
    }

    protected abstract void withdraw(Integer amount);
    public abstract void addAffiliates(Bus b);

    public void removeAffiliate(String s){
        if(affiliates.removeIf(bus -> bus.getCompany_name().equals(s))){
            System.out.println(s + " was removed from " + company_name + "'s agency.");
        }else{
            System.out.println("WARNING: " + s + " was not found in " + company_name + "'s agency.");
        }
    };

    public void showAffiliates(){
        int count = 0;
        System.out.println("Affiliates of " + company_name + " are:");
        for (Bus affiliate: affiliates) {
            count++;
            System.out.println("\t\tAffiliate " + count + ": " + affiliate.getCompany_name());
        }
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", budget=" + budget +
                ", company_status='" + company_status + '\'' +
                ", affiliates=" + affiliates +
                '}';
    }

    // Protected getters and setters so only subclasses can use it
    protected void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    protected void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    protected void setBudget(Integer budget) {
        this.budget = budget;
    }

    protected void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    protected String getCompany_id() {
        return company_id;
    }

    protected String getCompany_name() {
        return company_name;
    }

    protected Integer getBudget() {
        return budget;
    }

    protected String getCompany_status() {
        return company_status;
    }

    public Integer getNumberOfAffiliates(){
        return affiliates.size();
    }
}
