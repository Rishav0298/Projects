package org.rish.collection;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class ArrayToCollection {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of cities you want to visit:");
		int n= Integer.parseInt(in.readLine());
		
		String[] city=new String[n];

		System.out.println("Enter"+ n+ "city name: ");
		
		for(int i=0;i<n;i++) {
			city[i]=in.readLine();
		}
		System.out.println("your city choices are");
		for(int i=0;i<n;i++) {
			System.out.println(city[i]+" ");
		}
		List<String> list= Arrays.asList(city);
		System.out.println();
		list.sort(null);
		for(String li : list)
		{
			System.out.print(li+" ");
		}

	
	}

}
