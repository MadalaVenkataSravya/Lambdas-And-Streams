package com.epam.StreamsAndLambdas;
import java.util.*;
public class Average {
	public static void main(String args[]) {
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	List<Integer> avglist=new ArrayList<Integer>();
	System.out.println("Enter no of elements:");
	n=s.nextInt();
	System.out.print("Enter elements");
	for(int i=0;i<n;i++) {
		avglist.add(s.nextInt());
	} 
	for(int suml:avglist) {
		sum+=suml;
	}
	System.out.println("Average of the elements : "+((double)sum/n));
	s.close();
}
}