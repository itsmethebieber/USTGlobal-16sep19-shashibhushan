package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	/*public int compareTo(Student o ) {
		if(this.id>o.id) {
			return 1;
		}else if(this.id<o.id){
			return -1;
		
		}
		return 0;
		
	}

}*/
	//@Override
	/*public int compareTo(Student o ) {
		if(this.percentage>o.percentage) {
			return 1;
		}else if(this.percentage<o.percentage){
			return -1;
		
		}
		return 0;
		
		
	}
	}*/
	
	public int compareTo(Student o) {
		if(this.name.compareTo(o.name)>0)
		{
			return 1;
		}
		else if(this.name.compareTo(o.name)<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
			
	}
		

		
	
		
	
	
}

