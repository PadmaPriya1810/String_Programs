package String_Programs;

public class FrequencyNoOfCharacterInString {
	public static void main(String[] args) {
		
		String s="malayalam";
		
		char[] str=s.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j] &&str[i]!=' ')
				{
					count++;
					str[j]=' ';
				}
			}
			if(str[i]!=' '&& count!=1)
				System.out.println(str[i]+"-"+count);
		}
		
	}

}
