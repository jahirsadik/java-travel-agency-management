package com.jahir;

public class PremiumTravelAgency extends TravelAgency {
    private static Integer totalNoOfPremiumAgencies = 1;

    public PremiumTravelAgency(String company_name, Integer budget) {
        super(totalNoOfPremiumAgencies.toString(), company_name, budget, "Premium");
        totalNoOfPremiumAgencies++;
    }

    @Override
    public void addAffiliates(Bus b) {
        if(getNumberOfAffiliates() <= 7){
            affiliates.add(b);
        }else{
            System.out.println("WARNING: Premium Travel Agencies like " + getCompany_name() + " cannot have more than 7 affiliates.");
        }
    }

    @Override
    protected void withdraw(Integer amount) {
        if(amount > this.getBudget()/2){
            System.out.println("WARNING: " + this.getCompany_status() + " companies like " + this.getCompany_name() + " cannot withdraw more than half of the budget.");
        }else{
            Integer budget = this.getBudget();
            budget -= amount;
            this.setBudget(budget);
            System.out.println("Money(" + amount + ") withdrawn from " + this.getCompany_name() +"'s agency." +  "New Budget: " + this.getBudget().toString());
        }
    }
}


