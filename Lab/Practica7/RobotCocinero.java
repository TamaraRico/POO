
public class RobotCocinero extends Robot implements Cocinar{
	double tempCoccion;
	
	public RobotCocinero(String manos, String name, double id, int porcentajeBateria, int control, double tempCoccion) {
		super(manos, name, id, porcentajeBateria, control);
		this.tempCoccion=tempCoccion;
	}

	public void cocinarVegetales() {
		System.out.println("El robot cocinero esta cociendo los vegetales");
		porcentajeBateria-=10;
		control=2;
	}

	public void cocinarCarne() {
		System.out.println("El robot cocinero esta cocinando la carne a la temperatura especificada");
		porcentajeBateria-=10;
		control=3;
	}

	public void moverse() {
		System.out.println("El robot cocinero esta calentando sus manos a la temperatura correcta");
		porcentajeBateria-=10;
		control=1;
	}
	
	public void setTempCoccion(double tempCoccion) {
		this.tempCoccion=tempCoccion;
	}
	
	public double getTempCoccion() {
		return tempCoccion;
	}

}
