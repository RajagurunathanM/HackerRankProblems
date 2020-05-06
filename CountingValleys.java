import java.util.*;

class CountingValleys
{
	static int fun(String s,int n)
	{
		int sum=0;
		int mark=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='U')
			{
				sum=sum+1;
				
			}
			if(ch[i]=='D')
			{
				sum=sum-1;
				
			}
			if(sum==0 && ch[i]=='U')
			{
				mark++;
			}
					
			
			
		}
		
		return mark;
	}
	
	
	public static void main(String args[])
	{
		String a ="DDUUDDUDUUUD";
		int result;
		
		System.out.println((result = fun(a,a.length())));
		
	}
	
	
}