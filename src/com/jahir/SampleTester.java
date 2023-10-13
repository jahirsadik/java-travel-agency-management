package com.jahir;

public class SampleTester {

    public static void main(String[] args) {
        Bus b1, b2, b3, b4, b5, b6, b7, b8;
        b1 = new Bus("Ena", "Dhaka", "Mymensingh");
        b2 = new Bus("Hanif", "Dhaka", "Khulna");
        b3 = new Bus("SP Golden Line", "Dhaka", "Sakhira");
        b4 = new Bus("Eagle", "Dhaka", "Chuadanga");
        b5 = new Bus("Green Line", "Dhaka", "Cox's Bazar");
        b6 = new Bus("Nabil", "Dhaka", "Manikganj");
        b7 = new Bus("Saudia", "Dhaka", "Chittagong");
        b8 = new Bus("Kuakata Express", "Dhaka", "Kuakata");
        PremiumTravelAgency p1;
        BasicTravelAgency bt1;
        p1 = new PremiumTravelAgency("GoZayaan", 10000);
        bt1 = new BasicTravelAgency("TripAdvisor", 4000);
        b3.enrollAgency(bt1, b3);
        bt1.addAffiliates(b8);
        bt1.addAffiliates(b7);
        b2.enrollAgency(bt1, b2);
        bt1.addAffiliates(b4);
        b5.enrollAgency(bt1, b5);
        bt1.withdraw(500);
        p1.addAffiliates(b1);
        p1.addAffiliates(b3);
        p1.addAffiliates(b5);
        p1.withdraw(6000);
        System.out.println(b6);
        System.out.println(p1);
        System.out.println(bt1);
        bt1.removeAffiliate("Hanif");
        bt1.showAffiliates();
    }
}
