
public class Animal {
	protected String nombre;
	protected String nombreEspecie;
	protected String raza;
	protected String tipoAlimentacion;
	protected int edad;
	protected int peso;
	protected boolean vacunado;
	
	public Animal(String nombre, String nombreEspecie, String raza, String tipoAlimentacion, int edad, int peso, boolean vacunado) {
		this.nombre=nombre;
		this.nombreEspecie=nombreEspecie;
		this.raza=raza;
		this.tipoAlimentacion=tipoAlimentacion;
		this.edad=edad;
		this.peso=peso;
		this.vacunado=vacunado;
	}
	
	public void Dormir() {
		System.out.println("\nEl "+nombreEspecie+" esta durmiendo");
	}
	
	public void Comer() {
		System.out.println("\nEl "+nombreEspecie+" esta comiendo");
	}
	
	//setters and getters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie=nombreEspecie;
	}
	
	public void setRaza(String raza) {
		this.raza=raza;
	}
	
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion=tipoAlimentacion;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public void setVacunado(boolean vacunado) {
		this.vacunado=vacunado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}	
	
	public int getEdad() {
		return edad;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public boolean getVacunado() {
		return vacunado;
	}
	
}
