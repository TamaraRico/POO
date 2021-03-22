
public class OperacionesBanco {
	public static Cuenta buscarCuenta(Cuenta cuentas[], String name){
		 Cuenta c1=new Cuenta("", 0, 0);
		 for(int i=0; i<cuentas.length; i++) {
			 //System.out.println("a= "+cuentas[i].getNombre());
				if(name.equals(cuentas[i].getNombre())) {
					c1=cuentas[i];
					//return a1;
					break;
				}
				/*else {
					System.out.println("\nEl alumno "+name+" no fue encontrado en el grupo");
				}*/
			}
		 	return c1;
		 }
	
	public static int Deposito(Cuenta c, int num) {
		int nuevoSaldo=0;
		int saldoActual=c.getSaldo();
		nuevoSaldo=saldoActual+num;
		c.setSaldo(nuevoSaldo);
		return nuevoSaldo;
	}
	
	public static int Retiro(Cuenta c, int num) {
		int nuevoSaldo=0;
		int saldoActual=c.getSaldo();
		nuevoSaldo=saldoActual-num;
		c.setSaldo(nuevoSaldo);
		return nuevoSaldo;
	}
}
