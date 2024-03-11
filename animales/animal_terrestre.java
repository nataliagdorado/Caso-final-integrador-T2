package animales;

public class animal_terrestre {

    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo_terrestre;

    public animal_terrestre(String nombre, String especie, String raza, boolean patas, boolean cola,
        boolean pelaje, String tipo_terrestre) {
        super(nombre, especie, raza, comportamiento);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipo_terrestre = tipo_terrestre;
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public String getTipo_terrestre() {
        return tipo_terrestre;
    }

    public void setTipo_terrestre(String tipo_terrestre) {
        this.tipo_terrestre = tipo_terrestre;
    }
}
