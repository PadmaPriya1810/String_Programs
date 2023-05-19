package String_Programs;

public class FrequencyOfCharactersInString_JTpoint
{
	public static void main(String[] args) 
    {  
       String str = "Hello";  
       int[] freq = new int[str.length()];  
       System.out.println("The entered string is "+str);
       //Convert the given string into character array  
       char str1[] = str.toCharArray();            
       for(int i = 0; i <str.length(); i++) 
       {  
           freq[i] = 1;  
           for(int j = i+1; j <str.length(); j++) 
           {  
               if(str1[i] == str1[j])
               {  
                   freq[i]++;  
                     
                   //Set str1[j] to 0 to avoid printing visited character  
                   str1[j] = '0';  
               }  
           }  
       }            
       //Displays the characters and their corresponding frequency  
       System.out.println("Frequencies of the characters in the string are as below: "); 
       System.out.println("Characters  frequencies");  
       for(int i = 0; i <freq.length; i++) 
       {  
           if(str1[i] != ' ' && str1[i] != '0')  
               System.out.println(str1[i] + "              " + freq[i]);  
       }  
   }  
}  


//Algorithm
//Start
//
//Declare a string
//
//Ask the user to initialize it.
//
//Use a frequency array to store the frequency of each character.
//
//Convert the string to a character array
//
//Use two for loops to calculate the frequency of each element.
//
//Use the first for loop to iterate through each character of the array.
//
//Initialize each element of the frequency array as 1.
//
//Use another for loop to iterate through the remaining characters.
//
//Check for the total occurrence of the element.
//
//If the element occurs again, increment the value in the frequency array.
//
//Set the character array to 0 to avoid counting visited characters.
//
//Print the characters and their corresponding frequency.
//
//Stop.

