/**
 * @author Brittany Pruneau
 * 
 * Describes how a plane can fly. 
 */
package labInterface;

public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;
	/**
	 * 
	 * @param engines  Stores the number of engines in a particular plane. 
	 * @param m  	   Labels the specific model plane.  
	 */
	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}
	/**
	 * Prints the specific model of plane and the number of engines.   
	 */
	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}
	/**
	 * Describes how a plane launches into flight. 
	 */
	@Override
	public void launch() 
	{
		System.out.println("Rolling until take-off");
		
	}
	/**
	 * Describes how a plane lands. 
	 */
	@Override
	public void land() 
	{
		System.out.println("Rolling to a stop");
		
	}
}
