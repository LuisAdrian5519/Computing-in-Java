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

    int [] números= new int [longitud];

    do
    {
    System.out.print("Dame el numero " + (i+1) +": " );
    números [i] = Teclado.nextInt();
    L= i-1;

    while (L > 0)
    {
    if (números [i]== números [L])
    System.out.println("numero repetido: " + números [i] +" En posicion: " + (L+1) );
    L--;
    do {
	System.out.print("Dame otro numero " + ": " );
	números [i] = Teclado.nextInt();
	}while (números [i]==números[L]);
}
    i++;
    }while ( i < longitud);

    //IMPRIMIR
    for (i=0;i<números.length;i++)
    {
    System.out.println(números[i]);

		}
	}
}