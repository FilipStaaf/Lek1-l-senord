
import java.util.Scanner;

public class Inalmningsuppgift1 
{

	public static void main(String[] args) 
	{
		// a variable that sets a value of 3, which will be used for setting a limit of attempts.
		final int TotalTryes = 3;
		// a boolean for the for loop later used.
		boolean succes = false;
		// a for loop that counts the inputs attempts done by the user.
		for (int Tryes = 1; Tryes <= TotalTryes && !succes; Tryes++) 
		{
			System.out.print("Write your password:");
			// method for reading the user's inputs and saving the input as a value in a variable.
			Scanner reader = new Scanner(System.in);
			String PwTry = reader.nextLine();
			/* if statement that sends a message that tells if the password the user typed in was correct or not.
			 for every attempt made by the user the TotalTries Int variable will decrease by 1 integer.
			 if the input from the user is the correct password, the boolean will become true and the loop will end. 
			 */
			if (!(PwTry.equals("kennypowers"))) 
			{
				System.out.println("Wrong password, please try again!\t" + "\n" + ((Tryes - TotalTryes) * (-1)) + " "
						+ "Attempts remaining");
			} else 
			{
				System.out.println("Congratulations you wrote the correct password!");
				succes = true;
				reader.close();
			}

		}

	}

}
