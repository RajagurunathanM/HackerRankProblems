import java.util.*;

class MissingNumber
{
	static boolean bsearch(int[] a,int l,int r,int key)
	{
		if(r>=l)
		{
			int m =(l+r)/2;
			if(a[m]==key)
			{
				return true;
			}
			else if(key < a[m])
			{
				return bsearch(a,l,m-1,key);
			}
			else
			{
				return bsearch(a,m+1,r,key);
			}
		}
		
		return false;
	}
		
		
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t =x.nextInt();
		
		for(int z=0;z<t;z++)
		{
			int n =x.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n-1;i++)
			{
				a[i]=x.nextInt();
			}
			for(int i=1;i<=n;i++)
			{
				boolean result = bsearch(a,0,n-1,i);
				if(result==true)
				{
					continue;
				}
				else
				{
					System.out.println(i);
					break;
				}
			}
		}
		
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		