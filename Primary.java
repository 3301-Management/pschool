package main;

public class Primary {

	public static void main(String[] args) {
		//40 sudents 20 teachers 4 admmins
		StudentDatabase studentDatabase = new StudentDatabase();
		System.out.println("1");
		CourseListDatabase courseDatabase = new CourseListDatabase();
		TeacherDatabase teacherDatabase = new TeacherDatabase();
		AdministratorDatabase administratorDatabase = new AdministratorDatabase();
		System.out.println("2");
		courseDatabase.Populate();
		System.out.println("2.1");
		studentDatabase.Populate();
		System.out.println("2.3");
		teacherDatabase.Populate();
		System.out.println("2.4");
		administratorDatabase.Populate();
		System.out.println("3");
		ledger schedule = new ledger(administratorDatabase, courseDatabase, studentDatabase, teacherDatabase );
		System.out.println("4");
		schedule.search(administratorDatabase, courseDatabase, studentDatabase, teacherDatabase);
		System.out.println("5");
		schedule.sort(administratorDatabase, courseDatabase, studentDatabase, teacherDatabase);
		System.out.println("6");
		
				
			
		
		

	}

}
