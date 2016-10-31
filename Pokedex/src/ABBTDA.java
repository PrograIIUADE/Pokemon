
public interface ABBTDA {
	void inicializar();
	NodoABB raiz();
	void agregar(Pokemon poke);
	void eliminar(Pokemon poke);
	boolean arbolVacio();
	ABBTDA hijoIzquierdo();
	ABBTDA hijoDerecho();
}
