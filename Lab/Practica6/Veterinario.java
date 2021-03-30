
public class Veterinario {
	String name;
	double salario;
	
	public Veterinario(String name, double salario) {
		this.name=name;
		this.salario=salario;
	}
	
	public void Vacunar(Animal animal) {
		animal.setVacunado(true);
		System.out.println(animal.getNombre()+"ha sido vacunado");
	}
	
	public void examinarAnimales(Animal a) {
		System.out.println("\nSe realizo un examen fisico a "+a.nombre);
	}
	
	public void limpiarDientes(Animal a) {
		System.out.println("\nSe realizo una limpieza de dietes a "+a.getNombre());
	}
	
}
