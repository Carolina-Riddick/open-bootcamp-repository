/*  Para practicar la encapsulación:
Crear clase Persona.
Crear variables privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola  */
package ClasePersona;

class Persona {
    // Propiedades
    private int edad;
    private String nombre;
    private int telefono;

    // Metodos get y set de Edad.
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
     // Metodos get y set de Nombre:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
     // Metodos get y set de Telefono:
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
   
    public int getTelefono(){
        return this.telefono;
    }    
}

class Main{
    public static void main(String[] args) {
        
        // Creamos un primer objeto, le asignamos valores
        Persona persona1 = new Persona();
        System.out.println("Los datos de la persona 1 son: ");     
        persona1.setNombre("Felicitas");
        System.out.println("El nombre de la persona es : " + persona1.getNombre());
        
         persona1.setEdad(33);
        System.out.println("La edad es : " + persona1.getEdad() + " años");
        
        persona1.setTelefono(456123);
        System.out.println("El telefono es : " + persona1.getTelefono());
        
        // Creamos un segundo objeto, le asignamos valores
        Persona persona2 = new Persona();
        System.out.println("Los datos de la persona 2 son:  ");
        persona2.setNombre("Pilar");
        System.out.println(persona2.getNombre());
        persona2.setEdad(28);
        System.out.println(persona2.getEdad());
        persona2.setTelefono(22152369);
        System.out.println(persona2.getTelefono());         
    }
}