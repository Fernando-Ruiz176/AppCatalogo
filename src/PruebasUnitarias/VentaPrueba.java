package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Catalogo.LineaDetalle;
import Catalogo.Producto;
import Catalogo.Venta;

class VentaPrueba {

	@Test
	void test() {
		
		Producto producto1 = new Producto("aaa", "AAA", 100, "aAa", "AaA");
		Producto producto2 = new Producto("bbb", "BBB", 200, "bBb", "BbB");
		Producto producto3 = new Producto("ccc", "CCC", 300, "cCc", "CcC");
		
		LineaDetalle Id1 = new LineaDetalle(1, producto1);
		LineaDetalle Id2 = new LineaDetalle(2, producto2);
		
		Venta venta = new Venta();
		venta.setFecha(null);
		venta.getFecha();
		venta.agregarLineaDetalle(Id1);
		venta.agregarLineaDetalle(Id2);
		
		
		assertEquals(500, venta.calcularTotal());
		
		
		LineaDetalle Id3 = new LineaDetalle(10, producto1);
		
		Venta venta2 = new Venta();
		venta2.getLineaDetalle();
		venta2.getFecha();
		venta2.agregarLineaDetalle(Id3);
		
		
		assertEquals(1000, venta2.calcularTotal());
		
		
		
		LineaDetalle Id4 = new LineaDetalle(14, producto1);
		
		Venta venta3 = new Venta();
		venta3.getLineaDetalle();
		venta3.getFecha();
		venta3.agregarLineaDetalle(Id4);
		
		assertEquals(1400, venta3.calcularTotal());
		
		
		
		LineaDetalle Id5 = new LineaDetalle(8, producto1);
		
		Venta venta4 = new Venta();
		venta4.getLineaDetalle();
		venta4.getFecha();
		venta4.agregarLineaDetalle(Id5);
		
		assertEquals(800, venta4.calcularTotal());
		
		
		LineaDetalle Id6 = new LineaDetalle(11, producto2);
		
		Venta venta5 = new Venta();
		venta5.getLineaDetalle();
		venta5.getFecha();
		venta5.agregarLineaDetalle(Id6);
		
		assertEquals(2200, venta5.calcularTotal());
		
		
		LineaDetalle Id7 = new LineaDetalle(9, producto2);
		
		Venta venta6 = new Venta();
		venta6.getLineaDetalle();
		venta6.getFecha();
		venta6.agregarLineaDetalle(Id7);
		
		assertEquals(1800, venta6.calcularTotal());
		
		LineaDetalle Id8 = new LineaDetalle(6, producto2);
		
		Venta venta7 = new Venta();
		venta7.getLineaDetalle();
		venta7.getFecha();
		venta7.agregarLineaDetalle(Id8);
		
		assertEquals(1200, venta7.calcularTotal());
		
		
		LineaDetalle Id9 = new LineaDetalle(4, producto3);
		
		Venta venta8 = new Venta();
		venta8.getLineaDetalle();
		venta8.getFecha();
		venta8.agregarLineaDetalle(Id9);
		
		assertEquals(1200, venta8.calcularTotal());
		
		
		LineaDetalle Id10 = new LineaDetalle(12, producto3);
		
		Venta venta9 = new Venta();
		venta9.getLineaDetalle();
		venta9.getFecha();
		venta9.agregarLineaDetalle(Id10);
		
		assertEquals(3600, venta9.calcularTotal());
		
		
		LineaDetalle Id11 = new LineaDetalle(7,producto3);
		Venta venta10 = new Venta();
		venta10.getLineaDetalle();
		venta10.getFecha();
		venta10.agregarLineaDetalle(Id11);
		
		assertEquals(2100, venta10.calcularTotal());
		
		LineaDetalle Id12 = new LineaDetalle(14,producto3);
		Venta venta11 = new Venta();
		venta11.getLineaDetalle();
		venta11.getFecha();
		venta11.agregarLineaDetalle(Id12);
		
		assertEquals(4200, venta11.calcularTotal());
		
		LineaDetalle Id13 = new LineaDetalle(11,producto3);
		Venta venta12 = new Venta();
		venta12.getLineaDetalle();
		venta12.getFecha();
		venta12.agregarLineaDetalle(Id13);
		
		assertEquals(3300, venta12.calcularTotal());
		
		LineaDetalle Id14 = new LineaDetalle(20,producto3);
		Venta venta13 = new Venta();
		venta13.getLineaDetalle();
		venta13.getFecha();
		venta13.agregarLineaDetalle(Id14);
		
		assertEquals(6000, venta13.calcularTotal());
		
		
		venta.setLineaDetalle(null);
		
		
	}

}
