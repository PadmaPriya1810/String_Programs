package String_Programs;

public class Remove_Digits_From_String_Using_replaceAll
{
public static void main(String[] args) 
{
	String s="Priya1810";
	 
	    s = s.replaceAll("[0-9]","");//Removes if there is any Digits
	    
	    System.out.println(s);//Priya
}
}
