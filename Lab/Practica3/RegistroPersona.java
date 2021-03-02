
public class RegistroPersona {
	public static void main (String [] args){
		
		System.out.println("\n****CONSULTA DE CURP Y DE RFC****\n");
		System.out.println("\n\n\n\nCaptura de datos para el CURP:");
		Persona p1=new Persona(CapturaEntrada.capturarNombre("Capture el nombre: "), CapturaEntrada.capturarNombre("Capture el apellido paterno: "), CapturaEntrada.capturarNombre("Capture el apellido materno: "), CapturaEntrada.capturarNombre("Fecha de nacimiento en formato AAMMDD: "), CapturaEntrada.capturarNombre("Genero(Hombre o Mujer): "), CapturaEntrada.capturarNombre("Estado de nacimiento: "));

		System.out.println("\nCURP: "+MetodosPersona.primerDigito(p1)+MetodosPersona.segundoDigitoC(p1)+MetodosPersona.tercerDigito(p1)+MetodosPersona.cuartoDigito(p1)+MetodosPersona.fechaNacimiento(p1)+MetodosPersona.caracterG(p1)+MetodosPersona.definirEstadoP(p1)+MetodosPersona.definirEstadoS(p1)+MetodosPersona.catorceavoDigitoC(p1)+MetodosPersona.quinteavoDigitoC(p1)+MetodosPersona.dieciseisavoDigitoC(p1)+MetodosPersona.dosAleatorios());
		
		System.out.println("\n\n\n\nCaptura de datos para el RFC:");
		Persona p2=new Persona(CapturaEntrada.capturarNombre("Capture el nombre: "), CapturaEntrada.capturarNombre("Capture el apellido paterno: "), CapturaEntrada.capturarNombre("Capture el apellido materno: "), CapturaEntrada.capturarNombre("Fecha de nacimiento en formato AAMMDD: "), "", "");
		System.out.println("\nRFC: "+MetodosPersona.primerDigito(p2)+MetodosPersona.segundoDigitoR(p2)+MetodosPersona.tercerDigito(p2)+MetodosPersona.cuartoDigito(p2)+MetodosPersona.fechaNacimiento(p2)+MetodosPersona.tresAleatorios());

		System.out.println("\n\n\n\nCaptura de datos para el CURP y RFC:");
		Persona p3=new Persona(CapturaEntrada.capturarNombre("Capture el nombre: "), CapturaEntrada.capturarNombre("Capture el apellido paterno: "), CapturaEntrada.capturarNombre("Capture el apellido materno: "), CapturaEntrada.capturarNombre("Fecha de nacimiento en formato AAMMDD: "), CapturaEntrada.capturarNombre("Genero(Hombre o Mujer): "), CapturaEntrada.capturarNombre("Estado de nacimiento: "));
		System.out.println("\nCURP: "+MetodosPersona.primerDigito(p3)+MetodosPersona.segundoDigitoC(p3)+MetodosPersona.tercerDigito(p3)+MetodosPersona.cuartoDigito(p3)+MetodosPersona.fechaNacimiento(p3)+MetodosPersona.caracterG(p3)+MetodosPersona.definirEstadoP(p3)+MetodosPersona.definirEstadoS(p3)+MetodosPersona.catorceavoDigitoC(p3)+MetodosPersona.quinteavoDigitoC(p3)+MetodosPersona.dieciseisavoDigitoC(p3)+MetodosPersona.dosAleatorios());
		System.out.println("\nRFC: "+MetodosPersona.primerDigito(p3)+MetodosPersona.segundoDigitoR(p3)+MetodosPersona.tercerDigito(p3)+MetodosPersona.cuartoDigito(p3)+MetodosPersona.fechaNacimiento(p3)+MetodosPersona.tresAleatorios());
		

	}
}
