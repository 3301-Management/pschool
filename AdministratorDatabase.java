package main;

public class AdministratorDatabase extends schoolDatabase {
	admin[] admins = new admin[2];
	
	public void Populate() {
		int x = 0;
		while(x < admins.length) {
			admins[x] = new admin();
			//admins[x].createRandom();
			x++;
		}
	}
	public admin[] getAdmins() {
		return admins;
	}
	public void setAdmins(admin[] admins) {
		this.admins = admins;
	}
	public void setSchedule() {
		
	}

}



















