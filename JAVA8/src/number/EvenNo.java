package number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {

	public static void main(String[] args) {
		/*
		 * List of integer find even number
		 * input:{1,2,3,4,5,6,9}
		 */
		//both correct
	/*	List<Integer> list=Arrays.asList(1,2,3,4,5,6,9);
		list.stream().filter(l->l%2==0).collect(Collectors.toList()).forEach(System.out::println);
	*/	
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,9);
		list.stream().filter(l->l%2==0).forEach(System.out::println);
	}

}
