package String_Programs;

public class RemoveSpaceInString 
{
	public static void main(String[] args)
	{
		String s1="GO OD";
		String s2="";//Create a New Empty String to Store
		
		for(int i=0;i<s1.length();i++)//Always use length() method in String //length var for Array 
		{
			char c=s1.charAt(i); //Takes Each Character with the help of Index
			if(c!=' ')//Checks SPace Character
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);
	}

}
