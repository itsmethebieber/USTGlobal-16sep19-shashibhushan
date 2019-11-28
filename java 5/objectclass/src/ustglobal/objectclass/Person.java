package ustglobal.objectclass;

public class Person implements Cloneable {
int id;
String name;

 protected Object Clone() throws CloneNotSupportedException {
	return super.clone();
}

public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
 

}

