package zsgsTask;
import java.util.Scanner;
public class AverageWeight {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number");
		int num=10;
		int []arr=new int[num];
		int sum=0;
		System.out.println("Enter the 10 people weight");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
			
			
			
		}
		double avg= (double)sum/num;
		System.out.println("Average weight of 10 people: "+avg);
	}

}
/*
6. Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.

*/
