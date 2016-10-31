import TDA.ColaPrioridadTDA;


public interface PokedexTDA {
	void inicializar();
	void agregar(Pokemon pokemon); //agrega un pokemon a la estructura. Es necesario que la misma est� inicializada.
	void transferir(Pokemon pokemon); //elimina el pokemon de la estructura, transfiri�ndolo al profesor. Es necesario que el pokemon exista.
	ColaPrioridadTDA<Pokemon> Recuperar(TipoPokemon tipo); //recupera todos los pokemones del tipo pasado por par�metro en una ColaPrioridadTDA. Es neceario que la estructura est� inicializada.

}
