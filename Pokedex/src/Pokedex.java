import TDA.ColaPrioridadTDA;


public class Pokedex implements PokedexTDA{
	
	ABBTDA pokeArbol;

	@Override
	public void inicializar() {		
		pokeArbol = new ABB();		
	}

	@Override
	public void agregar(Pokemon pokemon) {
		
		pokeArbol.agregar(pokemon);
		
	}

	@Override
	public void transferir(Pokemon pokemon) {
		
		pokeArbol.eliminar(pokemon);
	}

	@Override
	public ColaPrioridadTDA<Pokemon> Recuperar(TipoPokemon tipo) {
		
		return pokeArbol.recuperarCola(tipo);
		
	} 
	
	

}
