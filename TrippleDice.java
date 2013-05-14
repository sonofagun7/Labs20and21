/**
 * 
 */

/**
 * @author dhuynh
 *
 */
public class TrippleDice extends Dice 
{
	
	public TrippleDice()
	{
		super.setDiceCount(3);
	}
	
	public String RollCountMsg()
	  {
		String msg;
		msg = "Calling my super to get ";
		msg = msg + super.RollCountMsg();
	  	return msg ;
	  }

}
