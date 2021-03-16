
public class angryBirds {
	  public static void main(String args[]){
		  Rojo r1=new Rojo("Terence", "redondo", "grito poderoso");
		  Amarillo a1=new Amarillo("Chuck", "triangular", "aumento de velocidad");
		  Negro n1=new Negro("Bomb", "esferico", "convertirse en una bomba");
		  Pajaro pajaros[]= {r1, a1, n1};
		  
		  System.out.println("\n********PARAJOS EN ANGRY BIRDS********\n");
		  System.out.println("--Elementos: \n");
		  for(int i=0; i<pajaros.length; i++) {
			  System.out.println("Pajaro: "+pajaros[i].getNombre());
			  System.out.println("Caracteristicas: "+pajaros[i].getForma());
			  System.out.println("");
		  }
		  
		  System.out.println("\n--Pajaros individualmente:\n");
		  r1.imprimirRojo();
		  a1.imprimirAmarillo();
		  n1.imprimirNegro();
	  }
}
