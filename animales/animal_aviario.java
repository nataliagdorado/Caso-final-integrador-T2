package animales;

public class animal_aviario {
    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipo_aviario;

    public animal_aviario(String nombre, String especie, String raza, boolean comportamiento,  boolean vuela, boolean pico,
        boolean plumaje, String tipo_aviario) {
        super(nombre, especie, raza, comportamiento);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipo_aviario = tipo_aviario;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(boolean plumaje) {
        this.plumaje = plumaje;
    }

    public String getTipo_aviario() {
        return tipo_aviario;
    }

    public void setTipo_aviario(String tipo_aviario) {
        this.tipo_aviario = tipo_aviario;
    }

}
