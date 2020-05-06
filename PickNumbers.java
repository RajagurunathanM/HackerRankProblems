import java.util.*;

class PickNumbers
{

static int pickcount(int[] a)
{
	Arrays.sort(a);
	int max1=0,max2=0;
	
	for(int i=0;i<a.length;i++)
	{
		max2=0;
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]-a[j] <=1)
			{
				max2++;
			}
		}
		
		if(max2>max1)
		{
			max1=max2;
		}
	}
	
	return max1;
	
}

public static void main(String args[])
{
	Scanner x = new Scanner(System.in);
	int s = x.nextInt();
	int[] a = new int[s];
	
	for(int i=0;i<s;i++)
	{
		a[i] = x.nextInt();
	}
	int result = pickcount(a);
	
	for(int i=0;i<s;i++)
	{
		System.out.print(a[i]+ " ");
	}
	
	System.out.println();
	System.out.println(result);
}
}
	
	