import java.util.Scanner;
public class ArrayMethods {

	public static void main(String[] args) {
	
		System.out.println("------Question 1-------");
		System.out.println("Welcome to join UUM");
		
		String sem1[] = {"Sport, Dental, Health, Library, Tuition, Welfare, Registration, Computer/ICT, Transportation, Medical Check-Up"};
		String price1[] = {"30,20,30,35,660,13,634,75,80,80"};
		
		System.out.println("\n" + "Description of fees: ");
		for (String fees : sem1) {
			System.out.println(fees);
			
		System.out.println("\n" + "Price of fees: ");
		for (String price : price1) {
			System.out.println(price);
		}
		}
		
	

		System.out.println("------Question 2-------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 if you retaking exam");
		int sem = scan.nextInt();
		System.out.println("Student Fees: RM993");
}
}