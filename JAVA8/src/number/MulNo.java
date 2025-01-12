package number;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Multiplying the no of array
 */

public class MulNo {

	public static void main(String[] args) {
		
		Integer[] intArray= {1,2,3,4,5};//120
		//List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> list=Arrays.asList(intArray);
		Optional<Integer> outPut=list.stream().reduce((a,b)->a*b);
		if(outPut.isPresent()) {
			//System.out.println("Multplying no"+outPut);
			System.out.println("Multplying no : "+outPut.get());
		}else {
			System.out.println("Empty");
		}
		
		//2nd method
		Integer out=1;
		for(Integer no:list) {		
			out *=no;
		}
		System.out.println("Mul no: "+out);

	}

}
