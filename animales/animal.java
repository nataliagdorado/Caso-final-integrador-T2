package animales;

// Esto no puede ser una clase abstracta? public abstract class animal 
public class Animal {
    // Atributos comunes de todos los animales
    int id;
    String nombre;
    String especie;
    String raza;
    Boolean buencomportamiento;

    public animal (int id, String nombre, String especie, String raza, Boolean buencomportamiento) {
        this.id=id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.buencomportamiento = buencomportamiento;

    }

    @Override
    public String toString() {
        return "animal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public void buencomportamiento(boolean comportamiento) {
        if (comportamiento == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de comportamiento");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de comportamiento");
    }
    // metodo para registrar el comportamiento
    public void registrarComportamiento(boolean comportamiento) {
        System.out.println(buencomportamiento(comportamiento));
    }

    // metodos para otras cosas. Son abstract para que lo puedan tener el resto no?
    public class Animal {
        public void comer() {
            System.out.println("El animal está comiendo");
        }
    }
}
