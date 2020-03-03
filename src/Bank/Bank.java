package Bank;

import java.util.Scanner;

public class Bank {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name, gender, address, education;
	double rate;
	System.out.println("---------------Welcome To BanK----------------\n");
	System.out.println("----------Please Select your Choice------------\n");
	System.out.println("1.Home Loan \n2.Education Loan");
	do{
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Rate of interest for Home Loan = 5.0%");
			rate = 5.0; break;
			}
		else if(choice == 2) {
			System.out.println("Rate of interest for Home Loan = 3.0%");
			rate = 3.0; break;
			}
		else
			System.out.println("Invalid Input: Please Enter valid choice");
		}
	while(true);
	System.out.println("--------Thank You for Connecting: Enter Personal details:------");
	System.out.println("Name:");
	name = sc.next();
	System.out.println("Gender(Male/Female):");
	gender = sc.next();
	System.out.println("Age(>30):");
	int age = sc.nextInt();
	if(age<30){
		System.out.println("your Age is not valid: Underage");
		}
	System.out.println("Address(city,state,country):");
	address = sc.next();
	String country = address.split(",")[2];
	if(!country.equals("India")) {
		System.out.println("We Don't have any branch in your Country");
		System.exit(0);
		}
	System.out.println("------Thank you For Details----------\n");
	System.out.println("Please Enter Amount :");
	double amount = sc.nextLong();
	System.out.println("Please Enter loan Time(In years):");
	int time = sc.nextInt();
	System.out.println("Please Enter Education details:\n1.Graduate\n2.UnderGraduate\n3.PostGraduate");
	int ch  = sc.nextInt();
	
	if(ch == 1) {
		System.out.println("Congratulations!!:You are Eligible for Loan\n");
		}
	else if(ch == 2) {
		System.out.println("Congratulations!!:You are Eligible for Loan\n");
		}
	else if(ch == 3) {
		System.out.println("Congratulations!!:You are Eligible for Loan\n");
		}
	else
		System.out.println("Invalid Input:Not Valid for loan");

	System.out.println("\n------------------------------------EMI Chart:-----------------------------\n");
	double y = Math.pow((1+rate/100),time);
        double x = amount*rate*y/100;
        double EMI = Math.round(x / (y-1));
        double CB = amount;
        System.out.printf("%10s %15s %10s %22s %22s %18s", "Year", "Opening Balance", "EMI", "Interest paid yearly", "Principal paid yearly", "Closing Balance");
        System.out.println();
        for(int i=0; i<time; i++) {
        	int year = i+1;
        	double OB = (CB);
        	double interest = (CB*rate/100);
        	double Amount = EMI - interest;

        	if(CB - Amount < 0)
        		Amount = CB;
        	CB = (CB - Amount);

System.out.printf("%10d %15d %10d %22d %22d %18d", (long)year, (long)OB, (long)EMI, (long)interest, (long)Amount, (long)CB);
System.out.println();
}
sc.close();
}

}

