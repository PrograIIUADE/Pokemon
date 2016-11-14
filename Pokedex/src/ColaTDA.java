
public interface ColaTDA {
	
	public void inicializarCola();
	//siempre que la cola esté inicializada;
	public void acolar(Pokemon valor);
	//siempre que la cola esté inicializada y no vacía
	public void desacolar();
	//siempre que la cola esté inicializada
	public boolean colaVacía();
	//siempre que la cola esté inicializada y no vacía
	public Pokemon primero();

}
