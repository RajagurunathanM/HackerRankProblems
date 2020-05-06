import java.util.*;

class RepeatString
{
	static long repeat(String s,long n)
	{
		long count=0;
		
		while(s.length() < n)
		{
			s=s+s;
		}
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				count++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		String s = x.next();
		long n = x.nextLong();
		
		long result = repeat(s,n);
		System.out.println(result);
	}
}
