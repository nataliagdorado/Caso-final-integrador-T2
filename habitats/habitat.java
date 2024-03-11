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
// ¿Esto que hace?
@Override
public String toString(){
    return "habitats []";
}


}
}
