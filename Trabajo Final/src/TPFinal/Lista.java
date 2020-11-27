package TPFinal;


public class Lista 
{
private NodoListaString inicio;
	
	//constructor por defecto
	public Lista() {}
	
	//constructor
	public Lista(NodoListaString inicio)
	{
		this.inicio = inicio;
	}

	//get
	public NodoListaString getInicio() 
	{
		return inicio;
	}

	//set
	public void setInicio(NodoListaString inicio) 
	{
		this.inicio = inicio;
	}
	
	public boolean EsVacia()
	{
		if(inicio == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	public void IngresarNodoInicio(Nodo nodo)
//	{
//		if(this.EsVacia() == true)
//		{
//			this.inicio = nodo;
//		}
//		else
//		{
//			// apunto el nuevo nodo al nodo que estaba apuntando la lista.
//			nodo.setSiguiente(inicio);
//			// apunto la lista al nuevo nodo.
//			inicio = nodo;
//		}
//	}
//	
//	public void IngresarNodoFinal(Nodo nodo)
//	{
//		if(this.EsVacia() == true)
//		{
//			this.inicio = nodo;
//		}
//		else
//		{
//			Nodo aux = inicio;
//			while (aux.getSiguiente() != null)
//			{
//				aux = aux.getSiguiente();
//			}
//			aux.setSiguiente(nodo);
//		}
//	}
//	
//	public void AgregarDatoFinal(int dato) {
//		Nodo n1= new Nodo(dato);
//		if(this.inicio==null) {
//			this.inicio=n1;
//		}
//		else {
//			Nodo actual=this.inicio;
//			while(actual.getSiguiente()!=null) {
//				actual=actual.getSiguiente();
//				}
//			actual.setSiguiente(n1);
//		}
//	}
//	
//	public void AgregarDatoInicio(int dato)
//	{
//		Nodo nodo = new Nodo(dato);
//		if(this.EsVacia() == true)
//		{
//			this.inicio = nodo;
//		}
//		else
//		{
//			// apunto el nuevo nodo al nodo que estaba apuntando la lista.
//			nodo.setSiguiente(inicio);
//			// apunto la lista al nuevo nodo.
//			inicio = nodo;
//		}
//	}
//	
//	public void Visualizar()
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			// copio la informacion del inicio para poder ir moviendome
//			Nodo nodo = this.inicio;
//			System.out.print("Lista: ");
//			// mientras el nodo apunte a alguien, osea haya otro valor en la lista.
//			while (nodo != null)
//			{
//				// imprimo el valor del nodo.
//				System.out.print(nodo.getN()+"\t");
//				// avanzo al siguiente nodo.
//				nodo = nodo.getSiguiente();
//			}
//			System.out.println();
//		}
//	}
//	
//	public void Buscar(int dato)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			boolean condicion = false;
//			Nodo nodo = this.inicio;
//			while (nodo != null)
//			{
//				if (nodo.getN() == dato)
//				{
//					condicion = true;
//				}
//				nodo = nodo.getSiguiente();
//			}
//			if (condicion == true)
//			{
//				System.out.println("Se encontro el valor "+dato+" en la lista.");
//			}
//			else
//			{
//				System.out.println("No se encontro el valor "+dato+" en la lista.");
//			}
//		}
//	}
//	
//	//EJERCICIO 1
//	// método iterativo que permite ingresar un nodo a la lista después de una posición determinada.
//	public void IngresarNodoPosicion(Nodo nodo, int n)
//	{
//		Nodo aux = inicio;
//		IngresarNodoPosicion2(nodo, n, 0, aux);
//	}
//	
//	public void IngresarNodoPosicion2(Nodo nodo, int n, int i, Nodo aux)
//	{
//		if(this.EsVacia() == true)
//		{
//			this.inicio = nodo;
//		}
//		else
//		{
//			if (n == 0)
//			{
//				IngresarNodoInicio(nodo);
//			}
//			else
//			{
//				if (aux.getSiguiente() == null)
//				{
//					// si la posicion ingresada es mas grande que el tamaño de la lista lo agrega al final.
//					IngresarNodoFinal(nodo);
//				}
//				else
//				{
//					if (i == n - 1)
//					{
//						 Nodo siguiente = aux.getSiguiente();
//						 aux.setSiguiente(nodo);
//						 nodo.setSiguiente(siguiente);
//					}
//					else
//					{
//						IngresarNodoPosicion2(nodo, n, i + 1, aux.getSiguiente());
//					}
//				}
//			}
//		}
//	}
//	
//	public void IngresarNodoPosicionI(Nodo nodo, int n)
//	{
//		Nodo aux = inicio;
//		if(this.EsVacia() == true)
//		{
//			this.inicio = nodo;
//		}
//		else
//		{
//			for(int i = 0; i < n; i++)
//			{
//				if(aux.getSiguiente() == null)
//				{
//					// si la posicion ingresada es mas grande que el tamaño de la lista lo agrega al final.
//					IngresarNodoFinal(nodo);
//					break;
//				}
//				
//				if(i == n - 1)
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(nodo);
//					nodo.setSiguiente(siguiente);
//				}
//				aux = aux.getSiguiente();
//				
//			}
//		}
//	
//	}
//	
//	// EJERCICIO 2
//	//método iterativo permita ingresar un nodo a la lista por referencia, es decir dado el valor de un dato en la lista introducir un nuevo nodo inmediatamente después del anterior.
//	public void IngresarNodoReferencia(Nodo nodo, int r)
//	{
//		Nodo aux = inicio;
//		IngresarNodoReferencia2(nodo, r, aux, 0);
//	}
//	
//	public void IngresarNodoReferencia2(Nodo nodo, int r, Nodo aux, int i)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			if (aux == null)
//			{
//				System.out.println(r+" no es parte de la lista. ");
//			}
//			else
//			{
//				if (aux.getN() == r)
//				{
//					IngresarNodoPosicion2(nodo, i + 1, i, aux);
//				}
//				else
//				{
//					IngresarNodoReferencia2(nodo, r, aux.getSiguiente(), i + 1);
//				}
//			}
//		}
//	}
//
//	public void IngresarNodoReferenciaI(Nodo nodo, int r)
//	{
//		Nodo aux = inicio;
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			while(aux != null)
//			{
//				if(aux.getN() == r)
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(nodo);
//					nodo.setSiguiente(siguiente);
//				}
//				aux = aux.getSiguiente();
//			}
//		}
//	}
//	
//	// EJERCICIO 3
//	// método iterativo que permita obtener el valor de un nodo de una determinada posición en la lista.
//	public int ObtenerValorxPosicion(int p)
//	{
//		Nodo aux = inicio;
//		return ObtenerValorxPosicion2(p, 0, aux);
//	}
//	
//	public int ObtenerValorxPosicion2(int p, int i, Nodo aux)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//			return Integer.MAX_VALUE;
//		}
//		else
//		{
//			if(aux == null)
//			{
//				System.out.println("La lista no tiene tantas posiciones.");
//				return Integer.MAX_VALUE;
//			}
//			else
//			{
//				if(i == p)
//				{
//					return aux.getN();
//				}
//				else
//				{
//					return ObtenerValorxPosicion2(p, i + 1, aux.getSiguiente());
//				}
//			}
//		}
//	}
//	
//	public int ObtenerValorxPosicionI(int p)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//			return Integer.MAX_VALUE;
//		}
//		else
//		{
//			Nodo aux = inicio;
//			int i = 0;
//			while(aux != null)
//			{
//				if(i == p)
//				{
//					return aux.getN();
//				}
//				aux = aux.getSiguiente();
//				i++;
//			}
//			System.out.println("La lista no tiene tantas posiciones.");
//			return Integer.MAX_VALUE;
//		}
//	}
//	
//	// EJERCICIO 4
//	// método iterativo que permita obtener la posición de un valor en la lista.
//	public int ObtenerPosicionxValor(int v)
//	{
//		Nodo aux = inicio;
//		return ObtenerPosicionxValor2(v, 0, aux);
//	}
//	
//	public int ObtenerPosicionxValor2(int v, int i, Nodo aux)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//			return Integer.MAX_VALUE;
//		}
//		else
//		{
//			if(aux == null)
//			{
//				System.out.println(v+" no es parte de la lista.");
//				return Integer.MAX_VALUE;
//			}
//			else
//			{
//				if(aux.getN() == v)
//				{
//					return i;
//				}
//				else
//				{
//					return ObtenerPosicionxValor2(v, i + 1, aux.getSiguiente());
//				}
//			}
//		}
//	}
//	
//	public int ObtenerPosicionxValorI(int v)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//			return Integer.MAX_VALUE;
//		}
//		else
//		{
//			Nodo aux = inicio;
//			int i = 0;
//			while(aux != null)
//			{
//				if(aux.getN() == v)
//				{
//					return i;
//				}
//				aux = aux.getSiguiente();
//				i++;
//			}
//			System.out.println("No existe ese valor en la lista.");
//			return Integer.MAX_VALUE;
//		}
//	}
//	
//	//EJERCICIO 6
//	//método iterativo elimine una lista.
//	public void EliminarLista()
//	{
//		this.inicio = null;
//	}
//	
//	//EJERCICIO 7
//	// método iterativo que tiene como entrada una lista de datos enteros y elimina de la misma los nodos de posiciones pares.
//	public void EliminarNodosPares()
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			int t = TamañoLista();
//			Nodo aux = inicio;
//			if(t % 2 == 0)
//			{
//				for(int i = 0; i < t / 2; i++)
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(siguiente.getSiguiente());
//					aux = aux.getSiguiente();
//				}
//			}
//			else
//			{
//				for(int i = 0; i < (t - 1) / 2; i++)
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(siguiente.getSiguiente());
//					aux = aux.getSiguiente();
//				}
//				aux.setSiguiente(null);
//			}
//		}
//	}
//	
//	public int TamañoLista()
//	{
//		Nodo aux = inicio;
//		int cont = 0;
//		while (aux != null)
//		{
//			cont++;
//			aux = aux.getSiguiente();
//		}
//		return cont;
//	}
//	
//	public void EliminarNodosParesRecursivo()
//	{
//		Nodo aux = inicio;
//		int t = TamañoLista();
//		EliminarNodosPares2(0, t, aux);
//	}
//	
//	public void EliminarNodosPares2(int i, int t, Nodo aux)
//	{
//		if(this.EsVacia() == true)
//		{
//			System.out.println("La lista esta vacia.");
//		}
//		else
//		{
//			if(t % 2 == 0)
//			{
//				if(i == t / 2)
//				{
//					System.out.println("Se eliminaron los nodos pares de la lista:");
//					Visualizar();
//				}
//				else
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(siguiente.getSiguiente());
//					EliminarNodosPares2(i + 1, t,  aux.getSiguiente());
//				}
//			}
//			else
//			{
//				if(i == (t - 1) / 2)
//				{
//					aux.setSiguiente(null);
//					System.out.println("Se eliminaron los nodos pares de la lista:");
//					Visualizar();
//				}
//				else
//				{
//					Nodo siguiente = aux.getSiguiente();
//					aux.setSiguiente(siguiente.getSiguiente());
//					EliminarNodosPares2(i + 1, t, aux.getSiguiente());
//				}
//			}
//			
//		}
//	}
//	
//	public void EliminarNodosParesI()
//	{
//		int t = this.TamañoLista();
//		Nodo aux = inicio;
//		if(t % 2 != 0)
//		{
//			t = t - 1;
//		}
//		for(int i = 0; i < t; i = i + 2)
//		{
//			Nodo siguiente = aux.getSiguiente();
//			aux.setSiguiente(siguiente.getSiguiente());
//			aux = aux.getSiguiente();
//		}
//		
//	}
//	
//	// EJERCICIO 8
//	// método que toma dos listas de enteros y las une en una sola lista de la siguiente manera: Lista1Elemento1, Lista2Elemento1, Lista1Elemento2, Lista2Elemento2, etc. 
//	// De no ser iguales los tamaños de ambas listas, manejarlo apropiadamente.
//	
//	public void ConcatenarListas(Lista l1, Lista l2)
//	{
//		int t1 = l1.TamañoLista();
//		int t2 = l2.TamañoLista();
//		if(t1 == t2)
//		{
//			Nodo aux1 = l1.getInicio();
//			Nodo aux2 = l2.getInicio();
//			for(int i = 0; i < t2; i++) 
//			{
//				AgregarDatoFinal(aux1.getN());
//				aux1 = aux1.getSiguiente();
//				AgregarDatoFinal(aux2.getN());
//				aux2=aux2.getSiguiente();
//			}
//		}
//		else
//		{
//			if(t1 > t2)
//			{
//				Nodo aux1 = l1.getInicio();
//				Nodo aux2 = l2.getInicio();
//				for(int i = 0; i < t2; i++) 
//				{
//					AgregarDatoFinal(aux1.getN());
//					aux1 = aux1.getSiguiente();
//					AgregarDatoFinal(aux2.getN());
//					aux2=aux2.getSiguiente();
//				}
//				for(int j=0;j<t1-t2;j++) 
//				{
//					AgregarDatoFinal(aux1.getN());
//					aux1=aux1.getSiguiente();
//				}
//			}
//			else
//			{
//				Nodo aux1 = l1.getInicio();
//				Nodo aux2 = l2.getInicio();
//				for(int i = 0; i < t1; i++) 
//				{
//					AgregarDatoFinal(aux1.getN());
//					aux1 = aux1.getSiguiente();
//					AgregarDatoFinal(aux2.getN());
//					aux2=aux2.getSiguiente();
//				}
//				for(int j=0;j<t2-t1;j++) 
//				{
//					AgregarDatoFinal(aux2.getN());
//					aux2=aux2.getSiguiente();
//				}
//			}
//		}
//	}
//		
//	public void ConcatenarListasI(Lista l2)
//	{
//		Nodo aux = inicio;
//		Nodo aux2 = l2.getInicio();
//		int t1 = this.TamañoLista();
//		int t2 = l2.TamañoLista();
//		while(aux2 != null && aux != null)
//		{
//			Nodo siguiente = aux.getSiguiente();
//			Nodo aux3 = new Nodo(aux2.getN());
//			aux.setSiguiente(aux3);
//			aux = aux.getSiguiente();
//			aux.setSiguiente(siguiente);
//			aux = aux.getSiguiente();
//			aux2 = aux2.getSiguiente();
//		}
//		if (t1 < t2)
//		{
//			while(aux2 != null)
//			{
//				this.AgregarDatoFinal(aux2.getN());
//				aux2 = aux2.getSiguiente();
//			}
//		}
//	}
//	
//	// EJERCICIO 9
//	// método que toma una lista de enteros y los agrupa en dos listas distintas, una para los pares y una para los impares. 
//	// Luego, ambas listas deben unirse en una lista final que posea primero los números pares y luego los impares. 
//	
//	public void DividirListaPareseImpares(Lista pares, Lista impares)
//	{
//		Nodo aux = inicio;
//		while(aux.getSiguiente() != null)
//		{
//			if(aux.getN() % 2 == 0)
//			{
//				pares.AgregarDatoFinal(aux.getN());
//			}
//			else
//			{
//				impares.AgregarDatoFinal(aux.getN());
//			}
//			aux = aux.getSiguiente();
//		}
//	}
//	
//	public void UnirListas(Lista pares, Lista impares)
//	{
//		Nodo aux = pares.inicio;
//		while(aux != null)
//		{
//			AgregarDatoFinal(aux.getN());
//			aux = aux.getSiguiente();
//		}
//		aux = impares.inicio;
//		while(aux != null)
//		{
//			AgregarDatoFinal(aux.getN());
//			aux = aux.getSiguiente();
//		}
//	}
//	
//	public Lista DividirListaPareseImpares()
//	{
//		Nodo aux = inicio;
//		Lista pares = new Lista();
//		Lista impares = new Lista();
//		while(aux != null)
//		{
//			if(aux.getN() % 2 == 0)
//			{
//				pares.AgregarDatoFinal(aux.getN());
//			}
//			else
//			{
//				impares.AgregarDatoFinal(aux.getN());
//			}
//			aux = aux.getSiguiente();
//		}
//		pares.Visualizar();
//		impares.Visualizar();
//		Lista lista = new Lista();
//		lista.UnirListas(pares, impares);
//		return lista;
//	}
//	
//	// EJERCICIO 10
//	// método recursivo, que reciba una lista y compute su longitud.
//	public int LongitudLista()
//	{
//		Nodo aux = inicio;
//		return LongitudLista2(aux);
//	}
//	
//	public int LongitudLista2(Nodo aux)
//	{
//		if (aux == null)
//		{
//			return 0;
//		}
//		else
//		{
//			return 1 + LongitudLista2(aux.getSiguiente());
//		}
//	}
//	
//	// EJERCICIO 11
//	// método recursivo que elimina los nodos de la lista que almacenan números pares. 
//	// Observación: no debe crear una nueva lista con el resultado, sino eliminar nodos sobre la misma lista. Recorrer la lista solo una vez.
//
//	public void EliminarPares()
//	{
//		Nodo aux = inicio;
//		EliminarPares2(aux);
//	}
//	
//	public void EliminarPares2(Nodo aux)
//	{
//		if(aux == null)
//		{
//			System.out.println("Se eliminaron todos los nodos con valor par:");
//			Visualizar();
//		}
//		else
//		{
//			if(aux.getN() % 2 == 0)
//			{
//				Nodo siguiente = aux.getSiguiente();
//				aux.setSiguiente(siguiente.getSiguiente());
//			}
//			EliminarPares2(aux.getSiguiente());
//		}
//	}
}
