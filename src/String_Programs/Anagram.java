package String_Programs;

public class Anagram
{
	public static void main(String[] args)
	{
		String s1="Silent";
		String s2="Listen";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		//To Remove Space
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not An Anagram");
		}
		else
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
					}
				}
			}
		if(count==s2.length())
		{
			System.out.println("It's An Anagram");
		}
	}
}

}
