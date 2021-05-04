
public class Torneo {
	protected String nombre;
	protected String region;
	protected int no_equipos;
	protected int partidos_jugados;
	protected int partidos_pendientes;
	Equipo equipos[];
	
	/*public void setEquipo(String name, String division, String nombre_entrenador, int torneos_participados, int torneos_ganados, int torneos_perdidos) {
		//for(int i=0; i<5; i++) {
			this.equipo.setEquipo(name, division, nombre_entrenador, torneos_participados, torneos_ganados, torneos_perdidos);
		//}
	}
	public void setEquipo(String name, String division, String nombre_entrenador, int torneos_participados, int torneos_ganados, int torneos_perdidos) {
		this.equipo.setEquipo(name, division, nombre_entrenador, torneos_participados, torneos_ganados, torneos_perdidos);
	}*/
	
	/*public Torneo(String nombre, String region, int no_equipos, int partidos_jugados, int partidos_pendientes) {
		this.nombre=nombre;
		this.region=region;
		this.no_equipos=no_equipos;
		this.partidos_jugados=partidos_jugados;
		this.partidos_pendientes=partidos_pendientes;
	}*/
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setRegion(String region) {
		this.region=region;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setNo_equipos(int no_equipos) {
		this.no_equipos=no_equipos;
	}
	
	public int getNo_equipos() {
		return no_equipos;
	}
	
	public void setPartidos_jugados(int partidos_jugados) {
		this.partidos_jugados=partidos_jugados;
	}
	
	public int getPartidos_jugados() {
		return partidos_jugados;
	}
	
	public void setPartidos_pendientes(int partidos_pendientes) {
		this.partidos_pendientes=partidos_pendientes;
	}
	
	public int getPartidos_pendientes() {
		return partidos_pendientes;
	}
	
	public void setEquipos(int nummat){
		  equipos = new Equipo[nummat];
		  for (int i = 0; i < nummat; i++){
			  equipos[i]= new Equipo();
		  }
		  
		  for (int i = 0; i < nummat; i++){
			  equipos[i]= new Equipo();
			  System.out.println("\n\nCapture los datos de un equipo");
			  equipos[i].name = CapturaEntrada.capturarNombre("Nombre del equipo: ");
			  //califs[i].setMateria(CapturaEntrada.capturarNombre("Nombre de materia: "));
			  equipos[i].division= CapturaEntrada.capturarNombre("Nombre de la division: ");
			  equipos[i].nombre_entrenador=CapturaEntrada.capturarNombre("Nombre del entrenador: ");
			  equipos[i].torneos_participados=CapturaEntrada.capturarNum("No. de torneos participados: ");
			  equipos[i].torneos_ganados=CapturaEntrada.capturarNum("No. de torneos ganados: ");
			  equipos[i].torneos_perdidos=CapturaEntrada.capturarNum("No. de torneos perdidos: ");
			  System.out.println("\n");
			  equipos[i].setJugador(10);
			 /* for(int j=0; i<equipos[i].jugadores.length; i++) {
				  if(Validaciones.buscarNombre(equipos,equipos[i].jugadores[j].getName()))
					  System.out.println("El jugador "+equipos[i].jugadores[j].getName()+" ya esta participando en otro equipo");
				  if(Validaciones.buscarNumJugador(equipos[i].jugadores, equipos[i].jugadores[j].no_uniforme))
					  System.out.println("El numero de jugador ya ha sido seleccionado");
			  }**/
			  //califs[i].setCalificacion(CapturaEntrada.capturarCalificaciones("Calificación: "));
		  }
		} 
	
	public Equipo[] getEquipos() {
		return equipos;
	}
	
	public void imprimirEquipos() {
		for(int i=0; i<equipos.length; i++) {
			System.out.println("Nombre del equipo: "+equipos[i].getName());
			System.out.println("Nombre de la division: "+equipos[i].getDivision());
			System.out.println("Numero de jugadores: "+equipos[i].regresarJugadores());
			//System.out.println("Nombre de la division: "+equipos[i].recuentoPuntos(jugadores));
			/*System.out.println("Nombre del entrenador: "+equipos[i].getNombre_entrenador());
			System.out.println("Numero de torneos ganados: "+equipos[i].getTorneos_ganados());
			System.out.println("Numero de torneos participados: "+equipos[i].getTorneos_participados());
			System.out.println("Numero de torneos perdidos: "+equipos[i].getTorneos_perdidos());*/
			equipos[i].imprimirJugadores();
		}
	}
}
