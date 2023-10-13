package com.jahir;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        ArrayList<Bus> busCompanies = new ArrayList<>();
        ArrayList<PremiumTravelAgency> premiumTravelAgencies = new ArrayList<>();
        ArrayList<BasicTravelAgency> basicTravelAgencies = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        Integer totalBusInput = 10, totalPremiumAgencyInput = 2, totalBasicAgencyInput = 3;
        System.out.println("Enter 10 Bus Company information: ");
        do{
            totalBusInput--;
            System.out.print("Enter bus name: ");
            String busName = myObj.nextLine();  // Read user input
            System.out.println("Bus name is: " + busName);
            System.out.print("Enter bus starting city: ");
            String start = myObj.nextLine();
            System.out.println("Bus starting city is: " + start);
            System.out.print("Enter bus destination city: ");
            String end = myObj.nextLine();
            System.out.println("Bus starting city is: " + end);
            busCompanies.add(new Bus(busName, start, end));
        }while(totalBusInput>0);
        System.out.println("Enter 2 Premium Agency information: ");
        do{
            totalPremiumAgencyInput--;
            System.out.print("Enter premium agency name: ");
            String agencyName = myObj.nextLine();  // Read user input
            System.out.println("Premium Agency name is: " + agencyName);
            System.out.print("Enter premium agency budget: ");
            int agencyBudget = myObj.nextInt();  // Read user input
            System.out.println("Premium Agency name is: " + agencyBudget);
            premiumTravelAgencies.add(new PremiumTravelAgency(agencyName, agencyBudget));
            agencyName = myObj.nextLine();  // Read user input
        }while(totalPremiumAgencyInput>0);
        System.out.println("Enter 3 Basic Agency information: ");
        do{
            totalBasicAgencyInput--;
            System.out.print("Enter basic agency name: ");
            String agencyName = myObj.nextLine();  // Read user input
            System.out.println("Basic Agency name is: " + agencyName);
            System.out.print("Enter basic agency budget: ");
            int agencyBudget = myObj.nextInt();  // Read user input
            System.out.println("Basic Agency name is: " + agencyBudget);
            basicTravelAgencies.add(new BasicTravelAgency(agencyName, agencyBudget));
            agencyName = myObj.nextLine();  // Read user input
        }while(totalBasicAgencyInput>0);

        boolean flag = false;
        do{
            System.out.println("Choose what you want to do: "
                                    + "\n\t1. Enroll Agency"
                                    + "\n\t2. Add Affiliates"
                                    + "\n\t3. Withdraw"
                                    + "\n\t4. Remove Affiliates"
                                    + "\n\t5. Show Affiliates"
                                    + "\n\t6. Quit.");
            int selection = myObj.nextInt();  // Read user input
            String temp = myObj.nextLine();
            if(selection == 1){
                System.out.print("Enter Bus Company name: ");
                String busName = myObj.nextLine();
                System.out.print("Enter Agency name: ");
                String agencyName = myObj.nextLine();
                Bus resultBus = busCompanies.stream().filter(bus -> bus.getCompany_name().equals(busName)).findFirst().orElse(null);
                BasicTravelAgency resultBasicAgency = basicTravelAgencies.stream().filter(bt -> bt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                if(resultBus != null){
                    if(resultBasicAgency != null){
                        resultBus.enrollAgency(resultBasicAgency, resultBus);
                    }else{
                        System.out.println("WARNING: No Basic Travel Agency With That Name");
                    }
                }else {
                    System.out.println("WARNING: No Bus Company With That Name");
                }
            }else if(selection == 2){
                System.out.print("Enter Bus Company name: ");
                String busName = myObj.nextLine();
                System.out.print("Enter Agency name: ");
                String agencyName = myObj.nextLine();
                Bus resultBus = busCompanies.stream().filter(bus -> bus.getCompany_name().equals(busName)).findFirst().orElse(null);
                PremiumTravelAgency resultPremiumAgency = premiumTravelAgencies.stream().filter(pt -> pt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                BasicTravelAgency resultBasicAgency = basicTravelAgencies.stream().filter(bt -> bt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                if(resultBus != null){
                    if(resultPremiumAgency != null){
                        resultPremiumAgency.addAffiliates(resultBus);
                    }else if(resultBasicAgency != null){
                        resultBasicAgency.addAffiliates(resultBus);
                    }else{
                        System.out.println("WARNING: No Travel Agency With That Name");
                    }
                }else {
                    System.out.println("WARNING: No Bus Company With That Name");
                }
            }else if(selection == 3){
                System.out.print("Enter Agency name: ");
                String agencyName = myObj.nextLine();
                System.out.print("Enter amount to withdraw: ");
                Integer amount = myObj.nextInt();
                PremiumTravelAgency resultPremiumAgency = premiumTravelAgencies.stream().filter(pt -> pt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                BasicTravelAgency resultBasicAgency = basicTravelAgencies.stream().filter(bt -> bt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                if(resultBasicAgency != null){
                    resultBasicAgency.withdraw(amount);
                }else if(resultPremiumAgency != null){
                    resultPremiumAgency.withdraw(amount);
                }else{
                    System.out.println("WARNING: No Travel Agency With That Name");
                }
            }else if(selection == 4){
                System.out.print("Enter Bus Company name: ");
                String busName = myObj.nextLine();
                System.out.print("Enter Agency name: ");
                String agencyName = myObj.nextLine();
                Bus resultBus = busCompanies.stream().filter(bus -> bus.getCompany_name().equals(busName)).findFirst().orElse(null);
                PremiumTravelAgency resultPremiumAgency = premiumTravelAgencies.stream().filter(pt -> pt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                BasicTravelAgency resultBasicAgency = basicTravelAgencies.stream().filter(bt -> bt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                if(resultBus != null){
                    if(resultPremiumAgency != null){
                        resultPremiumAgency.removeAffiliate(resultBus.getCompany_name());
                    }else if(resultBasicAgency != null){
                        resultBasicAgency.removeAffiliate(resultBus.getCompany_name());
                    }else{
                        System.out.println("WARNING: No Travel Agency With That Name");
                    }
                }else {
                    System.out.println("WARNING: No Bus Company With That Name");
                }
            }else if(selection == 5){
                System.out.print("Enter Agency name: ");
                String agencyName = myObj.nextLine();
                PremiumTravelAgency resultPremiumAgency = premiumTravelAgencies.stream().filter(pt -> pt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                BasicTravelAgency resultBasicAgency = basicTravelAgencies.stream().filter(bt -> bt.getCompany_name().equals(agencyName)).findFirst().orElse(null);
                if(resultBasicAgency != null){
                    resultBasicAgency.showAffiliates();
                }else if(resultPremiumAgency != null){
                    resultPremiumAgency.showAffiliates();
                }else{
                    System.out.println("WARNING: No Travel Agency With That Name");
                }
            }else if(selection == 6){
                flag = true;
            }else{
                System.out.println("Please Enter an integer to select option.");
            }
        }while(!flag);
    }
}
