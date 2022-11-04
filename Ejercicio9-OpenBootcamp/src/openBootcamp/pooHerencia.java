/*Crea una clase Persona con las siguientes variables: La edad, El nombre, El teléfono.
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes 
que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/
package openBootcamp;

public class pooHerencia {
    public static void main(String[] args) {
                
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("carolina");
        System.out.println("El nombre del cliente es " + cliente1.getNombre());
        cliente1.edad = 13;
        cliente1.telefono= 22167845;
        cliente1.credito= 120.000;
        System.out.println("La edad del cleinte es : " + cliente1.edad + " años. El telefono del cliente es:  " + cliente1.telefono + ". El credito del cliente es : " + cliente1.credito);
        
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Juan";
        System.out.println("El nuevo trabajador se llama: " + trabajador1.getNombre());
        trabajador1.getNombre();
        trabajador1.introducirSalario(850);

        
    }
}

class Persona{
    private String nombre;
    int edad;
    int telefono;
    
    public Persona(){ System.out.println("Constructor de persona. "); }
}

class Cliente extends Persona{
    double credito;
    private String nombre;
    
    //Metodo Set para nombre
public void setNombre(String nombre){
    this.nombre = nombre;
}
// Metodo Get
public String getNombre(){
    return this.nombre;
}
}

class Trabajador extends Persona{
    float salario;
    String nombre;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public void introducirSalario(float salario){
       this.salario = salario;
       System.out.println("El salario es de : " +  this.salario) ;

    }
}
