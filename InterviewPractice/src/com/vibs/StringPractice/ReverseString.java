package com.vibs.StringPractice;
import java.util.Scanner;

public class ReverseString {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String : ");

		String s = sc.nextLine();

		char [] cs = s.toCharArray();
		
		// method 1

		/*for(int i = cs.length-1 ; i >= 0 ; i--){
			System.out.print(cs[i]);
		}*/

		/*for(int i=0; i< cs.length/2; i++) {
			char ch = s.charAt(i);
			cs[i] = cs[cs.length-1-i];
			cs[cs.length-1-i] = ch;
		} 
		System.out.print(cs);*/
		
		System.out.print(reverseMe(s));

		String str1 = "Strings";
	    String str2 = "Strings";
	    String str3 = "Integers are not immutable";

	    int result = str1.compareToIgnoreCase( str2 );
	    System.out.println(result);

	    result = str2.compareToIgnoreCase( str3 );
	    System.out.println(result);

	    result = str3.compareToIgnoreCase( str1 );
	    System.out.println(result);
	    System.out.println(recursiveMethod(s));
	    
	}
	static String reverseMe(String s) {
		   if(s.length() == 0)
		     return "";
		   return s.charAt(s.length() - 1) + reverseMe(s.substring(0,s.length()-1));
		 }
	
	//Recursive method to reverse string
	 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         //System.out.println(str.substring(1));
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
