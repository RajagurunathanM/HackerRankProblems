import java.util.*;

class BirthdayChocolate
{
	
public static void main(String args[])
{
Scanner x = new Scanner(System.in);	
	
int size = x.nextInt();
int[] a = new int[size];
for(int i=0;i<size;i++)
{
	a[i]=x.nextInt();
}

int d=x.nextInt(); //month
int m=x.nextInt();  //date

int sum=0;
int count=0;

for(int i=0;i<a.length;i++)
{

sum=0;
sum= a[i];

for(int j=i+1; j<i+m;j++)
{
	if(j<a.length)
	{
		sum=sum+a[j];
	}
}



if(sum==d)
{
	count= count+1;
}

}
System.out.println(count);
}
}
