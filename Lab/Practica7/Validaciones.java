
public class Validaciones {
	public static void validarRobot1(RobotChef n) {
		if((n.getControl())==1) {
			System.out.println("\nUltima actividad realizada: moverse");
		}
		else if((n.getControl())==2) {
			System.out.println("\nUltima actividad realizada: servir el platillo");
		}
		
		else if((n.getControl())==0) {
			System.out.println("\nUltima actividad realizada: no ha realizado ninguna actividad");
		}
	}

	public static void validarRobot2(RobotCortador n) {
		if((n.getControl())==1) {
			System.out.println("\nUltima actividad realizada: moverse");
		}
		else if((n.getControl())==2) {
			System.out.println("\nUltima actividad realizada: cortar verduras");
		}
		
		else if((n.getControl())==3) {
			System.out.println("\nUltima actividad realizada: cortar carne");
		}
		
		else if((n.getControl())==0) {
			System.out.println("\nUltima actividad realizada: no ha realizado ninguna actividad");
		}
	}
	
	public static void validarRobot3(RobotCocinero n) {
		if((n.getControl())==1) {
			System.out.println("\nUltima actividad realizada: moverse");
		}
		else if((n.getControl())==2) {
			System.out.println("\nUltima actividad realizada: cocinar verduras");
		}
		
		else if((n.getControl())==3) {
			System.out.println("\nUltima actividad realizada: cocinar carne");
		}
		
		else if((n.getControl())==0) {
			System.out.println("\nUltima actividad realizada: no ha realizado ninguna actividad");
		}
	}
	
	public static void validarOrden(int n1, int n2, int n3) {
		if(n1==2 && n2<3 && n3<3) {
			System.out.println("No se puede servir el platillo si todavia no se parten las verduras y la carne, y estos mismo se cocen");
		}
		else if(n1<2 && n2==2 && n3==3) {
			System.out.println("No se puede cocer la carne si no se ha cortado y preparado");
		}
		else if(n1<2 && n2==1 && n3>1) {
			System.out.println("No se pueden cocer las verduras ni la carne si no se han cortado primero");
		}
		else if(n1==2 && n2<=3 && n3<3) {
			System.out.println("No se puede servir el platillo si todavia no se parten las verduras y la carne, y estos mismo se cocen");
		}
		else if(n1==2 && n2<3 && n3<=3) {
			System.out.println("No se puede servir el platillo si todavia no se parten las verduras y la carne, y estos mismo se cocen");
		}
	}

}
