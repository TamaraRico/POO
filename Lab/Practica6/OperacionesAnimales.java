
public class OperacionesAnimales {
	public static int buscarAnimal(Animal a[], String name){
		int indice=0; 
		for(int i=0; i<a.length; i++) {
			 //System.out.println("a= "+cuentas[i].getNombre());
				if(name.equals(a[i].getNombre())) {
					indice=i;
					//return a1;
					break;
				}
				/*else {
					System.out.println("\nEl alumno "+name+" no fue encontrado en el grupo");
				}*/
			}
		 	return indice;
		 }
	
	public static void mostrarDatos(Animal a) {
		System.out.println("Nombre de la especie: "+a.getNombreEspecie());
		System.out.println("Nombre: "+a.getNombre());
		System.out.println("Raza del animal: "+a.getRaza());
		System.out.println("Tipo de Alimentacion: "+a.getTipoAlimentacion());
		System.out.println("Nombre de la especie: "+a.getNombreEspecie());
		System.out.println("Edad: "+a.getEdad());
		System.out.println("Peso: "+a.getPeso());
		System.out.println("Estado de vacunacion: "+a.getVacunado());
	}
}
