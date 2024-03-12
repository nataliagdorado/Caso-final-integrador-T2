package animales;

public class animal_acuatico {
    boolean aletas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, String raza, String color, boolean comportamiento, boolean aletas, String tipo_agua) {
        super(nombre, especie, raza, comportamiento);
        this.aletas = aletas;
        this.tipo_agua = tipo_agua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }
    // Métodos heredados
    @Override
    public void comer() {
        System.out.println("El animal terrestre está comiendo");
    }


    // Métodos propios
    public void empezarNadar(){
        System.out.println("Empiezo a nadar porque soy "+nombre);
    }
    public void moverAleta(){
        System.out.println("Muevo mis aletas");
    }
    }
}
