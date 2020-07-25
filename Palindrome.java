package com.epam.StreamsAndLambdas;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
public class Palindrome {
    public static void checkPalindrome(List<String> l1){
        List<String> l2=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
       System.out.println("Palindrome Strings are: "+l2);
    }
    public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter number of Strings:");
		int n=s.nextInt();
		List<String> list=new ArrayList<String>();
		System.out.println("Enter strings");
		for(int i=1;i<=n;i++)
		{
			list.add(s.next());
		}
        Palindrome.checkPalindrome(list);
    }  
}