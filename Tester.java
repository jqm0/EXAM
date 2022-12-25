package firstTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		boolean option = true;
		boolean option2 = true;
		boolean option3 = true;
		boolean option4 = true;
		
		ArrayList<Department> departmentA = new ArrayList<Department>();
		Scanner sc = new Scanner(System.in);
		School school1 = new School();
		System.out.println(">>> welcome to object chaining system <<<");
		System.out.print("Please Enter School Name : ");
		school1.setName(sc.nextLine());
		System.out.print("Please Enter School ID : ");
		school1.setId(sc.nextInt());
		while (option) {

			Department dep = new Department();
			System.out.print(" Please Enter Department Name : ");
			dep.setName(sc.next());
			System.out.print(" Please Enter Department size : ");
			dep.setdSize(sc.nextInt());
			System.out.print(" Please Enter Department location : ");
			dep.setLocation(sc.next());
			while (option2) {

				Teacher t = new Teacher();
				System.out.print("Please Enter Teacher name : ");
				t.setName(sc.next());
				System.out.print("Please Enter Teacher ID : ");
				t.setId(sc.nextInt());
				while (option3) {
					Student st = new Student();
					System.out.print("Please Enter Student name : ");
					st.setName(sc.next());
					System.out.print("Please Enter Student ID : ");
					st.setId(sc.nextInt());
					while (option4) {
						Course courseX = new Course();
						System.out.print("Please Enter Course name : ");
						courseX.setName(sc.next());
						System.out.print("Please Enter Course Type : ");
						courseX.setType(sc.next());
						System.out.print("Please Enter Midterm Mark : ");
						courseX.markCourse.setMathMark(sc.nextInt());
						System.out.print("Please Enter Finall Mark : ");
						courseX.markCourse.setPhysics(sc.nextInt());
						st.courseList.add(courseX);
						System.out.print("Do You want add another course 1 if yes.> ");
						if (sc.nextInt() != 1) {
							option4 = false;
						}

					}
					t.studentList.add(st);
					System.out.print("Do You want add another Student 1 if yes.> ");
					if (sc.nextInt() != 1) {
						option3 = false;

					}
					option4 = true;
				}
				dep.teacherList.add(t);

				System.out.print("Do You want another Teacher 1 if yes.> ");
				option3 = true;
				if (sc.nextInt() != 1) {
					option2 = false;
				}
			}
			departmentA.add(dep);

			System.out.print("Please Enter 1 to add more department :");
			option2 = true;
			if (sc.nextInt() != 1) {
				option = false;
				String ANSI_GREEN = "\u001B[32m";
				
				System.out.println(ANSI_GREEN + "===========@@@ School Details @@@============");
				System.out.println(">> School name is :" + school1.getName());
				System.out.println(">> School id is :" + school1.getId());
				System.out.println("=========== |Departments List| ============");
// First loop to Display all detals about each department
				for (Department department : departmentA) {
					String ANSI_CYAN = "\u001B[36m";
					System.out.println(ANSI_CYAN +"=========== |>> Department Details <<| ============");
					System.out.println("============= Department name is " + department.getName() + " ============");
					System.out.println("============= Department Size is " + department.getdSize() +" ============");
					System.out.println("=========== \\ Teacher List // ============");
//Second loop to Display detals about each teacher
					for (Teacher t : department.teacherList) {
						String ANSI_YELLOW = "\u001B[33m";
						System.out.println(ANSI_YELLOW +"================== Teacher Details =====================");
						System.out.println(">> Teacher name is : " + t.getName());
						System.out.println(">> Teacher id is : :" + t.getId());
						System.out.println("==================### Student List ###=====================");
//Third loop to Display detals about each Student with same teacher
						for (Student s : t.studentList) {
							 String ANSI_RED = "\u001B[31m";
							System.out.println(ANSI_RED +"==================>> Student Details <<=====================");
							System.out.println(">> Student name is : " + s.getName());
							System.out.println(">> Student id is : :" + s.getId());
							System.out.println("==================###... Course List ...###=====================");
//4th loop to Display detals about each Student Courses
							for (Course c : s.courseList) {
							String ANSI_CYAN = "\u001B[36m";

								System.out.println(ANSI_CYAN + "==================$$$... Course Details ...$$$=====================");
								System.out.println(">> Course name is : " + c.getName());
								System.out.println(">> Course type is : :" + c.getType());
								System.out.println(">> Midterm Mark is : " + c.markCourse.getMathMark());
								System.out.println(">> finall Mark is : :" + c.markCourse.getPhysics());
							}
						}

					}

					System.out.println("********************************************************");
				}
				System.out.println("=========== Thank You :) ============");

			}

		}
		sc.close();
	}

}
