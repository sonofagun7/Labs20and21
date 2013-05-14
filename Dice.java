import javax.swing.*;

/**
 * 
 */

/**
 * @author dhuynh
 *
 */
/*--------------- Parent Class Dic ---------------*/
public class Dice
{
	  private int numberofrolls = 0;
	  private int numberofdices = 1;

	  private int[] rollArray = new int[10];
	  	  
	  public void setDiceCount(int n )
	  {
	  /*--------------- Set number of dices ---------------*/
		  numberofdices = n;
	  }
	  
	  public Dice()
	  {
	  /*--------------- Dice Constructor    ---------------*/
		  numberofrolls = 0;
		  numberofdices = 1;
	  }
	  
	  public int RollDice()
	  /*--------------- Roll Dice(s) and increment RollCounts    ---------------*/
	  {
		int rndno;
		rndno = (1 + (int) (Math.random() *  6))* numberofdices;
		numberofrolls = numberofrolls + numberofdices ;
	  
	  	return rndno;
	  }

	  public int RollCount()
	  {
	  	return numberofrolls;
	  }
	  
	  public String RollCountMsg()
	  {
	  	return "Dices rolled thus far: " + numberofrolls ;
	  }
	  
	  public void ClearHistoryArray()
	  {
		  
		  for (int i = 0; i < 9; i++)
			  rollArray[i] = 0;
	  }
	  
	  public void RollHistoryArray(int current)
	  {
	  
		  JOptionPane.showMessageDialog(null, "Roll History:\n" + 
				  							  "Current Roll: " + current + "\n" +
				  							  "1 Roll Ago: " + rollArray[9] + "\n" +
				  							  "2 Rolls Ago: " + rollArray[8] + "\n" +
				  							  "3 Rolls Ago: " + rollArray[7] + "\n" +
				  							  "4 Rolls Ago: " + rollArray[6] + "\n" +
				  							  "5 Rolls Ago: " + rollArray[5] + "\n" +
				  							  "6 Rolls Ago: " + rollArray[4] + "\n" +
				  							  "7 Rolls Ago: " + rollArray[3] + "\n" +
				  							  "8 Rolls Ago: " + rollArray[2] + "\n" +
				  							  "9 Rolls Ago: " + rollArray[1] + "\n" +
				  							  "10 Rolls Ago: " + rollArray[0] + "\n");
		  for (int i = 0; i < 9; i ++)
		  {
			  rollArray[9] = current;
			  rollArray[i] = rollArray[i + 1];
			 
		  }
	  }
	  
}
