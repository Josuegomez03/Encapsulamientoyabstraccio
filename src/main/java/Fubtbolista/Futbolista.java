
package Fubtbolista;


public class Futbolista {
 
    private int edad;
    public String nombre;
    private String equipoactual;
    
    
    public void setedad(int edad){
        this.edad = edad;
    }
     public int getedad(){
         return edad;
     }       

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

  public void setEquipoactual(String equipoactual) {
        this.equipoactual = equipoactual;
    }
     
     public String getEquipoactual() {
        return equipoactual;
    }

}
