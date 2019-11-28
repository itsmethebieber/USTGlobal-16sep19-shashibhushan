package ustglobal.objectclass;

public class TestB {
public static void main(String[] args) {
	Pen p =new Pen();
	int PHashcode = p.hashCode();
	System.out.println("Hashcode of p +PHashcode");
	
	Pen q = new Pen();
	int qHashcode = q.hashCode();
	System.out.println("Hashcode of q +PHashcode");
	
	
}
}
