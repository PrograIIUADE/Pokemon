import TDA.ColaPrioridadTDA;


public class Test {

	public static void main(String[] args) {
		PokedexTDA pokedex= new Pokedex();
		pokedex.inicializar();
		
		System.out.format("Se van a cargar los pokemones \n");
		
		Pokemon magnamite= new Pokemon();
		
		magnamite.setTipo(TipoPokemon.Acero);
		magnamite.setNombre("Magnamite");
		magnamite.setPc(100);
		magnamite.setPs(50);
		magnamite.setAtaque(70);
		magnamite.setDefensa(80);
		magnamite.setStamina(20);
		
		pokedex.agregar(magnamite);
		
		Pokemon magnetron = new Pokemon();
		
		magnetron.setTipo(TipoPokemon.Acero);
		magnetron.setNombre("Magnetron");
		magnetron.setPc(200);
		magnetron.setPs(50);
		magnetron.setAtaque(170);
		magnetron.setDefensa(180);
		magnetron.setStamina(220);
		
		pokedex.agregar(magnetron);
		
		Pokemon psyduck = new Pokemon();
		
		psyduck.setTipo(TipoPokemon.Psiquico);
		psyduck.setNombre("Psyduck");
		psyduck.setPc(2100);
		psyduck.setPs(510);
		psyduck.setAtaque(1270);
		psyduck.setDefensa(180);
		psyduck.setStamina(2320);
		
		pokedex.agregar(psyduck);
		
		Pokemon hypno = new Pokemon();
		
		hypno.setTipo(TipoPokemon.Psiquico);
		hypno.setNombre("Hypno");
		hypno.setPc(10);
		hypno.setPs(5);
		hypno.setAtaque(12);
		hypno.setDefensa(10);
		hypno.setStamina(2);
		
		pokedex.agregar(hypno);
		
		System.out.println("4 Pokemones cargados");
		
		ColaTDA ordenarPokemones = pokedex.OrdenarPokemones(TipoPokemon.Acero, Caracteristica.Stamina);
		
		System.out.println("Pokemones acero ordenados por stamina");
		while(!ordenarPokemones.colaVacía()){
			System.out.println(ordenarPokemones.primero().getNombre());
			ordenarPokemones.desacolar();
		}
		
		try {
			ColaPrioridadTDA<Pokemon> pokemonesPoderosos = pokedex.PokemonesPoderosos(2);
			
			System.out.println("2 Pokemones mas poderosos");
			while(!pokemonesPoderosos.ColaVacia()){
				System.out.println(pokemonesPoderosos.RecuperarMaxElemento().getNombre());
				pokemonesPoderosos.EliminarMaxPrioridad();	
			}
			
			ColaPrioridadTDA<Pokemon> pokemonesDebiles = pokedex.PokemonesDebiles(2);
			
			System.out.println("2 Pokemones mas debiles");
			while(!pokemonesDebiles.ColaVacia()){
				System.out.println(pokemonesDebiles.RecuperarMaxElemento().getNombre());
				pokemonesDebiles.EliminarMaxPrioridad();	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pokedex.transferir(magnetron);
		
		System.out.println("Magnetron transferido");
		
		ColaTDA pokemonesOrdenados = pokedex.OrdenarPokemones(TipoPokemon.Psiquico, Caracteristica.Nombre);
		
		System.out.println("Pokemones psiquicos ordenados por nombre");
		while(!pokemonesOrdenados.colaVacía()){
			System.out.println(pokemonesOrdenados.primero().getNombre());
			pokemonesOrdenados.desacolar();
		}
		
	}

}
