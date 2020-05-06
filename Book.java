import java.util.*;
class Book
{
static int pageCount(int n,int p)
{
	int count1=0,count2=0,result=0;
	for(int i=1;i<p;i++)
	{
		count1++;
	}
	
	for(int i=n;i>p;i--)
	{
		count2++;
	}
	
	if(count1<count2) result = count1/2;
	if(count2<count1) result = count2/2;
	if(count1==count2) result = count1/2;
	
	
	return result;
}

public static void main(String args[])
{
	Scanner x = new Scanner(System.in);
	
	int result=0;
	int n = x.nextInt();
	int p = x.nextInt();
	System.out.println((result = pageCount(n,p)));
}
}