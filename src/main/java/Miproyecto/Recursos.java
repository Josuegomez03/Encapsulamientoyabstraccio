
package Miproyecto;
  
public class Recursos {
    
    public static void main(String arg[ ]) 
 {
   
Operaciones operaciones  = new Operaciones (); 
operaciones.dato();                  
operaciones.edad(21); 
Operaciones.multiplicacion(10,5);
operaciones.lista(10);
    }
   
    public static class Operaciones {
     public void dato() {
     System.out.println("Programacion Oientada a Objeto 2021");
   }
    
     public void edad(int edad) {
     if (edad >= 21){
     System.out.println("Eres mayor de edad");
    }else{
     System.out.println("Eres menor de edad");
     }
    }
     
     public static int multiplicacion(int x, int y){
            int multiplicacion= x * y;
            System.out.println("El resultado es " + multiplicacion);
            return multiplicacion;
     }
     
     public void lista (int x){
        
          System.out.println("La lista de numeros es");
          
            for(int i=1; i <= x; i++){  

                System.out.println(i);
            }
        } 
     
   }
    
    
}
