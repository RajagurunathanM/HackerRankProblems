import java.util.*;

class Socks
{
	public static void main(String args[])
	{
		int[] a={1,2,1,2,1,3,2};
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				break;
			}
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==0)
				{
				    break;
				}
			
				
				if(a[i]==a[j])
				{
					a[i]=0;
					a[j]=0;
					count++;
				}
				i=j;
			}

		}
		System.out.println(count);
				
	}
}
