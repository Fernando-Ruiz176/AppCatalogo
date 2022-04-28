package Catalogo;
/**
 * 
 * 
 * Esta clase establece las caracteristicas necesarias para la identificacion de cada elemento del catalogo a exhibir.
 * @author Fernando Ruiz
 * @version 1.0
 *
 */
		//ATRIBUTOS 
public class Producto {
	private String 	codigo;
	private String 	nombre;
	private int 	precio;
	private String 	categoria;
	private String 	descripcion;
	
	public Producto() {
	}

	/**
	 * Constructor para generar una instancia en un catalogo.
	 * 
	 * @param codigo de la entidad que se presentara en el catalogo.
	 * @param nombre por el cual se le identificara.
	 * @param precio para atribuirle el valor de mercado en el catalogo.
	 * @param categoria donde se le clasificara de acuerdo a patrones comunes con otros articulos.
	 * @param descripcionProducto como una reseña donde se pondrar sus cualidades particulares.
	 */

	public Producto(String codigo, String nombre, int precio, String categoria, String descripcionProducto) {
		//CONSTRUCTOR
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.descripcion = descripcionProducto;
	}

		//GETTERS AND SETTERS

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
