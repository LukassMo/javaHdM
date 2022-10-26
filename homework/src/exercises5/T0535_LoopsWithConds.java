package exercises5;

public class T0535_LoopsWithConds {
	public static void main(String[] args) {
		String correctNums = "";
		for(int i=10;i<=99;i++) {
			for(int x=10;x<=99;x++) {
				if(x+i==60) {
					if(x-i==14 || i-x==14) {
						correctNums = correctNums + x + " and " + i + "; ";
					}
				}
			}
		}
		
		System.out.println(correctNums);
	}
}
