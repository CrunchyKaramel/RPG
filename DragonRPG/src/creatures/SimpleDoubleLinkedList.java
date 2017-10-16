package creatures;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class SimpleDoubleLinkedList<E> {
	
	private ListElement<E> head;

	/**
	 * Creates and empty list.
	 */
	public SimpleDoubleLinkedList() {
		this.head = null;
	}
	
	/**
	 * Adds an item to a specific position in the list, or not if the position is invalid.
	 * @param index the desired position of the item.
	 * @param item the item of the type E to be included.
	 * @return true if the item was successfully added, otherwise false.
	 */
	public boolean add(int index, E item) {
		ListElement<E> newElement = new ListElement<E>(item);
		ListElement<E> current = this.head;
		for (int i = 0; i < index; i++) {
			if (current == null) {
				return false;
			}
			current = current.getNext();
		}
		newElement.setNext(current.getNext());
		newElement.setPrevious(current);
		return true;
	}

	/**
	 * Returns an item on a specific position.
	 * @param index the position of the desired item.
	 * @return the item at the specified position.
	 */
	public E get(int index) {
		ListElement<E> current = this.head;
		for (int i = 0; i <= index; i++) {
			if (current == null) {
				return null;
			}
			current = current.getNext();
		}
		return current.get();
	}

	/**
	 * Pulls an item from the list and returns it.
	 * @param index the position of the desired item.
	 * @return the item that is being pulled from the list.
	 */
	public E pull(int index) {
		ListElement<E> current = this.head;
		for (int i = 0; i <= index; i++) {
			if (current == null) {
				return null;
			}
			current = current.getNext();
		}
		current.remove();
		return current.get();
	}
	
	/**
	 * Removes an item from the list.
	 * @param index the position of the desired item.
	 */
	public void remove(int index) {
		ListElement<E> current = this.head;
		for (int i = 0; i <= index; i++) {
			if (current == null) {
				return;
			}
			current = current.getNext();
		}
			current.remove();
	}

	/**
	 * Tries to change the item of a cell, and tells if it was doable or not.
	 * @param index the new position of the new item.
	 * @param newItem the item to be included.
	 * @return true if the item was successfully adde, otherwise false.
	 */
	public boolean set(int index, E newItem) {
		ListElement<E> current = this.head;
		for (int i = 0; i <= index; i++) {
			if (current == null) {
				return false;
			}
			current = current.getNext();
		}
		current.set(newItem);
		return true;
	}
	
	/**
	 * A single cell of the Sortable List. It is doubly linked, can change its linked neighbors without breaking its structure, can delete itself from the list and can change its stored content.
	 * @author Toxic_Iceman
	 *
	 * @param <F>
	 */
	class ListElement<F> {
		private ListElement<F> next;     //the next cell
		private ListElement<F> previous; //the previous cell
		private F content;            //the stored content of the cell
		
		/**
		 * Creates a filled cell.
		 * @param item the content filling this cell.
		 */
		ListElement(F item) {
			this.next = null;
			this.previous = null;
			this.content = item;
		}
		
		/**
		 * Retrieves the currently stored content.
		 * @return stored content of the type F.
		 */
		F get() {
			return this.content;
		}
		
		/**
		 * Retrieves the following cell.
		 * @return the next cell of the type ListElement, or null if nonexistent.
		 */
		ListElement<F> getNext() {
			return this.next;
		}
		
		/**
		 * Retrieves the previous cell.
		 * @return the previous cell of the type ListElement, or null if nonexistent.
		 */
		ListElement<F> getPrevious() {
			return this.previous;
		}
		
		/**
		 * Sets the content to be stored in this cell.
		 * @param content object of the type F.
		 */
		void set(F content) {
			this.content = content;
		}
		
		/**
		 * Sets the following cell while keeping the list structure intact.
		 * @param next cell of the type ListElement
		 */
		void setNext(ListElement<F> next) {
			this.next = next;
			if (this.next != null) {
				this.next.setPrevious(this);
			}
		}
		
		/**
		 * Sets the previous cell while keeping the list structure intact.
		 * @param previous cell of the type ListElement
		 */
		void setPrevious(ListElement<F> previous) {
			this.previous = previous;
			if (this.previous != null) {
				this.previous.setNext(this);
			}
		}
		
		/**
		 * removes the cell while keeping the list structure intact.
		 */
		void remove() {
			if (this.next != null) {
				this.next.setPrevious(this.previous);
			}
			if (this.next == null || this.previous != null) {
				this.previous.setNext(this.next);
			}
		}
	}
}
