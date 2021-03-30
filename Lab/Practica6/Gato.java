
public class Gato extends Animal{
	public Gato(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		super(nombre, nombreEspecie, raza, tipoAlimentacion, edad, peso, vacunado);
	}

	@Override
	public void Comer() {
		System.out.println("\n"+nombre+" esta comiendo croquetas para gato");
	}
	
	@Override
	public void Dormir() {
		System.out.println("\nEl gato esta durmiendo");
	}
	
	public void Ronronear() {
		System.out.println("\nEl gato esta ronroneando");
	}
}
