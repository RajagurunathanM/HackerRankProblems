import java.util.*;

class MarsCode
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		String msg=x.next();
		
		System.out.println(msg.length()/3);
		
		char[] ch=msg.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='S' && ch[i]!='O')
			{
				System.out.println("WRONG CODE OCCUR AT "+i+" place");
				count++;
			}
		}
		
		System.out.println("NUMBER OF WRONG CHARACTER IS "+count);
		
	}
}