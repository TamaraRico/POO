
public class RobotChef extends Robot{
	String mainIngrediente;
	 
	public RobotChef(String manos, String name, double id, int porcentajeBateria, int control, String mainIngrediente) {
		super(manos, name, id, porcentajeBateria, control);
		this.mainIngrediente=mainIngrediente;
	}

	public void moverse() {
		System.out.println("El robot chef esta moviendose para preparar su deliciosa comida");
		porcentajeBateria-=10;
		control=1;
	}
	
	public void servirPlatillo(String mainIngrediente) {
		System.out.println("Su platillo a base de "+mainIngrediente+" esta listo");
		porcentajeBateria-=10;
		control=2;
	}
	
	public void setMainIngrdiente(String mainIngrediente) {
		this.mainIngrediente=mainIngrediente;
	}
	
	public String getMainIngrediente() {
		return mainIngrediente;
	}

}
