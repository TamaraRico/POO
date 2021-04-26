
public abstract class Robot {
	String manos;
	String name;
	double id;
	int porcentajeBateria;
	int control;
	
	public Robot(String manos, String name, double id, int porcentajeBateria, int control) {
		this.manos=manos;
		this.name=name;
		this.id=id;
		this.porcentajeBateria=porcentajeBateria;
		this.control=control;
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre: "+name);
		System.out.println("Numero de identificacion: "+id);
		System.out.println("Porcentaje de Bateria: "+porcentajeBateria);
	}
	
	public abstract void  moverse();
	
	public void setManos(String manos) {
		this.manos=manos;
	}
	
	public String getManos() {
		return manos;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setID(double id) {
		this.id=id;
	}
	
	public double getID() {
		return id;
	}
	
	public void setPorcentajeBateria(int porcentajeBateria) {
		this.porcentajeBateria=porcentajeBateria;
	}
	
	public int getPorcetajeBateria() {
		return porcentajeBateria;
	}
	
	public void setControl(int control) {
		this.control=control;
	}
	
	public int getControl() {
		return control;
	}
}
