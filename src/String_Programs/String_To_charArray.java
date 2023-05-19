package String_Programs;
/*  
	 * "toCharArray()" method of String class
	 * Converts this string into character array. 
 */
public class String_To_charArray 
{
public static void main(String[] args)
{
	String s="Priya";
	
	//Using toCharArray()
	char[] ch=s.toCharArray(); //Converts String into char[]
	
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);//ch-Priya //ch[i]-P r i y a prints in each line
	}
}
}
