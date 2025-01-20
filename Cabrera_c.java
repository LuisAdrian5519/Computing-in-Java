import java.util.Scanner;

class Cabrera_c
{
	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);
	{
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

		for(f=0; f<filas; f++){

			for(c=0; c<columnas; c++){
			System.out.print("[ fila: " +(f+1) +" | ");
			System.out.print("Columna: " +(c+1) +" ]" +" | Dame el número " +(i+1) +": ");
			números [f][c]=Teclado.nextInt();
			i++;
		}
		}
		System.out.println("-------------------------------------");

		int suma[]= new int[(filas*columnas)];
		int sumatotal=0;

		for (f=0;f<filas;f++){
			System.out.println ("La suma en la fila "+ (f+1) +" es:");

			for (c=0;c<columnas;c++){
			suma[o]=números[f][c];
			System.out.print (suma[o] +"  ");
			ft+=suma[o];
			sumatotal+=suma[o];
			}
			System.out.println("= " +ft);
			ft=0;
			}

		System.out.println("-------------------------------------");

		for (c=0;c<columnas;c++){
			System.out.println ("La suma en la columna "+ (c+1) +" es:");

			for (f=0;f<filas;f++){
			suma[o]=números[f][c];
			System.out.print (suma[o] +"  ");
			ft+=suma[o];
			sumatotal+=suma[o];
			}
			System.out.println("= " +ft);
			ft=0;
			}

		System.out.print("------------------------------------> 	");

		System.out.print("La suma total es: " +sumatotal +"		");
	}
}
}
