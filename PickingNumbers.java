import java.util.*;

class PickingNumbers
{
	static void pick(int[] a)
	{
		Arrays.sort(a);
		
		ArrayList<Integer> item = new ArrayList<Integer>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++)
        {
            if( !(item.contains(a[i])) )
            {
                item.add(a[i]);
            }
        }

        for(int i=0;i<item.size();i++)
        {
            int c =0;

            for(int j=0;j<a.length;j++)
            {
                if( item.get(i) == a[j] )
                {
                    c++;
                }
            }

            count.add(c);
        }
		
		System.out.println(item);
		System.out.println(count);
		
		if(item.size() == 1)
		{
			System.out.println(count.get(0));
			return;
		}
		
		int x = Collections.max(count);
		
		int max = x;
		
		System.out.println("SINGLE MAX IS "+x);
		
		for(int i=0;i<item.size()-1;i++)
		{
			if( Math.abs(item.get(i) - item.get(i+1)) <= 1)
			{
				int sum = count.get(i) + count.get(i+1);
				
				if(sum > max)
				{
					max = sum;
				}
			}
		}
		
		System.out.println(max);
		
		
			
	}
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int n = x.nextInt();

		int[] a= new int[n];

		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
    
		pick(a);
		
	}
}
		