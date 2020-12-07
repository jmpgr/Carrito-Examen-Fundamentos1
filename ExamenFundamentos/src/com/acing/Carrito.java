package com.acing;


import java.util.*;

public class Carrito {

	private Collection<Comerciable> productos = new ArrayList<>();

	public Collection<Comerciable> getProductos() {
		return productos;
	}

	public boolean addProducto(Comerciable p) {
		return getProductos().add(p);
	}

	public double getValorCarrito() {
		double total = 0;
		for (Comerciable comerciable : getProductos()) {
			total += comerciable.getPrecio();
		}
		return total;
	}

	
	public String getInformeCarrito() {
		String informe ="";
//		List <Comerciable> listaComerciables =new ArrayList<Comerciable>();
//		listaComerciables.addAll(getProductos());
//		Collections.sort(listaComerciables, new Comparator<Comerciable>() {
//			 public int compare(Comerciable p1, Comerciable p2) {
//	                return Double.compare(p1.getPrecio(), p2.getPrecio());
//			 }
//		});
		Collections.sort((ArrayList<Comerciable>)getProductos(), new Comparator<Comerciable>() {
			public int compare (Comerciable p1, Comerciable p2) {
				return Double.compare(p1.getPrecio(), p2.getPrecio());
			}
		});
		for (Comerciable comerciable : productos) {
            informe += comerciable + " " + comerciable.getPrecio() +" euros\n";
        }
        // Esta seria la mejor forma, pero se podria dejar con mas decimales si no lo piden
        informe += String.format("\tEl total es: %.2f euros\n", getValorCarrito());
        
        return informe;
		}
		
	}


