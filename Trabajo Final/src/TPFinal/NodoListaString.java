package TPFinal;


public class NodoListaString {

	private String s;
	private NodoListaString siguiente;
	
	//constructor por defecto
	public NodoListaString() {}
	
	//constructor
	public NodoListaString(String s)
	{
		this.s = s;
		siguiente = null;
	}

	//get
	public String getS() 
	{
		return s;
	}

	public NodoListaString getSiguiente() 
	{
		return siguiente;
	}
	
	//set
	public void setS(String s) 
	{
		this.s = s;
	}
	
	public void setSiguiente(NodoListaString siguiente) 
	{
		this.siguiente = siguiente;
	}

}
