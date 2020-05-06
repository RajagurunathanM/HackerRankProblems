import java.util.*;

class Solution
{
    static int maxcount(int a[])
    {
       int[] b = new int[5];
	   for(int i=0;i<a.length;i++)
	   {
		   b[a[i]]=b[a[i]]+1;
	   }
	   
	   for(int i=0;i<b.length;i++)
	   {
		   System.out.println(b[i]);
	   }
	   
	   
	 return 0; 
	   
    }
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        int size=x.nextInt();
        
        int[] a = new int[size];
        
        for(int i=0;i<size;i++)
        {
            a[i]=x.nextInt();
        }
    
        
        int result;
        
        System.out.println((result= maxcount(a)));
        
    }
}
        
