import java.util.*;

class StrangeCounter
{
	static int timeCounter(int t)
	{
		int fixedtime=3;
		int time =1,value =3;
		int result=0;
		
		if(t==1)
		{
			result = 3;
		}
		
		else
		{
		
	    aa:while(time<=t)
		{
			while(value>=1)
			{
				System.out.println(time+"   "+value);
				time++;
				value--;
				result = value;
				
				if(time == t)
				{
					if(value == 0)
					{
						value=2*fixedtime;
						result=value;
						break aa;
					}
					
					break aa;
				}
				
				
			}
		
			value=2*fixedtime;
			fixedtime = value;
			
		}
		}
		
		return result;
	}
			
	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int result = timeCounter(t);
		
		System.out.println(result);
	}
}