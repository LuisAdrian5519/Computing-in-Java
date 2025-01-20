import java.util.Scanner;

class eje1104a
{
	public static void main (String args[])
	{

	Scanner Teclado = new Scanner(System.in);

		int números[]= new int[11];
		int i=1;

	   do {
	   System.out.print("Dame el número " +i +": ");
	   números[i] = Teclado.nextInt();
	   i++;
	   } while (i<números.length);



		//IMPRIMIR
        for (i=1;i<números.length;i++)
        {
	    System.out.println(números[i]);

	    }
     }
}