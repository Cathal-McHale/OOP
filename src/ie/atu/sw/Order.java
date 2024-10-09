package ie.atu.sw;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Item> items = new ArrayList<>();

	public int count() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public boolean hasItem(Object item) {
		return items.contains(item);
	}

	public boolean add(Item item) {
		return items.add(item);
	}

	public void clear() {
		items.clear();
	}

	public Item remove(int index) {
		return items.remove(index);
	}
	
	
	
}
