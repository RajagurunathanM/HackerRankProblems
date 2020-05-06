import java.util.*;

class SeqEq
{
	public static void main(String args[])
	{
		int[] a={5,2,1,3,4};
		
		int pos1=0;
		int z=0;
		
		int[] b = new int[a.length];
		for(int i=1;i<50;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					pos1=j+1;
					
					for(int k=0;k<a.length;k++)
					{
						if(pos1==a[k])
						{
							//System.out.print((k+1) +" ");
							//al.add(k+1);
							b[z]=k+1;
							z++;
						}
					}
					
				}	
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}


        
		
				
	}
}