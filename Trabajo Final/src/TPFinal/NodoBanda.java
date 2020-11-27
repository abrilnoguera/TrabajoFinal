package TPFinal;

public class NodoBanda 
{
	// NODO DEL ARBOL DE BANDAS.
	private Banda banda;
	private NodoBanda derecha;
	private NodoBanda izquierda;
	
	// constructor por defecto
	public NodoBanda() {}
	
	//constructor
	public NodoBanda(int valor)
	{
		this.banda = banda;
		this.derecha = null;
		this.izquierda = null;
	}

	// get 
	public Banda getBanda() {
		return banda;
	}

	public NodoBanda getDerecha() {
		return derecha;
	}

	public NodoBanda getIzquierda() {
		return izquierda;
	}
	
	// set
	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public void setDerecha(NodoBanda derecha) {
		this.derecha = derecha;
	}

	public void setIzquierda(NodoBanda izquierda) {
		this.izquierda = izquierda;
	}
	
	public String toString()
	{
		return "\n El nombre de la banda es: "+banda.getNombre();
	}
}
