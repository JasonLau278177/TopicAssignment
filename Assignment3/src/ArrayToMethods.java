
public class ArrayToMethods {

	public static void main(String[] args) {
		System.out.println("------Question 3-------");
		welcome();
		newstudent(30,20,30,35,660,13,634,75,80,80);
		registeredstudent(1657,634,80);
		retakestudent(1657,634,80,50);

	}
	public static void welcome() {
		System.out.println("\n" + "Welcome to study in UUM");
	}
	
	public static void newstudent(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		System.out.println("Total student fees (New Student):" + (a + b + c + d + e + f + g + h + i + j));
	}
	public static void registeredstudent(int a, int b, int c) {
		System.out.println("Total student fees (Sem 2 above):" + (a - b - c));
	}
	public static void retakestudent(int a, int b, int c, int d) {
		System.out.println("Total student fees (Student retaking exam):" + ((a - b - c) + d));
	}
}	
