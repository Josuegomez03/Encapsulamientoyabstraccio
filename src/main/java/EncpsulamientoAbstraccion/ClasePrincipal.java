
package EncpsulamientoAbstraccion;

import Abstraccion.Barcelona;
import Abstraccion.Inter;
import Abstraccion.RealMadrid;
import Fubtbolista.Futbolista;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        Futbolista futbolista = new Futbolista();
        
     
      futbolista.setedad(21);
      System.out.println("La edad es: " +futbolista.getedad());
             
      futbolista.setNombre("Carlos Gomez");
      System.out.println("El nombre es: "+futbolista.getNombre());
        
      futbolista.setEquipoactual("Barcelona");
      System.out.println("EL equipo actual es: "+futbolista.getEquipoactual());
     
      Barcelona barcelona = new Barcelona();
      RealMadrid realMadrid = new RealMadrid();
      Inter inter = new Inter();
      
      System.out.println("Equipos y Capitanes");
      
      System.out .println(barcelona.getequipo());
      System.out .println(barcelona.getcapitan());
      
      System.out .println(realMadrid.getequipo());
      System.out .println(realMadrid.getcapitan());
      
      System.out .println(inter.getequipo());
      System.out .println(inter.getcapitan());
     
    }
    
}