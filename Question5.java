package zsgsTask;
import java.util.Scanner;
public class Question5 {

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
