package String_Programs;

//I/P - a1b2c3d4
//O/P - 10

public class Alphanumeric 
{
	public static void main(String[] args) 
	{
	String s="a1b2c3d4";
	int sum=0;
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='0' && c<='9' )
		{
			sum=sum+(c-48);  //ASCII value of 1=48 9=57								
		}
	}
	System.out.println("Sum of Only Numbers "+sum);
	}
}
