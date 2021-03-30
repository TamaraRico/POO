
public class Caballo extends Animal{
	public Caballo(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		super(nombre, nombreEspecie, raza, tipoAlimentacion, edad, peso, vacunado);
	}
	
	public void cabalgar() {
		System.out.println("\nEl caballo esta siendo cabalgado por un visitante");
	}
	
	public void relinchar() {
		System.out.println("\nEl caballo esta relinchando");
	}

}
