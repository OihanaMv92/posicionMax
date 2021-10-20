package es.Studium.PosicionMax;

import java.util.Scanner;

public class PosicionMax
{

	public static void main(String[] args)
	{
		//Creamos una constante de tipo entero llamada TAM
		final int TAM = 10;
		
		//Creamos la tabla de tipo entero y valor 10 llamada tabla
		int[] tabla = new int[TAM]; 
		
		//Declaramos la variable para el número mayor insertado
		int max; 

		//Utilizamos la herramienta para el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Para rellenar la tabla
		for (int i = 0; i < TAM; i++) 
		{ 
			//Solicitamos los valores para la tabla al usuario 
			System.out.println("Escriba el valor para la tabla en la posición " + i); 
			
			//Leemos los datos y los almacenamos en memoria
			tabla[i] = teclado.nextInt();
		} 
		//Iniciamos la variable maximo con el valor inicial de la tabla
		max = tabla[0]; 
		
		//Para tratar los elementos de la tabla: caso de dato mayor
		for (int i = 0; i < TAM; i++)
		{
			//Localizamos el valor máximo insertado
			if(tabla[i] > max) 
			{ 
				max = tabla[i];
			}
		} 
		//Para hacerlo más atractivo a la vista
		System.out.println("------------------------------------");
		
		//Mostramos por pantalla el valor mayor ingresado
		System.out.println("El número mayor de los insertados es: " + max);
		
		//Para hacerlo más atractivo a la vista estos println:
		System.out.println("==========================================");
		
		System.out.println("Este número se ha insertado en la/as posición/es: ");
		
		//Para mostrar los datos por pantalla: el lugar donde se encuentra el dato mayor 
		for (int i = 0; i < TAM; i++) 
		{
			
			//Para localizar los lugares donde se ha insertado el mayor número
			if(tabla[i] == max) 
			{ 
				//Mostramos el lugar/lugares donde está/están el/los dato/s mayor/es
				System.out.println(i); 
			}
		} 
		//Cerramos el teclado
		teclado.close();
	}

	}


