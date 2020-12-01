import java.util.Scanner;

public class Register {

	String UserName, Email, PhoneNumber;
	String Password, ReTypePassword;

	public void details() {

		System.out.println("--Register Before Login--");
		System.out.println("Fill The Following Details Sequentially");
		Scanner input = new Scanner(System.in);
		System.out.print("User Name : ");
		UserName = input.nextLine();
		System.out.print("Email : ");
		Email = input.next();


		while(true)
		{
			System.out.print("Password : ");
			Password = input.next();
			System.out.print("Re-Type Password : ");
			ReTypePassword = input.next();
			if(!(Password.equals(ReTypePassword)))
			{
				System.out.println("Your Password doesnot match");

			}

			if(Password.contentEquals(ReTypePassword))

			{
				break;
			}
		}
		System.out.print("PhoneNumber : ");
		PhoneNumber= input.next();

		System.out.println("You are Successfully Registered");
	}

	public String getUserName() {
		return UserName;
	}

	public String getPassword() {
		return Password;
	}
}