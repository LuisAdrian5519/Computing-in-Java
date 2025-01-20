
import java.util.Scanner;

class SWITCH
{
	public static void main ( String args [] )
	{
		Scanner Teclado = new Scanner(System.in);

		System.out.print ("Dame un número entre el 0 y el 9:");
		int numero;

		numero = Teclado.nextInt();

		switch (numero)
		{
			case 0: //Esto funciona como una función Or
			case 1:
			{
				System.out.println ("Tecleaste CERO o UNO");
				break;
			}
			case 2:
			{
				System.out.println ("Tecleaste DOS");
				break;
			}
			case 3:
			{
				System.out.println ("Tecleaste TRES");
				break;
			}
			case 4:
			{
				System.out.println ("Tecleaste CUATRO");
				break;
			}
			case 5:
			{
				System.out.println ("Tecleaste CINCO");
				break;
			}
			case 6:
			{
				System.out.println ("Tecleaste SEIS");
				break;
			}
			case 7:
			{
				System.out.println ("Tecleaste SIETE");
				break;
			}
			case 8:
			{
				System.out.println ("Tecleaste OCHO");
				break;
			}
			case 9:
			{
				System.out.println ("Tecleaste NUEVE");
				break;
			}
			default:
			{
				System.out.println ("Tecleaste algo diferente de 1 a 9");
			}
			}
		}
	}