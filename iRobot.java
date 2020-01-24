/**
 * Child Class of Robot: iRobot
 * Extends the Abstract Base Class Robot
 * @author Warren Beagle
 */
public class iRobot extends Robot{
	
	/**
	 * iRobot Constructor
	 * Gets the Constructor from the parent class Robot with the name parameter
	 * Sets the move behavior to a new run behavior
	 * Sets the talk behavior to a new speak behavior
	 * @param name
	 */
	public iRobot(String name) {
		super(name);
		moveBehavior = new RunBehavior();
		talkBehavior = new SpeakBehavior();
	}
	
	/**
	 * Abstract to string method from the parent class that is unique
	 * @return string statement with the name
	 */
	public String toString() {
		return (name + " is a scary iRobot");	
	}

}
