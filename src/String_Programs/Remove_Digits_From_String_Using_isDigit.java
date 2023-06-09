package String_Programs;

public class Remove_Digits_From_String_Using_isDigit 
{
	 // Method to remove all the digits from String
    
    public static String removeAllDigit(String str)
    {
        // Converting the given string into a character array
        char[] charArray = str.toCharArray();
        String result = "";
 
        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) 
        {
 
            // Check if the specified character is not digit
            // then add this character into result variable
        	
            if (!Character.isDigit(charArray[i]))
            {
                result = result + charArray[i];
            }
        }
 
        // Return result
        return result;
    }
 
    public static void main(String args[])
    {
 
        // Given alphanumeric string str
        String str = "GeeksForGeeks123";
 
        // Print the modified string
        System.out.println(removeAllDigit(str));
    }
}
