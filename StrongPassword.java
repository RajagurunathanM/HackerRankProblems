import java.util.*;

class StrongPassword
{
public static void main(String args[])
{
Scanner x = new Scanner(System.in);

String s = x.next();

char[] ch = s.toCharArray();
int numflag=0,lowflag=0,upflag=0,spflag=0;


if(s.length()<6)
{
	System.out.println("ADD "+ (6-s.length()) +" MORE CHARACTER");
}
else
{
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A' && ch[i]<='Z')
	{
		upflag++;
	}

	if(ch[i]>='a' && ch[i]<='z')
	{
		lowflag++;
	}
	if(ch[i]>='0' && ch[i]<='9')
	{
		numflag++;
	}
	if(ch[i]>='!' && ch[i]<='+')
	{
		spflag++;
	}

	
	
}
}
int count=0;

if(s.length()>6)
{
if(upflag==0)
{
	System.out.println("ADD ATLEAST "+1+" UPPERCASE CHARACTER");
	count++;
}
if(lowflag==0)
{
	System.out.println("ADD ATLEAST "+1+" LOWERCASE CHARACTER");
	count++;
}
if(numflag==0)
{
	System.out.println("ADD ATLEAST "+1+" NUMBER");
	count++;
}
if(spflag==0)
{
	System.out.println("ADD ATLEAST "+1+" SPECIAL CHARACTER");
	count++;
}
}

System.out.println("TOTAL NO.OF CHARACTERS TO BE ADDED "+count);

}
}