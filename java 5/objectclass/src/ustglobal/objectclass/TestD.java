package ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Student s = new Student(1,"shashi",76.55);
	int hashcode = s.hashCode();
	System.out.println("id = "+hashcode);
	System.out.println("----------");
	System.out.println(s);
	System.out.println("============");
	System.out.println(s.toString());
	
}
}
