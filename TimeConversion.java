import java.util.*;

class TimeConversion
{
	static String time(String s)
	{
		String result="";
		if('A'==s.charAt(8))
		{
		int val=Integer.valueOf(s.substring(0,2));
		
			if(val == 12)
			{
				result= "00"+s.substring(2,8);
			}
			else
			{
				result=s.substring(0,8);
		
			}
		
		}
		else
		{
			
			int val=Integer.valueOf(s.substring(0,2));
			
			if(val == 12)
			{
				result= s.substring(0,8);
				
			}
			if(val>12)
			{
				result= String.valueOf((val+11)) + s.substring(2,8);
				
			}	
			if(val<12)
			{
				result= String.valueOf((val+12)) + s.substring(2,8);
			}
			
		}
		
		
		return result;
	}
		
		
		
		
		
		
		
		
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		String s = x.next();
		String result;
		System.out.println(result = time(s));
		
	}
}