package main;

import java.util.Scanner;

public class ledger {
	public String[][] tandc = new String[5][5];
	public String[][] sandc = new String[20][41];

	public ledger(AdministratorDatabase a, CourseListDatabase c, StudentDatabase s, TeacherDatabase t) {
		/*for (int i = 0; i <= 4; i++) {
			tandc[i][0] = (t.getTeachers())[i].getfName();
		}
		for (int i = 0; i <= 4; i++) {
			for (int ii = 1; i <= 4; i++) {
				tandc[i][ii] = (c.getCourseArray())[i].getCourseName();
			}
		}
		for (int i = 0; i <= 19; i++) {
			sandc[i][0] = (c.getCourseArray())[i].getCourseName();
		}
		for (int i = 0; i < 19; i++) {
			for (int ii = 1; i < 40; i++) {
				sandc[i][ii] = (s.getStudents())[i].getFirst();
			}

		}
*/
		for (int i = 0 ; i < 5; i++) {
			tandc[i][0] = (t.getTeachers())[i].getfName();
		}
		
		int e = 0;
		for (int i = 0; i < 5; i++) {
			for(int ii = 0; ii < 4; ii++) {
				tandc[i][ii+1] = (c.getCourseArray())[e].getCourseName();
				e++;
			}
		}
		
		for (int i = 0 ; i < 20; i++) {
			sandc[i][0] = (c.getCourseArray())[i].getCourseName();
		}
		
		for (int i = 0; i < 20; i++) {
			for (int ii = 0; ii < 40; ii++) {
				sandc[i][ii+1] = (s.getStudents())[ii].getFirst();
			}
		}
	}
//course - students
	public String[] returnStudents(String in) {
		String[] re = new String[40];
		for (int i = 0; i <= 19; i++)
			if (sandc[i][0] == in) {
				for (int ii = 1; ii <=40; ii++) {
					re[ii-1] = sandc[i][ii];
				}
			}
		return re;
	}
//teacher
	public String[] returnCourses(String in) {
		String[] re = new String[4];
		for (int i = 0; i <= 4; i++) {
			if ((tandc[i][0] == in)) {
				for (int ii = 1; i <= 4; i++) {
					re[ii] = tandc[i][ii];
				}

			}

		}
		return re;
	}
//course
	public String returnTeacher(String in) {
		String re = "";
		for (int i = 0; i <= 4; i++) {
			for (int ii = 1; ii <= 4; ii++) {
				if ((tandc[i][ii] == in)) {
					re = tandc[i][0];
				}

			}

		}
		return re;
	}

	public void search(AdministratorDatabase A, CourseListDatabase C, StudentDatabase S, TeacherDatabase T) {
		Scanner in = new Scanner(System.in);
		int searchArgument = 0;
		int tempSearchArgument = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("Please input what to search for: [1] Student, [2] Teacher, [3] Administrator [4] course");
			tempSearchArgument = in.nextInt();
			if (tempSearchArgument == 1 || tempSearchArgument == 2 || tempSearchArgument == 3 || tempSearchArgument == 4) {
				exit = true;
			} else {
				System.out.println("Not a possible selection, please select again.");		
			}
		}
		searchArgument = tempSearchArgument;
		String name = null;
		boolean found = false;
		if (searchArgument == 1) {
			Student[] students = S.getStudents();
			System.out.println("Input the last name of the student to search for: ");
			name = in.next();
			for (Student s : students) {
				if (s.getLast().equals(name)) {
					System.out.println("Student Found!\n Information: " + s.getDetails());
					found = true;
				}
			}
		} else if (searchArgument == 2) {
			Teacher[] teachers = T.getTeachers();
			System.out.println("Input the last name of the teacher to search for: ");
			name = in.next();
			for (Teacher t : teachers) {
				if (t.getlName().equals(name)) {
					System.out.println("Teacher Found!\n Information: " + t.getDetails());
					found = true;
				}
			}
		} else if (searchArgument == 3) {
			admin[] admins = A.getAdmins();
			System.out.println("Input the last name of the administrator to search for: ");
			name = in.next();
			for (admin a : admins) {
				if (a.getlNAME().equals(name)) {
					System.out.println("Administrator Found!\n Information: " + a.getDetails());
					found = true;
				}
			}
		} else {
			Course[] cou = C.getCourseArray();
			System.out.println("Input the last name of the course to search for: ");
			name = in.next();
			for (Course a : cou) {
				if (a.getCourseName().equals(name)) {
					System.out.println("Course Found!\n Information: " + a.getDetails());
					System.out.println("\nStudents:" + returnTeacher(name));
					System.out.println("\nStudents:" + returnStudents(name));

					found = true;
				}
				if (!found) {
					System.out.println("Cannot find the person.");
				}
			}
		}

	}
	
	public void sort(AdministratorDatabase a, CourseListDatabase c, StudentDatabase s, TeacherDatabase t) {
		int i = 0;
		while (i < c.getCourseArray().length) {
			c.getCourseArray()[i].setStudentArray(this.returnStudents(c.getCourseArray()[i].getCourseName()));
			for (int ii = 0; ii < 20; i++) {
			System.out.println(c.getCourseArray()[i].sortStudents()[ii]);
			}
			i++;
		}
		
		i = 0;
		while (i < c.getCourseArray().length) {
			c.getCourseArray()[i].Sort();
			i++;
		}
	}
}
