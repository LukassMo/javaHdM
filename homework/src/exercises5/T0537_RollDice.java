package exercises5;

public class T0537_RollDice {
	public static void main(String[] args) {
		double moneyBalance = 0;
		int sum;
		
		for(int i=0;i<1000;i++) {
			moneyBalance = moneyBalance - 0.5; //cost for playing 1 round
			int diceOne =(int)(Math.random() * 6) + 1;
			int diceTwo =(int)(Math.random() * 6) + 1;
			sum = diceOne+diceTwo;
			
			if(sum<=6) {
				moneyBalance = moneyBalance; // Player looses 0.5 
			}
			else if(sum<=9){
				moneyBalance = moneyBalance + 0.5; // No profit or loss
			}
			else if(sum==10){
				moneyBalance = moneyBalance + 1; //Profit of 0.5
			}
			else if(sum==11){
				moneyBalance = moneyBalance + 1.5; //Profit of 1
			}
			else if(sum==12){
				moneyBalance = moneyBalance + 2; //Profit of 1.5
			}
		}
		System.out.println("You now have " + moneyBalance + "€");
	}
}
