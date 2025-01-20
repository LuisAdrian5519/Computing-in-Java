import java.util.Scanner;

class Multiplicacion_de_matrices
{
	//2.Multiplicacion de Matrices (C = A * B), valor 60 puntos
	//a.Pedir las dimensiones de la matriz A y pedir las dimensiones de la matriz B. Validar que las columnas de la matriz A sea exactamente igual que los renglones de la matriz B.
	//b.Pedir por renglon y columna cada uno de los valores de la matriz A y posteriormente los valores de la matriz B, indicando que renglon y columna, se esta registrando.
	//c.Calcular la multiplicacion de la matriz C: (A*B), de forma correcta
	//d.Imprimir los resultados de las matriz C, en forma de renglon, separando por dos espacios, cada uno de los valores de la columna de matriz resultante.


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
	float números2 [][]= new float [columnas][filas];

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
			System.out.print("[fila: " +(c+1) +" | ");
			System.out.print("Columna: " +(f+1) +"]" +" | Dame el número " +(i+1) +": ");
			números2 [c][f]=Teclado.nextFloat();
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
			Suma[f][c]=números[f][c]*números2[c][f];
			System.out.print("  ");
			System.out.print("[" +(f+1) +"]" + "[" +(c+1) + "]: " +Suma[f][c]);
			c++;
			}
		c=0;
		fl++;
		f++;
		}
		System.out.print("  ");
	}
}