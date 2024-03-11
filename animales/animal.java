package animales;

public class animal {
    String nombre;
    String especie;
    String raza;
    Boolean buencomportamiento;

    public animal (String nombre, String especie, String raza, Boolean buencomportamiento) {
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
}
