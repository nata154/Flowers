package by.HTP.Project.Entity;

public class Student extends Person{

	private double avgMark;

	@Override
	public String toString() {
		String s=
		 "name:" +name +"avg"+avgMark;
		return s;
	}
}


