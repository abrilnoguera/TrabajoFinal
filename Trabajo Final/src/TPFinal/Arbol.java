package TPFinal;

public class Arbol 
{
	private NodoBanda raiz;
	
	//constructor por defecto
	public Arbol() {}
	
	//constructor
	public Arbol(NodoBanda raiz)
	{
		this.raiz = raiz;
	}

	// get 
	public NodoBanda getRaiz() {
		return raiz;
	}

	// set
	public void setRaiz(NodoBanda raiz) {
		this.raiz = raiz;
	}
	
	public boolean EsVacio()
	{
		if(raiz == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void IngresarconValor(int n)
	{
		NodoBanda nodo = new NodoBanda(n);
		IngresarNodo(nodo);
	}
	
	public void IngresarNodo(NodoBanda nodo)
	{
		if(EsVacio() == true)
		{
			raiz = nodo;
		}
		else
		{
			IngresarNodo2(nodo, raiz);
		}
	}
	// METODO COMPARE TO -> PARA COMPARAR STRINGS.
	// DEVUELVE: <0 SI EL STRING QUE LLAMA AL METODO ESTA ANTES, == 0 SI SON IGUALES, Y > 0 SI EL STRING QUE LLAMA AL METODO ESTA DESPUES (EL PARAMETRO ESTA ANTES)
	public static void IngresarNodo2(NodoBanda nodo, NodoBanda aux)
	{
		if(nodo.getBanda().getNombre().compareTo(aux.getBanda().getNombre()) < 0)
		{
			if(aux.getIzquierda() == null)
			{
				aux.setIzquierda(nodo);
			}
			else
			{
				IngresarNodo2(nodo, aux.getIzquierda());
			}
		}
		else
		{
			if(nodo.getBanda().getNombre().compareTo(aux.getBanda().getNombre()) > 0)
			{
				if(aux.getDerecha() == null)
				{
					aux.setDerecha(nodo);
				}
				else
				{
					IngresarNodo2(nodo, aux.getDerecha());
				}
			}
			else
			{
				System.out.println("Ese valor ya existe en el arbol. ");
			}
		}
	}
//	
//	// EJERCICIO 1
//	// Implemente un método que calcule la altura de un árbol binario de búsqueda.
//	public int Altura()
//	{
//		return Altura2(raiz);
//	}
//	public int Altura2(NodoBanda aux)
//	{
//		int a = 0;
//		if(aux != null)
//		{
//			if(aux.getIzquierda() != null)
//			{
//				a = maximo(a, Altura2(aux.getIzquierda()));
//			}
//			if(aux.getDerecha() != null)
//			{
//				a = maximo(a, Altura2(aux.getDerecha()));
//			}
//			a++;
//		}
//		return a;
//	}
//	public static int maximo(int a, int b)
//	{
//		if(a >= b)
//		{
//			return a;
//		}
//		else
//		{
//			return b;
//		}
//	}
//	
//	// EJERCICIO 2
//	// Implemente el método de recorrido postorden para un árbol binario de búsqueda.
//	public void Postorden()
//	{
//		System.out.print("Postorden: ");
//		Postorden2(raiz);
//		System.out.println();
//	}
//	
//	public void Postorden2(NodoBanda aux)
//	{
//		if(aux != null)
//		{
//			Postorden2(aux.getIzquierda());
//			Postorden2(aux.getDerecha());
//			System.out.print(aux.getValor()+"\t");
//		}
//	}
//	
//	// EJERCICIO 3
//	// Implemente un método que busque si un valor numérico dado está en el árbol binario de búsqueda.
//	public void BuscarValor(int n)
//	{
//		BuscarValor2(raiz, n);
//	}
//	
//	public void BuscarValor2(NodoBanda aux, int n)
//	{
//		if(aux == null)
//		{
//			System.out.println("No se encontro el valor "+n+" en el arbol.");
//		}
//		else
//		{
//			if(aux.getValor() == n)
//			{
//				System.out.println("Se encontro el valor "+n+" en el arbol.");
//			}
//			else
//			{
//				if(aux.getValor() < n)
//				{
//					BuscarValor2(aux.getDerecha(), n);
//				}
//				else
//				{
//					BuscarValor2(aux.getIzquierda(), n);
//				}
//			}
//		}
//	}
//	
//	// EJERCICIO 4
//	// Implemente un método que permita calcular el número de hojas que tiene un árbol binario de búsqueda.
//	public int CalcularHojas()
//	{
//		return CalcularHojas2(raiz, 1);
//	}
//	
//	public int CalcularHojas2(NodoBanda aux, int i)
//	{
//		if(aux.getDerecha() == null && aux.getIzquierda() == null)
//		{
//			return i++;
//		}
//		else
//		{
//			if(aux.getDerecha() != null && aux.getIzquierda() != null)
//			{
//				return CalcularHojas2(aux.getIzquierda(), i) + CalcularHojas2(aux.getDerecha(), i);
//			}
//			else
//			{
//				if(aux.getDerecha() != null && aux.getIzquierda() == null)
//				{
//					return CalcularHojas2(aux.getDerecha(), i);
//				}
//				else
//				{
//					return CalcularHojas2(aux.getIzquierda(), i);
//				}
//			}
//		}
//		
//	}
//	
//	// EJERCICIO 5
//	// Dado un árbol binario de búsqueda de números enteros, escribir un método que calcule la suma de sus elementos.
//	public int SumaElementos()
//	{
//		return SumaElementos2(raiz);
//	}
//	
//	public int SumaElementos2(NodoBanda aux)
//	{
//		int suma = aux.getValor();
//		if(aux.getIzquierda() == null && aux.getDerecha() == null)
//    	{
//    		return suma;
//    	}
//    	else
//    	{
//    		if(aux.getDerecha() != null && aux.getIzquierda() != null)
//    		{
//    			suma += SumaElementos2(aux.getIzquierda());
//				suma += SumaElementos2(aux.getDerecha());
//    		}
//    		else
//    		{
//    			if(aux.getDerecha() != null)
//    			{
//    				suma += SumaElementos2(aux.getDerecha());
//    			}
//    			else
//    			{
//    				suma += SumaElementos2(aux.getIzquierda());
//    			}
//    		}
//    	}
//		return suma;
//	}
//	
//	// EJERCICIO 6 NO FUNCIONA
//	// Dado un árbol binario de búsqueda de números enteros, escribir un método que calcule la suma de sus elementos múltiplos de 2.
//	public int SumaElementosMultiplosde2()
//	{
//		return SumaElementosMultiplosde22(raiz, 0);
//	}
//	public int SumaElementosMultiplosde22(NodoBanda aux, int suma)
//	{
//		if(aux.getIzquierda() == null && aux.getDerecha() == null)
//    	{
//    		return suma;
//    	}
//    	else
//    	{
//    		if(aux.getValor() % 2 == 0)
//			{
//				suma += aux.getValor();
//			}
//    		if(aux.getDerecha() != null && aux.getIzquierda() != null)
//    		{
//    			
//    			SumaElementosMultiplosde22(aux.getIzquierda(), suma + aux.getValor());
//				SumaElementosMultiplosde22(aux.getDerecha(), suma + aux.getValor());
//    		}
//    		else
//    		{
//    			if(aux.getDerecha() != null)
//    			{
//    				SumaElementosMultiplosde22(aux.getDerecha(), suma + aux.getValor());
//    			}
//    			else
//    			{
//    				SumaElementosMultiplosde22(aux.getIzquierda(), suma + aux.getValor());
//    			}
//    		}
//    	}
//		return suma;
//	}
//	
//	// EJERCICIO 7
//	//  Implemente un método que encuentre el máximo valor almacenado en un árbol binario de búsqueda.
//	public int MaximoValor()
//	{
//		NodoBanda aux = raiz;
//		while(aux.getDerecha() != null)
//		{
//			aux = aux.getDerecha();
//		}
//		return aux.getValor();
//	}
//	
//	// EJERCICIO 8
//	// Implemente un método que determine el numero de nodos que se encuentran en el nivel n de un árbol binario de búsqueda.
//	// El nivel es ingresado por el usuario.
//	//public int ElementosenNivel(int n)
//	public int ElementosNivel(int n)
//	{
//		return ElementosNivel2(raiz, n, 1);
//	}
//	
//	public int ElementosNivel2(NodoBanda nodo, int n, int a)
//	{
//		if(nodo == null)
//		{
//			return 0;
//		}
//		
//		if(a == n)
//		{
//			return 1;
//		}
//		else
//		{
//			return ElementosNivel2(nodo.getIzquierda(), n, a + 1) + ElementosNivel2(nodo.getDerecha(), n, a + 1);
//		}
//	}
//	
//	// EJERCICIO 9
//	// Implemente un método iterativo que encuentre el número de hojas en un arbol binario.
//	
//	public int NumerodeHojas()
//	{
//		return NumerodeHojas2(raiz);
//	}
//	
//	public int NumerodeHojas2(NodoBanda nodo)
//	{
//		if(nodo == null)
//		{
//			return 0;
//		}
//		if(nodo.getIzquierda() == null && nodo.getDerecha() == null)
//		{
//			return 1;
//		}
//		else
//		{
//			return NumerodeHojas2(nodo.getIzquierda()) + NumerodeHojas2(nodo.getDerecha());
//		}
//	}
//	// EJERCICIO 10
//	// Implemente un metodo que regrese verdadero si dos arboles que ingresan al metodo como argumentos son inguales,
//	// en caso contrario debe regresar falso.
//	
//	public boolean SonIguales(Arbol a)
//	{
//		return SonIguales2(raiz, a.getRaiz());
//	}
//	
//	public boolean SonIguales2(NodoBanda nodo, NodoBanda nodo2)
//	{
//		if(nodo == null && nodo2 == null)
//		{
//			return true;
//		}
//		if(nodo == null || nodo2 == null)
//		{
//			return false;
//		}
//		
//		return nodo.getValor() == nodo2.getValor() && SonIguales2(nodo.getDerecha(), nodo2.getDerecha()) && SonIguales2(nodo.getIzquierda(), nodo2.getIzquierda());
//	}
//	
//	// EJERCICIO 11
//	// Implemente un método que le ingresa como argumento un árbol de búsqueda binaria y regrese verdadero si el árbol es lleno sino regrese falso.
//	public boolean Lleno()
//	{
//		if(this.NumerodeHojas() == (this.Altura() - 1) * 2)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	
//	
//	public void Preorden()
//	{
//		System.out.println("Preorden: ");
//		Preorden2(raiz);
//		System.out.println();
//	}
//	
//	public static void Preorden2(NodoBanda aux)
//	{
//		if(aux != null)
//		{
//			System.out.print(aux.getValor()+"\t");
//			Preorden2(aux.getIzquierda());
//			Preorden2(aux.getDerecha());
//		}
//	}
//	
//	public void Inorden()
//	{
//		System.out.println("Inorden: ");
//		Inorden2(raiz);
//		System.out.println();
//	}
//	
//	public void Inorden2(NodoBanda aux)
//	{
//		if(aux != null)
//		{
//			Inorden2(aux.getIzquierda());
//			System.out.print(aux.getValor()+"\t");
//			Inorden2(aux.getDerecha());
//		}
//	}
	
	
}
