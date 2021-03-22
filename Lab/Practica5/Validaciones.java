
public class Validaciones {
	public static boolean validarSaldo(Cuenta c1, int num){
        if((c1.getSaldo())>num)
            return true;
            else return false;
    }
	
	public static boolean validarPin(Cuenta c1, int p1) {
		if((c1.getPin())==p1)
			return true;
			else return false;
	}
}

