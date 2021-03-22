
import java.util.Scanner;

public class Banco {//intentar llenar el arreglo de cuantas vacias a ver si quiere buscar, sino preguntar
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		String name=null;
		int i=0, opc=0, opc2=0, constante=0, num=0, pin=0;
		Cuenta cuentas[]=new Cuenta[100];
		
		do{
			System.out.println("\nIngrese una opcion \n");
			System.out.println("1) Capture los datos de una nueva cuenta");
			System.out.println("2) Imprimir los datos una cuenta");
			System.out.println("3) Realizar una operacion bancaria");
			System.out.println("4) Salir");
			System.out.println("Opcion: ");
			opc=teclado.nextInt();		
			
			switch(opc){
			case 1:
				if(i<100) {
					System.out.println("\n");
					cuentas[i] = new Cuenta(CapturaEntrada.capturarNombre("Nombre del titular:"), CapturaEntrada.capturarNum("Saldo:"), CapturaEntrada.capturarNum("PIN:"));
					i++;
					constante=1;
				}
				else {
					System.out.println("\nHa sobrepasado la capacidad del banco, hasta ahora, sólo podemos aceptar 100 cuentas");
					System.out.println("Estamos mejorando el servicio, espere a la proxima actualizacion");
				}
				break;				
			case 2:
				if(constante!=1) {
					System.out.println("Ingrese primero las cuentas");
				}
				else {
					System.out.println("\n");
					System.out.print("Nombre del titular: ");
					teclado.nextLine();
					name=teclado.nextLine();
					Cuenta n=new Cuenta("", 0, 0);
					n=OperacionesBanco.buscarCuenta(cuentas, name);
					System.out.println("\n");
					System.out.println("Nombre del titular: "+n.getNombre());
					System.out.println("Saldo de la cuenta: "+n.getSaldo());
					System.out.println("No es posible imprimir el pin de la cuenta");
				}
				break;
			case 3:
				if(constante==1) {
					System.out.println("\n");
					System.out.print("Nombre del titular: ");
					teclado.nextLine();
					name=teclado.nextLine();
					Cuenta n=new Cuenta("", 0, 0);
					n=OperacionesBanco.buscarCuenta(cuentas, name);
					System.out.println("Saldo de la cuenta: "+n.getSaldo());
					System.out.println("\nQue operacion desea realizar:");
					System.out.println("1)Depositar dinero");
					System.out.println("2)Retirar efectivo");
					System.out.println("Opcion: ");
					opc2=teclado.nextInt();
					switch(opc2) {
					case 1:
						System.out.println("\nIngrese su PIN:");
						teclado.nextLine();
						pin=teclado.nextInt();
						if(Validaciones.validarPin(n, pin)) {
							System.out.println("\nCuanto dinero va depositar:");
							teclado.nextLine();
							num=teclado.nextInt();
							System.out.println("\nEl saldo ahora es de :"+OperacionesBanco.Deposito(n,num)+" pesos");
							System.out.println("Saldo: "+n.getSaldo());
						}
						else
							System.out.println("\nEl PIN de la cuenta es incorrecto, verifica tu PIN e intentalo de nuevo");
						break;
					case 2:
						System.out.println("\nIngrese su PIN:");
						teclado.nextLine();
						pin=teclado.nextInt();
						if(Validaciones.validarPin(n, pin)) {
							System.out.println("\nCuanto dinero va retirar:");
							teclado.nextLine();
							num=teclado.nextInt();
							if(Validaciones.validarSaldo(n, num)) {
								System.out.println("\nEl saldo ahora es de :"+OperacionesBanco.Retiro(n,num)+" pesos");
								System.out.println("Saldo: "+n.getSaldo());//hacer q no imprima el saldo vacio si la cantidad se excede del limite con un if
							}
							else 
								System.out.println("La cantidad a retirar no es valida, intentelo de nuevo");
						}
						else
							System.out.println("\nEl PIN de la cuenta es incorrecto, verifica tu PIN e intentalo de nuevo");
						break;
					}
				}		
				else {
					System.out.println("Ingrese primero las cuentas");
				}
				break;
			case 4:
				break;
			}
		}while(opc!=4);
	}
}
