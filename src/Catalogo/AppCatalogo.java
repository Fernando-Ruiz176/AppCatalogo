package Catalogo;

/**
 * @version 1.0
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class AppCatalogo {
	
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Venta> ventas       = new ArrayList<Venta>();
	
	private static final int MENU_VER_PRODUCTO 		= 1;
	private static final int MENU_AGREGAR_PRODUCTO 	= 2;
	private static final int MENU_ELIMINAR_PRODUCTO = 3;
	private static final int MENU_AGREGAR_VENTA 	= 4;
	private static final int MENU_REPORTE_VENTA 	= 5;
	private static final int MENU_RECAUDACION_VENTA = 6;
	private static final int MENU_SALIR 			= 7;
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		init();
		int opcionSeleccionada;
		do {
			opcionSeleccionada = menu();
			switch ( opcionSeleccionada ) {
			
				case MENU_VER_PRODUCTO:
					verProductos();
					break;
				case MENU_AGREGAR_PRODUCTO:
					crearProductos();
					break;
				case MENU_ELIMINAR_PRODUCTO:
					eliminarProducto();
					break;
				case MENU_AGREGAR_VENTA:
					agregarVentas();
					break;
				case MENU_REPORTE_VENTA:
					crearReporteVentas();
					break;
				case MENU_RECAUDACION_VENTA:
					totalRecaudaciones();
					break;
				case MENU_SALIR:
					break;
			
			}
		} while ( opcionSeleccionada != MENU_SALIR);
		System.out.printf("Selecciono la opcion %d", opcionSeleccionada);
	}
	
	private static void init() {
		productos.add(new Producto("CH1", "Chicle Menta          ", 200, "confites   ", "peso <200 gr."));
		productos.add(new Producto("CH2", "Chicle Frutilla       ", 250, "confites"   , "<200 gr."));
		productos.add(new Producto("BC1", "Coca Cola 500ml       ",	800, "bebestibles", "Envase individual"));
		productos.add(new Producto("BC2", "Coca Cola 350ml       ", 620, "bebestibles", "Envase individual chico"));
		productos.add(new Producto("SO1", "Super Ocho 29gr       ", 270, "confites"   , "Envase individual"));
		productos.add(new Producto("SO2", "Super Ocho c/mani 29gr", 450, "confites"   , "peso< 200 gr."));
		productos.add(new Producto("GT1", "Galleta triton 126gr  ", 670, "confites"   , "peso <200 gr."));
		productos.add(new Producto("NE1", "Chocolate Negrita 30gr", 480, "confites"   , "peso <200 gr."));
		System.out.println("El listado de productos iniciales se ha cargado correctamente.\n");
	}
	
	private static void verProductos() {
		System.out.println("\nPRODUCTOS:\n==========================\n");
		for(Producto producto : productos ) {
			System.out.printf("C�digo: %s  Producto: %s   Precio: %d   Categoria: %s  Descripcion: %s %n"
					, producto.getCodigo()
					, producto.getNombre()
					, producto.getPrecio()	
					, producto.getCategoria()	
					, producto.getDescripcion()	
			);
		}
		System.out.println("");
	}
	

	private static void crearProductos() {
		scanner.nextLine();
		
		System.out.println("Ingrese Codigo del producto");
		String codigo = scanner.nextLine();
		
		System.out.println("Ingrese Nombre del producto");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese Precio del producto");
		int precio= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ingrese Categoria del producto");
		String categoria = scanner.nextLine();
		
		System.out.println("Ingrese Descripcion del producto");
		String descripcion = scanner.nextLine();
		
		Producto producto = new Producto( codigo, nombre, precio, categoria, descripcion);
		productos.add(producto);
		
		System.out.printf("Se añadio el producto '%s' de la categoria '%s' con un precio de '%d' y Su descripcion es '%s' %n.",
				producto.getNombre(),
				producto.getCategoria(),
				producto.getPrecio(),
				producto.getDescripcion());
	}
	
	private static Producto buscarProducto(String codigo) {
		for(Producto producto: productos) {
			if( producto.getCodigo().equalsIgnoreCase(codigo)) {
				return producto;
			}
		}
		return null;
	}
	
	private static void eliminarProducto() {
		System.out.println("Escriba el codigo del producto a eliminar:");
		Scanner scanner = new Scanner( System.in );
		String codigo = scanner.nextLine();
		for( int i = 0; i < productos.size(); i++ ) {
			Producto get = productos.get(i);
			
			if( codigo.equals( get.getCodigo()) ) {
				productos.remove( i );
				break;		
			}
		}
		System.out.println("El producto se ha eliminado correctamente.\n");
	}
	
	private static void agregarVentas() {	
		Venta venta = new Venta();
		boolean seguirAgregandoProductos = true;
		do {
			verProductos();
			System.out.println("Escriba el codigo del producto que desea comprar: ");
			Scanner scanner = new Scanner(System.in);
			String codigo = scanner.next();
			Producto producto = buscarProducto(codigo);
		
			System.out.println("Escriba la cantidad que desea comprar: ");
			int cantidad = scanner.nextInt();
			
			LineaDetalle lineaDetalle = new LineaDetalle(cantidad, producto);
			venta.agregarLineaDetalle(lineaDetalle);
			
			System.out.println("Desea agregar mas productos al carro: [si/no]");
			String seguirAgregandoProductosStr =scanner.next();
			seguirAgregandoProductos = seguirAgregandoProductosStr.equalsIgnoreCase("SI")? true:false;
		} while ( seguirAgregandoProductos );
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("La venta fue pagada? [Si/NO]");
		boolean ventaPagada = scanner.nextLine().equalsIgnoreCase("SI")?true:false;
		
		if( ventaPagada ) {
			ventas.add( venta );
		}
	}
	
	private static void crearReporteVentas() {
		System.out.println("\nVentas\n**************************");
		System.out.println("Fecha \t                         Monto");
		
		for(Venta venta: ventas) {
			System.out.printf("%td de %tB %tY,  %tH:%tM hrs.     %d\n"
					, venta.getFecha()
					, venta.getFecha()
					, venta.getFecha()
					, venta.getFecha()
					, venta.getFecha()
					, venta.calcularTotal());	
		}
		System.out.printf("%n%n\n");
	}
	
	private static void totalRecaudaciones() {
		int valorTotalDelDia = 0;
		for (Venta venta : ventas) {
			valorTotalDelDia = valorTotalDelDia + venta.calcularTotal();
		}
		System.out.println("Recaudaciones del dia: $" + valorTotalDelDia);
	}

    private static int menu() {
		
		System.out.println("\nMENU CATALOGO\n==========================\n");
		System.out.println("1. Ver productos");
		System.out.println("2. Agregar producto");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Agregar venta");
		System.out.println("5. Reporte venta");
		System.out.println("6. Recaudacion venta");
		System.out.println("7. Salir");
		
		System.out.println("\nPor favor elija una opcion : ");
		Scanner scanner = new Scanner(System.in);
		try {
			int opcionSeleccionada = scanner.nextInt();
			return opcionSeleccionada;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar los datos solicitados!!!");
		}
		return 0;
		
			
	}

}
