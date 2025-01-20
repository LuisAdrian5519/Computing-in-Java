import java.util.Scanner;

class Suma_de_matrices2
{
	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);
		//1.Suma de Matrices (C = A + B). valor 40 puntos
		//a.Pedir las dimensiones de la matriz (ambas tienen que ser de las mismas dimensiones)
		//b.Pedir por renglon y columna cada uno de los valores de la matriz A y posteriormente los valores de la matriz B, indicando que renglon y columna, se esta registrando.
		//c.Calcular la suma de la matriz C, (A+B), de forma correcta
		//d.Imprimir los resultados de las matriz C, en forma de renglon, separando por un "tabulador" (\t) en el SOP, cada uno de los valores de la columna de matriz resultante.

	int c;
	int f;
	int i=0;
	int o=0;
	int ft=0;
	int filas;
	int columnas;
	int contador=0;

	System.out.print("Dame el número de filas: ");
	filas = Teclado.nextInt();
	System.out.print("Dame el número de columnas: ");
	columnas = Teclado.nextInt();

	int números [][]= new int [filas][columnas];
	int números2 [][]= new int [filas][columnas];

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[ fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +" ]" +" | Dame el número " +(i+1) +": ");
			números [f][c]=Teclado.nextInt();
			i++;
			}
		}
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");

		System.out.print("Dame el número de filas para la segunda matriz: ");
		filas = Teclado.nextInt();
		System.out.print("Dame el número de columnas para la segunda matriz: ");
		columnas = Teclado.nextInt();
		i=0;

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[ fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +" ]" +" | Dame el número " +(i+1) +": ");
			números2 [f][c]=Teclado.nextInt();
			i++;
			}
		}

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[ fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +" ]" +" | Dame el número " +(i+1) +": ");
			números [f][c]=Teclado.nextInt();
			i++;
			}
		}
	}
}