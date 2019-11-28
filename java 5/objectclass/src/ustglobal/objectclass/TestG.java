package ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"ganga",10000);
		Employee e2 = new Employee(2,"gowri",10000);
		Employee e3 = new Employee(3,"kavya",10000);
		Employee e4 =e3;

		boolean isEquals = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEquals);
	}


}
