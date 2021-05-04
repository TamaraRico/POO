
public class Jugador {
	protected String name;
	protected int no_uniforme;
	protected int puntos;
	protected String posicion;
	protected float estatura;
	
	/*public void setJugador(String name, int no_uniforme, int puntos, String posicion, float estatura) {
		this.name=name;
		this.no_uniforme=no_uniforme;
		this.puntos=puntos;
		this.posicion=posicion;
		this.estatura=estatura;
	}*/
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNo_uniforme(int no_uniforme) {
		this.no_uniforme=no_uniforme;
	}
	
	public int getNo_uniforme() {
		return no_uniforme;
	}
	
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public void setEstatura(float estatura) {
		this.estatura=estatura;
	}
	
	public float getEstatura() {
		return estatura;
	}
}
