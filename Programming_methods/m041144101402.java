import java.util.Scanner;

class m041144101402
{

//Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por su antig�edad o bien por el monto de su sueldo (el que sea mayor), de la siguiente forma:

//Cuando la antig�edad es mayor a 2 a�os pero menor a 5, se otorga 20 % de su sueldo; cuando es de 5 a�os o m�s, 30 %.

//Ahora bien, el bono por concepto de sueldo, si �ste es menor a $1000, se da 25 % de �ste, cuando �ste es mayor a $1000, pero menor o igual a $3500, se otorga 15% de su sueldo, para m�s de $3500. 10%. Realice el algoritmo correspondiente para calcular los dos tipos de bono, asignando el mayor, y repres�ntelo con un diagrama de flujo y pseudoc�digo.

    public static void main ( String args [] )
    {

    Scanner Teclado = new Scanner(System.in);

    int Antiguedad;

    System.out.print("�Cu�ntos a�os llevas trabajando aqu�? ");
    Antiguedad = Teclado.nextInt();

    int Sueldo;

    System.out.print("�De Cu�nto es tu sueldo mensual? ");
    Sueldo = Teclado.nextInt();

	if (Antiguedad >= 2 & Antiguedad <= 5 & Sueldo < 1000)
    	{
    	System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.20 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.25 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.20 + Sueldo*0.25) + " pesos");
		}

	else if (Antiguedad < 2 & Sueldo < 1000)
		{
		System.out.println("Tu bono por antiguedad es de: " + 0 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.25 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.25) + " pesos");
		}

	else if (Antiguedad > 5 & Sueldo < 1000)
		{
		System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.30 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.25 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.30 + Sueldo*0.25) + " pesos");
		}

	if (Antiguedad >= 2 & Antiguedad <= 5 & Sueldo >= 1000 & Sueldo <= 3500 )
	    {
	    System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.20 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.15 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.20 + Sueldo*0.15) + " pesos");
		}

	else if (Antiguedad < 2 & Sueldo >= 1000 & Sueldo <= 3500 )
    	{
		System.out.println("Tu bono por antiguedad es de: " + 0 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.15 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.15) + " pesos");
		}

    else if (Antiguedad > 5 & Sueldo >= 1000 & Sueldo <= 3500 )
    	{
    	System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.30 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.15 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.30 + Sueldo*0.15) + " pesos");
		}

    if (Antiguedad >= 2 & Antiguedad <= 5 & Sueldo > 3500)
    	{
    	System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.20 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.10 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.20 + Sueldo*0.10) + " pesos");
		}

    else if (Antiguedad < 2 & Sueldo > 3500 )
    	{
    	System.out.println("Tu bono por antiguedad es de: " + 0 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.10 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.10) + " pesos");
		}

	else if (Antiguedad > 5 & Sueldo > 1000 & Sueldo > 3500 )
    	{
    	System.out.println("Tu bono por antiguedad es de: " + Sueldo*0.30 + " pesos");
        System.out.println("Tu bono por sueldo es de: " + Sueldo*0.15 + " pesos");
        System.out.println("Tu salario final es: " + (Sueldo + Sueldo*0.30 + Sueldo*0.15) + " pesos");
		}
     }
}