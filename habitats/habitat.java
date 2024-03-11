package habitats;

public class habitat {
float temperatura;
float humedad;
boolean limpieza;

public habitats (float temperatura, float humedad, boolean limpieza) {
    this.temperatura=temperatura;
    this.humedad=humedad;
    this.limpieza=limpieza;
}
// ¿QUE HACEN LOS OVERRIDE ESTOS?

@Override
public String toString(){
    return "habitats []";
}
@Override
protected Object clone() throws CloneNotSupportedException {
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

    // GETTERS Y SETTERS
    public float getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(float temperatura){
        this.temperatura=temperatura;
    }
    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}
