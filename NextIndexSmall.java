import java.util.*;

class NextIndexSmall
{
	static void nextsmall(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]<a[i])
			{
				System.out.print(a[i+1]);
			}
			else
			{
				System.out.print(-1);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
			int N = scan.nextInt();
			int[] a = new int[N];
			
			for(int i=0;i<N;i++)
			{
				a[i]= scan.nextInt();
			}
			
			nextsmall(a);
			
			System.out.println();
			
			t--;
		}
	}
}