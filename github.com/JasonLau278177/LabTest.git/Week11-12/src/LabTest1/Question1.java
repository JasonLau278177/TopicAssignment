package LabTest1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of item(s): ");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		if (a<=3) {
		System.out.println("Your number of items: " + a);
		}	else {
			System.out.println("You have exceed the maximum number of purchase.");
		}	
		
		System.out.println("Please enter the price of first item: " );
		double b=in.nextDouble();
		System.out.println("Price of first item: " + b);
		
		System.out.println("Please enter the quantity of first item: ");
		int c=in.nextInt();
		System.out.println("Quantity of first item: " + c);
		
		System.out.println("Please enter the price of second item: " );
		double d=in.nextDouble();
		System.out.println("Price of second item: " + d);
		
		System.out.println("Please enter the quantity of second item: ");
		int e=in.nextInt();
		System.out.println("Quantity of second item: " + e);
		
		System.out.println("Please enter the price of third item: ");
		double f=in.nextDouble();
		System.out.println("Price of third item: " + f);
		
		System.out.println("Please enter the quantity of third item: ");
		int g=in.nextInt();
		System.out.println("Quantity of third item: " + g);
		
		double discount,price,totalprice;
		price = (b*c)+(d*e)+(f*g);
		if (price>100) {
			discount = (price*0.2);
		}
		else {
			discount =(price*0.1);
		}
		totalprice = (price-discount);
		System.out.println("Total price : RM " + price);
		System.out.println("Discount received : RM " + discount);
		System.out.println("Price to be paid : RM " + totalprice);
		
	}

}
