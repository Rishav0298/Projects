package roy.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
			list.add(i);
		
		//creating a parallel stream
		
		Stream<Integer> stream =list.parallelStream();
		
		Integer[] oddNumberArr = stream.filter(i->i%2!=0)
								.toArray(Integer[]::new);
		
		for(Integer i: oddNumberArr) {
		System.out.println(i);
		}
		
		int marks[] = {22,44,31,45,68,35,17,19};
		Arrays.parallelSort(marks,1,5);
		
		Arrays.stream(marks).forEach(n -> System.out.printf(n+ " "));

 	}

}
