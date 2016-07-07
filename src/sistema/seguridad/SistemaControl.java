package sistema.seguridad;

/**
 * Created by andre on 7/6/16.
 */
public class SistemaControl implements Observador {

    @Override
    public void notificar(Alarma alarma) {
        System.out.println("Se disparo la alarma: "+alarma);
    }
}
