import javax.swing.JOptionPane;

public class DicTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dice singleDice = new Dice();
		Dice x3Dice = new TrippleDice();
		
		int currentRollResult = 0,
			tripleRollResult = 0;

		boolean notDoneRolling = true;
		
		singleDice.ClearHistoryArray();
		
		while (notDoneRolling)
		{
			currentRollResult = singleDice.RollDice();
			tripleRollResult = x3Dice.RollDice();
			
			JOptionPane.showMessageDialog(null, "Single roll output: " + currentRollResult);
			JOptionPane.showMessageDialog(null, "TrippleDice roll output: " + tripleRollResult);
			JOptionPane.showMessageDialog(null, "singleDice rollcount: " + singleDice.RollCountMsg());
			JOptionPane.showMessageDialog(null, "x3Dice rollcount: " + x3Dice.RollCountMsg());
			
			singleDice.RollHistoryArray(currentRollResult);
			
			String playAgain = JOptionPane.showInputDialog( null, "Would you like to roll again? (Enter 1 for Yes and 2 for No.");
					
			if (playAgain.equals("2"))
				notDoneRolling = false;
		
		}
		
	}

}
