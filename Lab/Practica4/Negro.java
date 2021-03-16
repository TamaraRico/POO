
public class Negro extends Pajaro {
		String poder;

		public Negro(String nombre, String forma, String poder) {
			super(nombre,forma);
			this.poder=poder;
		}
		
		public void setPoder(String poder){
			this.poder=poder;
		}

		public String getPoder(){
			return poder;
		}
		
		 public void imprimirNegro(){
			 System.out.println("Nombre: "+this.nombre);
			 System.out.println("Forma: "+this.forma);
			 System.out.println("Poder: "+this.poder);
			 System.out.println(" ");
		 } 
}
