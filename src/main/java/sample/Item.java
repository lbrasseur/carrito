package sample;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String descripcion;

	@Column
	private Double monto;

	@ManyToOne(cascade = CascadeType.ALL)
	private Carrito carrito;

	public Item() {
	}

	public Item(String descripcion, Double monto) {
		this.descripcion = descripcion;
		this.monto = monto;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getMonto() {
		return monto;
	}

	public Carrito getCarrito() {
		return carrito;
	}
}
