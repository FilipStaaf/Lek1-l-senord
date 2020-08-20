
import java.util.Scanner;

public class Inalmningsuppgift1 
{

	public static void main(String[] args) 
	{
		final int TotalTryes = 3;
		boolean succes = false;

		for (int Tryes = 1; Tryes <= TotalTryes && !succes; Tryes++) 
		{
			System.out.print("Write your password:");
			Scanner reader = new Scanner(System.in);
			String PwTry = reader.nextLine();

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
