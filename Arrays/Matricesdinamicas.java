import java.util.Scanner;

class Matricesdinamicas
{
	public static void main (String args[])
	{

	int c;
	int filas=3;
	int columnas=3;
	int contador=0;
	int números [][]= new int [3][3];

	for(c=0; c<columnas; c++){

		for(int i=0; i<filas; i++){
			números [c][i]=contador;
			contador++;
			System.out.print("["+contador +"]");
		}

		System.out.println("");

		}
	}
}