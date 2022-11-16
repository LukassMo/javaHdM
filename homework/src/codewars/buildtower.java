package codewars;

public class buildtower {
	public static String[] towerBuilder(int nFloors) {
		String buildingstring = "";
		for(int i=1; i <= nFloors+0.5*i ; i++) {
			boolean x = true;
			buildingstring = buildingstring + "*";
			if(nFloors == 1||(i+2)%3==0) {
				buildingstring = buildingstring + ("\n");
				x = false;
			
			}
		}
		System.out.println(buildingstring);
		return new String[0];
	}
}
