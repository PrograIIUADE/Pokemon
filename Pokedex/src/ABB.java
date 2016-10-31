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
		if(! arbolVacio()){
		}
		
	}
	
	@Override
	public void eliminar(Pokemon poke) {
		// TODO Auto-generated method stub
		
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


}
