import java.util.Scanner;

public class CapturaEntrada {
	public static String capturarNombre(String msg){
		Scanner sc = new Scanner(System.in);
	    System.out.print("\n\n"+msg+" : ");
	    return (sc.nextLine());
	}
	
	public static String capturarId(String msg){
		Scanner sc = new Scanner(System.in);
	    System.out.print(""+msg+" : ");
	    return (sc.nextLine());
	}
	
	public static String capturarMateri(String msg){
		Scanner sc = new Scanner(System.in);
	    System.out.print(""+msg+" : ");
	    return (sc.nextLine());
	}
	
	public static int capturarCalificaciones(String msg){
		Scanner sc = new Scanner(System.in);
	    System.out.print(""+msg+" : ");
	    return (sc.nextInt());
	}
}
