import java.util.Scanner;

public class SqrtCbrt {

	double number;
	void SquareRoot()
	{
		System.out.println("Square root of the number is: "+ Math.sqrt(number) );
	}
	
	void CubeRoot()
	{
		System.out.println("Cube root of the number is: "+ Math.cbrt(number));
	}
	public static void main(String[] args) {
		
		SqrtCbrt SqrCb =  new SqrtCbrt();
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		SqrCb.number = input.nextDouble();
		
		//Getting the square root
		SqrCb.SquareRoot();
		
		//Getting the cube root
		SqrCb.CubeRoot();
		
		input.close();
	}

}
