
public class Persona {
	String nombre;
	String apaterno;
	String amaterno;
	String fnacimiento;
	String genero;
	String estado;
	String curp;
	String rfc;
	
	//constructor 
	public Persona(String nombre, String apaterno, String amaterno, String fnacimiento, String genero, String estado){
		this.nombre=nombre;
		this.apaterno=apaterno;
		this.amaterno=amaterno;
		this.fnacimiento=fnacimiento;
		this.genero=genero;
		this.estado=estado;
	}
	
	//setters 
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApaterno(String apaterno) {
		this.apaterno=apaterno;
	}
	
	public void setAmaterno(String amaterno) {
		this.amaterno=amaterno;
	}
	
	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento=fnacimiento;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getApaterno() {
		return apaterno;
	}
	
	public String getAmaterno() {
		return amaterno;
	}
	
	public String getFnacimiento() {
		return fnacimiento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getEstado() {
		return estado;
	}
	
	/*public String setCurp() {
		this.curp=//revisar
	}
	
	public void estadoEstudiante(int calificacion) {//hacer aqui lo de estado con variables a b o hacerlo en proceso
		if(calificacion<60) {
			this.estado="Reprobado";
		}
		else {
			this.estado="Aprobado";
		}
	}*/
	
	public void imprimirDatos() {
		System.out.println("Nombre completo: "+this.nombre+" "+this.apaterno+" "+this.amaterno);
		System.out.println("Fecha de nacimiento: "+this.fnacimiento);
		System.out.println("Genero : "+this.genero);
		System.out.println("Estado : "+this.estado+"\n\n");

	}
	
}

