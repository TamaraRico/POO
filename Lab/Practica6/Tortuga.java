
public class Tortuga extends Animal{
	public Tortuga(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		super(nombre, nombreEspecie, raza, tipoAlimentacion, edad, peso, vacunado);
	}
	
	public void esconderse() {
		System.out.println("\nLa tortuga se escondio en su caparazon");
	}
	
}
