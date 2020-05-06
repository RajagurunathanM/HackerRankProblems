import java.io.*;
import java.util.*;

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) 
	{
		int[] dayscount = {31,28,31,30,31,30,31,31};
		int sum=0,month=1;
		for(int i=0;i<dayscount.length;i++)
		{
			month++;
			sum=sum+dayscount[i];
		}
		int day = 256 - sum;
		
		if(year>=1700 && year<=1917)
		{
			if(year%4==0)
			{
				System.out.println((day-1)+"."+month+"."+year);
			}
			else
			{
				System.out.println((day)+"."+month+"."+year);
			}
				
		}
		if(year>=1918 && year<=2700)
		{
			if((year%4==0 && year%100!=0) || (year%400==0))
			{
				System.out.println((day-1)+"."+month+"."+year);
			}
			else
			{
				System.out.println((day)+"."+month+"."+year);
			}
		}

		return "";

    }

    public static void main(String[] args)
	{
        Scanner x = new Scanner(System.in);
		int year = x.nextInt();
		
		String result=dayOfProgrammer(year);
		
		System.out.println(result);
			
    }
}
