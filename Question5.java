package zsgsTask;
import java.util.Scanner;
public class  Enum{

	public static void main(String[] args) {
		
		enum Weekday  {
			Sunday,Monday,Tuesday,Wendesday,Thursday,Friday,Saturday
			}
		// enum is key word use to get fixed set of daya
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to 7");
		int num=scan.nextInt();
		if(num>=1&&num<=7)
		{
			Weekday day =Weekday.values()[num-1];
			System.out.println("The day is:"+day);
		}
		else
		{
			System.out.println("Enter the correct day 1 To 7");
		}
		
		
		
	}
		

}
/*
5. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.


*/
