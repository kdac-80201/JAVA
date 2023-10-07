import java.util.Scanner;

public class Assign_1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		double first = sc.nextDouble();
		System.out.println("Enter Second value: ");
		double second = sc.nextDouble();
		
		
		if(first%1 != 0 && second%1 != 0) {
			System.out.println("Average of two doubles is: "+((first+second)/2));
		}
		else
			System.out.println("Please enter double values. PROGRAM TERMINATED! ");
		
		sc.close();
		
	}

}
