class revDigit
{
public static void main(String args[])
{
int n=9999;
int l=0;
if(n>9 && n<100) l=10;
if(n>99 && n<1000) l=100;
if(n>999 && n<10000) l=1000;
int temp1=0,temp2=0;
if(n>10)
{
	
while(n>0)
{
	int r = n%10;
	n=n/10;
	temp1 = r*l ;
	temp2 = temp1 + temp2;
	l=l/10;
}
System.out.println(temp2);
}
else
{
	System.out.println(n);
}
}
}

	
	