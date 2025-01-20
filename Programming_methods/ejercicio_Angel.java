import java.util.Scanner;

class ejercicio_Angel
{
        public static Scanner Teclado = new Scanner(System.in);

        public static void SOPln (String cadena)
            {System.out.println (cadena);}

        public static void SOP (String cadena)
            {System.out.print (cadena);}
        public static void main ( String args [] )


    {

    float numero=1;
    float sumatoria=0;
    float promedio=0;
    float cantidad=0;

while (numero != 0)
{

        SOP("Escribe un numero ");
        numero=Teclado.nextFloat ();
        sumatoria += numero;
        cantidad ++;
        promedio = sumatoria/cantidad;
}



    SOPln("Sumatoria "+ sumatoria);
    SOPln("Promedio "+ promedio);
    }
}