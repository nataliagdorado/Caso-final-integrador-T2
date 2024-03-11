package habitats;

public class habitat_terrario {
    boolean puede_caminar;

    public terrestres(float temperatura,float humedad,boolean limpieza, boolean puede_caminar) {
        super(temperatura, humedad, limpieza);
        this.puede_caminar = puede_caminar;
    }

    @Override
    public String toString() {
        return "terrestres []";
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

    public boolean isPuede_caminar() {
        return puede_caminar;
    }

    public void setPuede_caminar(boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }
}
