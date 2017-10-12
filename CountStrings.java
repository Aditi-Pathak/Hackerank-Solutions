package hackerank_Algorithm_Datastructures;

import java.util.Scanner;

class CountStrings 
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String words[]= s.split("[A-Z]+");
        
        int count = words.length;
        System.out.println(count);
        
        in.close();
    }

}
