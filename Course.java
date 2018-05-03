package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Course implements schoolRecord {
	public Course() {
		
	}
	public Course(String courseName, int courseIDNumber, String[] studentArray) {
		this.courseName = courseName;
		this.courseIDNumber = courseIDNumber;
		this.studentArray = studentArray;
	}
	private String[] courseNameArray = {"AP Computer Science", "Biology", "AP Chemistry", "AP Physics C", "AP Physics 1"};
	private String courseName;
	private int courseIDNumber;
	private String[] studentArray;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseIDNumber() {
		return courseIDNumber;
	}
	public void setCourseIDNumber(int courseIDNumber) {
		this.courseIDNumber = courseIDNumber;
	}
	public String[] getStudentArray() {
		return studentArray;
	}
	public void setStudentArray(String[] studentArray) {
		this.studentArray = studentArray;
	}
	public void createRandom() {
		Random ran = new Random();
		int index = ran.nextInt(courseNameArray.length);
		courseName = courseNameArray[index];
	}
	public String getSummary() {
		return "Course name: " + courseName;
	}
	public String getDetails() {
		String studentDetails = "";
		studentDetails = "Course name: " + courseName;
		//for(int x = 0; x < studentArray.length; x++) {
		//	studentDetails = studentDetails + "\n First name: " + studentArray[x].getFirst() + ", Last name: " + studentArray[x].getLast() + ", ID : " + studentArray[x].getID();
		//}
		return studentDetails;
	}

	public String[] sortStudents() {
		int[][] numberLastNames = new int[studentArray.length][50];
		for(int x = 0; x < studentArray.length; x++) {
			numberLastNames[x] = numberLastName(studentArray[x]);
		}
		for(int x = 0; x < studentArray.length - 1; x++) { //Goes through array
			int temp = x; //Used to reset x after moving value
			while(swap(numberLastNames[x], numberLastNames[x + 1])) { //Checks if sort possible, if possible, moves value down, repeats
				int[] tempLastName = numberLastNames[x]; //Swap start
				String tempStudent = studentArray[x];
				numberLastNames[x] = numberLastNames[x + 1];
				studentArray[x] = studentArray[x + 1];
				numberLastNames[x + 1] = tempLastName; //Swap end
				studentArray[x + 1] = tempStudent;
				if(x - 1 >= 0) { //Move down by one value
					x = x - 1;
				}
			}
			x = temp;
		}
		return studentArray;
	}
	public static int[] numberLastName(String name) { //Changes lastnames into integer arrays
		int[] numberName = new int[name.length()]; //Number Name
		for(int c = 0; c <= name.length() - 1; c++) { //Converts letters to ascii
			numberName[c] = name.toLowerCase().charAt(c);
		}
		return numberName;
	}
	public static boolean swap(int[] name1, int[] name2) { //Checks if swapping is required
		try { //Try and catch statement used to keep name1 OR name2 from throwing exception(simpler than checking both arrays)
			for(int x = 0; x <= 199; x++) {
				if(name1[x] > name2[x]) { //If element on the left is greater switch
					return true;
				}
				if(name1[x] < name2[x]) { //Otherwise do not switch
					return false;
				}
			}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		return false; //If all the letters are the same, do not switch(no reason to)
	}
	@Override
	public Person[] Sort() {
		// TODO Auto-generated method stub
		return null;
	}
}
