import java.util.Scanner;

public class contactInfo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");

		String name = input.nextLine();

		System.out.println("Enter your last name.");

		String lastName = input.nextLine();

		System.out.println("My name is " + name + " " + lastName + "!");

		System.out.println("Enter your phone number.");

		String phoneNumber = input.nextLine();

		System.out.println("My name is " + name + " " + lastName + " and my phone number is " + phoneNumber);

		System.out.println("Enter you're birthday.");

		String birthday = input.nextLine();

		System.out.println("My name is " + name + " " + lastName + ". My phone number is " + phoneNumber
				+ ", and my birthday is, " + birthday + "!!");

		input.close();
	}

}
