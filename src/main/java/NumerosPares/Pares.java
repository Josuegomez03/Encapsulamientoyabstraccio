
package NumerosPares;

public class Pares {

    public static void main(String[] args) {
        int numero = 2;
        System.out.println("Estos son los numeros pares que se encuentran entre el 2 y 100");
        for ( numero=2; numero <=100; numero++){
         if(numero%2==0) 
            {
            System.out.println(numero + " es par");
            }
        }
     
        
    }
}