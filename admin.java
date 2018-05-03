package main;
import java.util.*; 

public class admin extends Perosn implements schoolRecord{
	
	static int l;
	private String iD_nUMBER, fNAME, lNAME, aDDRESS, cITY, pHONE, pOSITION;
	private String salary;
	String name[] = {"Boris","Tim","Elizabeth","Micale","Jim","Fredo","Payne","Barret","Porfanofskisiki","Boristin"};
	String city[] = {"New York, NY [83448]", "Borisville, NY [76466]", "Los Alamos, NM [87544]", "New Caprica, YT [65387]", "Twin Peaks, WA [89733]", "Null Island, CK [76466]", "Agloe, NY [653647]", "Hell, MI [52933]", "U Thant Island, NY [83744]", "Banjawarn, NY [48566]"};                                   
	String address[] = {"Tim St","Boris St", "Main Rd", "Abby Rd", "Copperhead Rd", "Delancy St", "45th St", "48th St", "leerino St", "Steeeeeeve St"};
	//aDDRESS, cITY, sTATE, zIP
	
	public admin() {
		int[] seed = new int[4];
		Random ran = new Random();
		
		for (int i = 0; i <= 3; i++) {
			seed[i] = ran.nextInt(10);
		}
		iD_nUMBER = Integer.toString(l+1) + '\n';
		l++;
		//iD_nUMBER = Integer.toString(seed[1] + seed[3] + seed[0] + seed[2]);
		pHONE = "(505) 576 ";
		pHONE += Integer.toString(seed[1]) + Integer.toString(seed[3]) + Integer.toString(seed[0]) + Integer.toString(seed[2]) + '\n';
		fNAME = name[seed[2]] + '\n';
		lNAME = name[seed[0]] + '\n';
		cITY = city[seed[3]]  + '\n';
		aDDRESS = address[seed[1]] + '\n';
		pOSITION = "ADMIN." + '\n';
		salary = '$'+ Integer.toString(seed[3]) + Integer.toString(seed[3]) + '.' + Integer.toString(seed[0]) + Integer.toString(seed[2]) + '\n';
		
		
	}
	
	public void createRandom() {
	} 

	public String getSummary() {
	return fNAME + lNAME + iD_nUMBER + salary;
	
	}
	
	
	public String getDetails() {
		return iD_nUMBER + fNAME + lNAME + aDDRESS + cITY + pHONE + pOSITION + salary;
	}
	
	
	public Person[] Sort() {
		
		return null;
	}

	public String getiD_nUMBER() {
		return iD_nUMBER;
	}

	public String getfNAME() {
		return fNAME;
	}

	public String getlNAME() {
		return lNAME;
	}

	public String getaDDRESS() {
		return aDDRESS;
	}

	public String getcITY() {
		return cITY;
	}

	public String getpHONE() {
		return pHONE;
	}

	public String getpOSITION() {
		return pOSITION;
	}

	public String getSalary() {
		return salary;
	}
	 
}
