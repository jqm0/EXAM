package firstTask;

import java.util.ArrayList;

public class Student {
	private String name ;
	private int id ;
	Course course1 = new Course();
//array list of courses object
	ArrayList<Course> courseList = new ArrayList<Course>();
// ====== setter and getter =====
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
