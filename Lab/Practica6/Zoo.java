import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		String name=null;
		int i=0, opc=0, n=0;
		Veterinario vet=new Veterinario("Dr. Roberto Salinas", 5500);
		Animal animales[]=new Animal[6];
		
		//animales iniciales del zoo
		animales[0]=new Perro("Goofy", "Perro", "Pastor aleman", "carnivoro", 7, 30, false);
		animales[1]=new Gato("Pelusa", "Gato", "siames", "carnivoros", 10, 4, false);
		animales[2]=new Caballo("Spirit", "Caballo", "Araba", "herbivoro", 15, 500, false);
		animales[3]=new Elefante("Dumbo", "Elefante","Africano","herbivoro", 45, 5000, false);
		animales[4]=new Jirafa("Melvin", "Jirafa", "Jirafa de sudafrica", "hervivoro", 15, 800, false);
		animales[5]=new Tortuga("Franklin", "Tortuga", "Tortuga marina de orejas amarillas", "omnivoras", 25, 1, false);
		
		System.out.println("\n***********ZOOLOGICO DE CENTRAL PARK*********\n");
		
		do{
			System.out.println("\nIngrese una opcion \n");
			System.out.println("1) Capture los datos de un nuevo animal");
			System.out.println("2) Elimine los datos de un animal");
			System.out.println("3) Mostrar los datos de un animal");
			System.out.println("4) Mostrar los datos de todos los animales ");
			System.out.println("5) Llamar al veterinario");
			System.out.println("6) Salir");
			System.out.println("Opcion: ");
			opc=teclado.nextInt();		
			
			switch(opc) {
			case 1:
				//Convertir el arreglo en un ArrayList
		        ArrayList<Animal> lista= new ArrayList<Animal>(Arrays.asList(animales));
		        Animal a=new Animal(CapturaEntrada.capturarNombre("Nombre : "),CapturaEntrada.capturarNombre("Nombre de la Especie:"), CapturaEntrada.capturarNombre("Tipo/raza: "), CapturaEntrada.capturarNombre("Forma de Alimentarse: "), CapturaEntrada.capturarNum("Edad: "), CapturaEntrada.capturarNum("Peso en Kg: "), false);
		        lista.add(a);
		        //Convertir el arraylist a un arreglo
		        animales= new Animal[ lista.size() ];
		        lista.toArray(animales);
		        break;
			case 2:
				System.out.println("\n");
				System.out.print("Nombre del animal (no especie): ");
				teclado.nextLine();
				name=teclado.nextLine();
				n=OperacionesAnimales.buscarAnimal(animales, name);
		        ArrayList<Animal> lista1= new ArrayList<Animal>(Arrays.asList(animales));
		        lista1.remove(n);
		        animales= new Animal[ lista1.size() ];
		        lista1.toArray(animales);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("\n");
				System.out.print("Nombre del animal (no especie): ");
				teclado.nextLine();
				name=teclado.nextLine();
				n=OperacionesAnimales.buscarAnimal(animales, name);
				OperacionesAnimales.mostrarDatos(animales[n]);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("\n");
				for(int j=0; j<animales.length; j++) {
					System.out.println("\n Animal "+(j+1));
					OperacionesAnimales.mostrarDatos(animales[j]);
				}
				break;
			case 5:
				System.out.println("\n");
				for(int j=0; j<animales.length; j++) {
					System.out.println("\n Animal "+(j+1));
					vet.Vacunar(animales[j]);
					OperacionesAnimales.mostrarDatos(animales[j]);
					vet.examinarAnimales(animales[j]);
					vet.limpiarDientes(animales[j]);
				}
				break;
			}
			
		}while(opc!=5);
	}
}
