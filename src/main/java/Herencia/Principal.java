
package Herencia;

import EjecucionHerencia.Circulo;
import EjecucionHerencia.Cuadrado;
import EjecucionHerencia.Linea;
import EjecucionHerencia.Triangulo;


public class Principal {

    public static void main(String[] args) {
      
    Circulo circul= new Circulo();
    Linea line =new Linea();
    Triangulo triangul =new Triangulo();
    Cuadrado cuadrad = new Cuadrado();
    
    
    
    System.out.println("figura numero 1");
    System.out .println(circul.dibujar("Circulo"));
    System.out .println("La formula para calcular radio es:"+circul.Calcularradio());
  
    System.out.println("");
    System.out.println("figura numero 2");
    System.out .println(line.dibujar("Linea"));
    
    System.out.println("");
    System.out.println("figura numero 3");
    System.out .println(triangul.dibujar("Triangulo"));
    System.out .println("La formula para calcular area de un triangulo es:"+triangul.Calculararea());
   
    System.out.println("");
    System.out.println("figura numero 4");
    System.out .println(cuadrad.dibujar("Cuadrado"));
    System.out .println("La formula para calcular area de un cuadrado  es:"+cuadrad.Calculararea());
  
      
    }
    
}
