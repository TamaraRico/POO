
import java.util.Scanner;

public class CapturaEntrada {
    public static int capturarNum(String msg){
        Scanner sc =  new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextInt();
    }
    
    public static float capturarNum2(String msg){
        Scanner sc =  new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextFloat();
    }
    
    public static String capturarNombre(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return sc.nextLine();
    }  
    
}

