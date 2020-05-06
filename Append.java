import java.util.*;

class Append
{
	static String appdel(String s,String t,int k)
	{
		
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        int index = 0;
        
        for(int i=0;i<sc.length && i<tc.length;i++)
        {
            if(sc[i] != tc[i])
            {
                index = i;
                break;
            }
        }
        
        int count = 0;

        for(int i=index;i<sc.length;i++)
        {
            
            count++;
        }
        
        for(int i=index;i<tc.length;i++)
        {
            count++;
        }
        
        if(count <= k)
        {
           return "Yes";
        }

        return "No";

			
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		String s = x.next();
		String t = x.next();
		
		int k = x.nextInt();
		
		System.out.println( appdel(s,t,k) );
		
	}
}
		