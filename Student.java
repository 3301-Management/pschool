package main;
 
import main.schoolDatabase;
import java.util.Random;
 
public class Student extends Person implements schoolRecord {
	static int l;
	private String ID, first, last, address, city, state, zip, phone;
    private int[] grade = new int[7];
    Course[] courses = new Course[7];
    Random rand = new Random();
    String[] names = new String[40];
 
    public Student(String first, String last, String address, String city, String state, String zip, String phone) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.grade = grade;
    }
    

 
    public String getFirst() {
        return first;
    }
 
    public void setFirst(String first) {
        this.first = first;
    }
 
    public String getLast() {
        return last;
    }
 
    public void setLast(String last) {
        this.last = last;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getZip() {
        return zip;
    }
 
    public void setZip(String zip) {
        this.zip = zip;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public double getGrade(int n) {
        return grade[n];
    }
 
    public String getID() {
        return ID;
    }
 
    public void setGrade(int[] grade) {
        this.grade = grade;
    }
 
    public double getGPA() {
        double GPA = 0;
        for (int i = 0; i < grade.length; i++) {
            GPA = GPA + getGrade(i);
 
        }
        return GPA;
 
    }
 
    public Course getCourses(int i) {
        return courses[i];
    }
 
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
 
    public void setID(String iD) {
        ID = iD;
    }
 
    public Student() {
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
 
        first = names[rand.nextInt(39)];
        last = names[rand.nextInt(39)];
        
        //private String ID, first, last, address, city, state, zip, phone;
        
    String name[] = {"Boris","Tim","Elizabeth","Micale","Jim","Fredo","Payne","Barret","Porfanofskisiki","Boristin"};
    	String city1[] = {"New York, NY [83448]", "Borisville, NY [76466]", "Los Alamos, NM [87544]", "New Caprica, YT [65387]", "Twin Peaks, WA [89733]", "Null Island, CK [76466]", "Agloe, NY [653647]", "Hell, MI [52933]", "U Thant Island, NY [83744]", "Banjawarn, NY [48566]"};                                   
    	String address1[] = {"Tim St","Boris St", "Main Rd", "Abby Rd", "Copperhead Rd", "Delancy St", "45th St", "48th St", "leerino St", "Steeeeeeve St"};
 
    	int[] seed = new int[4];
		Random ran = new Random();
		
		for (int i = 0; i <= 3; i++) {
			seed[i] = ran.nextInt(10);
		}
		ID = Integer.toString(l+1) + '\n';
		l++;
		//iD_nUMBER = Integer.toString(seed[1] + seed[3] + seed[0] + seed[2]);
		phone = "(505) 576 ";
		phone += Integer.toString(seed[1]) + Integer.toString(seed[3]) + Integer.toString(seed[0]) + Integer.toString(seed[2]) + '\n';
		city = city1[seed[3]]  + '\n';
		address = address1[seed[1]] + '\n';
		//pOSITION = "ADMIN." + '\n';
		//salary = '$'+ Integer.toString(seed[3]) + Integer.toString(seed[3]) + '.' + Integer.toString(seed[0]) + Integer.toString(seed[2]) + '\n';
    }
 
    public String getSummary() {
        return first + " " + last + " " + ID;
    }
 
    public String getDetails() {
        return ID + " " + first + " " + last + " " + address + " " + city + " " + phone;
    }
 
    public Person[] Sort() {
        return null;
    }



	@Override
	public void createRandom() {
		// TODO Auto-generated method stub
		
	}
}