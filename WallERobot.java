/**
 * Child Class of Robot: Wall-E Robot
 * Extends the Abstract Base Class Robot
 * @author Warren Beagle
 */
public class WallERobot extends Robot{
	
	/**
	 * WallERobot Constructor
	 * Gets the Constructor from the parent class Robot with the name parameter
	 * Sets the move behavior to a new walk behavior
	 * Sets the talk behavior to a new simple speak behavior
	 * @param name
	 */
	public WallERobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SimpleSpeakBehavior();
	}
	
	/**
	 * Abstract to string method from the parent class that is unique
	 * @return string statement with the name
	 */
	public String toString() {
		return (name + " is an environmentally friendly Wall-E Robot");
	}

}
