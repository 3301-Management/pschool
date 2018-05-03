package main;

public class TeacherDatabase extends schoolDatabase {
	Teacher[] teachers = new Teacher[5];
	public Teacher[] getTeachers() {
		return teachers;
	}
	public void setTeachers(Teacher[] teachers) {
		this.teachers = teachers;
	}
	public void Populate() {
		int x = 0;
		while(x < teachers.length) {
			teachers[x] = new Teacher();
			x++;
		}
	}
	public void setSchedule() {
		
	}

}



