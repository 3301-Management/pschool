package main;

public class CourseListDatabase extends schoolDatabase {
	Course[] courses = new Course[20];
	public void Populate() {
		int x = 0;
		while(x < courses.length) {
			courses[x] = new Course();
			courses[x].createRandom();
			x++;
		}
	}
	public void setSchedule() {
		
	}
	public Course[] getCourseArray() {
		return courses;
	}
	public void setCourseArray(Course[] courses) {
		this.courses = courses;
	}
	public Course getIndivCourse(int index) {
		return courses[index];
	}
	public void setIndivCourse(int index, Course course) {
		courses[index] = course;
	}
}





