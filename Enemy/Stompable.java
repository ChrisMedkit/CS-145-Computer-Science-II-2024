/*
 * @author masont
 * Interface to give Sprites stomp characteristics
 */
public interface Stompable {
	/**
	 * Maximum health of a Sprite
	 */
	public static final int FULL_HEALTH = 100;
	/**
	 * No more health of the Sprite
	 */
	public static final int DEATH = 0;
	/**
	 * Reduces health by 25 or a quarter of full health
	 * @return the updated health value of the Sprite
	 */
	public int stomp();
	/**
	 * @param amount the integer value to reduce health. Must be less that FULL_HEALTH and must be positive.
	 * @return updated value of Sprite health
	 */
	public int stomp(int amount);
}
