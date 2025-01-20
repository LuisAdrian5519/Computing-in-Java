import java.util.Scanner;

class Suma_de_matrices
{
	//1.Suma de Matrices (C = A + B). valor 40 puntos
	//a.Pedir las dimensiones de la matriz (ambas tienen que ser de las mismas dimensiones)
	//b.Pedir por renglon y columna cada uno de los valores de la matriz A y posteriormente los valores de la matriz B, indicando que renglon y columna, se esta registrando.
	//c.Calcular la suma de la matriz C, (A+B), de forma correcta
	//d.Imprimir los resultados de las matriz C, en forma de renglon, separando por un "tabulador" (\t) en el SOP, cada uno de los valores de la columna de matriz resultante.

	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);

	int c;
	int f;
	int i=0;
	int fl=0;
	int filas;
	int columnas;

	System.out.print("Dame el número de filas para ambas matrices (Un valor entre 3 y 5): ");
	filas = Teclado.nextInt();

	while(filas<3 || filas>5){
	System.out.println("");
	System.out.print("Número fuera de rango, dame otro número filas para ambas matrices: ");
	filas = Teclado.nextInt();
	}

	System.out.println("");
	System.out.print("Dame el número de columnas para ambas matrices (Un valor entre 3 y 5): ");
	columnas = Teclado.nextInt();

	while(columnas<3 || columnas>5){
	System.out.println("");
	System.out.print("Número fuera de rango, dame otro número columnas para ambas matrices: ");
	columnas = Teclado.nextInt();
	}

	float números [][]= new float [filas][columnas];
	float números2 [][]= new float [filas][columnas];

		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Matriz 1");
		System.out.println("");

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +"]" +" | Dame el número " +(i+1) +": ");
			números [f][c]=Teclado.nextFloat();
			i++;
			}
		}
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Matriz 2");
		System.out.println("");

		i=0;

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +"]" +" | Dame el número " +(i+1) +": ");
			números2 [f][c]=Teclado.nextFloat();
			i++;
			}
		}

		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");

		float Suma [][]= new float [filas][columnas];

		f=0;
		c=0;
		fl=0;

		System.out.print("Resultado: ");

		while(fl<filas){

			while(c<columnas){
			Suma[f][c]=números[f][c]+números2[f][c];
			System.out.print("\t");
			System.out.print("[" +(f+1) +"]" + "[" +(c+1) + "]: " +Suma[f][c]);
			c++;
			}
		c=0;
		fl++;
		f++;
		}
		System.out.print("\t");
	}
}