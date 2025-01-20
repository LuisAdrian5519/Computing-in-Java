
import java.util.Scanner;

class Edad
{
	public static void main ( String args [] )
	{
		Scanner Teclado = new Scanner(System.in); //Declaro el buffer del teclado

		int edad;

		System.out.print("Dame tu edad :"); //Para que se pueda escribir
		edad = Teclado.nextInt();

        if (edad >= 18 & edad <= 60)
            System.out.println("Dame el numero de tu INE ");

        else if (edad < 18)
            System.out.println(" Eres menor de edad ");
		else
		    System.out.println(" Eres mayor de 60 años ");

    }
}