import java.util.*;

class BeautifulDays
{
	static long fun(long val1,long val2,long d)
	{
		long result=0;
		
		for(long i=val1;i<=val2;i++)
		{
			long temp=i;	
			long rev=0;
			long l=0;
			if(i>9 && i<100) l=10;
			if(i>99 && i<1000) l=100;
			if(i>999 && i<10000) l=1000;
			if(i>9999 && i<100000) l=10000;
			if(i>99999 && i<1000000) l=100000;
			if(i>999999 && i<10000000) l=1000000;
			if(i>9999999 && i<100000000) l=10000000;
			long temp1=0;
			
			if(i>0 && i<9)
			{
				rev=i;
			}
			else
			{
			while(temp>0)
			{
				long r = temp%10;
				temp=temp/10;
				temp1 = (r*l);
				rev = temp1 + rev;
				l=l/10;
				
			}
			}
			
			if((Math.abs(i - rev)%d==0))
			{
				result++;
				
			}
				
		}
		
		if(val1>0 && val1<9)
		{
			result++;
		}
		
		
		return result;
	}
	
public static void main(String args[])
{
Scanner x = new Scanner(System.in);
long result ;
long val1,val2,d;

val1=x.nextLong();
val2=x.nextLong();
d=x.nextLong();


System.out.println(result = fun(val1,val2,d));	

}
}