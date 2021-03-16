
public class Amarillo extends Pajaro {
	String poder;

	public Amarillo(String nombre, String forma, String poder) {
		super(nombre,forma);
		this.poder=poder;
	}
	
	public void setPoder(String poder){
		this.poder=poder;
	}

	public String getPoder(){
		return poder;
	}
	
	 public void imprimirAmarillo(){
		 System.out.println("Nombre: "+this.nombre);
		 System.out.println("Forma: "+this.forma);
		 System.out.println("Poder: "+this.poder);
		 System.out.println(" ");
	 } 
}
