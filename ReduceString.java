import java.util.*;

class ReduceString
{
	static String reduce(String s)
	{
		char[] ch = s.toCharArray();
		
		for(int j=0;j<ch.length*2;j++)
		{
			ch = s.toCharArray();
		
		for(int i=0;i<(ch.length-1);i++)
		{
			if(ch[i]!='0')
			{
				if(ch[i]==ch[i+1])
				{
					ch[i]='0';
					ch[i+1]='0';
				}
			}
			
		}
		
		s ="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
			{
				s=s+ch[i];
			}
		}
		
		
		}
		
		/*for(int j=0;j<ch.length;j++)
		{
			ch = s.toCharArray();
		
		for(int i=0;i<(ch.length-1);i++)
		{
			if(ch[i]!='0')
			{
				if(ch[i]==ch[i+1])
				{
					ch[i]='0';
					ch[i+1]='0';
				}
			}
			
		}
		
		s ="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
			{
				s=s+ch[i];
			}
		}
		
		
		}*/
		
		
		
		
		
		String result ="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
			{
				result = result+ch[i];
			}
		}
		
		return result;
		
	}
		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		String s = x.next();
		
		String result = reduce(s);
		
		System.out.println(result);
		
	}
}