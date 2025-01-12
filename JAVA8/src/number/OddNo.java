package number;

import java.util.Arrays;
import java.util.List;

public class OddNo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,9);
		list.stream().filter(l->l%2==1).forEach(System.out::println);

	}

}
