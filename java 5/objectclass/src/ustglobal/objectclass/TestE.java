package ustglobal.objectclass;

public class TestE {
public static void main(String[] args) {
	Car c = new Car(200000,"audi","black");
	int hashcode = c.hashCode();
	System.out.println("id = "+hashcode);
	System.out.println("----------");
	System.out.println(c);
	System.out.println("============");
	System.out.println(c.toString());
}
}
