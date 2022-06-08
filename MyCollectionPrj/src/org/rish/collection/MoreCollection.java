package org.rish.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MoreCollection {

	public static void main(String[] args) {
		
		List lnkList=new LinkedList();
		
		lnkList.add("Cricket");
		lnkList.add("Hockey");
		lnkList.add("Football");
		lnkList.add("Basketball");
		
//		System.out.println(lnkList);
		displayAll(lnkList);
		
		//map Collection
		Map map1=new HashMap();
		map1.put("101", "India");
		map1.put("102", "Pakistan");
		map1.put("103", "Sri Lanka");
		
		displayAll(map1.keySet());
		displayAll(map1.values());
		
		
		Map<Integer,String> map2=new HashMap();
		map2.put(1, "Green");
		map2.put(2, "Red");
		map2.put(3, "Blue");
		
		System.out.println("For key k=1, Value= "+map2.get(1));
		for(Map.Entry<Integer,String> m : map2.entrySet()) {
			if(m.getValue().equals("Blue"))
				System.out.println(m.getKey()+" "+m.getValue() );
		}
		

	}
	
	static void displayAll(Collection c) {
		Iterator iter=c.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}

}
