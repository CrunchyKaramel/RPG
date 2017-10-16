package creatures;

/**
 * A class representing limbs from a Creature.
 * @author Toxic_Iceman
 *
 */
public class Limb {
	private LimbType type;
	private String name;
	private SimpleDoubleLinkedList<Effect> effects;
	private Creature owner;
	
	/**
	 * Creates a new Limb.
	 * @param type The type of limb.
	 * @param name A short description of the limb.
	 * @param effects Effects that are present from the start.
	 * @param owner The Creature this limb belongs to.
	 */
	protected Limb(LimbType type, String name, SimpleDoubleLinkedList<Effect> effects, Creature owner) {
		this.type = type;
		this.name = name;
		this.effects = effects;
		this.owner = owner;
	}
	
	/**
	 * Adds an effect that affect or are caused by the limb.
	 * @param newEffect The new effect that is to be added.
	 * @throws FailureToAddItemException An exception thrown when the effect wasn't able to get added to the list of effects.
	 */
	protected void addEffect(Effect newEffect) throws FailureToAddItemException {
		if (!this.effects.add(0, newEffect)) {
			throw new FailureToAddItemException();
		}
	}
	
	/**
	 * Removes an effect.
	 * @param index The position of the desired effect.
	 */
	protected void removeEffect(int index) {
		this.effects.remove(index);
	}
	
	/**
	 * Retrieves an effect that affects or is caused by the limb.
	 * @param index The position of the effect.
	 * @return The desired effect.
	 */
	protected Effect getEffect(int index) {
		return this.effects.get(index);
	}
	
}
