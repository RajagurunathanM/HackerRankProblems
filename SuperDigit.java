import java.util.*;
import java.math.*;

class SuperDigit
{
	static void fun(String s)
	{
			if(s.length() == 1)
			{
				System.out.println(s);
				return;
			}
			else
			{
				BigInteger val = new BigInteger("0");
				char[] ch = s.toCharArray();
				
				for(int j=0;j<ch.length;j++)
				{
					int d = ch[j] - '0';
					String x = String.valueOf(d);
					
					val = val.add( new BigInteger(x));
					
					//val = val + Long.valueOf( (ch[j] - '0') );
				}
				
				String temp = String.valueOf(val);
				
				//System.out.println(temp);
				
				s = temp;
				
				fun(s);
			}
		
	}
			
	static String combine(String temp,String n,long k)
	{
		if(k==0)
		{
			return temp;
		}
		else
		{
			temp = temp + n;
			k--;
			return combine(temp,n,k);
		}
		
	}
		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		String n = x.next();
		long k = x.nextLong();
		String s ="";
		
		s = combine(s,n,k);
		
		System.out.println(s);
		
		//fun(s);
		
	}
}
		