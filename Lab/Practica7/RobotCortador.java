
public class RobotCortador extends Robot implements Cortar{
	String verduras;
	boolean carne;
	
	public RobotCortador(String manos, String name, double id, int porcentajeBateria, int control, String verduras, boolean carne) {
		super(manos, name, id, porcentajeBateria, control);
		this.verduras=verduras;
		this.carne=carne;
	}

	public void moverse() {
		System.out.println("El robot Cortador esta tomando las verduras");
		porcentajeBateria-=10;
		control=1;
	}

	public void cortarVerdurasEspecificas(String verduras) {
		System.out.println("El robor cortador esta cortando "+verduras);
		porcentajeBateria-=10;
		control=2;
	}
	
	public void setVerduras(String verduras) {
		this.verduras=verduras;
	}
	
	public String getVerduras() {
		return verduras;
	}
	
	public void setCarne(boolean carne) {
		this.carne=carne;
	}
	
	public boolean getCarne() {
		return carne;
	}

	public void cortarVerduras() {
		System.out.println("El robot esta cortando todas las verduras");
		porcentajeBateria-=10;
	}
	
	public void cortarCarne() {
		System.out.println("El robor esta cortando la carne");
		porcentajeBateria-=10;
		control=3;
	}
	
}
