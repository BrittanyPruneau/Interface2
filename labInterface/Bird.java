/**
 * @author Brittany Pruneau 
 * 
 * Describes how a bird can fly. 
 */
package labInterface;

public class Bird implements Flyable
{
	private final String type;
	/**
	 * 
	 * @param t Defines the type of bird. 
	 */
	public Bird(String t)
	{
		type = t;
	}
	/**
	 * Prints the type of bird.  
	 */
	@Override
	public String toString()
	{
		return type;
	}
	/**
	 * Describes how a bird launches into flight. 
	 */
	@Override
	public void launch() 
	{
		System.out.println("Flapping the wings to take off");
	}
	/**
	 * Describes how a bird lands. 
	 */
	@Override
	public void land() 
	{
		System.out.println("Flapping the wings until landing");
	}
}
