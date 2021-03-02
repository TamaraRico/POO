

public class Main {

	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Tamara Rico", "1270673", "POO", 85, "");
		Estudiante est2=new Estudiante("Mariano Perez", "1277958", "Electricidad", 100, "");
		Estudiante est3=new Estudiante("Danna Lugo", "1271236", "Mercadotecnia", 92, "");
		Estudiante est4=new Estudiante("Diego Rivera", "1278941", "Algebra", 56, "");
		Estudiante est5=new Estudiante("Paulina Fierro", "1271054", "Calculo Integral", 31, "");
		Estudiante est6=new Estudiante(CapturaEntrada.capturarNombre("Capture el nombre del alumno: "), CapturaEntrada.capturarId("Capture el numero de ID del alumno: "), CapturaEntrada.capturarMateri("Nombre de la materia: "), CapturaEntrada.capturarCalificaciones("Calificacion: "), "");
		Estudiante est7=new Estudiante(CapturaEntrada.capturarNombre("Capture el nombre del alumno: "), CapturaEntrada.capturarId("Capture el numero de ID del alumno: "), CapturaEntrada.capturarMateri("Nombre de la materia: "), CapturaEntrada.capturarCalificaciones("Calificacion: "), "");
		Estudiante est8=new Estudiante(CapturaEntrada.capturarNombre("Capture el nombre del alumno: "), CapturaEntrada.capturarId("Capture el numero de ID del alumno: "), CapturaEntrada.capturarMateri("Nombre de la materia: "), CapturaEntrada.capturarCalificaciones("Calificacion: "), "");
		Estudiante est9=new Estudiante(CapturaEntrada.capturarNombre("Capture el nombre del alumno: "), CapturaEntrada.capturarId("Capture el numero de ID del alumno: "), CapturaEntrada.capturarMateri("Nombre de la materia: "), CapturaEntrada.capturarCalificaciones("Calificacion: "), "");
		Estudiante est10=new Estudiante(CapturaEntrada.capturarNombre("Capture el nombre del alumno: "), CapturaEntrada.capturarId("Capture el numero de ID del alumno: "), CapturaEntrada.capturarMateri("Nombre de la materia: "), CapturaEntrada.capturarCalificaciones("Calificacion: "), "");

		est1.estadoEstudiante(est1.getCalificacion());
		est2.estadoEstudiante(est2.getCalificacion());
		est3.estadoEstudiante(est3.getCalificacion());
		est4.estadoEstudiante(est4.getCalificacion());
		est5.estadoEstudiante(est5.getCalificacion());
		est6.estadoEstudiante(est6.getCalificacion());
		est7.estadoEstudiante(est7.getCalificacion());
		est8.estadoEstudiante(est8.getCalificacion());
		est9.estadoEstudiante(est9.getCalificacion());
		est10.estadoEstudiante(est10.getCalificacion());
		
		est1.imprimirDatos();
		est2.imprimirDatos();
		est3.imprimirDatos();
		est4.imprimirDatos();
		est5.imprimirDatos();
		est6.imprimirDatos();
		est7.imprimirDatos();
		est8.imprimirDatos();
		est9.imprimirDatos();
		est10.imprimirDatos();
	} 	
}
