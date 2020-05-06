import java.util.*;

class TwoSets
{
	
	static int fun(int a[],int b[])
	{
		
		
		
int start =a[a.length-1],end=b[0];
int count1=0,count2 =0,result1=0,result2=0,result=0;
for(int i=start;i<=end;i++)
{
	count1=0;
	count2=0;
	
	for(int j=0;j<a.length;j++)
	{
		if(i%a[j] == 0)
		{
			count1=count1+1;
		}
	}
	if(count1==a.length)
	{
		result1++;
		for(int j=0;j < b.length;j++)
		{
			if(b[j]%i == 0)
			{
				count2=count2+1;
			}
		}
		if(count2==b.length)
		{
			result2++;
		}
	}
}
	
	

if(result1<result2)
{
	result = result1;
}
else
{
	result = result2;
}


return result;

	}
		
		
		
		
	
public static void main(String args[])
{
	Scanner x = new Scanner(System.in);
        
		int n = x.nextInt();
		int m = x.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[m];
		
		
		for(int i =0;i<n;i++)
		{
			a[i]=x.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=x.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
	
	
	int result;
	System.out.println((result = fun(a,b)));
	
}
}