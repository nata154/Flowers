package by.HTP.Project.Run;

import by.HTP.Project.Entity.B;
import by.HTP.Project.Entity.Employee;
import by.HTP.Project.Entity.Person;
import by.HTP.Project.Entity.Student;

public class MainApp {

	public static void main(String[] args) {
	B b=new B ();
	
	Student st= new Student();
	
	Person per[]=new Person[]{
			new Student(),
			new Employee()
	};
	
	for(Person p: per){
		System.out.println(p);
	}
	System.out.println();

	}

}
