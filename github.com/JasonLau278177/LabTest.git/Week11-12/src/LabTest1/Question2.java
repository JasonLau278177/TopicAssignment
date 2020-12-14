package LabTest1;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter sales : RM" );
		double sales = scan.nextDouble();
		
		if(sales>=150.00 && sales<=300.00) {
			System.out.println("Enter hours worked : ");
			int hour;
			hour=scan.nextInt();
			double commissions = (sales*5)/100;
			double dailywages = commissions + (hour*5);
			System.out.println("Commissions : RM" + commissions);
			System.out.println("Daily wages : RM" + dailywages);
		}else if(sales>=301.00 && sales<=500.00) {
			System.out.println("Enter hours worked : ");
			int hour;
			hour=scan.nextInt();
			double commissions = (sales*10)/100;
			double dailywages = commissions + (hour*5);
			System.out.println("Commissions : RM" + commissions);
			System.out.println("Daily wages : RM" + dailywages);
		}else if(sales>500) {
			System.out.println("Enter hours worked : ");
			int hour;
			hour=scan.nextInt();
			double commissions = (sales*15)/100;
			double dailywages = commissions + (hour*5);
			System.out.println("Commissions : RM" + commissions);
			System.out.println("Daily wages : RM" + dailywages);
		}
		
	}

}
