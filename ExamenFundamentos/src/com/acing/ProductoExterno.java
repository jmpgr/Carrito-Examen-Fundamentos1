package com.acing;

import com.examen.*;



public class ProductoExterno extends Product3rdParty  implements Comerciable {

	public ProductoExterno(String description, double price) {
		super(description, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return getDescription();
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return getPrice();
	}

}
