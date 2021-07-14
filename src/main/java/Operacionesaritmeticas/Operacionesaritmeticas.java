
package Operacionesaritmeticas;

public class Operacionesaritmeticas {

    public static void main(String[] args) {
      double numero1 = 30,numero2 =25, numero3 =15, numero4 =12;
         double suma, resta, multiplicacion = 0;
         double division = 0; 
    
         suma = numero1 + numero2 + numero3 + numero4;
         resta = numero1 - numero2 -numero3 - numero4;
         multiplicacion = numero1 * numero2 * numero3 * numero4;
    
  
         if (numero2 != 0){
                division = numero1 / numero2 / numero3 / numero4;
         }
        
 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La division es: " + division);
              
    }
    
}
