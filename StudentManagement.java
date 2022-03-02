package Business;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
	Vector<Students> vStudent = new Vector<Students>();
	int n=2;//so luong sinh vien
	Enumeration<Students> eStudent;
	public StudentManagement() {
		this.InputStudent();
		this.ViewStudent();
	}
	//nhap sinh vien va dua vao vector
	public void InputStudent() {
		Scanner key = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Name =");
			String name = key.nextLine();
			System.out.println("Address=");
			String address = key.nextLine();
			Students s = new Students(name, address, "cntt", 5, 200000);
			vStudent.add(s);
		}
	}
	//view Student tim nhung sinh vien o da nang
	
	public void ViewStudent() {
		/*for(int i=0;i<vStudent.size();i++) {
			System.out.println(vStudent.get(i).getName());
		}*/
		eStudent = vStudent.elements();
		while(eStudent.hasMoreElements()){
			Students s = (Students)eStudent.nextElement();
			//if(s.getAddress().equals("danang"))
			System.out.println("name ="+s.getName());			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentManagement();

	}

}
