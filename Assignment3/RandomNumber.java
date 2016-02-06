
public class RandomNumber {

	int GetRandNumber(int num)
	{
		
		return  (int)(Math.random() * num); 
	}
	public static void main(String[] args) {
		
		RandomNumber GetNumber = new RandomNumber();
		System.out.println(GetNumber.GetRandNumber(100));
		
	}

}
