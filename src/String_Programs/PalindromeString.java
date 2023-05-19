package String_Programs;

public class PalindromeString {
	public static void main(String[] args) 
	{
		String s1="MADAM";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)//Start From Last Index length()-1; end at >=0, decrement for reverse
		{
			char c=s1.charAt(i);//Takes Each Character with the help of Index
			s2=s2+c;//Checks Space Character
			
		}
	   if(s1.equals(s2))
	   {
		   System.out.println("Palindrome");
	   }
	   else
		   System.out.println("Not A Palindrome");
	}


}
