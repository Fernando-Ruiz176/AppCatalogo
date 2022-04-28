package Catalogo;

/**
 * 
 * Esta clase se desarrolla para documentar la fecha de cada venta
 * 
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

 
public class Venta {
	private LocalDateTime fecha = LocalDateTime.now();
	private ArrayList<LineaDetalle> lineasDetalle = new ArrayList<>();
	
	
		
	public Venta() {
	}
	
	public Venta(LocalDateTime fecha, ArrayList<LineaDetalle> lineasDetalle) {
		this.fecha = fecha;
		this.lineasDetalle = lineasDetalle;
	}
	
	public void agregarLineaDetalle( LineaDetalle lineaDetalle) {
		this.lineasDetalle.add(lineaDetalle);
	}
	
	public int calcularTotal() {
		int total = 0;
		for (LineaDetalle lineaDetalle : lineasDetalle) {
			total = total + lineaDetalle.calcularSubtotal();				
		}
		return total;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public ArrayList<LineaDetalle> getLineaDetalle() {
		return lineasDetalle;
	}

	public void setLineaDetalle(ArrayList<LineaDetalle> lineaDetalle) {
		this.lineasDetalle = lineaDetalle;
	}
	
}
