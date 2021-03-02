import java.util.UUID;

public class MetodosPersona {
	public static char primerDigito(Persona p1) {
		char a=p1.apaterno.toUpperCase().charAt(0);
		/*p1.nombre.toUpperCase();
		p1.apaterno.toUpperCase();
		p1.amaterno.toUpperCase();
		a=p1.apaterno.charAt(0);
		for(int i=1; i<p1.apaterno.length(); i++) {
			char vocal=p1.apaterno.charAt(i);
			if(vocal=='A'|| vocal=='E' || vocal=='I' || vocal=='O'||vocal=='U') {
				b=vocal;
			}
		}
		c=p1.amaterno.charAt(0);
		d=p1.nombre.charAt(0);*/
		//System.out.println(a);
		return a;
	}
	
	public static char segundoDigitoC(Persona p1) {
		String apellido=p1.apaterno.toUpperCase();
		char b='n';
		for(int i=1; i<p1.apaterno.toUpperCase().length(); i++) {
			char vocal=apellido.charAt(i);
			if(vocal=='A'|| vocal=='E' || vocal=='I' || vocal=='O'||vocal=='U') {
				b=vocal;
				break;
			}
		}
		return b;
	}

	public static char tercerDigito(Persona p1) {
		char c=p1.amaterno.toUpperCase().charAt(0);
		return c;
	}
	
	public static char cuartoDigito(Persona p1) {
		char d=p1.nombre.toUpperCase().charAt(0);
		return d;
	}
	
	public static char caracterG(Persona p1) {
		char g=p1.genero.toUpperCase().charAt(0);
		return g;
	}

	public static String fechaNacimiento(Persona p1) {
		String o=p1.fnacimiento;
		return o;
	}
	
	public static char segundoDigitoR(Persona p1) {
			char b=p1.apaterno.toUpperCase().charAt(1);
			return b;
		}
	
	public static char catorceavoDigitoC(Persona p1) {
		String apellido=p1.apaterno.toUpperCase();
		char a='n';
		for(int i=1; i<p1.apaterno.toUpperCase().length(); i++) {
			char con1=apellido.charAt(i);
			if(con1!='A'&& con1!='E'&&con1!='I'&&con1!='O'&&con1!='U') {
				a=con1;
				break;
			}
		}
		return a;
	}
	
	public static char quinteavoDigitoC(Persona p1) {
		String apellido=p1.amaterno.toUpperCase();
		char b='n';
		for(int j=1; j<p1.amaterno.toUpperCase().length(); j++) {
			char con2=apellido.charAt(j);
			if(con2!='A'&& con2!='E'&&con2!='I'&&con2!='O'&&con2!='U') {
				b=con2;
				break;
			}
		}
		return b;
	}
	
	public static char dieciseisavoDigitoC(Persona p1) {
		String name=p1.nombre.toUpperCase();
		char c='n';
		p1.nombre.toUpperCase();
		for(int k=1; k<p1.nombre.toUpperCase().length(); k++) {
			char con3=name.charAt(k);
			//System.out.println(con3);
			if(con3!='A'&& con3!='E'&&con3!='I'&&con3!='O'&&con3!='U') {
				c=con3;
				//System.out.println(c);
				break;
			}
		}
		return c;
	}
	
	public static char definirEstadoP(Persona p1) {
		String estado=p1.getEstado().toLowerCase();
		char a='N',b='E';
		switch(estado) {
			case "aguascalientes":
				a='A';
				b='S';
				break;
			case "baja california":
				a='B';
				b='C';
				break;
			case "baja california sur":
				a='B';
				b='S';
				break;
			case "campeche":
				a='C';
				b='C';
				break;
			case "coahuila":
				a='C';
				b='L';
				break;
			case "colima":
				a='C';
				b='M';
				break;
			case "chiapas":
				a='C';
				b='S';
				break;
			case "chihuahua":
				a='c';
				b='H';
				break;
			case "distrito federal":
				a='D';
				b='F';
				break;
			case "durango":
				a='D';
				b='G';
				break;
			case "guanajuato":
				a='G';
				b='T';
				break;
			case "guerrero":
				a='G';
				b='R';
				break;
			case "hidalgo":
				a='H';
				b='G';
				break;
			case "jalisco":
				a='J';
				b='C';
				break;
			case "mexico":
				a='M';
				b='C';
				break;
			case "michoacan":
				a='M';
				b='N';
				break;
			case "morelos":
				a='M';
				b='S';
				break;
			case "nayarit":
				a='N';
				b='T';
				break;
			case "nuevo leon":
				a='N';
				b='L';
				break;
			case "oaxaca":
				a='O';
				b='C';
				break;
			case "puebla":
				a='P';
				b='L';
				break;
			case "queretato":
				a='Q';
				b='T';
				break;
			case "quintana roo":
				a='Q';
				b='R';
				break;
			case "san luis potosi":
				a='S';
				b='P';
				break;
			case "sinaloa":
				a='S';
				b='L';
				break;
			case "sonora":
				a='S';
				b='R';
				break;
			case "tabasco":
				a='T';
				b='C';
				break;
			case "tamaulipas":
				a='T';
				b='S';
				break;
			case "tlaxcala":
				a='T';
				b='L';
				break;
			case "veracruz":
				a='V';
				b='Z';
				break;
			case "yucatan":
				a='Y';
				b='N';
				break;
			case "zacatecas":
				a='Z';
				b='S';
				break;
			case "nacido en el extranjero":
				a='N';
				b='E';
				break;
		}
		return a;
	}
	
	public static char definirEstadoS(Persona p1) {
		String estado=p1.getEstado().toLowerCase();
		char a='N',b='E';
		switch(estado) {
			case "aguascalientes":
				a='A';
				b='S';
				break;
			case "baja california":
				a='B';
				b='C';
				break;
			case "baja california sur":
				a='B';
				b='S';
				break;
			case "campeche":
				a='C';
				b='C';
				break;
			case "coahuila":
				a='C';
				b='L';
				break;
			case "colima":
				a='C';
				b='M';
				break;
			case "chiapas":
				a='C';
				b='S';
				break;
			case "chihuahua":
				a='c';
				b='H';
				break;
			case "distrito federal":
				a='D';
				b='F';
				break;
			case "durango":
				a='D';
				b='G';
				break;
			case "guanajuato":
				a='G';
				b='T';
				break;
			case "guerrero":
				a='G';
				b='R';
				break;
			case "hidalgo":
				a='H';
				b='G';
				break;
			case "jalisco":
				a='J';
				b='C';
				break;
			case "mexico":
				a='M';
				b='C';
				break;
			case "michoacan":
				a='M';
				b='N';
				break;
			case "morelos":
				a='M';
				b='S';
				break;
			case "nayarit":
				a='N';
				b='T';
				break;
			case "nuevo leon":
				a='N';
				b='L';
				break;
			case "oaxaca":
				a='O';
				b='C';
				break;
			case "puebla":
				a='P';
				b='L';
				break;
			case "queretato":
				a='Q';
				b='T';
				break;
			case "quintana roo":
				a='Q';
				b='R';
				break;
			case "san luis potosi":
				a='S';
				b='P';
				break;
			case "sinaloa":
				a='S';
				b='L';
				break;
			case "sonora":
				a='S';
				b='R';
				break;
			case "tabasco":
				a='T';
				b='C';
				break;
			case "tamaulipas":
				a='T';
				b='S';
				break;
			case "tlaxcala":
				a='T';
				b='L';
				break;
			case "veracruz":
				a='V';
				b='Z';
				break;
			case "yucatan":
				a='Y';
				b='N';
				break;
			case "zacatecas":
				a='Z';
				b='S';
				break;
			case "nacido en el extranjero":
				a='N';
				b='E';
				break;
		}
		return b;
	}
	
	public static String dosAleatorios() {
		String j=UUID.randomUUID().toString().toUpperCase().substring(0, 2);
		return j;
	}
		
	public static String tresAleatorios() {
		String k=UUID.randomUUID().toString().toUpperCase().substring(0, 3);
		return k;
	}

}
