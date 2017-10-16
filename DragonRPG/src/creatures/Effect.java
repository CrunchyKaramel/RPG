package creatures;

/**
 * Interface that contains all necessary methods for effects.
 * @author Toxic_Iceman
 *
 */
public interface Effect {
	
	/**
	 * Tries to activate the effect.
	 * @return true if the effect was successfully activated, otherwise false.
	 */
	public boolean activate();
	
	/**
	 * Tries to deactivate the effect.
	 * @return True if the effect was deactivated, otherwise false.
	 */
	public boolean deactivate();
	
	/**
	 * Tries to add an entity affected by the effect.
	 * @param c the entity of the type Creature.
	 * @return True if the entity was added to the affected entities, otherwise false.
	 */
	public boolean addAffected(Creature c);
	
	/**
	 * Removes an entity from the list of affected entities.
	 * @param c entity to be removed.
	 */
	public void removeAffected(Creature c);
	
	/**
	 * Tells if the effect is currently active or not.
	 * @return true if the effect is currently active, otherwise false.
	 */
	public boolean isActive();
	
	/**
	 * Expires the effect, making it unusable.
	 */
	public void expire();
}
