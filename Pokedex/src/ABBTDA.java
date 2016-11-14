import TDA.ColaPrioridadTDA;


public interface ABBTDA {
	void inicializar();
	NodoABB raiz();
	void agregar(Pokemon poke);
	void eliminar(Pokemon poke);
	ColaPrioridadTDA<Pokemon> recuperarCola(TipoPokemon tipo);
	boolean arbolVacio();
	ABBTDA hijoIzquierdo();
	ABBTDA hijoDerecho();
}
