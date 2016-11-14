
public class ColaID implements ColaTDA {

	class nodo 
	{
		Pokemon valor;
		nodo sig;		
	}
	nodo primero;
	public void inicializarCola() 
	{
		primero=null;		
	}
	public void acolar(Pokemon valor)
	{
		if (primero==null)
		{
			primero= new nodo();
			primero.valor=valor;
			primero.sig=null;
		}
		else 
		{
			nodo recorro=primero;
			while(recorro.sig !=null)
			{
				recorro=recorro.sig;
			}
			nodo aux=new nodo();
			aux.valor=valor;
			aux.sig=recorro.sig;
			recorro.sig=aux;
		}
		
	}
	public void desacolar()
	{
	primero=primero.sig;	
		
	}
	public boolean colaVacía() {
		return primero==null;
	}
	public Pokemon primero()
	{
		return primero.valor;
	}
}