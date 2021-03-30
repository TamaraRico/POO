
public class Perro extends Animal{
	public Perro(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		super(nombre, nombreEspecie, raza, tipoAlimentacion, edad, peso, vacunado);
	}

	@Override
	public void Comer() {
		System.out.println("\n"+nombre+" esta comiendo croquetas");
	}
	
	@Override
	public void Dormir() {
		System.out.println("\nEl perro esta durmiendo");
	}
	
	public void Ladrar() {
		System.out.println("\nEl perro esta ladrando");
	}
}
