import java.util.Scanner;

public class CapturaEntrada {
	public static String capturarNombre(String msg){
		Scanner sc = new Scanner(System.in);
	    System.out.print("\n"+msg+": ");
	    return (sc.nextLine());
	}
	
}