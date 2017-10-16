package creatures;

/**
 * This is a basic stat sheet for a Creature. It only contains basic getters and setters, and the setters are protected as only other Creatures may influence them.
 * @author Toxic_Iceman
 *
 */
public class BaseStats {
	private int health;      //Represents the Creature's health.
	private int threat;      //Represents how much of a threat other Creatures see in it.
	private int strength;    //Represents the strength of the Creature.
	private int agility;     //Represents the agility of the Creature.
	private int confidence;  //Represents the Confidence the Creature has in itself.
	
	/**
	 * Creates a new basic stat sheet.
	 * @param health the initial health of the creature.
	 * @param threat the initial threat of the creature.
	 * @param strength the initial strength of the creature.
	 * @param agility the initial agility of the creature.
	 * @param confidence the initial confidence of the creature.
	 */
	public BaseStats(int health, int threat, int strength, int agility, int confidence) {
		this.health = health;
		this.threat = threat;
		this.strength = strength;
		this.agility = agility;
		this.confidence = confidence;
	}
	
	/**
	 * Returns the current health value.
	 * @return current health value of the Creature.
	 */
	public int health() {
		return this.health;
	}
	
	/**
	 * Returns the current threat the Creature looks for others.
	 * @return current threat value of the Creature.
	 */
	public int threat() {
		return this.threat;
	}
	
	/**
	 * Returns the current strength.
	 * @return current strength value of the Creature.
	 */
	public int strength() {
		return this.strength;
	}
	
	/**
	 * Returns the current agility.
	 * @return current agility value of the Creature.
	 */
	public int agility() {
		return this.agility;
	}
	
	/**
	 * Returns the current confidence value.
	 * @return current confidence value of the Creature.
	 */
	public int confidence() {
		return this.confidence;
	}
	
	/**
	 * Changes the health value by a certain value. The health value cannot be under 0.
	 * @param change the delta value of the change.
	 */
	protected void changeHealth(int change) {
		this.health += change;
		if (this.health < 0) {
			this.health = 0;
		}
	}
	
	/**
	 * Changes the threat value by a certain value. The threat value cannot be under 0 or over 100.
	 * @param change the delta value of the change.
	 */
	protected void changeThreat(int change) {
		this.threat += change;
		if (this.threat < 0) {
			this.threat = 0;
		}
		if (this.threat > 100) {
			this.threat = 100;
		}
	}
	
	/**
	 * Changes the strength value by a certain value. The strength value cannot be under 0 or over 100.
	 * @param change the delta value of the change.
	 */
	protected void changeStrength(int change) {
		this.strength += change;
		if (this.strength < 0) {
			this.strength = 0;
		}
		if (this.strength > 100) {
			this.strength = 100;
		}
	}
	
	/**
	 * Changes the agility value by a certain value. The agility value cannot be under 0 or over 100.
	 * @param change the delta value of the change.
	 */
	protected void changeAgility(int change) {
		this.agility += change;
		if (this.agility < 0) {
			this.agility = 0;
		}
		if (this.strength > 100) {
			this.strength = 100;
		}
	}
	
	/**
	 * Changes the confidence value by a certain value. The confidence value cannot be under 0 or over 100.
	 * @param change the delta value of the change.
	 */
	protected void changeConfidence(int change) {
		this.confidence += change;
		if (this.confidence < 0) {
			this.confidence = 0;
		}
		if (this.confidence > 100) {
			this.confidence = 100;
		}
	}
}
