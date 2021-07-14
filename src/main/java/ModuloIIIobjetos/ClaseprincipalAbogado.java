
package ModuloIIIobjetos;

public class ClaseprincipalAbogado {

    public static void main(String[] args) {
     Abogado abogado = new Abogado();
    abogado.setNombres("Mario Anibal");
    abogado.setApellidos("Cruz Mejia");
    abogado.setsexo ("Masculino");
    abogado.setnacionalidad("Hondureña");
    abogado.setIDE ("1804-2000-00053");
    abogado.setestadocivil ("Soltero");
    
 System.out.println("Nombres: " + abogado.getNombres() );
 System.out.println("Apellidos: " + abogado.getApellidos() );
 System.out.println("Sexo: " + abogado.getSexo() );
 System.out.println("Nacionalidad: " + abogado.getNacinalidad() );
 System.out.println("IDE: " + abogado.getIDE() );
 System.out.println("Estadocivil: " + abogado.getestadocivil()) ;
    
    }
    
    
    
    public static class Abogado {
        
    private String  nombres;
    private String  apellidos;
    private String  sexo ;   
    private String nacionalidad ;   
    private String IDE;
    private String estadocivil;
    
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public String getSexo(){
        return sexo;
    }
     public String getNacinalidad(){
        return nacionalidad;
    }
    
     public String   getIDE(){
        return IDE ;
    }
    
     public String getestadocivil(){
        return estadocivil;
    }
     
     
     public void setNombres(String nombres){
        this.nombres = nombres;
    }
     
    
      public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
       public void setsexo(String   sexo){
        this.sexo= sexo;
    }
        public void setnacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
     
        public void setIDE(String IDE){
        this.IDE= IDE;
    }
        
        public void setestadocivil(String estadocivil){
        this.estadocivil= estadocivil;
    }
}
    
     
}
