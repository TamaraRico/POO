
public class Validaciones {
	public static boolean buscarNumJugador(Jugador j[], int num){
		 for(int i=0; i<j.length; i++) {
			 if(num==(j[i].getNo_uniforme())) 
				return true;
			 	break;
		}
		return false;
	}
	
	public static boolean buscarNombre(Equipo eq[], String name){
		 for(int i=0; i<eq.length; i++) {
			 for(int j=0; j<eq[i].jugadores.length; j++) {
				if(name.equals(eq[i].jugadores[j].getName())) {
					return true;
					//break;
				}
			 }
			}
		 	return false;
		 }
}
