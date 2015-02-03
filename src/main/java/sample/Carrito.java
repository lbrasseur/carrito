package sample;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrito {
	@Id
	@GeneratedValue
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "carrito")
	private Set<Item> items;

	public Carrito() {
	}

	public Carrito(Item... initialItems) {
		items = new HashSet<Item>();
		for (Item item : initialItems) {
			addItem(item);
		}
	}

	public void addItem(Item item) {
		items.add(item);
		// Esto es necesario para que cargue la "clave foranea"
		item.setCarrito(this);
	}

	public Integer getId() {
		return id;
	}

	public Set<Item> getItems() {
		return items;
	}
}
