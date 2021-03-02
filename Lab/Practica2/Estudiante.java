//contiene informacion del estudiante

public class Estudiante {
//atributos
	String nombre;
	String id;
	String materia;
	int calificacion;
	String estado;
	
	//método constructor
	public Estudiante(String nombre, String id, String materia, int calificacion, String estado){
		this.nombre=nombre;
		this.id=id;
		this.materia=materia;
		this.calificacion=calificacion;
		this.estado=estado;
	}
	
	//metodos set and get para acceder a cada elemento
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public void setMateria(String materia) {
		this.materia=materia;
	}
	
	public void setCalificacion(int calificacion) {
		this.calificacion=calificacion;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void estadoEstudiante(int calificacion) {
		if(calificacion<60) {
			this.estado="Reprobado";
		}
		else {
			this.estado="Aprobado";
		}
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre : "+this.nombre);
		System.out.println("ID : "+this.id);
		System.out.println("Materia : "+this.materia);
		System.out.println("Calificación : "+this.calificacion);
		System.out.println("Estado : "+this.estado+"\n\n");

	}
	
}
