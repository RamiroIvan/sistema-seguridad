package sistema.seguridad;

import java.util.ArrayList;

/**
 * Created by andre on 7/6/16.
 */
public abstract class Sujeto {
    private ArrayList<Observador> arrayListObservador=new ArrayList<Observador>();

    public void registrarObservador(Observador observador){
         arrayListObservador.add(observador);
    }
    public void eliminarObservador(Observador observador){
         arrayListObservador.remove(observador);
    }
    public void notificarObservadores(Alarma alarma){
        for (Observador observador :
                arrayListObservador) {
            observador.notificar(alarma);
        }
    }
}
