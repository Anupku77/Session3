import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class CheckPrime {

	void CheckForPrime(int num)
	{
		if(num == 1)
		{
			System.out.println("The number is neither prime nor composite");
		}
		else
		{
			int count = 0;
			for(int i = 2; i <= num/2 ; i++)
			{
				if(num % i == 0)
				{
					count = 1;
					break;
				}
			}
			if(count != 1)
			{
				System.out.println(num +" is prime");
			}
			else
			{
				System.out.println(num+" is composite");
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner number = new Scanner(System.in);
		CheckPrime FindPrime = new CheckPrime();
		
		FindPrime.CheckForPrime(number.nextInt());
		
		number.close();

	}

}
