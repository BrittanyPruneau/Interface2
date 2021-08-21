/**
 * @author Brittany Pruneau 
 * 
 * Describes how a Hangglider can fly. 
 */
package labInterface;

public class Hangglider implements Flyable
{
	private final boolean isRigidWing;
	/**
	 * 
	 * @param rigidWing Declares if a Hangglider is a rigidWing or not.  
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}
	/**
	 * Prints if the hangglider is a rigid-wing or a flex-wing.  
	 */
	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}
	/**
	 * Describes how a hangglider launches into flight. 
	 */
	@Override
	public void launch() 
	{
		System.out.println("Running until take-off");
	}
	/**
	 * Describes how a hangglider lands. 
	 */
	@Override
	public void land() 
	{
		System.out.println("Gliding to a land");
	}
}
