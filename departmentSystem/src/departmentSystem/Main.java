package departmentSystem;
import area.Area;

public class Main {

	public static void main(String[] args) {

		Area ar1 = new Area("401", "amphi");
		Area ar2 = new Area("402", "amphi");
		Area ar3 = new Area("403", "Amphi");
		Area ar4 = new Area("404", "aMphi");
		Area ar5 = new Area("405", "amphi");
		Area ar6 = new Area("406", "amPhi");
		Area ar7 = new Area("407", "ampHi");
		Area ar8 = new Area("408", "amphi");

		Area ar9 = new Area("Lab1", "lab");
		Area ar10 = new Area("lab2", "lAb");

		Area ar11 = new Area("Of.1", "office");
		Area ar12 = new Area("Of.2", "Office");
		Area ar13 = new Area("Of.3", "oFfice");
		Area ar14 = new Area("Of.4", "offİce");
		Area ar15 = new Area("Of.5", "office");

		Area ar16 = new Area("Entry1", "area");
		Area ar17 = new Area("Entry2", "area");
		Area ar18 = new Area("Entry3", "area");
		Area ar19 = new Area("Garden1", "area");
		Area ar20 = new Area("Garden2", "area");

		try {
			Area.addArea(ar13);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}