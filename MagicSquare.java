import java.util.*;

class MagicSquare
{
	static void magic(int[][] a)
	{
		int min =1000000;
		
		for(int i=0;i<3;i++)
		{
			int sum = 0;
			for(int j=0;j<3;j++)
			{
				sum = sum + a[i][j];
			}
			if(sum < min)
			{
				min = sum;
			}
		}
		
		
		for(int i=0;i<3;i++)
		{
			int sum = 0;
			for(int j=0;j<3;j++)
			{
				sum = sum + a[i][j];
			}
			
			if(sum == min)
			{
				continue;
			}
			else
			{
				for(int k=0;k<3;k++)
				{
					int add =0;
					for(int l=0;l<3;l++)
					{
						add = add + a[l][k];
					}
					
					int diff = Math.abs(add - min);
					
					if(diff != 0)
					{
						a[i][k] = a[i][k]-diff;
					}
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			int s=0;
			for(int j=0;j<3;j++)
			{
				s = s+ a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println(s);
		}
		
		
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int[][] a= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j] = x.nextInt();
			}
		}
		
		magic(a);
	}
}