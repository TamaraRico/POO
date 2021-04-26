
import java.util.Scanner;

public class MagnumOpus {
	public static void main(String[] args) {
		RobotChef rchef=new RobotChef("manos humanas", "Colette", 1270673, 100, 0, "");
		RobotCortador rcortador=new RobotCortador("manos con cuchillos", "Remi", 1278956, 100, 0, null, false);
		RobotCocinero rcocinero=new RobotCocinero("manos calientes", "Emil", 1298653, 100, 0, 85);
		Scanner teclado = new Scanner(System.in);
		int i=0, opc=0, opc2=0, opc3=0, n1=0, n2=0, n3=0;
		
		System.out.println("\n***********PRESENTACION DE ROBOTS COCINEROS*********\n");
		
		do{
			System.out.println("\nIngrese una opcion \n");
			System.out.println("1) Seleccione un robot");
			System.out.println("2) Mostrar los datos de todos los robots");
			System.out.println("3) Salir");
			System.out.println("Opcion: ");
			opc=teclado.nextInt();	
			switch(opc) {
			case 1:
				do {
				System.out.println("\nSeleccione un robot \n");
				System.out.println("1) Robot chef");
				System.out.println("2) Robot cortador");
				System.out.println("3) Robot cocinero");
				System.out.println("4) Salir");
				System.out.println("Opcion: ");
				opc2=teclado.nextInt();	
				if(opc2!=1 && opc2!=2 && opc2!=3 && opc2!=4)
					System.out.println("Esta opcion no es valida");
				switch(opc2) {
				case 1:
					System.out.println("\nHa seleccionado al robot chef");
					do {
						System.out.println("\nSeleccione una accion\n");
						System.out.println("1) Moverse");
						System.out.println("2) Servir el platillo");
						System.out.println("3) Salir");
						System.out.println("Opcion: ");
						opc3=teclado.nextInt();	
						switch(opc3) {
						case 1:
							rchef.moverse();
							n1=1;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 2:
							rchef.setMainIngrdiente(CapturaEntrada.capturarString("Escriba el ingrediente principal de su platillo: "));
							rchef.servirPlatillo(rchef.getMainIngrediente());
							n1=2;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 3:
							break;
						}
					}while(opc3!=3);
					break;
				case 2:
					System.out.println("Ha seleccionado al robot cortador");
					do {
						System.out.println("\nSeleccione una accion\n");
						System.out.println("1) Moverse");
						System.out.println("2) Cortar verduras");
						System.out.println("3) Cortar carne");
						System.out.println("4) Salir");
						System.out.println("Opcion: ");
						opc3=teclado.nextInt();	
						switch(opc3) {
						case 1:
							rcortador.moverse();
							n2=1;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 2:
							rcortador.setVerduras(CapturaEntrada.capturarString("Escriba una verdura para su platillo: "));
							rcortador.cortarVerdurasEspecificas(rcortador.getVerduras());
							n2=2;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 3:
							System.out.println("\nTu platillo tiene carne (true or false)?");
							boolean c=teclado.nextBoolean();
							rcortador.setCarne(c);
							if(rcortador.getCarne())
								rcortador.cortarCarne();
							n2=3;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 4:
							break;
						}
					}while(opc3!=3);
					break;
				case 3:
					System.out.println("Ha seleccionado al robot cocinero");
					do {
						System.out.println("\nSeleccione una accion\n");
						System.out.println("1) Moverse");
						System.out.println("2) Cocinar verduras");
						System.out.println("3) Cocinar carne");
						System.out.println("4) Salir");
						System.out.println("Opcion: ");
						opc3=teclado.nextInt();	
						switch(opc3) {
						case 1:
							rcocinero.moverse();
							 n3=1;
							 Validaciones.validarOrden(n1, n2, n3);
							break;
						case 2:
							rcocinero.cocinarVegetales();
							n3=2;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 3:
							if(rcortador.getCarne())
								rcocinero.cocinarCarne();
							else
								System.out.println("Su platillo no tiene carne");
							n3=3;
							Validaciones.validarOrden(n1, n2, n3);
							break;
						case 4:
							break;
						}
					}while(opc3!=3);
					break;
				}
				}while(opc2!=4);
		       break;
			case 2:
				System.out.println("\nRobot Chef");
				rchef.imprimirDatos();
				Validaciones.validarRobot1(rchef);
				System.out.println("\nRobot Cortador");
				rcortador.imprimirDatos();
				Validaciones.validarRobot2(rcortador);
				System.out.println("\nRobot Cocinero");
				rcocinero.imprimirDatos();
				Validaciones.validarRobot3(rcocinero);
				System.out.println("\n");
				break;
			case 3:
				break;
			}
			
		}while(opc!=3);
	}
}
