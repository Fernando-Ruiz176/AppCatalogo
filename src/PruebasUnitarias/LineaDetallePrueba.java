package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Catalogo.LineaDetalle;
import Catalogo.Producto;
import Catalogo.AppCatalogo;

class LineaDetallePrueba {

	@Test
	void test() {
		
		Producto producto1 = new Producto();
		producto1.getPrecio();
		producto1.getCodigo();
		producto1.setCodigo(null);
		producto1.setNombre(null);
		producto1.equals(null);
		producto1.setPrecio(100);
		
		Producto producto2 = new Producto();
		producto2.getCodigo();
		producto2.getNombre();
		producto2.setPrecio(500);
		
		Producto producto3 = new Producto();
		producto3.setPrecio(800);
		
		
		LineaDetalle Id = new LineaDetalle();
		Id.getCantidad();
		Id.setCantidad(2);
		Id.setProducto(producto1);
		
		assertEquals(200, Id.calcularSubtotal() );
		
		AppCatalogo pv = new AppCatalogo();
		pv.equals(Id);
		pv.equals(producto1);
		pv.equals(null);
		pv.getClass();
		pv.toString();
	
		
		
		LineaDetalle Id2 = new LineaDetalle();
		Id2.getProducto();
		Id2.setCantidad(1);
		Id2.setProducto(producto2);
		
		assertEquals(500, Id2.calcularSubtotal() );
		
		LineaDetalle Id3 = new LineaDetalle();
		Id3.getProducto();
		Id3.setCantidad(3);
		Id3.setProducto(producto3);
		
		assertEquals(2400, Id3.calcularSubtotal() );
		
		
		Producto producto4 = new Producto();
		producto4.setPrecio(650);
		
		LineaDetalle Id4 = new LineaDetalle();
		Id4.getProducto();
		Id4.setCantidad(2);
		Id4.setProducto(producto4);
		
		assertEquals(1300, Id4.calcularSubtotal() );
		
		
		
		
		Producto producto5 = new Producto();
		producto5.setPrecio(940);
		
		LineaDetalle Id5 = new LineaDetalle();
		Id5.getProducto();
		Id5.setCantidad(3);
		Id5.setProducto(producto5);
		
		assertEquals(2820, Id5.calcularSubtotal() );
		
		
		Producto producto6 = new Producto();
		producto6.setPrecio(1500);
		
		LineaDetalle Id6 = new LineaDetalle();
		Id6.getProducto();
		Id6.setCantidad(4);
		Id6.setProducto(producto6);
		
		assertEquals(6000, Id6.calcularSubtotal() );
		
		
		Producto producto7 = new Producto();
		producto7.setPrecio(910);
		
		LineaDetalle Id7 = new LineaDetalle();
		Id7.getProducto();
		Id7.setCantidad(2);
		Id7.setProducto(producto7);
		
		assertEquals(1820, Id7.calcularSubtotal() );
		
		
		Producto producto8 = new Producto();
		producto8.setPrecio(1040);
		
		LineaDetalle Id8 = new LineaDetalle();
		Id8.getProducto();
		Id8.setCantidad(3);
		Id8.setProducto(producto8);
		
		assertEquals(3120, Id8.calcularSubtotal() );
		
		Producto producto9 = new Producto();
		producto9.setPrecio(1100);
		
		LineaDetalle Id9 = new LineaDetalle();
		Id9.getProducto();
		Id9.setCantidad(2);
		Id9.setProducto(producto9);
		
		assertEquals(2200, Id9.calcularSubtotal() );		
		
		Producto producto10 = new Producto();
		producto10.setPrecio(750);
		
		LineaDetalle Id10 = new LineaDetalle();
		Id10.setCantidad(3);
		Id10.setProducto(producto10);
		
		assertEquals(2250, Id10.calcularSubtotal() );
		
		Producto producto11 = new Producto();
		producto11.setPrecio(820);
		
		LineaDetalle Id11 = new LineaDetalle();
		Id11.setCantidad(3);
		Id11.setProducto(producto11);
		
		assertEquals(2460, Id11.calcularSubtotal() );
		
		Producto producto12 = new Producto();
		producto12.setPrecio(620);
		
		LineaDetalle Id12 = new LineaDetalle();
		Id12.setCantidad(4);
		Id12.setProducto(producto12);
		
		assertEquals(2480, Id12.calcularSubtotal() );
		
		Producto producto13 = new Producto();
		producto13.setPrecio(990);
		
		LineaDetalle Id13 = new LineaDetalle();
		Id13.setCantidad(1);
		Id13.setProducto(producto13);
		
		assertEquals(990, Id13.calcularSubtotal() );
		
		Producto producto14 = new Producto();
		producto14.setPrecio(2990);
		
		LineaDetalle Id14 = new LineaDetalle();
		Id14.setCantidad(4);
		Id14.setProducto(producto14);
		
		assertEquals(11960, Id14.calcularSubtotal() );
		
		Producto producto15 = new Producto();
		producto15.setPrecio(3100);
		
		LineaDetalle Id15 = new LineaDetalle();
		Id15.setCantidad(3);
		Id15.setProducto(producto15);
		
		assertEquals(9300, Id15.calcularSubtotal() );
		
		
		Producto producto16 = new Producto();
		producto16.setPrecio(3200);
		
		LineaDetalle Id16 = new LineaDetalle();
		Id16.setCantidad(5);
		Id16.setProducto(producto16);
		
		assertEquals(16000, Id16.calcularSubtotal() );
		
		Producto producto17 = new Producto();
		producto17.setPrecio(1620);
		
		LineaDetalle Id17 = new LineaDetalle();
		Id17.setCantidad(3);
		Id17.setProducto(producto17);
		
		assertEquals(4860, Id17.calcularSubtotal() );
		
		Producto producto18 = new Producto();
		producto18.setPrecio(1640);
		
		LineaDetalle Id18 = new LineaDetalle();
		Id18.setCantidad(7);
		Id18.setProducto(producto18);
		
		assertEquals(11480, Id18.calcularSubtotal() );
		
		
		Producto producto19 = new Producto();
		producto19.setPrecio(1660);
		
		LineaDetalle Id19 = new LineaDetalle();
		Id19.setCantidad(5);
		Id19.setProducto(producto19);
		
		assertEquals(8300, Id19.calcularSubtotal() );
		
		
	}

}
