// tengo que importar a alex?
public class alexelleon extends animal_terrestre {
    // Atributos adicionales de alex
    private String comportamiento;
    private int id;

    // Constructor de alex
    public alexelleon(String nombre, int edad, String comportamiento, int id) {
        super(nombre, edad); // Llama al constructor de la clase padre (animal_terrestre)
        this.comportamiento = comportamiento;
        this.id = id;
    }

    // Métodos adicionales de alex
    // ...

    // Getter y setter para comportamiento
    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    // Getter y setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

