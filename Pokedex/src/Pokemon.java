
public class Pokemon {
	
	String nombre;
	int pc; //Puntos de Combate (PC)
	int ps; //Puntos de Salud (PS)
	TipoPokemon tipo; // tipos de pokemon (tierra, fuego, roca, etc.)
	int ataque;
	int defensa;
	int stamina;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public TipoPokemon getTipo() {
		return tipo;
	}
	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (ataque != other.ataque)
			return false;
		if (defensa != other.defensa)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pc != other.pc)
			return false;
		if (ps != other.ps)
			return false;
		if (stamina != other.stamina)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	
}
