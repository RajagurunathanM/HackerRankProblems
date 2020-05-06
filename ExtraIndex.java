import java.util.*;

class ExtraIndex
{
	static int findextra(int[] a,int[] b)
	{
		int result=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(bsearch(b,0,b.length-1,a[i]))
			{
				System.out.println("found");
				continue;
			}
			else
			{
				System.out.println("not found");
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	static boolean bsearch(int[] b,int l,int r,int key)
	{
		if(r>=l)
		{
			int m=(l+r)/2;
			
			if(b[m]==key)
			{
				return true;
			}
			else if(key<b[m])
			{
				return bsearch(b,0,m-1,key);
			}
			else
			{
				return bsearch(b,m+1,r,key);	
			}
		}
		
		return false;
	}
	
	
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6};
		int[] b={1,2,3,4,6};
		
		int result = findextra(a,b);
		System.out.println(result);
	}
}