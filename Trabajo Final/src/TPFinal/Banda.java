package TPFinal;

public class Banda 
{
	// Crear la clase Banda, al cual tiene como atributos la estructura de los datos almacenados en cada línea del archivo.
	
	private String nombre; // nombre del cantante del grupo. (No esta nunca en blanco)
	private String genero; // (No esta nunca en blanco)
	private String estilo;
	private String fechainscripcion; // (No esta nunca en blanco)
	private String linkfacebook;
	private String linktwitter;
	private String otrasredes;
	private Lista nombrediscos; // LO PONGO COMO LISTA PORQUE PUEDEN INGRESAR MAS DE UNO. 
	private String linkvideoclip;
	private String linkvideovivo;
	private String barrio;
	private int cantidadintegrantes; // (No esta nunca en blanco)
	
	// constructor por defecto.
	public Banda() {}
	
	// constructor de no vacios.
	public Banda(String nombre, String genero, String fechainscripcion, int cantidadintegrantes)
	{
		this.nombre = nombre;
		this.genero = genero;
		this.fechainscripcion = fechainscripcion;
		this.cantidadintegrantes = cantidadintegrantes;
	}
	
	// constructor general.
	public Banda(String nombre, String genero, String estilo, String fechainscripcion, String linkfacebook, String linktwitter, String otrasredes, Lista nombrediscos, String linkvideoclip, String linkvideovivo, String barrio, int cantidadintegrantes)
	{
		this.nombre = nombre;
		this.genero = genero;
		this.estilo = estilo;
		this.fechainscripcion = fechainscripcion;
		this.linkfacebook = linkfacebook;
		this.linktwitter = linktwitter;
		this.otrasredes = otrasredes;
		this.nombrediscos = nombrediscos;
		this.linkvideoclip = linkvideoclip;
		this.linkvideovivo = linkvideovivo;
		this.barrio = barrio;
		this.cantidadintegrantes = cantidadintegrantes;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getFechainscripcion() {
		return fechainscripcion;
	}

	public void setFechainscripcion(String fechainscripcion) {
		this.fechainscripcion = fechainscripcion;
	}

	public String getLinkfacebook() {
		return linkfacebook;
	}

	public void setLinkfacebook(String linkfacebook) {
		this.linkfacebook = linkfacebook;
	}

	public String getLinktwitter() {
		return linktwitter;
	}

	public void setLinktwitter(String linktwitter) {
		this.linktwitter = linktwitter;
	}

	public String getOtrasredes() {
		return otrasredes;
	}

	public void setOtrasredes(String otrasredes) {
		this.otrasredes = otrasredes;
	}

	public Lista getNombrediscos() {
		return nombrediscos;
	}

	public void setNombrediscos(Lista nombrediscos) {
		this.nombrediscos = nombrediscos;
	}

	public String getLinkvideoclip() {
		return linkvideoclip;
	}

	public void setLinkvideoclip(String linkvideoclip) {
		this.linkvideoclip = linkvideoclip;
	}

	public String getLinkvideovivo() {
		return linkvideovivo;
	}

	public void setLinkvideovivo(String linkvideovivo) {
		this.linkvideovivo = linkvideovivo;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public int getCantidadintegrantes() {
		return cantidadintegrantes;
	}

	public void setCantidadintegrantes(int cantidadintegrantes) {
		this.cantidadintegrantes = cantidadintegrantes;
	}
		
	
}
