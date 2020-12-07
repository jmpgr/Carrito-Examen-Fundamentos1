package com.acing;

import java.util.Collection;

public class Producto implements Comerciable{
	private int id;
	private String descripcion;
	private Marca marca;
	private double precio;
	

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Marca getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}
	
	public Producto(int id, String descripcion, Marca marca, double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}

	public Producto(String descripcion, Marca marca, double precio) {
		this(-1, descripcion, marca, precio);

	}

	@Override
	public String toString() {
		
		return getDescripcion() + "-" + getMarca();

	}
}
