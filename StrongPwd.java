import java.util.*;

class StrongPwd
{
	static void check(String s)
	{
		char[] ch = s.toCharArray();
		
		int lower = 0;
		int upper = 0;
		int number = 0;
		int symbol = 0;
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				lower++;
				System.out.println("lower case");
			}
			if(ch[i]>='A' && ch[i]<='Z')
			{
				upper++;
				System.out.println("Upper case");
			}
			if(ch[i]=='!' || ch[i]=='@' || ch[i]=='#' ||  ch[i]=='$' ||  ch[i]=='%' || ch[i]=='^' || ch[i]=='&' || ch[i]=='*' || ch[i]=='-' || ch[i]=='+' || ch[i]=='(' || ch[i]==')')                                
			{
				symbol++;
				System.out.println("Special Character");
			}
			if(ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='6' || ch[i]=='7' || ch[i]=='8' || ch[i]=='9' || ch[i]=='0')
			{
				number++;
				System.out.println("Numbers");
			}
			
		}
		
			int count =0;
			if(lower==0)
			{
				count++;
			}
			if(upper==0)
			{
				count++;
			}
			if(symbol==0)
			{
				count++;
			}
			if(number==0)
			{
				count++;
			}
			
			System.out.println("lower"+lower);
			System.out.println("upper"+upper);
			System.out.println("symbol"+symbol);
			System.out.println("number"+number);
			
			
			if(ch.length < 6)
			{
				int diff = 6-ch.length;
				
				if(diff < count)
				{
					System.out.println(count);
				}
				else
				{
					System.out.println(diff);
				}
			}
			else
			{
				System.out.println("Add "+count);
			}

			
			
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		String s = x.next();
		
		check(s);
	}
}