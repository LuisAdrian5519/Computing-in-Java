import java.util.Scanner;

class eje1104a
{
	public static void main (String args[])
	{

	Scanner Teclado = new Scanner(System.in);

		int n�meros[]= new int[11];
		int i=1;

	   do {
	   System.out.print("Dame el n�mero " +i +": ");
	   n�meros[i] = Teclado.nextInt();
	   i++;
	   } while (i<n�meros.length);



		//IMPRIMIR
        for (i=1;i<n�meros.length;i++)
        {
	    System.out.println(n�meros[i]);

	    }
     }
}