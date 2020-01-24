/**
 * Abstract Base Class Robot
 * @author Warren Beagle
 */
public abstract class Robot {
	
	/** Instance variables; protected to be accessed by the children. */
	protected String name;
	protected MoveBehavior moveBehavior;
	protected TalkBehavior talkBehavior;
	
	/**
	 * Robot Constructor
	 * Sets the name to name parameter
	 * @param name
	 */
	public Robot(String name) {
		this.name = name;
	}
	
	/**
	 * Set Move Behavior Constructor
	 * Sets the move behavior to MoveBehavior parameter
	 * @param mb
	 */
	public void setMoveBehavior(MoveBehavior mb) {
		moveBehavior = mb;
	}
	
	/**
	 * Set Talk Behavior Constructor
	 * Sets the talk behavior to TalkBehavior parameter
	 * @param tb
	 */
	public void setTalkBehavior(TalkBehavior tb) {
		talkBehavior = tb;
	}
	
	/**
	 * Return the move behavior of the robot
	 * @return move behavior
	 */
	public String move() {
		return moveBehavior.move();
	}
	
	/**
	 * Return the talk behavior of the robot
	 * @return talk behavior
	 */
	public String talk() {
		return talkBehavior.talk();
	}
	
	/** Abstract to string method that is unique in the children */
	public abstract String toString();
	
}
