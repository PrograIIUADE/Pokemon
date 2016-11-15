import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Implementaciones.ColaPrioridad;
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

	@Override
	public ColaTDA OrdenarPokemones(TipoPokemon tipo, Caracteristica carac) {
		
		List<Pokemon> lista = new ArrayList<Pokemon>();
		
		ColaPrioridadTDA<Pokemon> cola = pokeArbol.recuperarCola(tipo);
		
		while(!cola.ColaVacia()){
			try {
				Pokemon poke = cola.RecuperarMaxElemento();
				lista.add(poke);
				cola.EliminarMaxPrioridad();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	Comparator<Pokemon> comparador;
	
	switch(carac){

		case PC:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getPc()-o2.getPc();
				}
			};
			break;
		case PS:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getPs()-o2.getPs();
				}
			};
			break;
		case Ataque:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getAtaque()-o2.getAtaque();
				}
			};
			break;
		case Defensa:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getDefensa()-o2.getDefensa();
				}
			};
			break;
		case Stamina:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getStamina()-o2.getStamina();
				}
			};
			break;
		case Nombre:	
		default:
			comparador = new Comparator<Pokemon>() {
				@Override
				public int compare(Pokemon o1, Pokemon o2) {
					return o1.getNombre().compareTo(o2.getNombre());
				}
			};
			break;
		}
		Collections.sort(lista , comparador);
		ColaTDA respuesta = new  ColaID();
		for (Pokemon pokemon : lista) {
			
			respuesta.acolar(pokemon);
			cola.AgregarElemento(pokemon, pokemon.getPc());
		}
		
		return respuesta;
		
	}

	@Override
	public ColaPrioridadTDA<Pokemon> PokemonesPoderosos(int cant) {
		
		List<Pokemon> lista = new ArrayList<Pokemon>();
				
		for (TipoPokemon tipo : TipoPokemon.values()) {
			
			ColaPrioridadTDA<Pokemon> cola = pokeArbol.recuperarCola(tipo);
			List<Pokemon> listaAuxiliar = new ArrayList<Pokemon>();
			while(!cola.ColaVacia()){
				try {
					Pokemon poke = cola.RecuperarMaxElemento();
					lista.add(poke);
					listaAuxiliar.add(poke);
					cola.EliminarMaxPrioridad();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for(Pokemon pokeAux : listaAuxiliar){
				cola.AgregarElemento(pokeAux, pokeAux.getPc());
			}
						
		}
		
		Collections.sort(lista, new Comparator<Pokemon>() {

			@Override
			public int compare(Pokemon o1, Pokemon o2) {
				return o2.getPc()-o1.getPc();
			}
		});
		
		List<Pokemon> listaPoderosos = lista.subList(0, cant);
		ColaPrioridadTDA<Pokemon> colaPoderosos = new ColaPrioridad<Pokemon>();
		for (Pokemon pokemon : listaPoderosos) {
			
			colaPoderosos.AgregarElemento(pokemon, pokemon.getPc());
		}
		
		return colaPoderosos;
	}

	@Override
	public ColaPrioridadTDA<Pokemon> PokemonesDebiles(int cant) {
		
		List<Pokemon> lista = new ArrayList<Pokemon>();
				
		for (TipoPokemon tipo : TipoPokemon.values()) {
			
			ColaPrioridadTDA<Pokemon> cola = pokeArbol.recuperarCola(tipo);
			List<Pokemon> listaAuxiliar = new ArrayList<Pokemon>();
			while(!cola.ColaVacia()){
				try {
					Pokemon poke = cola.RecuperarMaxElemento();
					lista.add(poke);
					listaAuxiliar.add(poke);
					cola.EliminarMaxPrioridad();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for(Pokemon pokeAux : listaAuxiliar){
				cola.AgregarElemento(pokeAux, pokeAux.getPc());
			}
						
		}
		
		Collections.sort(lista, new Comparator<Pokemon>() {

			@Override
			public int compare(Pokemon o1, Pokemon o2) {
				return o1.getPc()-o2.getPc();
			}
		});
		
		List<Pokemon> listaDebiles = lista.subList(0, cant);
		ColaPrioridadTDA<Pokemon> colaDebiles = new ColaPrioridad<Pokemon>();
		for (Pokemon pokemon : listaDebiles) {
			
			colaDebiles.AgregarElemento(pokemon, pokemon.getPc());
		}
		
		return colaDebiles;
	}
	} 
	
	


