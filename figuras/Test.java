package figuras;
/**
 * La clase Test es la clase principal que contiene el método main para probar la funcionalidad de la clase Circunferencia.
 */
public class Test {
    public static void main(String[] args)
{
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);
/**
 * Compara las circunferencias c2 y c3 sin considerar decimales y muestra un mensaje si son iguales.
 */
   if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");
/**
 * Compara las circunferencias c2 y c3 considerando decimales y muestra un mensaje si son iguales.
 */
   if (c2.esIgual(true, c3))
       System.out.println("c2 y c3: iguales considerando decimales");
}

}
