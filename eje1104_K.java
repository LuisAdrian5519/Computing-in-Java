import java.util.Scanner;

class eje1104_K

{

    public static void main ( String args [] )
	{
    	Scanner Teclado = new Scanner(System.in);

        int longitud=10;
        int número =0;
        int i=0;
        int L=0;

        int [] números= new int [longitud];

        while (i<longitud)
        {
       		 System.out.print("Dame el número " + (i+1) +": " );
       		 número=Teclado.nextInt();				//números [i] = Teclado.nextInt();

       		L= i;
			i++;

			int o=0;
      		while (L < 10)
      		 {
        //		if (números [o]== número)
        //		{
       		//		System.out.println("numero repetido " + número +" en la posicion " + (L) );

        	//		System.out.print("Dame otro número: " );
       		//		números [i] = Teclado.nextInt();

			//	}
			//	números [i] = número;
			//	o++;
        	}
        }

		//IMPRIMIR
    	for (i=0;i<números.length;i++)
   		{
    		System.out.println(números[i]);
		}
    }
}