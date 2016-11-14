
public interface ColaTDA {
	
	public void inicializarCola();
	//siempre que la cola est� inicializada;
	public void acolar(Pokemon valor);
	//siempre que la cola est� inicializada y no vac�a
	public void desacolar();
	//siempre que la cola est� inicializada
	public boolean colaVac�a();
	//siempre que la cola est� inicializada y no vac�a
	public Pokemon primero();

}
