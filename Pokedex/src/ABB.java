import Implementaciones.ColaPrioridad;
import TDA.ColaPrioridadTDA;

public class ABB implements ABBTDA{
	
	NodoABB raiz;

	
	@Override
	public void inicializar() {
		
		raiz = null;
		
	}
	@Override
	public NodoABB raiz() {
		return raiz;
	}
	
	@Override
	public void agregar(Pokemon poke) {
		if( raiz == null){
			raiz =new NodoABB();
			raiz.tipo = poke.tipo;
			raiz.cola = new ColaPrioridad<Pokemon>();
			raiz.cola.AgregarElemento(poke, poke.pc);
			raiz.HijoDerecho = new ABB();
			raiz.HijoDerecho.inicializar();
			raiz.HijoIzquierdo = new ABB();
			raiz.HijoIzquierdo.inicializar();
		}
		else{
			if(raiz.tipo.ordinal() == poke.tipo.ordinal()){
				raiz.cola.AgregarElemento(poke, poke.pc);
			}
			else{
				
				if(raiz.tipo.ordinal() < poke.tipo.ordinal())
					raiz.HijoDerecho.agregar(poke);
					else
						raiz.HijoIzquierdo.agregar(poke);
				
			}
				
			
		}
	
		
	}
	
	@Override
	public void eliminar(Pokemon poke) {

		if (raiz != null) {
			if (raiz.tipo == poke.tipo) {
				ColaPrioridadTDA<Pokemon> aux = new ColaPrioridad<Pokemon>();

				while (!raiz.cola.ColaVacia()) {

					try {
						Pokemon pokeMax = raiz.cola.RecuperarMaxElemento();
						raiz.cola.EliminarMaxPrioridad();
						
						if (!pokeMax.equals(poke)) {
							aux.AgregarElemento(pokeMax, pokeMax.pc);
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				if (aux.ColaVacia()) {
					if (raiz.HijoDerecho.arbolVacio()
							&& raiz.HijoIzquierdo.arbolVacio()) {
						raiz = null;
					} else {
						if (!raiz.HijoIzquierdo.arbolVacio()) {
							ABBTDA auxHijoDerecho = raiz.HijoDerecho;
							raiz = Mayor(raiz.HijoIzquierdo);
							raiz.HijoDerecho = auxHijoDerecho;
						} else {
							ABBTDA auxHijoIzquierdo = raiz.HijoIzquierdo;
							raiz = Menor(raiz.HijoDerecho);
							raiz.HijoIzquierdo = auxHijoIzquierdo;
						}

					}
				} else {
					raiz.cola = aux;
				}

			} else {
				if (raiz.tipo.ordinal() < poke.tipo.ordinal()) {
					raiz.HijoDerecho.eliminar(poke);
				} else {
					raiz.HijoIzquierdo.eliminar(poke);
				}
			}

		}

	}
	
	private NodoABB Mayor( ABBTDA a){
		
		if(a.hijoDerecho().arbolVacio()){
			return a.raiz();
		}
		else{
			return Mayor(a.hijoDerecho());
		}
	}
	
	private NodoABB Menor( ABBTDA a){
		
		if(a.hijoIzquierdo().arbolVacio()){
			return a.raiz();
		}
		else{
			return Menor(a.hijoIzquierdo());
		}
	}
	
	@Override
	public boolean arbolVacio() {

		return raiz == null;
	}
	@Override
	public ABBTDA hijoIzquierdo() {
	
		return raiz.HijoIzquierdo;
	}
	@Override
	public ABBTDA hijoDerecho() {
		
		return raiz.HijoDerecho;
	}
	@Override
	public ColaPrioridadTDA<Pokemon> recuperarCola(TipoPokemon tipo) {
		
		if (raiz != null) {
			if(raiz.tipo == tipo){
				return raiz.getCola();
			} else {
				if(raiz.tipo.ordinal() < tipo.ordinal() && !raiz.HijoDerecho.arbolVacio()){
					return raiz.HijoDerecho.recuperarCola(tipo);
				} else {
					if(!raiz.HijoIzquierdo.arbolVacio()){
						return raiz.HijoIzquierdo.recuperarCola(tipo);
					}
				}
					
				
			}
			
		}
		return new ColaPrioridad<Pokemon>();
	}


}
