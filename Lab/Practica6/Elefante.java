
public class Elefante extends Animal{
	public Elefante(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		super(nombre, nombreEspecie, raza, tipoAlimentacion, edad, peso, vacunado);
	}
	
	public void barritar() {
		System.out.println("\nEl elefante esta barritando");
	}
}
