package co.eagerapp.manuelro.eager.Structures.Cola;

/**
 * Created by Manuel on 19/11/2015.
 */
public class Cola {

    private Nodo primero;
    private Nodo ultimo;

    public void enCola(Nodo d){
        if(primero == null){
            primero= d;
            ultimo = d;
        }else{
            d.setAtras(primero);
            primero=d;
        }

    }

    public void setUltimo(Nodo nodo){
        ultimo=nodo;
    }
    public int size(){
        return ultimo.getPosition();
    }
    public Nodo atiende(){
        Nodo temp = primero;
        if(primero != null){
            primero = primero.getAtras();
            temp.setAtras(null);

            if(primero == null)
                ultimo = null;

        }
        return temp;
    }

}
