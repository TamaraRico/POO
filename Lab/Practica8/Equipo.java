
public class Equipo {
	protected String name;
	protected String division;
	protected String nombre_entrenador;
	protected int torneos_participados;
	protected int torneos_ganados;
	protected int torneos_perdidos;
	Jugador jugadores[];
	
	public void setJugador(int nummat){
		  jugadores = new Jugador[nummat];
		  for (int i = 0; i < nummat; i++){
			  jugadores[i]= new Jugador();
		  }
		  
		  for (int i = 0; i < nummat; i++){
			  jugadores[i]= new Jugador();
			  System.out.println("\n\nJugador "+i);
			  jugadores[i].name = CapturaEntrada.capturarNombre("Nombre del jugador: ");
			  //califs[i].setMateria(CapturaEntrada.capturarNombre("Nombre de materia: "));
			  jugadores[i].no_uniforme= CapturaEntrada.capturarNum("Numero de jugador: ");
			  jugadores[i].posicion=CapturaEntrada.capturarNombre("Posicion: ");
			  jugadores[i].estatura=CapturaEntrada.capturarNum2("Estatura: ");
			  jugadores[i].puntos=CapturaEntrada.capturarNum("Numero de puntos:");
			  //califs[i].setCalificacion(CapturaEntrada.capturarCalificaciones("Calificación: "));
		  }
		} 
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void imprimirJugadores() {
		for(int i=0; i<jugadores.length; i++) {
			System.out.println(jugadores[i].getName());
			System.out.println(jugadores[i].getNo_uniforme());
			/*System.out.println(jugadores[i].getPosicion());
			System.out.println(jugadores[i].getPuntos());
			System.out.println(jugadores[i].getEstatura());*/
		}
		System.out.println("Puntos totales en el equipo: "+recuentoPuntos(jugadores));
	}
	
	/*public void setJugador(String name, int no_uniforme, int puntos, String posicion, float estatura) {
		this.jugador.setJugador(name, no_uniforme, puntos, posicion, estatura);
	}*/
	
	/*public void setEquipo(String name, String division, String nombre_entrenador, int torneos_participados, int torneos_ganados, int torneos_perdidos) {
		this.name=name;
		this.division=division;
		this.nombre_entrenador=nombre_entrenador;
		this.torneos_participados=torneos_participados;
		this.torneos_ganados=torneos_ganados;
		this.torneos_perdidos=torneos_perdidos;
	}*/
	
	public void setName(String  name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDivision(String division) {
		this.division=division;
	}
	
	public String getDivision() {
		return division;
	}
	
	public void setNombre_entrenador(String nombre_entrenador) {
		this.nombre_entrenador=nombre_entrenador;
	}
	
	public String getNombre_entrenador() {
		return nombre_entrenador;
	}
	
	public void setTorneos_participados(int torneos_participados) {
		this.torneos_participados=torneos_participados;
	}
	
	public int getTorneos_participados() {
		return torneos_participados;
	}
	
	public void setTorneos_ganados(int torneos_ganados) {
		this.torneos_ganados=torneos_ganados;
	}
	
	public int getTorneos_ganados() {
		return torneos_ganados;
	}
	
	public void setTorneos_perdidos(int torneos_perdidos) {
		this.torneos_perdidos=torneos_perdidos;
	}
	
	public int getTorneos_perdidos() {
		return torneos_perdidos;
	}
	
	//metodos extra de la clade equipo
	public int regresarJugadores() {
		return jugadores.length;
	}
	
	public int recuentoPuntos(Jugador jugadores[]) {
		int recuento=0;
		for(int i=0; i<jugadores.length; i++) {
			recuento+=jugadores[i].getPuntos();
		}
		return recuento;
	}
}
