package firstTask;
public class School {
	private String name;
	private int id;
	Department department1 = new Department();
	
	public School() {
		System.out.println(">>> Defulat School Details <<<");
		this.name = "Muscat";
		this.id = 2022 ;
		System.out.println("School Name "+ name + " ID of school "+ id);
		System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
