package firstTask;

import java.util.ArrayList;

public class Department {
	private String name;
	private int Size;
	private String location;
	Teacher teacher1 = new Teacher();
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

	public Department() {
	
		this.name = "Computer Science";
		this.Size = 20;
		this.location = "North";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String dName) {
		this.name = dName;
	}
	public int getdSize() {
		return Size;
	}
	public void setdSize(int dSize) {
		this.Size = dSize;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
