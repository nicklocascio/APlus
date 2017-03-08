
public class pr70
	{
	public static void main(String [] args)
		{
		String word = "PALINDROME";
		String newWord = "";
		String [] letters = new String [word.length()];
		for(int i = 0; i < word.length(); i++)
			{
			letters[i] = word.substring(i, i+1);
			}
		for(int i = letters.length-1; i >= 0; i--)
			{
			newWord += letters[i];
			}
		System.out.println(newWord);
		}
	}
