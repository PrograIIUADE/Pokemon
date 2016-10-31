import TDA.ColaPrioridadTDA;


public interface PokedexTDA {
	void inicializar();
	void agregar(Pokemon pokemon); //agrega un pokemon a la estructura. Es necesario que la misma esté inicializada.
	void transferir(Pokemon pokemon); //elimina el pokemon de la estructura, transfiriéndolo al profesor. Es necesario que el pokemon exista.
	ColaPrioridadTDA<Pokemon> Recuperar(TipoPokemon tipo); //recupera todos los pokemones del tipo pasado por parámetro en una ColaPrioridadTDA. Es neceario que la estructura esté inicializada.

}
