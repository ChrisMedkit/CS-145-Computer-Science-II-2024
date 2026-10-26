import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String email ="";
		do {
			System.out.print("Enter email address (exit to leave): ");
			email = keyboard.next();
			
			try {
				checkEmail(email);
				System.out.println("You eentered " + email);
			} catch (EmailFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("You enterned " +email);
			
		}while( !email.equals("exit"));
		System.out.println("Thank you and goodbye");
		keyboard.close();
	}
	public static void checkEmail(String emai) throws EmailFormatException {
		
		String email = null;
		int indexOfAt = email.indexOf('@');
		if(indexOfAt < 0)
			throw new EmailFormatException("Missing expected @ symbol");
		
		int indexDot = email.lastIndexOf('.');
		if(indexDot < indexOfAt)
			throw new EmailFormatException("Missing expected @ symbol");
		
		}
	}


