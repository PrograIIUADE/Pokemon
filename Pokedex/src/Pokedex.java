import TDA.ColaPrioridadTDA;


public class Pokedex implements PokedexTDA{
	
	ABBTDA pokeArbol;

	@Override
	public void inicializar() {		
		pokeArbol = new ABB();		
	}

	@Override
	public void agregar(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ColaPrioridadTDA<Pokemon> Recuperar(TipoPokemon tipo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
