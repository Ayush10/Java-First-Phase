import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String password;
		String username;
		Register obj = new Register();
		obj.details();
		String user = obj.UserName;
		String pass = obj.Password;
		
		
	

		do
		{
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter Username : ");
			username = input1.next();

			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter Password : ");
			password = input2.next();
			
			

			if (user.equals(username) && pass.equals(password)) {

				System.out.println("You are Logged in!");
				System.out.println(" Welcome!");
				break;
			}

			else if (user.equals(username)) {
				System.out.println("Invalid Password!");
			} 
			else if (pass.equals(password)) {
				System.out.println("Invalid Username!");
			} 
			else {
				System.out.println("Invalid Username & Password!");
			}

		}while(true);
	}
}