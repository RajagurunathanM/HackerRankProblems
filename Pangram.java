class Pangram
{
public static void main(String args[])
{
	String a="We promptly judged antique ivory buckles for the  prize";
	char[] ch = a.toCharArray();
	int flag=0;
	for(int i=0;i<ch.length;i++)
	{
		if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z') || (ch[i]==' '))
		{
			flag=0;
		}
		else
		{
			flag++;
		}
	}
	if(flag>0)
	{
		System.out.println("not pangram");
	}
	else
	{
		System.out.println("pangram");
	}
}
}