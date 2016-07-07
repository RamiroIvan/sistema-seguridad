package sistema.seguridad;

/**
 * Created by andre on 7/6/16.
 */
public abstract class Sensor extends Sujeto {
    private String identificador;
    private float lectura;
    public Sensor(int lectura) {
        this.lectura = lectura;
    }
    public float sensar(){
//        Do something
       return lectura;
    }

    public float getLectura() {
        return lectura;
    }

    public void setLectura(float lectura) {
        this.lectura = lectura;
    }
}

