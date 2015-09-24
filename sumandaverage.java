import java.util.Scanner;

public class sumandaverage {
	
		public static void main(String[] args){
			double n1 = 0.0;
			double n2 = 0.0;
			double n3 = 0.0;
			double n4 = 0.0;
			double n5 = 0.0;
			
			System.out.println("Enter five numbers and I will calculate the sum and average.");
			
			Scanner keyboard = new Scanner(System.in);
//			System.out.println("Enter n1");
			n1 = keyboard.nextDouble();
//			System.out.println("Enter n2");
			n2 = keyboard.nextDouble();
//			System.out.println("Enter n3");
			n3 = keyboard.nextDouble();
//			System.out.println("Enter n4");
			n4 = keyboard.nextDouble();
//			System.out.println("Enter n5");
			n5 = keyboard.nextDouble();
			double sum = n1+n2+n3+n4+n5;
			double avg = (n1+n2+n3+n4+n5)/5;
			double max = Math.max( n1, Math.max( n2, Math.max(n3, Math.max(n4, n5))));
			double min = Math.min( n1, Math.min( n2, Math.min(n3, Math.min(n4, n5))));
			System.out.println("The sum is " + sum + "\n" + "The average is " + avg + "\n" +
			 "The maximum value is " + max + "\n" + "The minimum value is " + min);
			
		}

}
