package com.jahir;

public class BasicTravelAgency extends TravelAgency {
    private static Integer totalNoOfBasicAgencies = 0;

    public BasicTravelAgency(String company_name, Integer budget) {
        super(totalNoOfBasicAgencies.toString(), company_name, budget, "Basic");
        totalNoOfBasicAgencies++;
    }

    @Override
    public void addAffiliates(Bus b) {
        if(getNumberOfAffiliates() < 5){
            affiliates.add(b);
        }else{
            System.out.println("WARNING: Basic Travel Agencies like " + getCompany_name() + " cannot have more than 5 affiliates.");
        }
    }

    @Override
    protected void withdraw(Integer amount) {
        Integer budget = this.getBudget();
        if(amount > budget/4){
            System.out.println("WARNING: " + this.getCompany_status() + " companies like " + this.getCompany_name() + " cannot withdraw more than one fourth of the budget.");
        } else{
            budget -= amount;
            this.setBudget(budget);
            System.out.println("Money(" + amount + ") withdrawn from " + this.getCompany_name() +"'s agency." +  "New Budget: " + budget.toString());
        }
    }
}
