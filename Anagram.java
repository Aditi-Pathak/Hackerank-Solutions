/*Given two strings 'pattern' and 'text', find whether any anagram of string pattern 
  is a substring of text.

Example:
Input:
text = ideserve
pattern = veer
Output:
true
Substring which is an anagram of pattern: erve (ideserve)*/

package iDeserveCode;

import java.util.Scanner;

public class Anagram 
{
	public static boolean findAnagram(String text, String pattern)
	{
		boolean isAnagram = false;
		char[] letters = new char[pattern.length()];
				for(int i=0; i<letters.length; i++)
				{
					letters[i] = pattern.charAt(i);
					System.out.print(letters[i]);
				}
				System.out.println();
				if(text.indexOf(pattern)>=0)
				{
					System.out.println(text.indexOf(pattern));
					isAnagram=true;
				}
				
		return isAnagram;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pattern = sc.next();
		System.out.println(findAnagram(text, pattern));
		sc.close();
	}

}
