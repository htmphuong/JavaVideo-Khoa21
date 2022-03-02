package Business;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManage {
	//nhap danh sach sinh vien vao 1 vector
	Vector<Student> vStudent = new Vector<Student>();
	int n=2; //so luong sinh vien
	Enumeration<Student> eStudent;
	public StudentManage() {
		InputStudent();
		ViewStudent();
	}
	//nhap sinh vien va dua vao vector
	public void InputStudent() {
		Scanner key = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Name =");
			String name = key.nextLine();
			System.out.println("Address=");
			String address = key.nextLine();
			Student s = new Student(name, address, "cntt", 5, 200000);
			vStudent.add(s);
		}
	}
	//in ra sinh vien da nhap
	public void ViewStudent() {
		eStudent = vStudent.elements();
		while(eStudent.hasMoreElements()) {
			Student s = (Student)eStudent.nextElement();
			System.out.println("name = "+s.getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManage sm = new StudentManage();
		
		
	}

}
