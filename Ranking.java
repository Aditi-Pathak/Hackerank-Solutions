package hackerank_Algorithm_Datastructures;

import java.util.Scanner;

public class Ranking 
{
	 static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
		 int [] finalRank = new int[2];
		 int a = 0;
		 int b = 0;

		 if(a0>b0)
		 {
			 a= a+1;
		 }
		 else if(a0<b0)
		 {
			 b= b+1;
		 }
		 else
		 {
			 a=a+0;
			 b=b+0;
		 }
		 
		 if(a1>b1)
		 {
			 a= a+1;
		 }
		 else if(a1<b1)
		 {
			 b= b+1;
		 }
		 else
		 {
			 a=a+0;
			 b=b+0;
		 }
		 
		 if(a2>b2)
		 {
			 a= a+1;
		 }
		 else if(a2<b2)
		 {
			 b= b+1;
		 }
		 else
		 {
			 a=a+0;
			 b=b+0;
		 }
		 
		 finalRank[0] = a;
		 finalRank[1] = b;
		 
		 return finalRank;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        int[] result = solve(a0, a1, a2, b0, b1, b2);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");
	        in.close();
	    }

}
