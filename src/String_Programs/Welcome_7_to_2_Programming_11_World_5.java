package String_Programs;

public class Welcome_7_to_2_Programming_11_World_5  
{

	public static void main(String[] args) 
    {
		String s="Welcome To Programming World";
		 String[] str=s.split(" ");
		 String res="";
		 
	for(int i=0;i<str.length;i++)
	{
		int c=str[i].length();
		res=res+(str[i]+"-"+c+" ");
	}
	System.out.println(res);
  }
	
}

