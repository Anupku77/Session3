import java.util.Scanner;

public class Calculator {

	void FindValue(int operand1, char s, int operand2)
	{
		switch(s)
		{
			case '+': System.out.println("The value is "+ (operand1 + operand2));
		          	  break;
		          	  
			case '-': System.out.println("The value is "+ (operand1 - operand2));
	          break;
	        
			case '*': System.out.println("The value is "+ (operand1 * operand2));
	          break;
		     
			case '/': if(operand2 == 0)
					{
						System.out.println("Divide by zero error");
					}
					else
						System.out.println("The value is "+ (operand1 / operand2));
			          break;
			default: System.out.println("Enter correct operator");
					 break;
		}
	}
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter operand1,  operator and ");
		int number1 = inp.nextInt();
		
		char operator = inp.next().charAt(0);
		int number2 = inp.nextInt();
		 
		Calculator calculate = new Calculator();
		
		calculate.FindValue(number1, operator, number2);
		
		inp.close();
		
		
	}

}
