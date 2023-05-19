package String_Programs;
//I/P = a1b2c3d4
//O/P = abcd1234
public class abcd1234 
{
	public static void main(String[] args) 
	{
		String s="a1b2c3d4";
		
		String s1="";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z')
			{
				s1=s1+c; //1234 //Concat Char
			}
			else if(c>='0' && c<='9')
			{
				s2=s2+c; //abcd //Concat Char
			}
		}
		System.out.println(s1+s2); //Concatenating Both
	}

}
