
public class Main {
	public static void main (String [] args) {
		//Capturar los datos del torneo
		Torneo torneo= new Torneo();
		System.out.println("\n\nRegistro de datos para el torneo");
		torneo.setEquipos(5);
		torneo.setNo_equipos(5);
		torneo.setNombre(CapturaEntrada.capturarNombre("Nombre del torneo: "));
		torneo.setRegion(CapturaEntrada.capturarNombre("Nombre de la region: "));
		torneo.setPartidos_pendientes(CapturaEntrada.capturarNum("Partidos pendientes por jugar: "));
		torneo.setPartidos_jugados(CapturaEntrada.capturarNum("Partidos jugados: "));
		
		System.out.println("\n\nDatos capturados");
		torneo.imprimirEquipos();
		System.out.println("\n");
		System.out.println("Nombre del torneo: "+torneo.getNombre());
		System.out.println("Region: "+torneo.getRegion());
		System.out.println("Numero de equipos participantes: "+torneo.getNo_equipos());
		System.out.println("Partidos pendientes por jugar: "+torneo.getPartidos_pendientes());
		System.out.println("Partidos jugados: "+torneo.getPartidos_jugados());
	}
}
