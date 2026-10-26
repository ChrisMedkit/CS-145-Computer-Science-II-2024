import java.util.Scanner;

public class ReadInputIntegerMain {

	public static void main(String[] args) {
		Scanner keybaord = new Scanner (System.in);
		int score = 0;
		
		do {
			System.out.println("Enter a score out of 100 (-1 to exit): ");
			
			score = keybaord.nextInt();
			System.out.println("You entered " +score);
			int divisible = 100/score;
			System.out.println("Divisible is " + divisible);
			
		}
		while (score >= 0);
		
		System.out.println("Thank you and goodbye");
		
	}

}
