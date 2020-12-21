package Assignment1;
import java.util.Scanner;
public class StudentFees {

	public static void main(String[] args) {
		
		int semester,age,matric;
		
		Scanner in = new Scanner (System.in);

		System.out.print("Your name: ");
		String name = in.nextLine();
		
		System.out.print("Your Matric Number: ");
		matric = in.nextInt();
		
		System.out.print("Your semester: ");
		semester = in.nextInt();
		
		System.out.print("Your program: ");
		String program = in.next();
		
		System.out.println("----Your Details----");
		System.out.println("Name: " + name);
		System.out.println("Matric Number: " + matric);
		System.out.println("Semester: " + semester);
		System.out.println("Program: " + program);
	
		Scanner input = new Scanner(System.in);
		double sport = 30.00;
		double dental = 20.00;
		double health = 30.00;
		double library = 35.00;
		double welfare = 13.00;
		double tuition = 660.00;
		double registration = 634.00;
		double ICT = 75.00;
		double transportation = 80.00;
		double medical_checkup = 80.00;
		double retake = 100.00;
		double i;
		double sum1 = sport + dental + health + library + welfare + tuition + registration + ICT + transportation + medical_checkup + retake;
		
		System.out.println("Please choose the items: sport \n dental \n health \n library \n welfare \n tuition \n registration \n ICT \n transportation \n medical check-up \n retake ");
		double description = input.nextDouble();
		Scanner read = new Scanner(System.in);
		if (description <= 11)
			{
       
                for(i = 0; i < description; i++ )
           
                    System.out.println("End Year Balance " + sum1);
				
				
			}
	}
}
