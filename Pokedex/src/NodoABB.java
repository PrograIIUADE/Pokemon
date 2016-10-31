import TDA.ColaPrioridadTDA;


public class NodoABB{
	TipoPokemon tipo;
	ColaPrioridadTDA<Pokemon> cola;
	ABBTDA HijoIzquierdo;
	ABBTDA HijoDerecho;
	
	
	public TipoPokemon getTipo() {
		return tipo;
	}
	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}
	public ColaPrioridadTDA<Pokemon> getCola() {
		return cola;
	}
	public void setCola(ColaPrioridadTDA<Pokemon> cola) {
		this.cola = cola;
	}
	public ABBTDA getHijoIzquierdo() {
		return HijoIzquierdo;
	}
	public void setHijoIzquierdo(ABBTDA hijoIzquierdo) {
		HijoIzquierdo = hijoIzquierdo;
	}
	public ABBTDA getHijoDerecho() {
		return HijoDerecho;
	}
	public void setHijoDerecho(ABBTDA hijoDerecho) {
		HijoDerecho = hijoDerecho;
	}
}
	
