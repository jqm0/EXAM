package firstTask;

import java.util.ArrayList;

public class Teacher {
	private String name ;
	private int id ;
	Student student1 = new Student();
	ArrayList<Student> studentList = new ArrayList<Student>();
	public Teacher() {
		this.id = 1010101;
	}
	public String getName() {
		return name;
	}
	public void setName(String tName) {
		this.name = tName;
	}
	public int getId() {
		return id;
	}
	public void setId(int tId) {
		this.id = tId;
	}
	
}
