/**
 * Child Class of Robot: Dog Robot
 * Extends the Abstract Base Class Robot
 * @author Warren Beagle
 */
public class DogRobot extends Robot {

	/**
	 * DogRobot Constructor
	 * Gets the Constructor from the parent class Robot with the name parameter
	 * Sets the move behavior to a new crawl behavior
	 * Sets the talk behavior to a new bark behavior
	 * @param name
	 */
	public DogRobot(String name) {
		super(name);
		moveBehavior = new CrawlBehavior();
		talkBehavior = new BarkBehavior();
	}
	
	/**
	 * Abstract to string method from the parent class that is unique
	 * @return string statement with the name
	 */
	public String toString() {
		return (name + " is a happy dog robot");
	}
	
}
