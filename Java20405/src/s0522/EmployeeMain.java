package s0522;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("김로봇");
		e1.setNo(12345);
		e1.setAge(25);
		System.out.println(e1.toString());
		
		Employee e2 = new Employee("성춘향", 200, 18);
		System.out.println(e2.toString());
		e2.print();
	}
}

