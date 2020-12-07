package com.app;

import java.util.*;

import java.util.Collection;
import java.util.List;

import com.acing.*;

public class App {
	
	private static final Collection <Comerciable> PRODUCTOS= new ArrayList<Comerciable>();
	int[] almacen;
	private Carrito carrito;
	
	
	public int[] getAlmacen() {
		return almacen;
	}


	public static void main(String[] args) {
		
		App app=new App();
		Carrito carrito=new Carrito();
		carrito.addProducto(new Producto(1,"12 latas", new Marca("CocaCola"),6.01));		
		carrito.addProducto(new Producto(2,"Leche Semi", new Marca("President"),0.72));
		carrito.addProducto(new Producto(5, "Dentifrico", new Marca("OralB"), 1.99));
		carrito.addProducto(new Producto("Crimen y Castigo", new Marca(""), 5.99));

		System.out.println(carrito.getProductos());
		System.out.println(carrito.getInformeCarrito());
		Iterator<Comerciable> iterador=PRODUCTOS.iterator();
	}
	


}
