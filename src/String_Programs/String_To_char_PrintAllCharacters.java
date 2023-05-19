package String_Programs;

public class String_To_char_PrintAllCharacters 
{
	public static void main(String[] args)
	{
		String s="Priya";
		
		//Using "charAt(int index)" To Print Each Characters
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		
		System.out.println(ch);//Prints Each Characters
	    }
	}

}
