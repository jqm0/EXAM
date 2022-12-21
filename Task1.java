package firstTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Department> departmentA = new ArrayList<Department>();
		Scanner sc = new Scanner(System.in);
		School school1 = new School();
		System.out.println("welcome to object chaining system");
		System.out.print("Please Enter School Name : ");
		school1.setName(sc.nextLine());
		System.out.print("Please Enter School ID : ");
		school1.setId(sc.nextInt());
		System.out.print("Please Enter Department Name : ");
		school1.department1.setName(sc.next());
		System.out.print("Please Enter Department size : ");
		school1.department1.setdSize(sc.nextInt());
		System.out.print("Please Enter Department location : ");
		school1.department1.setLocation(sc.next());
		System.out.print("Please Enter Teacher name : ");
		school1.department1.teacher1.setName(sc.next());
		System.out.print("Please Enter Teacher ID : ");
		school1.department1.teacher1.setId(sc.nextInt());
		System.out.print("Please Enter Student name : ");
		school1.department1.teacher1.student1.setName(sc.next());
		System.out.print("Please Enter Student ID : ");
		school1.department1.teacher1.student1.setId(sc.nextInt());
		System.out.print("Please Enter Course name : ");
		school1.department1.teacher1.student1.course1.setName(sc.next());
		System.out.print("Please Enter Course Type : ");
		school1.department1.teacher1.student1.course1.setType(sc.next());
		System.out.print("Please Enter math Mark : ");
		school1.department1.teacher1.student1.course1.markCourse.setMathMark(sc.nextInt());
		System.out.print("Please Enter physics Mark : ");
		school1.department1.teacher1.student1.course1.markCourse.setPhysics(sc.nextInt());

		System.out.println("=================================");
		System.out.println(">> School name is :" + school1.getName());
		System.out.println(">> School id is :" + school1.getId());
		System.out.println(">> Department name is :" + school1.department1.getName());
		System.out.println(">> Department Size is :" + school1.department1.getdSize());
		System.out.println(">> Teacher name is : " + school1.department1.teacher1.getName());
		System.out.println(">> Teacher id is : :" + school1.department1.teacher1.getId());
		System.out.println(">> Student name is : " + school1.department1.teacher1.student1.getName());
		System.out.println(">> Student id is : :" + school1.department1.teacher1.student1.getId());
		System.out.println(">> Course name is : " + school1.department1.teacher1.student1.course1.getName());
		System.out.println(">> Course type is : :" + school1.department1.teacher1.student1.course1.getType());
		System.out.println(">> mathMark is : " + school1.department1.teacher1.student1.course1.markCourse.getMathMark());
		System.out.println(">> physics mark is : :" + school1.department1.teacher1.student1.course1.markCourse.getPhysics());
		
		sc.close();

	}

}
