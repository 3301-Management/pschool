package main;
import main.Primary;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
 
public class Teacher extends Person implements schoolRecord {
    private String ID, fName, lName, Address, City, State, Zip, Phone;
    private double salary;
    Course[] courses = new Course[4];
    String[] names = new String[40];
    Random rand = new Random();
 
    public Teacher(String fname, String lname, String address, String city, String zip, String phone, double salary) {
        fName = fname;
        lName = lname;
        Address = address;
        City = city;
        Zip = zip;
        Phone = phone;
        this.salary = salary;
    }
 
    public  Teacher(){
        names[0] = "BJÖRGHILDUR";
        names[1] = "INGVELDUR";
        names[2] = "MÆJA";
        names[3] = "MATTHILDUR";
        names[4] = "UNNUR";
        names[5] = "CHALCHIUHTICUE";
        names[6] = "COZAMALOTL";
        names[7] = "MALINALXOCHITL";
        names[8] = "NOXOCHICOZTLI";
        names[9] = "TEYACAPAN";
        names[10] = "YOLYAMANITZIN";
        names[11] = "HATOON";
        names[12] = "KNARIG";
        names[13] = "LOUSNTAK";
        names[14] = "NAZANI";
        names[15] = "BOGDANA";
        names[16] = "MAGDA";
        names[17] = "VLADIMIRA";
        names[18] = "ZARIA";
        names[19] = "MOKOSH";
        names[20] = "DRAHOSLAVA";
        names[21] = "DRAHOMIR";
        names[22] = "ELIŠKA";
        names[23] = "JINDŘIŠKA";
        names[24] = "JOSEFA";
        names[25] = "FISHEL";
        names[26] = "ZUSMANN";
        names[27] = "AERONWY";
        names[28] = "ANGHARAWD";
        names[29] = "BLODEUWEDD";
        names[30] = "DILYS";
        names[31] = "EFA";
        names[32] = "GWENGWYVAR";
        names[33] = "CONDWIRAMURS";
        names[34] = "DANBRANN";
        names[35] = "HOSï¿½";
        names[36] = "TOSHIBA";
        names[37] = "NIN-AKHA-GUDDU";
        names[38] = "NABU-BEL-SHUM";
        names[39] = "ADRAHASIS";
 
        fName = names[rand.nextInt(39)];
        lName = names[rand.nextInt(39)];
 
    }
 
    public String getSummary() {
        return fName + " " + lName + " " + ID;
    }
 
    public String getDetails() {
        return ID + " " + fName + " " + lName + " " + Address + " " + City + " " + State + " " + Zip + " " + Phone;
    }
 
    public String getID() {
        return ID;
    }
 
    public void setID(String iD) {
        ID = iD;
    }
 
    public String getfName() {
        return fName;
    }
 
    public void setfName(String fName) {
        this.fName = fName;
    }
 
    public String getlName() {
        return lName;
    }
 
    public void setlName(String lName) {
        this.lName = lName;
    }
 
    public String getAddress() {
        return Address;
    }
 
    public void setAddress(String address) {
        Address = address;
    }
 
    public String getCity() {
        return City;
    }
 
    public void setCity(String city) {
        City = city;
    }
 
    public String getState() {
        return State;
    }
 
    public void setState(String state) {
        State = state;
    }
 
    public String getZip() {
        return Zip;
    }
 
    public void setZip(String zip) {
        Zip = zip;
    }
 
    public String getPhone() {
        return Phone;
    }
 
    public void setPhone(String phone) {
        Phone = phone;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public String[] getNames() {
        return names;
    }
 
    public void setNames(String[] names) {
        this.names = names;
    }
 
    public Person[] Sort(ledger P) {
        ArrayList<String> courses = new ArrayList<String>();
       
        for(int i = 0; i < P.returnCourses(this.getfName()).length; i++) {
       
        courses.add(P.returnCourses(this.getfName())[i]); // puts output of returncourses() into courses
        }
        Collections.sort(courses);
        Person[] dam_ruski = new Person[courses.size()];
        for (int i = 0; i <= (courses.size()-1); i++) {
        	System.out.println(courses.get(i));
        }
        return dam_ruski;
    }

	@Override
	public Person[] Sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRandom() {
		// TODO Auto-generated method stub
		
	}
}