package progDiffType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1, "vikash", 20, "sail1", 200),
				new Employee(2, "vikashk", 20, "sail2", 2001), 
				new Employee(3, "vikashku", 20, "sail3", 2002),
				new Employee(4, "vikashkumar", 20, "sail4", 2003));
		empList(list);
		System.out.println();
		salary(list);
		System.out.println();
		name(list);
		System.out.println("find the name of emp whose salary is greater then 2001");
		nameSal(list);
		System.out.println();
		System.out.println("find the emp name having max salary");
		maxSalry(list);
		System.out.println();
		System.out.println("find the emp name having min salary");
		minSalry(list);
		
		System.out.println();
		System.out.println("unique department");
		unique(list);
		System.out.println();
		System.out.println("sorting asc");
		sort(list);
		System.out.println();
		System.out.println("sorting des");
		sortDe(list);
		System.out.println();
		System.out.println("sorting dept and name");
		sortDeName(list);
		System.out.println();
		System.out.println("grouping");
		noEmp(list);
		
		System.out.println();
		System.out.println("duplicate");
		dup(list);

	}

	// Print the emp list using stream
	static void empList(List<Employee> emp) {
		emp.stream().forEach(System.out::println);

	}

	// find the emp whose salary is greater then 2001
	static void salary(List<Employee> salary) {
		salary.stream().filter(s -> s.getSalary() > 2001).forEach(System.out::println);
	}
	// find the name of emp

	static void name(List<Employee> name) {
		name.stream().map(n -> n.getName()).forEach(System.out::println);
	}

	// find the name of emp whose salary is greater then 2001
	static void nameSal(List<Employee> nameSal) {
		nameSal.stream().filter(x->x.getSalary()>2001).map(m->m.getName()).forEach(System.out::println);
	}
	
	//find the emp name having max salary
	
	static void maxSalry(List<Employee> maxsal) {
		//Optional<String> op=maxsal.stream().max(Comparator.comparing(Employee :: getSalary)).map(Employee :: getName);
		//String op=maxsal.stream().max(Comparator.comparing(Employee :: getSalary)).map(Employee :: getName).get();
		String op=maxsal.stream().max(Comparator.comparing(Employee :: getSalary)).map(m->m.getName()).get();
		System.out.println(op);
		
	}
	//find the emp name having min salary
	
		static void minSalry(List<Employee> maxsal) {
			//Optional<String> op=maxsal.stream().max(Comparator.comparing(Employee :: getSalary)).map(Employee :: getName);
			//String op=maxsal.stream().max(Comparator.comparing(Employee :: getSalary)).map(Employee :: getName).get();
			String op=maxsal.stream().min(Comparator.comparing(Employee :: getSalary)).map(m->m.getName()).get();
			System.out.println(op);
			
		}
	// Print the unique department
	
	static void unique(List<Employee> un) {
		//un.stream().map(m->m.getDepartment()).distinct().forEach(System.out::println);
		//if you want to print comma(delimeter)
		String s=un.stream().map(m->m.getDepartment())
				.distinct()
				.collect(Collectors.joining(","));
				System.out.println("op:"+s);
	}
	
	//sort based upon name assending order
	static void sort(List<Employee> sort) {
		
		sort.stream()
		.map(m->m.getName())
		.sorted()
		.forEach(System.out::println);
	}
	
	
	//sort based upon name desinding order
			static void sortDe(List<Employee> sort) {
				
				sort.stream()
				.map(m->m.getName())
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
			}
			//sort based upon department and name 
			static void sortDeName(List<Employee> sort) {
				
				sort.stream()
				.sorted(Comparator.comparing(Employee ::getDepartment).thenComparing(Employee :: getName))
				.forEach(System.out::println);
			}
			
			//print the no of emp each department
			static void noEmp(List<Employee> emp) {
				//grouping each
			//	Map<String,List<Employee>> group=emp.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
				//grouping each count
				Map<String,Long> group=emp.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.counting()));
				System.out.println("group:"+group);
		
			}
			
			//print the duplacate element
			static void dup(List<Employee> emp) {
				
				Map<String,Long> group=emp.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.counting()));
				System.out.println("group:"+group);
				group.entrySet().stream().filter(f->f.getValue()>1)
				.map(Map.Entry::getKey)
				.forEach(System.out::println);
	
}
}