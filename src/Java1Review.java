import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) 
	{
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	public static double divide(double d, double e) 
	{
		return d/e;
	}
	
	public static int divide(int d, int e) 
	{
		if(e != 0)
		{
			return d/e;
		}
		return d/e;
	}
	
	public static Boolean isDivisibleBy7(int x) 
	{
		if(x % 7 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String main (String string)
	{
		
		return "Overloaded main method was passed " + "\"" + string + "\".";
	}
	
	//Help from Jack Davis 
	public static int findMin (int x, int y, int z)
	{
		int a = 0;
		if(x < y && x < z)
		{
			a = x;
		}
		if(y < x && y < z)
		{
			a = y;
		}
		if (z < x && z < y)
		{
			a = z;
		}
		return a;
	}
	
	public static int findMin(int [] array)
	{
		int minimum = array[0];
		for(int i = 1; i < array.length; ++i)
		{
			if(minimum > array[i])
			{
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	public static double average(int [] array)
	{
		int x = array.length;
		int y = 0;
		for(int i = 0; i < array.length; ++i)
		{
			y = y +array[i];
		}
		double average = (double)y / (double)x;
		return average;
	}

	public static void toLowerCase(String[] strings) 
	{
		for(int i = 0; i < strings.length; ++i)
		{
			strings[i] = strings[i].toLowerCase();
		}

	}

	public static String[] toLowerCaseCopy(String[] strings) 
	{
		
		String[] array = new String[strings.length];
		for(int i = 0; i < strings.length; ++i)
		{
			array[i] = strings[i].toLowerCase();
		}
		return array;
	}

	public static int[] removeDuplicates(int[] array) 
	{
		for(int i = 0; i < array.length; ++i)
		{
			int k = array[i];
			
			for(int j = i + 1; j < array.length; ++j)
			{
				if (k == array[j]) 
				{	
					array[i] = 0;
					array[j] = 0;
				}
			}
		}
		return array;
	}
}
