package zsgsTask;

public class Question4 {

	public static void main(String[] args) 
	{
		int x=10;
		int y=15;
		
		System.out.println("Before swap");
		System.out.println("X"+x);
		System.out.println("Y"+y);
		
		int temp = x;
		x=y;
		y=temp;
		System.out.println("After swap");
		System.out.println("X"+x);
		System.out.println("Y"+y);
	}

}
