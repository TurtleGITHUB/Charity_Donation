// Exercise chapter 5 238-239

import java.util.Scanner;

public class Volunteer
{
	public static void main(String[] args)
	{
		// variables and constants
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

		// input phase
		System.out.println("what type of donation is this?");
		System.out.println("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, " + OTHER_CODE + " for anything else >> ");
		donationType = input.nextInt();

		// this loop will check if the donationType is within the range of our menu choice, if not it will prompt user for a different input
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
			System.out.println("You entered " + donationType + " which is not a valid donation type");
			System.out.println("Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + "... ");
			System.out.println("Enter an integer... ");
			donationType = input.nextInt();
		}

		// calculation phase
		switch(donationType)
		{
			case(CLOTHING_CODE):
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			}
			case(FURNITURE_CODE):
			{
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE):
			{
				volunteer = ELECTRONICS_PRICER;
				message = "a electronics donation";
				break;
			}
			case(OTHER_CODE):
			{
				volunteer = OTHER_PRICER;
				message = " another donation type";
				break;
			}
			default:
			{
				volunteer = "invalid";
				message = "an invalid donation type";
			}
		}
		
		//output phase
		System.out.println("You entered " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}
}
