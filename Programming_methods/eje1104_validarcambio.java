import java.util.Scanner;

import java.util.Scanner;

class eje1104_validarcambio

    {
    public static void main ( String args [] )
    {
    Scanner Teclado = new Scanner(System.in);

    int longitud=10;
    int numero =0;
    int i=0;
    int L=0;

    int [] n�meros= new int [longitud];

    do
    {
    System.out.print("Dame el numero " + (i+1) +": " );
    n�meros [i] = Teclado.nextInt();
    L= i-1;

    while (L > 0)
    {
    if (n�meros [i]== n�meros [L])
    System.out.println("numero repetido: " + n�meros [i] +" En posicion: " + (L+1) );
    L--;
    do {
	System.out.print("Dame otro numero " + ": " );
	n�meros [i] = Teclado.nextInt();
	}while (n�meros [i]==n�meros[L]);
}
    i++;
    }while ( i < longitud);

    //IMPRIMIR
    for (i=0;i<n�meros.length;i++)
    {
    System.out.println(n�meros[i]);

		}
	}
}