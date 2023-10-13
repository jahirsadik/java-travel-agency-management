# Travel Agency Management System
This Java program is a simple console-based application that manages travel agencies and bus companies. The application allows users to perform various operations such as enrolling an agency, adding affiliates, withdrawing an amount, removing affiliates, and showing affiliates.

## Classes
The program consists of several classes:
- Bus: Represents a bus company with properties such as company name, starting city, and destination city.
- PremiumTravelAgency: Represents a premium travel agency with properties such as company name and budget. It can add or remove bus companies as affiliates.
- BasicTravelAgency: Represents a basic travel agency with properties such as company name and budget. It can add or remove bus companies as affiliates.

## Features
The main features of the application are:

- Enroll Agency: Enrolls a basic travel agency to a bus company.
- Add Affiliates: Adds a bus company as an affiliate to either a premium or basic travel agency.
- Withdraw: Withdraws an amount from either a premium or basic travel agency’s budget.
- Remove Affiliates: Removes a bus company from the affiliates of either a premium or basic travel agency.
- Show Affiliates: Shows the affiliates of either a premium or basic travel agency.

The application continues to run until the user chooses to quit.
Please note that this is a console-based application and requires user interaction for data input.

## How to Run
To run this program, you need to have Java installed on your machine. Open your terminal/command prompt, navigate to the directory containing the Tester.java file, and compile the program using the javac Tester.java command. Then, run the program using the java Tester command.
Please replace <input> with your actual input in the following examples:
```
Enter 10 Bus Company information:
Enter bus name: <input>
Enter bus starting city: <input>
Enter bus destination city: <input>
...
```

