package org.rish.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListRev {

	public static void main(String[] args) {
		String[] fruits= {"Apple","Kiwi","Grapes","Guava"};
		
		List fList = new ArrayList();
		
		for(int i=0;i<fruits.length;i++) {
			fList.add(fruits[i]);
		}
		fList.add("Blueberry");
		ListIterator lIter= fList.listIterator();
		
		while(lIter.hasNext()) {
			System.out.print(lIter.next()+" ");
		}
		Collections.reverse(fList);
		
//		System.out.print(fList);
		System.out.println("\n List after Reversal");
		lIter=fList.listIterator();
		while(lIter.hasNext()) {
			System.out.print(lIter.next()+" ");
		}
		System.out.print(fList);

	}

}
