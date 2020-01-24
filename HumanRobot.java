/**
 * Child Class of Robot: Human Robot
 * Extends the Abstract Base Class Robot
 * @author Warren Beagle
 */
public class HumanRobot extends Robot{
	
	/**
	 * HumanRobot Constructor
	 * Gets the Constructor from the parent class Robot with the name parameter
	 * Sets the move behavior to a new walk behavior
	 * Sets the talk behavior to a new speak behavior
	 * @param name
	 */
	public HumanRobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SpeakBehavior();
	}
	
	/**
	 * Abstract to string method from the parent class that is unique
	 * @return string statement with the name
	 */
	public String toString() {
		return (name + " is a typical human robot");	
	}

}
