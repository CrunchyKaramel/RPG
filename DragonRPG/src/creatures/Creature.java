package creatures;

/**
 * An abstract class defining all bases for a Creature, which are the (non-)playable Characters for this game.
 * @author Toxic_Iceman
 *
 */
public abstract class Creature {
	private String className;
	private String name;
	private BaseStats stats;
	private SimpleDoubleLinkedList<Effect> effects;
	private SimpleDoubleLinkedList<Limb> limbs;
	private SimpleDoubleLinkedList<Creature> knownCreatures;
	private SimpleDoubleLinkedList<Creature> nearbyCreatures;
	//TODO Add known locations
	
	/**
	 * Returns the name of the class this Creature is of.
	 * @return the name of this class.
	 */
	public abstract String getClassname();
	
	/**
	 * Returns the name of this Creature.
	 * @return the name of the Creature.
	 */
	public abstract String getName();
	
	/**
	 * Returns the stats of the Creature.
	 * @return the current stats of the Creature.
	 */
	public abstract BaseStats getStats();
	
	/**
	 * Returns a specific stat.
	 * @return the desired stat.
	 */
	public abstract int getStat();
	
	/**
	 * Changes the stats of the Creature.
	 * @param the index of the stat to be changed.
	 * @param value the delta of the change.
	 */
	public abstract void changeStat(int index, int value);
	
	/**
	 * Returns an Effect influencing the Creature, no matter whether it is currently active or not.
	 * @param index the index of the desired Effect.
	 */
	public abstract Effect getEffect(int index);
	
	/**
	 * Affects the Creature by adding an effect.
	 */
	public abstract void affect(Effect effect);
	
	/**
	 * Removes an effect from the Creature.
	 * @param effect the effect to be removed.
	 */
	public abstract void removeEffect(Effect effect);
	
	/**
	 * Removes an effect from the Creature.
	 * @param index the index of the Effect to be removed.
	 */
	public abstract void removeEffect(int index);
	
	/**
	 * Retrieves a limb of the Creature.
	 * @param index the index of the limb.
	 * @return the desired limb.
	 */
	public abstract Limb getLimb(int index);
	
	/**
	 * Adds an effect to a limb.
	 * @param limb the desired limb to be affected.
	 * @param effect the effect to be added.
	 */
	public abstract void affectLimb(Limb limb, Effect effect);
	
	/**
	 * Removes an Effect from a limb.
	 * @param effect the Effect to be removed.
	 */
	public abstract void removeEffect(Limb limb, Effect effect);
	
	/**
	 * Removes an effect from a limb.
	 * @param limb the desired limb to be affected.
	 * @param index the index of the effect to be removed.
	 */
	public abstract void removeEffect(Limb limb, int index);
	
	
	//TODO extend javadoc
	/**
	 * Gets 
	 * @param index
	 * @return
	 */
	public abstract Creature getKnownCreature(int index);
	
	/**
	 * Adds a Creature to the list known Creatures.
	 * @param creature the Creature to be met.
	 * @return true if the creature was already known, else false.
	 */
	public abstract boolean meetCreature(Creature creature);
	
	/**
	 * Removes a Creature from the known Creatures.
	 * @param creature the Creature to be removed.
	 */
	public abstract void removeCreatureFromContacts(Creature creature);
	
	/**
	 * Removes a Creature from the known Creatures.
	 * @param index the index of the Creature to be removed.
	 */
	public abstract void removeCreatureFromContacts(int index);
	
	/**
	 * Adds a Creature to the nearby Creatures.
	 * @param creature the Creature nearby.
	 * @return true if the Creature was already nearby, else false.
	 */
	public abstract boolean senseCreature(Creature creature);
	
	//TODO getters and checkers for limbs, lists and effects.
}
