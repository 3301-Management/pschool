package main;

public class StudentDatabase extends schoolDatabase {
	Student[] students = new Student[40];
	public void Populate() {
		int x = 0;
		while(x < students.length) {
			students[x] = new Student();
			x++;
		}
	}
	public void setSchedule() {
		
	}
	public Student[] getStudents() {
		return students;
	}

}



