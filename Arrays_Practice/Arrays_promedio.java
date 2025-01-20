import java.util.Scanner;

class Arrays_promedio
{
	public static void main (String args[])
	{

	int [] números = {5,7,9,4,8,6,5,1,2,3};
	int resultado=0;
	int i;

	for (i=0;i<números.length;++i)
	{
		System.out.print(i +": ");
		System.out.println(números[i]);
		resultado += números[i];
	}

	System.out.println("La media es: "+resultado/10);

	}
}