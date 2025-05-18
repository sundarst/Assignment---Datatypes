package zsgsTask;

public class TypeConversions{

	public static void main(String[] args) 
	{
		double doubleValue=99.99;
		float floatValue= (float)doubleValue;
		int intValue= (int)floatValue;
		short shortValue=(short)intValue;
		
		System.out.println("Original double value: "+doubleValue);
		System.out.println(" Double to Float: "+ floatValue);
		System.out.println(" Float to Int: "+intValue);
		System.out.println("Int to short: "+shortValue);
		// double 64 bit
		// float is 32 bit so double has higher priority  unlike int also have 32 bit 
		// why use (int) use like this to avoid  precision loss large to small 
		

	}

}
/*
2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short


*/
