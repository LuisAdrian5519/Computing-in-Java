import java.util.Scanner;

class eje1104_K

{

    public static void main ( String args [] )
	{
    	Scanner Teclado = new Scanner(System.in);

        int longitud=10;
        int n�mero =0;
        int i=0;
        int L=0;

        int [] n�meros= new int [longitud];

        while (i<longitud)
        {
       		 System.out.print("Dame el n�mero " + (i+1) +": " );
       		 n�mero=Teclado.nextInt();				//n�meros [i] = Teclado.nextInt();

       		L= i;
			i++;

			int o=0;
      		while (L < 10)
      		 {
        //		if (n�meros [o]== n�mero)
        //		{
       		//		System.out.println("numero repetido " + n�mero +" en la posicion " + (L) );

        	//		System.out.print("Dame otro n�mero: " );
       		//		n�meros [i] = Teclado.nextInt();

			//	}
			//	n�meros [i] = n�mero;
			//	o++;
        	}
        }

		//IMPRIMIR
    	for (i=0;i<n�meros.length;i++)
   		{
    		System.out.println(n�meros[i]);
		}
    }
}